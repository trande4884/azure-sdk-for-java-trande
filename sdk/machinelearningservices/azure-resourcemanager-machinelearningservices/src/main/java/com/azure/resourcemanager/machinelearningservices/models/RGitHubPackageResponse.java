// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RGitHubPackageResponse model. */
@Fluent
public final class RGitHubPackageResponse {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(RGitHubPackageResponse.class);

    /*
     * Repository address in the format username/repo[/subdir][@ref|#pull].
     */
    @JsonProperty(value = "repository")
    private String repository;

    /**
     * Get the repository property: Repository address in the format username/repo[/subdir][@ref|#pull].
     *
     * @return the repository value.
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository property: Repository address in the format username/repo[/subdir][@ref|#pull].
     *
     * @param repository the repository value to set.
     * @return the RGitHubPackageResponse object itself.
     */
    public RGitHubPackageResponse withRepository(String repository) {
        this.repository = repository;
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
