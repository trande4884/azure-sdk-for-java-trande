// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.ProvisioningServiceDescriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of provisioning service descriptions. */
@Fluent
public final class ProvisioningServiceDescriptionListResult {
    /*
     * List of provisioning service descriptions.
     */
    @JsonProperty(value = "value")
    private List<ProvisioningServiceDescriptionInner> value;

    /*
     * the next link
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of provisioning service descriptions.
     *
     * @return the value value.
     */
    public List<ProvisioningServiceDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of provisioning service descriptions.
     *
     * @param value the value value to set.
     * @return the ProvisioningServiceDescriptionListResult object itself.
     */
    public ProvisioningServiceDescriptionListResult withValue(List<ProvisioningServiceDescriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: the next link.
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
