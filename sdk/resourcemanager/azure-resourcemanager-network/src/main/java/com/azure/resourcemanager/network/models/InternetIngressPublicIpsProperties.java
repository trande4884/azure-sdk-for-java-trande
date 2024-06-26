// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Internet Ingress Public Ip Properties
 * 
 * Resource Uri of Public Ip for Standard Load Balancer Frontend End.
 */
@Fluent
public final class InternetIngressPublicIpsProperties {
    /*
     * Resource Uri of Public Ip
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of InternetIngressPublicIpsProperties class.
     */
    public InternetIngressPublicIpsProperties() {
    }

    /**
     * Get the id property: Resource Uri of Public Ip.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Uri of Public Ip.
     * 
     * @param id the id value to set.
     * @return the InternetIngressPublicIpsProperties object itself.
     */
    public InternetIngressPublicIpsProperties withId(String id) {
        this.id = id;
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
