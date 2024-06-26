// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

/** The inference results for the Trial Matcher request. */
@Immutable
public final class TrialMatcherResults {
    /*
     * Results for the patients given in the request.
     */
    @JsonProperty(value = "patients", required = true)
    private List<TrialMatcherPatientResult> patients;

    /*
     * The version of the model used for inference, expressed as the model date.
     */
    @JsonProperty(value = "modelVersion", required = true)
    private String modelVersion;

    /*
     * The date when the clinical trials knowledge graph was last updated.
     */
    @JsonProperty(value = "knowledgeGraphLastUpdateDate")
    private LocalDate knowledgeGraphLastUpdateDate;

    /**
     * Creates an instance of TrialMatcherResults class.
     *
     * @param patients the patients value to set.
     * @param modelVersion the modelVersion value to set.
     */
    @JsonCreator
    private TrialMatcherResults(
            @JsonProperty(value = "patients", required = true) List<TrialMatcherPatientResult> patients,
            @JsonProperty(value = "modelVersion", required = true) String modelVersion) {
        this.patients = patients;
        this.modelVersion = modelVersion;
    }

    /**
     * Get the patients property: Results for the patients given in the request.
     *
     * @return the patients value.
     */
    public List<TrialMatcherPatientResult> getPatients() {
        return this.patients;
    }

    /**
     * Get the modelVersion property: The version of the model used for inference, expressed as the model date.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Get the knowledgeGraphLastUpdateDate property: The date when the clinical trials knowledge graph was last
     * updated.
     *
     * @return the knowledgeGraphLastUpdateDate value.
     */
    public LocalDate getKnowledgeGraphLastUpdateDate() {
        return this.knowledgeGraphLastUpdateDate;
    }
}
