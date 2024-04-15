package com.azure.spring.data.cosmos.common;

import org.springframework.data.repository.query.parser.Part;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CosmosPart extends Part {

    private static final Pattern IGNORE_CASE = Pattern.compile("Ignor(ing|e)Case");

    private IgnoreCaseType ignoreCase = IgnoreCaseType.NEVER;

    private final CosmosPart.Type type;

    public CosmosPart(String source, Class<?> clazz) {
        this(source, clazz, false);
    }

    public CosmosPart(String source, Class<?> clazz, boolean alwaysIgnoreCase) {
        super(source, clazz, alwaysIgnoreCase);

        String partToUse = detectAndSetIgnoreCase(source);
        this.type = CosmosPart.Type.fromProperty(partToUse);
    }

    /**
     * @return the type
     */
    @Override
    public CosmosPart.Type getType() {
        return type;
    }

    private String detectAndSetIgnoreCase(String part) {

        Matcher matcher = IGNORE_CASE.matcher(part);
        String result = part;

        if (matcher.find()) {
            ignoreCase = IgnoreCaseType.ALWAYS;
            result = part.substring(0, matcher.start()) + part.substring(matcher.end(), part.length());
        }

        return result;
    }

    /**
     * The type of a method name part. Used to create query parts in various ways.
     *
     * @author Oliver Gierke
     * @author Thomas Darimont
     * @author Michael Cramer
     */
    public static enum Type {

        BETWEEN(2, "IsBetween", "Between"),
        IS_NOT_NULL(0, "IsNotNull", "NotNull"),
        IS_NULL(0, "IsNull", "Null"),
        LESS_THAN("IsLessThan", "LessThan"),
        LESS_THAN_EQUAL("IsLessThanEqual", "LessThanEqual"),
        GREATER_THAN("IsGreaterThan", "GreaterThan"),
        GREATER_THAN_EQUAL("IsGreaterThanEqual", "GreaterThanEqual"),
        BEFORE("IsBefore", "Before"),
        AFTER("IsAfter", "After"),
        NOT_LIKE("IsNotLike", "NotLike"),
        LIKE("IsLike", "Like"),
        STARTING_WITH("IsStartingWith", "StartingWith", "StartsWith"),
        ENDING_WITH("IsEndingWith", "EndingWith", "EndsWith"),
        IS_NOT_EMPTY(0, "IsNotEmpty", "NotEmpty"),
        IS_EMPTY(0, "IsEmpty", "Empty"),
        NOT_CONTAINING("IsNotContaining", "NotContaining", "NotContains"),
        CONTAINING("IsContaining", "Containing", "Contains"),
        NOT_IN("IsNotIn", "NotIn"),
        IN("IsIn", "In"),
        NEAR("IsNear", "Near"),
        WITHIN("IsWithin", "Within"),
        REGEX("MatchesRegex", "Matches", "Regex"),
        EXISTS(0, "Exists"),
        TRUE(0, "IsTrue", "True"),
        FALSE(0, "IsFalse", "False"),
        NEGATING_SIMPLE_PROPERTY("IsNot", "Not"),
        SIMPLE_PROPERTY("Is", "Equals"),
        IS_DEFINED(1, "IsDefined"),
        NOT_IS_DEFINED(1, "NotIsDefined");

        // Need to list them again explicitly as the order is important
        // (esp. for IS_NULL, IS_NOT_NULL)
        private static final List<CosmosPart.Type> ALL = Arrays.asList(IS_NOT_NULL, IS_NULL, BETWEEN, LESS_THAN, LESS_THAN_EQUAL,
            GREATER_THAN, GREATER_THAN_EQUAL, BEFORE, AFTER, NOT_LIKE, LIKE, STARTING_WITH, ENDING_WITH, IS_NOT_EMPTY,
            IS_EMPTY, NOT_CONTAINING, CONTAINING, NOT_IN, IN, NEAR, WITHIN, REGEX, EXISTS, TRUE, FALSE,
            NEGATING_SIMPLE_PROPERTY, SIMPLE_PROPERTY, IS_DEFINED, NOT_IS_DEFINED);

        public static final Collection<String> ALL_KEYWORDS;

        static {
            List<String> allKeywords = new ArrayList<>();
            for (CosmosPart.Type type : ALL) {
                allKeywords.addAll(type.keywords);
            }
            ALL_KEYWORDS = Collections.unmodifiableList(allKeywords);
        }

        private final List<String> keywords;
        private final int numberOfArguments;

        /**
         * Creates a new {@link CosmosPart.Type} using the given keyword, number of arguments to be bound and operator. Keyword and
         * operator can be {@literal null}.
         *
         * @param numberOfArguments
         * @param keywords
         */
        private Type(int numberOfArguments, String... keywords) {

            this.numberOfArguments = numberOfArguments;
            this.keywords = Arrays.asList(keywords);
        }

        private Type(String... keywords) {
            this(1, keywords);
        }

        /**
         * Returns the {@link CosmosPart.Type} of the {@link CosmosPart} for the given raw propertyPath. This will try to detect e.g.
         * keywords contained in the raw propertyPath that trigger special query creation. Returns {@link #SIMPLE_PROPERTY}
         * by default.
         *
         * @param rawProperty
         * @return
         */
        public static CosmosPart.Type fromProperty(String rawProperty) {

            for (CosmosPart.Type type : ALL) {
                if (type.supports(rawProperty)) {
                    return type;
                }
            }

            return SIMPLE_PROPERTY;
        }

        /**
         * Returns all keywords supported by the current {@link CosmosPart.Type}.
         *
         * @return
         */
        public Collection<String> getKeywords() {
            return Collections.unmodifiableList(keywords);
        }

        /**
         * Returns whether the the type supports the given raw property. Default implementation checks whether the property
         * ends with the registered keyword. Does not support the keyword if the property is a valid field as is.
         *
         * @param property
         * @return
         */
        protected boolean supports(String property) {

            for (String keyword : keywords) {
                if (property.endsWith(keyword)) {
                    return true;
                }
            }

            return false;
        }

        /**
         * Returns the number of arguments the propertyPath binds. By default this exactly one argument.
         *
         * @return
         */
        public int getNumberOfArguments() {
            return numberOfArguments;
        }

        /**
         * Callback method to extract the actual propertyPath to be bound from the given part. Strips the keyword from the
         * part's end if available.
         *
         * @param part
         * @return
         */
        public String extractProperty(String part) {

            String candidate = Introspector.decapitalize(part);

            for (String keyword : keywords) {
                if (candidate.endsWith(keyword)) {
                    return candidate.substring(0, candidate.length() - keyword.length());
                }
            }

            return candidate;
        }

        /*
         * (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return String.format("%s (%s): %s", name(), getNumberOfArguments(), getKeywords());
        }
    }

}
