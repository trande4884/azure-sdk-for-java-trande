// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Representation of a log probabilities model for a completions generation.
 */
@Immutable
public final class CompletionsLogProbabilityModel implements JsonSerializable<CompletionsLogProbabilityModel> {

    /*
     * The textual forms of tokens evaluated in this probability model.
     */
    @Generated
    private final List<String> tokens;

    /**
     * Creates an instance of CompletionsLogProbabilityModel class.
     *
     * @param tokens the tokens value to set.
     * @param tokenLogProbabilities the tokenLogProbabilities value to set.
     * @param topLogProbabilities the topLogProbabilities value to set.
     * @param textOffsets the textOffsets value to set.
     */
    @Generated
    private CompletionsLogProbabilityModel(List<String> tokens, List<Double> tokenLogProbabilities,
        List<Map<String, Double>> topLogProbabilities, List<Integer> textOffsets) {
        this.tokens = tokens;
        this.tokenLogProbabilities = tokenLogProbabilities;
        this.topLogProbabilities = topLogProbabilities;
        this.textOffsets = textOffsets;
    }

    /**
     * Get the tokens property: The textual forms of tokens evaluated in this probability model.
     *
     * @return the tokens value.
     */
    @Generated
    public List<String> getTokens() {
        return this.tokens;
    }

    /*
     * A collection of log probability values for the tokens in this completions data.
     */
    @Generated
    private final List<Double> tokenLogProbabilities;

    /*
     * A mapping of tokens to maximum log probability values in this completions data.
     */
    @Generated
    private final List<Map<String, Double>> topLogProbabilities;

    /*
     * The text offsets associated with tokens in this completions data.
     */
    @Generated
    private final List<Integer> textOffsets;

    /**
     * Get the tokenLogProbabilities property: A collection of log probability values for the tokens in this completions
     * data.
     *
     * @return the tokenLogProbabilities value.
     */
    @Generated
    public List<Double> getTokenLogProbabilities() {
        return this.tokenLogProbabilities;
    }

    /**
     * Get the topLogProbabilities property: A mapping of tokens to maximum log probability values in this completions
     * data.
     *
     * @return the topLogProbabilities value.
     */
    @Generated
    public List<Map<String, Double>> getTopLogProbabilities() {
        return this.topLogProbabilities;
    }

    /**
     * Get the textOffsets property: The text offsets associated with tokens in this completions data.
     *
     * @return the textOffsets value.
     */
    @Generated
    public List<Integer> getTextOffsets() {
        return this.textOffsets;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("tokens", this.tokens, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("token_logprobs", this.tokenLogProbabilities,
            (writer, element) -> writer.writeDouble(element));
        jsonWriter.writeArrayField("top_logprobs", this.topLogProbabilities,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> writer1.writeNumber(element1)));
        jsonWriter.writeArrayField("text_offset", this.textOffsets, (writer, element) -> writer.writeInt(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompletionsLogProbabilityModel from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompletionsLogProbabilityModel if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CompletionsLogProbabilityModel.
     */
    @Generated
    public static CompletionsLogProbabilityModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<String> tokens = null;
            List<Double> tokenLogProbabilities = null;
            List<Map<String, Double>> topLogProbabilities = null;
            List<Integer> textOffsets = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("tokens".equals(fieldName)) {
                    tokens = reader.readArray(reader1 -> reader1.getString());
                } else if ("token_logprobs".equals(fieldName)) {
                    tokenLogProbabilities = reader.readArray(reader1 -> reader1.getDouble());
                } else if ("top_logprobs".equals(fieldName)) {
                    topLogProbabilities = reader
                        .readArray(reader1 -> reader1.readMap(reader2 -> reader2.getNullable(JsonReader::getDouble)));
                } else if ("text_offset".equals(fieldName)) {
                    textOffsets = reader.readArray(reader1 -> reader1.getInt());
                } else {
                    reader.skipChildren();
                }
            }
            return new CompletionsLogProbabilityModel(tokens, tokenLogProbabilities, topLogProbabilities, textOffsets);
        });
    }
}
