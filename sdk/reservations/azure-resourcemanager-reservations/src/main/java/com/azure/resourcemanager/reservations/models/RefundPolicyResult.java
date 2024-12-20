// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Refund policy result.
 */
@Fluent
public final class RefundPolicyResult implements JsonSerializable<RefundPolicyResult> {
    /*
     * Refund policy result property
     */
    private RefundPolicyResultProperty properties;

    /**
     * Creates an instance of RefundPolicyResult class.
     */
    public RefundPolicyResult() {
    }

    /**
     * Get the properties property: Refund policy result property.
     * 
     * @return the properties value.
     */
    public RefundPolicyResultProperty properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Refund policy result property.
     * 
     * @param properties the properties value to set.
     * @return the RefundPolicyResult object itself.
     */
    public RefundPolicyResult withProperties(RefundPolicyResultProperty properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RefundPolicyResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RefundPolicyResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RefundPolicyResult.
     */
    public static RefundPolicyResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RefundPolicyResult deserializedRefundPolicyResult = new RefundPolicyResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedRefundPolicyResult.properties = RefundPolicyResultProperty.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRefundPolicyResult;
        });
    }
}
