// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Parquet read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = ParquetReadSettings.class, visible = true)
@JsonTypeName("ParquetReadSettings")
@Fluent
public final class ParquetReadSettings extends FormatReadSettings {
    /*
     * The read setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "ParquetReadSettings";

    /*
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /**
     * Creates an instance of ParquetReadSettings class.
     */
    public ParquetReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the compressionProperties property: Compression settings.
     * 
     * @return the compressionProperties value.
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set the compressionProperties property: Compression settings.
     * 
     * @param compressionProperties the compressionProperties value to set.
     * @return the ParquetReadSettings object itself.
     */
    public ParquetReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (compressionProperties() != null) {
            compressionProperties().validate();
        }
    }
}
