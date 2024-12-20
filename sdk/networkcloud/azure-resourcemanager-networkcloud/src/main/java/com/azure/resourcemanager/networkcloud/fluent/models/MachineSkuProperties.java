// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.networkcloud.models.BootstrapProtocol;
import com.azure.resourcemanager.networkcloud.models.MachineDisk;
import com.azure.resourcemanager.networkcloud.models.NetworkInterface;
import java.io.IOException;
import java.util.List;

/**
 * MachineSkuProperties represents the properties of the machine SKU.
 */
@Immutable
public final class MachineSkuProperties implements JsonSerializable<MachineSkuProperties> {
    /*
     * The type of bootstrap protocol used.
     */
    private BootstrapProtocol bootstrapProtocol;

    /*
     * The count of CPU cores for this machine.
     */
    private Long cpuCores;

    /*
     * The count of CPU sockets for this machine.
     */
    private Long cpuSockets;

    /*
     * The list of disks.
     */
    private List<MachineDisk> disks;

    /*
     * The generation of the architecture.
     */
    private String generation;

    /*
     * The hardware version of the machine.
     */
    private String hardwareVersion;

    /*
     * The maximum amount of memory. Measured in gibibytes.
     */
    private Long memoryCapacityGB;

    /*
     * The model of the machine.
     */
    private String model;

    /*
     * The list of network interfaces.
     */
    private List<NetworkInterface> networkInterfaces;

    /*
     * The count of SMT and physical core threads for this machine.
     */
    private Long totalThreads;

    /*
     * The make of the machine.
     */
    private String vendor;

    /**
     * Creates an instance of MachineSkuProperties class.
     */
    public MachineSkuProperties() {
    }

    /**
     * Get the bootstrapProtocol property: The type of bootstrap protocol used.
     * 
     * @return the bootstrapProtocol value.
     */
    public BootstrapProtocol bootstrapProtocol() {
        return this.bootstrapProtocol;
    }

    /**
     * Get the cpuCores property: The count of CPU cores for this machine.
     * 
     * @return the cpuCores value.
     */
    public Long cpuCores() {
        return this.cpuCores;
    }

    /**
     * Get the cpuSockets property: The count of CPU sockets for this machine.
     * 
     * @return the cpuSockets value.
     */
    public Long cpuSockets() {
        return this.cpuSockets;
    }

    /**
     * Get the disks property: The list of disks.
     * 
     * @return the disks value.
     */
    public List<MachineDisk> disks() {
        return this.disks;
    }

    /**
     * Get the generation property: The generation of the architecture.
     * 
     * @return the generation value.
     */
    public String generation() {
        return this.generation;
    }

    /**
     * Get the hardwareVersion property: The hardware version of the machine.
     * 
     * @return the hardwareVersion value.
     */
    public String hardwareVersion() {
        return this.hardwareVersion;
    }

    /**
     * Get the memoryCapacityGB property: The maximum amount of memory. Measured in gibibytes.
     * 
     * @return the memoryCapacityGB value.
     */
    public Long memoryCapacityGB() {
        return this.memoryCapacityGB;
    }

    /**
     * Get the model property: The model of the machine.
     * 
     * @return the model value.
     */
    public String model() {
        return this.model;
    }

    /**
     * Get the networkInterfaces property: The list of network interfaces.
     * 
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the totalThreads property: The count of SMT and physical core threads for this machine.
     * 
     * @return the totalThreads value.
     */
    public Long totalThreads() {
        return this.totalThreads;
    }

    /**
     * Get the vendor property: The make of the machine.
     * 
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (disks() != null) {
            disks().forEach(e -> e.validate());
        }
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineSkuProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineSkuProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachineSkuProperties.
     */
    public static MachineSkuProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineSkuProperties deserializedMachineSkuProperties = new MachineSkuProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bootstrapProtocol".equals(fieldName)) {
                    deserializedMachineSkuProperties.bootstrapProtocol
                        = BootstrapProtocol.fromString(reader.getString());
                } else if ("cpuCores".equals(fieldName)) {
                    deserializedMachineSkuProperties.cpuCores = reader.getNullable(JsonReader::getLong);
                } else if ("cpuSockets".equals(fieldName)) {
                    deserializedMachineSkuProperties.cpuSockets = reader.getNullable(JsonReader::getLong);
                } else if ("disks".equals(fieldName)) {
                    List<MachineDisk> disks = reader.readArray(reader1 -> MachineDisk.fromJson(reader1));
                    deserializedMachineSkuProperties.disks = disks;
                } else if ("generation".equals(fieldName)) {
                    deserializedMachineSkuProperties.generation = reader.getString();
                } else if ("hardwareVersion".equals(fieldName)) {
                    deserializedMachineSkuProperties.hardwareVersion = reader.getString();
                } else if ("memoryCapacityGB".equals(fieldName)) {
                    deserializedMachineSkuProperties.memoryCapacityGB = reader.getNullable(JsonReader::getLong);
                } else if ("model".equals(fieldName)) {
                    deserializedMachineSkuProperties.model = reader.getString();
                } else if ("networkInterfaces".equals(fieldName)) {
                    List<NetworkInterface> networkInterfaces
                        = reader.readArray(reader1 -> NetworkInterface.fromJson(reader1));
                    deserializedMachineSkuProperties.networkInterfaces = networkInterfaces;
                } else if ("totalThreads".equals(fieldName)) {
                    deserializedMachineSkuProperties.totalThreads = reader.getNullable(JsonReader::getLong);
                } else if ("vendor".equals(fieldName)) {
                    deserializedMachineSkuProperties.vendor = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineSkuProperties;
        });
    }
}
