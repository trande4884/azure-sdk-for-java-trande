// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AutomationRuleSet;
import com.azure.resourcemanager.security.models.AutomationTriggeringRule;
import com.azure.resourcemanager.security.models.Operator;
import com.azure.resourcemanager.security.models.PropertyType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AutomationRuleSetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationRuleSet model = BinaryData.fromString(
            "{\"rules\":[{\"propertyJPath\":\"lnacgcc\",\"propertyType\":\"String\",\"expectedValue\":\"xkizvy\",\"operator\":\"Contains\"},{\"propertyJPath\":\"vuljraaeranokqg\",\"propertyType\":\"String\",\"expectedValue\":\"qnvb\",\"operator\":\"LesserThanOrEqualTo\"},{\"propertyJPath\":\"a\",\"propertyType\":\"Number\",\"expectedValue\":\"cdisd\",\"operator\":\"GreaterThan\"}]}")
            .toObject(AutomationRuleSet.class);
        Assertions.assertEquals("lnacgcc", model.rules().get(0).propertyJPath());
        Assertions.assertEquals(PropertyType.STRING, model.rules().get(0).propertyType());
        Assertions.assertEquals("xkizvy", model.rules().get(0).expectedValue());
        Assertions.assertEquals(Operator.CONTAINS, model.rules().get(0).operator());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationRuleSet model = new AutomationRuleSet().withRules(Arrays.asList(
            new AutomationTriggeringRule().withPropertyJPath("lnacgcc")
                .withPropertyType(PropertyType.STRING)
                .withExpectedValue("xkizvy")
                .withOperator(Operator.CONTAINS),
            new AutomationTriggeringRule().withPropertyJPath("vuljraaeranokqg")
                .withPropertyType(PropertyType.STRING)
                .withExpectedValue("qnvb")
                .withOperator(Operator.LESSER_THAN_OR_EQUAL_TO),
            new AutomationTriggeringRule().withPropertyJPath("a")
                .withPropertyType(PropertyType.NUMBER)
                .withExpectedValue("cdisd")
                .withOperator(Operator.GREATER_THAN)));
        model = BinaryData.fromObject(model).toObject(AutomationRuleSet.class);
        Assertions.assertEquals("lnacgcc", model.rules().get(0).propertyJPath());
        Assertions.assertEquals(PropertyType.STRING, model.rules().get(0).propertyType());
        Assertions.assertEquals("xkizvy", model.rules().get(0).expectedValue());
        Assertions.assertEquals(Operator.CONTAINS, model.rules().get(0).operator());
    }
}
