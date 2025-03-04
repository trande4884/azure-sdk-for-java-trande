// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The update settings request object.
 */
@Fluent
public final class UpdateSettingRequest implements JsonSerializable<UpdateSettingRequest> {
    /*
     * The value of the pool setting.
     */
    private String value;

    /**
     * Creates an instance of UpdateSettingRequest class.
     */
    public UpdateSettingRequest() {
    }

    /**
     * Get the value property: The value of the pool setting.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the pool setting.
     * 
     * @param value the value value to set.
     * @return the UpdateSettingRequest object itself.
     */
    public UpdateSettingRequest setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateSettingRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateSettingRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateSettingRequest.
     */
    public static UpdateSettingRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateSettingRequest deserializedUpdateSettingRequest = new UpdateSettingRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedUpdateSettingRequest.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateSettingRequest;
        });
    }
}
