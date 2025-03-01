// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The external security solution properties for ATA solutions.
 */
@Fluent
public final class AtaSolutionProperties extends ExternalSecuritySolutionProperties {
    /*
     * The lastEventReceived property.
     */
    private String lastEventReceived;

    /**
     * Creates an instance of AtaSolutionProperties class.
     */
    public AtaSolutionProperties() {
    }

    /**
     * Get the lastEventReceived property: The lastEventReceived property.
     * 
     * @return the lastEventReceived value.
     */
    public String lastEventReceived() {
        return this.lastEventReceived;
    }

    /**
     * Set the lastEventReceived property: The lastEventReceived property.
     * 
     * @param lastEventReceived the lastEventReceived value to set.
     * @return the AtaSolutionProperties object itself.
     */
    public AtaSolutionProperties withLastEventReceived(String lastEventReceived) {
        this.lastEventReceived = lastEventReceived;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtaSolutionProperties withDeviceVendor(String deviceVendor) {
        super.withDeviceVendor(deviceVendor);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtaSolutionProperties withDeviceType(String deviceType) {
        super.withDeviceType(deviceType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtaSolutionProperties withWorkspace(ConnectedWorkspace workspace) {
        super.withWorkspace(workspace);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (workspace() != null) {
            workspace().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("deviceVendor", deviceVendor());
        jsonWriter.writeStringField("deviceType", deviceType());
        jsonWriter.writeJsonField("workspace", workspace());
        jsonWriter.writeStringField("lastEventReceived", this.lastEventReceived);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtaSolutionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtaSolutionProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtaSolutionProperties.
     */
    public static AtaSolutionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtaSolutionProperties deserializedAtaSolutionProperties = new AtaSolutionProperties();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deviceVendor".equals(fieldName)) {
                    deserializedAtaSolutionProperties.withDeviceVendor(reader.getString());
                } else if ("deviceType".equals(fieldName)) {
                    deserializedAtaSolutionProperties.withDeviceType(reader.getString());
                } else if ("workspace".equals(fieldName)) {
                    deserializedAtaSolutionProperties.withWorkspace(ConnectedWorkspace.fromJson(reader));
                } else if ("lastEventReceived".equals(fieldName)) {
                    deserializedAtaSolutionProperties.lastEventReceived = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAtaSolutionProperties.withAdditionalProperties(additionalProperties);

            return deserializedAtaSolutionProperties;
        });
    }
}
