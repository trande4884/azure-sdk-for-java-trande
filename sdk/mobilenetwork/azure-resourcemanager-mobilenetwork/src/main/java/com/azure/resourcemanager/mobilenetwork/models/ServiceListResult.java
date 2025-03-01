// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ServiceInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for services API service call.
 */
@Fluent
public final class ServiceListResult implements JsonSerializable<ServiceListResult> {
    /*
     * A list of services.
     */
    private List<ServiceInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ServiceListResult class.
     */
    public ServiceListResult() {
    }

    /**
     * Get the value property: A list of services.
     * 
     * @return the value value.
     */
    public List<ServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of services.
     * 
     * @param value the value value to set.
     * @return the ServiceListResult object itself.
     */
    public ServiceListResult withValue(List<ServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceListResult.
     */
    public static ServiceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceListResult deserializedServiceListResult = new ServiceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ServiceInner> value = reader.readArray(reader1 -> ServiceInner.fromJson(reader1));
                    deserializedServiceListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedServiceListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceListResult;
        });
    }
}
