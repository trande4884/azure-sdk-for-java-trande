// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines load balancer backend address pool properties. */
@Fluent
public final class LBBackendAddressPoolResourceSettings {
    /*
     * Gets or sets the backend address pool name.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of LBBackendAddressPoolResourceSettings class. */
    public LBBackendAddressPoolResourceSettings() {
    }

    /**
     * Get the name property: Gets or sets the backend address pool name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the backend address pool name.
     *
     * @param name the name value to set.
     * @return the LBBackendAddressPoolResourceSettings object itself.
     */
    public LBBackendAddressPoolResourceSettings withName(String name) {
        this.name = name;
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
