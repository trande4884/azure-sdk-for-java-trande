// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list with a single sensitivity settings resource.
 */
@Fluent
public final class GetSensitivitySettingsListResponseInner {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<GetSensitivitySettingsResponseInner> value;

    /**
     * Creates an instance of GetSensitivitySettingsListResponseInner class.
     */
    public GetSensitivitySettingsListResponseInner() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<GetSensitivitySettingsResponseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the GetSensitivitySettingsListResponseInner object itself.
     */
    public GetSensitivitySettingsListResponseInner withValue(List<GetSensitivitySettingsResponseInner> value) {
        this.value = value;
        return this;
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
