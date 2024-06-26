// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties for a CVE analysis summary.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "summaryType")
@JsonTypeName("CVE")
@Fluent
public final class CveSummary extends SummaryResourceProperties {
    /*
     * The total number of critical severity CVEs detected
     */
    @JsonProperty(value = "critical")
    private Long critical;

    /*
     * The total number of high severity CVEs detected
     */
    @JsonProperty(value = "high")
    private Long high;

    /*
     * The total number of medium severity CVEs detected
     */
    @JsonProperty(value = "medium")
    private Long medium;

    /*
     * The total number of low severity CVEs detected
     */
    @JsonProperty(value = "low")
    private Long low;

    /*
     * The total number of unknown severity CVEs detected
     */
    @JsonProperty(value = "unknown")
    private Long unknown;

    /**
     * Creates an instance of CveSummary class.
     */
    public CveSummary() {
    }

    /**
     * Get the critical property: The total number of critical severity CVEs detected.
     * 
     * @return the critical value.
     */
    public Long critical() {
        return this.critical;
    }

    /**
     * Set the critical property: The total number of critical severity CVEs detected.
     * 
     * @param critical the critical value to set.
     * @return the CveSummary object itself.
     */
    public CveSummary withCritical(Long critical) {
        this.critical = critical;
        return this;
    }

    /**
     * Get the high property: The total number of high severity CVEs detected.
     * 
     * @return the high value.
     */
    public Long high() {
        return this.high;
    }

    /**
     * Set the high property: The total number of high severity CVEs detected.
     * 
     * @param high the high value to set.
     * @return the CveSummary object itself.
     */
    public CveSummary withHigh(Long high) {
        this.high = high;
        return this;
    }

    /**
     * Get the medium property: The total number of medium severity CVEs detected.
     * 
     * @return the medium value.
     */
    public Long medium() {
        return this.medium;
    }

    /**
     * Set the medium property: The total number of medium severity CVEs detected.
     * 
     * @param medium the medium value to set.
     * @return the CveSummary object itself.
     */
    public CveSummary withMedium(Long medium) {
        this.medium = medium;
        return this;
    }

    /**
     * Get the low property: The total number of low severity CVEs detected.
     * 
     * @return the low value.
     */
    public Long low() {
        return this.low;
    }

    /**
     * Set the low property: The total number of low severity CVEs detected.
     * 
     * @param low the low value to set.
     * @return the CveSummary object itself.
     */
    public CveSummary withLow(Long low) {
        this.low = low;
        return this;
    }

    /**
     * Get the unknown property: The total number of unknown severity CVEs detected.
     * 
     * @return the unknown value.
     */
    public Long unknown() {
        return this.unknown;
    }

    /**
     * Set the unknown property: The total number of unknown severity CVEs detected.
     * 
     * @param unknown the unknown value to set.
     * @return the CveSummary object itself.
     */
    public CveSummary withUnknown(Long unknown) {
        this.unknown = unknown;
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
