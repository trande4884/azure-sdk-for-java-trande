// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Get collection count's request object.
 */
@Fluent
public final class GetCollectionCountRequest implements JsonSerializable<GetCollectionCountRequest> {
    /*
     * The resource type.
     */
    private String type;

    /**
     * Creates an instance of GetCollectionCountRequest class.
     */
    public GetCollectionCountRequest() {
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type.
     * 
     * @param type the type value to set.
     * @return the GetCollectionCountRequest object itself.
     */
    public GetCollectionCountRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetCollectionCountRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetCollectionCountRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GetCollectionCountRequest.
     */
    public static GetCollectionCountRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetCollectionCountRequest deserializedGetCollectionCountRequest = new GetCollectionCountRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedGetCollectionCountRequest.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetCollectionCountRequest;
        });
    }
}
