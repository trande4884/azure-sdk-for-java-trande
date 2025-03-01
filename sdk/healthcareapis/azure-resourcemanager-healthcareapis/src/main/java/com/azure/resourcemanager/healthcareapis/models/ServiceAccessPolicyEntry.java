// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An access policy entry.
 */
@Fluent
public final class ServiceAccessPolicyEntry implements JsonSerializable<ServiceAccessPolicyEntry> {
    /*
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     */
    private String objectId;

    /**
     * Creates an instance of ServiceAccessPolicyEntry class.
     */
    public ServiceAccessPolicyEntry() {
    }

    /**
     * Get the objectId property: An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     * @param objectId the objectId value to set.
     * @return the ServiceAccessPolicyEntry object itself.
     */
    public ServiceAccessPolicyEntry withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (objectId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property objectId in model ServiceAccessPolicyEntry"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceAccessPolicyEntry.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("objectId", this.objectId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceAccessPolicyEntry from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceAccessPolicyEntry if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ServiceAccessPolicyEntry.
     */
    public static ServiceAccessPolicyEntry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceAccessPolicyEntry deserializedServiceAccessPolicyEntry = new ServiceAccessPolicyEntry();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectId".equals(fieldName)) {
                    deserializedServiceAccessPolicyEntry.objectId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceAccessPolicyEntry;
        });
    }
}
