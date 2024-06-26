// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Display object with properties of the operation. */
@Fluent
public final class OperationsDisplayDefinition {
    /*
     * Resource provider of the operation.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource for the operation.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Short description of the operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of OperationsDisplayDefinition class. */
    public OperationsDisplayDefinition() {
    }

    /**
     * Get the provider property: Resource provider of the operation.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Resource provider of the operation.
     *
     * @param provider the provider value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource for the operation.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource for the operation.
     *
     * @param resource the resource value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Short description of the operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Short description of the operation.
     *
     * @param operation the operation value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the operation.
     *
     * @param description the description value to set.
     * @return the OperationsDisplayDefinition object itself.
     */
    public OperationsDisplayDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
