// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ServiceStatus model.
 */
@Fluent
class ServiceStatus implements JsonSerializable<ServiceStatus> {

    /*
     * The service property.
     */
    private String service;

    /*
     * The apiStatus property.
     */
    private String apiStatus;

    /*
     * The apiStatusMessage property.
     */
    private String apiStatusMessage;

    /**
     * Creates an instance of ServiceStatus class.
     */
    ServiceStatus() {
    }

    /**
     * Get the service property: The service property.
     *
     * @return the service value.
     */
    public String getService() {
        return this.service;
    }

    /**
     * Set the service property: The service property.
     *
     * @param service the service value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the apiStatus property: The apiStatus property.
     *
     * @return the apiStatus value.
     */
    public String getApiStatus() {
        return this.apiStatus;
    }

    /**
     * Set the apiStatus property: The apiStatus property.
     *
     * @param apiStatus the apiStatus value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }

    /**
     * Get the apiStatusMessage property: The apiStatusMessage property.
     *
     * @return the apiStatusMessage value.
     */
    public String getApiStatusMessage() {
        return this.apiStatusMessage;
    }

    /**
     * Set the apiStatusMessage property: The apiStatusMessage property.
     *
     * @param apiStatusMessage the apiStatusMessage value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus setApiStatusMessage(String apiStatusMessage) {
        this.apiStatusMessage = apiStatusMessage;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("service", this.service);
        jsonWriter.writeStringField("apiStatus", this.apiStatus);
        jsonWriter.writeStringField("apiStatusMessage", this.apiStatusMessage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceStatus from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceStatus if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceStatus.
     */
    public static ServiceStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceStatus deserializedServiceStatus = new ServiceStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("service".equals(fieldName)) {
                    deserializedServiceStatus.service = reader.getString();
                } else if ("apiStatus".equals(fieldName)) {
                    deserializedServiceStatus.apiStatus = reader.getString();
                } else if ("apiStatusMessage".equals(fieldName)) {
                    deserializedServiceStatus.apiStatusMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedServiceStatus;
        });
    }
}
