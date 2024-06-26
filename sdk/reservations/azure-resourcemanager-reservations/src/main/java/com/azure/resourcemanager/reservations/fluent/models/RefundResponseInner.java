// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.reservations.models.RefundResponseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response of refund request containing refund information of reservation. */
@Fluent
public final class RefundResponseInner {
    /*
     * Fully qualified identifier of the reservation being returned
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The refund properties of reservation
     */
    @JsonProperty(value = "properties")
    private RefundResponseProperties properties;

    /** Creates an instance of RefundResponseInner class. */
    public RefundResponseInner() {
    }

    /**
     * Get the id property: Fully qualified identifier of the reservation being returned.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified identifier of the reservation being returned.
     *
     * @param id the id value to set.
     * @return the RefundResponseInner object itself.
     */
    public RefundResponseInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties property: The refund properties of reservation.
     *
     * @return the properties value.
     */
    public RefundResponseProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The refund properties of reservation.
     *
     * @param properties the properties value to set.
     * @return the RefundResponseInner object itself.
     */
    public RefundResponseInner withProperties(RefundResponseProperties properties) {
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
