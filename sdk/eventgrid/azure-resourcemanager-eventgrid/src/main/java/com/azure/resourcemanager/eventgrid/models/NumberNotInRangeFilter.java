// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * NumberNotInRange Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = NumberNotInRangeFilter.class,
    visible = true)
@JsonTypeName("NumberNotInRange")
@Fluent
public final class NumberNotInRangeFilter extends Filter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    @JsonTypeId
    @JsonProperty(value = "operatorType", required = true)
    private FilterOperatorType operatorType = FilterOperatorType.NUMBER_NOT_IN_RANGE;

    /*
     * The set of filter values.
     */
    @JsonProperty(value = "values")
    private List<List<Double>> values;

    /**
     * Creates an instance of NumberNotInRangeFilter class.
     */
    public NumberNotInRangeFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public FilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the values property: The set of filter values.
     * 
     * @return the values value.
     */
    public List<List<Double>> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     * 
     * @param values the values value to set.
     * @return the NumberNotInRangeFilter object itself.
     */
    public NumberNotInRangeFilter withValues(List<List<Double>> values) {
        this.values = values;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NumberNotInRangeFilter withKey(String key) {
        super.withKey(key);
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
    }
}
