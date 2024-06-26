// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storage.models.StorageTaskReportProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage Tasks run report instance.
 */
@Fluent
public final class StorageTaskReportInstanceInner extends ProxyResource {
    /*
     * Storage task execution report for a run instance.
     */
    @JsonProperty(value = "properties")
    private StorageTaskReportProperties properties;

    /**
     * Creates an instance of StorageTaskReportInstanceInner class.
     */
    public StorageTaskReportInstanceInner() {
    }

    /**
     * Get the properties property: Storage task execution report for a run instance.
     * 
     * @return the properties value.
     */
    public StorageTaskReportProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Storage task execution report for a run instance.
     * 
     * @param properties the properties value to set.
     * @return the StorageTaskReportInstanceInner object itself.
     */
    public StorageTaskReportInstanceInner withProperties(StorageTaskReportProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
