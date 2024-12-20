// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BareMetalMachinePowerOffParameters represents the body of the request to power off bare metal machine.
 */
@Fluent
public final class BareMetalMachinePowerOffParameters implements JsonSerializable<BareMetalMachinePowerOffParameters> {
    /*
     * The indicator of whether to skip the graceful OS shutdown and power off the bare metal machine immediately.
     */
    private BareMetalMachineSkipShutdown skipShutdown;

    /**
     * Creates an instance of BareMetalMachinePowerOffParameters class.
     */
    public BareMetalMachinePowerOffParameters() {
    }

    /**
     * Get the skipShutdown property: The indicator of whether to skip the graceful OS shutdown and power off the bare
     * metal machine immediately.
     * 
     * @return the skipShutdown value.
     */
    public BareMetalMachineSkipShutdown skipShutdown() {
        return this.skipShutdown;
    }

    /**
     * Set the skipShutdown property: The indicator of whether to skip the graceful OS shutdown and power off the bare
     * metal machine immediately.
     * 
     * @param skipShutdown the skipShutdown value to set.
     * @return the BareMetalMachinePowerOffParameters object itself.
     */
    public BareMetalMachinePowerOffParameters withSkipShutdown(BareMetalMachineSkipShutdown skipShutdown) {
        this.skipShutdown = skipShutdown;
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
        jsonWriter.writeStringField("skipShutdown", this.skipShutdown == null ? null : this.skipShutdown.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BareMetalMachinePowerOffParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BareMetalMachinePowerOffParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BareMetalMachinePowerOffParameters.
     */
    public static BareMetalMachinePowerOffParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BareMetalMachinePowerOffParameters deserializedBareMetalMachinePowerOffParameters
                = new BareMetalMachinePowerOffParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("skipShutdown".equals(fieldName)) {
                    deserializedBareMetalMachinePowerOffParameters.skipShutdown
                        = BareMetalMachineSkipShutdown.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBareMetalMachinePowerOffParameters;
        });
    }
}
