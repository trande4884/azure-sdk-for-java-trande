// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mobilenetwork.fluent.models.UeInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for packet core list UEs API call.
 */
@Fluent
public final class UeInfoList {
    /*
     * A list of UEs in a packet core and their basic information.
     */
    @JsonProperty(value = "value")
    private List<UeInfoInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of UeInfoList class.
     */
    public UeInfoList() {
    }

    /**
     * Get the value property: A list of UEs in a packet core and their basic information.
     * 
     * @return the value value.
     */
    public List<UeInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of UEs in a packet core and their basic information.
     * 
     * @param value the value value to set.
     * @return the UeInfoList object itself.
     */
    public UeInfoList withValue(List<UeInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
