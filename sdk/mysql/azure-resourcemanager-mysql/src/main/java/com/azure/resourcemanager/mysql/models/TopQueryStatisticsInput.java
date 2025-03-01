// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.fluent.models.TopQueryStatisticsInputProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Input to get top query statistics. */
@Fluent
public final class TopQueryStatisticsInput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(TopQueryStatisticsInput.class);

    /*
     * The properties of a wait statistics input.
     */
    @JsonProperty(value = "properties", required = true)
    private TopQueryStatisticsInputProperties innerProperties = new TopQueryStatisticsInputProperties();

    /**
     * Get the innerProperties property: The properties of a wait statistics input.
     *
     * @return the innerProperties value.
     */
    private TopQueryStatisticsInputProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the numberOfTopQueries property: Max number of top queries to return.
     *
     * @return the numberOfTopQueries value.
     */
    public int numberOfTopQueries() {
        return this.innerProperties() == null ? 0 : this.innerProperties().numberOfTopQueries();
    }

    /**
     * Set the numberOfTopQueries property: Max number of top queries to return.
     *
     * @param numberOfTopQueries the numberOfTopQueries value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withNumberOfTopQueries(int numberOfTopQueries) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopQueryStatisticsInputProperties();
        }
        this.innerProperties().withNumberOfTopQueries(numberOfTopQueries);
        return this;
    }

    /**
     * Get the aggregationFunction property: Aggregation function name.
     *
     * @return the aggregationFunction value.
     */
    public String aggregationFunction() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregationFunction();
    }

    /**
     * Set the aggregationFunction property: Aggregation function name.
     *
     * @param aggregationFunction the aggregationFunction value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withAggregationFunction(String aggregationFunction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopQueryStatisticsInputProperties();
        }
        this.innerProperties().withAggregationFunction(aggregationFunction);
        return this;
    }

    /**
     * Get the observedMetric property: Observed metric name.
     *
     * @return the observedMetric value.
     */
    public String observedMetric() {
        return this.innerProperties() == null ? null : this.innerProperties().observedMetric();
    }

    /**
     * Set the observedMetric property: Observed metric name.
     *
     * @param observedMetric the observedMetric value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withObservedMetric(String observedMetric) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopQueryStatisticsInputProperties();
        }
        this.innerProperties().withObservedMetric(observedMetric);
        return this;
    }

    /**
     * Get the observationStartTime property: Observation start time.
     *
     * @return the observationStartTime value.
     */
    public OffsetDateTime observationStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().observationStartTime();
    }

    /**
     * Set the observationStartTime property: Observation start time.
     *
     * @param observationStartTime the observationStartTime value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withObservationStartTime(OffsetDateTime observationStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopQueryStatisticsInputProperties();
        }
        this.innerProperties().withObservationStartTime(observationStartTime);
        return this;
    }

    /**
     * Get the observationEndTime property: Observation end time.
     *
     * @return the observationEndTime value.
     */
    public OffsetDateTime observationEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().observationEndTime();
    }

    /**
     * Set the observationEndTime property: Observation end time.
     *
     * @param observationEndTime the observationEndTime value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withObservationEndTime(OffsetDateTime observationEndTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopQueryStatisticsInputProperties();
        }
        this.innerProperties().withObservationEndTime(observationEndTime);
        return this;
    }

    /**
     * Get the aggregationWindow property: Aggregation interval type in ISO 8601 format.
     *
     * @return the aggregationWindow value.
     */
    public String aggregationWindow() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregationWindow();
    }

    /**
     * Set the aggregationWindow property: Aggregation interval type in ISO 8601 format.
     *
     * @param aggregationWindow the aggregationWindow value to set.
     * @return the TopQueryStatisticsInput object itself.
     */
    public TopQueryStatisticsInput withAggregationWindow(String aggregationWindow) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopQueryStatisticsInputProperties();
        }
        this.innerProperties().withAggregationWindow(aggregationWindow);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model TopQueryStatisticsInput"));
        } else {
            innerProperties().validate();
        }
    }
}
