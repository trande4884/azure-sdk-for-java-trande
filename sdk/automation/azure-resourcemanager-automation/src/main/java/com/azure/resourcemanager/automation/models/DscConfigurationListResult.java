// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.fluent.models.DscConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the list configuration operation. */
@Fluent
public final class DscConfigurationListResult {
    /*
     * Gets or sets a list of configurations.
     */
    @JsonProperty(value = "value")
    private List<DscConfigurationInner> value;

    /*
     * Gets or sets the next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Gets the total number of configurations matching filter criteria.
     */
    @JsonProperty(value = "totalCount")
    private Integer totalCount;

    /**
     * Get the value property: Gets or sets a list of configurations.
     *
     * @return the value value.
     */
    public List<DscConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of configurations.
     *
     * @param value the value value to set.
     * @return the DscConfigurationListResult object itself.
     */
    public DscConfigurationListResult withValue(List<DscConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the DscConfigurationListResult object itself.
     */
    public DscConfigurationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the totalCount property: Gets the total number of configurations matching filter criteria.
     *
     * @return the totalCount value.
     */
    public Integer totalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: Gets the total number of configurations matching filter criteria.
     *
     * @param totalCount the totalCount value to set.
     * @return the DscConfigurationListResult object itself.
     */
    public DscConfigurationListResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
