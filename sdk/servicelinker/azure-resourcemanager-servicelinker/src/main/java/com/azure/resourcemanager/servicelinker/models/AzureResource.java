// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The azure resource info when target service type is AzureResource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureResource")
@Fluent
public final class AzureResource extends TargetServiceBase {
    /*
     * The Id of azure resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The azure resource connection related properties.
     */
    @JsonProperty(value = "resourceProperties")
    private AzureResourcePropertiesBase resourceProperties;

    /**
     * Get the id property: The Id of azure resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Id of azure resource.
     *
     * @param id the id value to set.
     * @return the AzureResource object itself.
     */
    public AzureResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the resourceProperties property: The azure resource connection related properties.
     *
     * @return the resourceProperties value.
     */
    public AzureResourcePropertiesBase resourceProperties() {
        return this.resourceProperties;
    }

    /**
     * Set the resourceProperties property: The azure resource connection related properties.
     *
     * @param resourceProperties the resourceProperties value to set.
     * @return the AzureResource object itself.
     */
    public AzureResource withResourceProperties(AzureResourcePropertiesBase resourceProperties) {
        this.resourceProperties = resourceProperties;
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
        if (resourceProperties() != null) {
            resourceProperties().validate();
        }
    }
}
