// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.deploymentmanager.models.RolloutOperationInfo;
import com.azure.resourcemanager.deploymentmanager.models.Service;
import com.azure.resourcemanager.deploymentmanager.models.StepGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that define a rollout. */
@Fluent
public final class RolloutProperties extends RolloutRequestProperties {
    /*
     * The current status of the rollout.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The cardinal count of total number of retries performed on the rollout at a given time.
     */
    @JsonProperty(value = "totalRetryAttempts", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalRetryAttempts;

    /*
     * Operational information of the rollout.
     */
    @JsonProperty(value = "operationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private RolloutOperationInfo operationInfo;

    /*
     * The detailed information on the services being deployed.
     */
    @JsonProperty(value = "services", access = JsonProperty.Access.WRITE_ONLY)
    private List<Service> services;

    /** Creates an instance of RolloutProperties class. */
    public RolloutProperties() {
    }

    /**
     * Get the status property: The current status of the rollout.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the totalRetryAttempts property: The cardinal count of total number of retries performed on the rollout at a
     * given time.
     *
     * @return the totalRetryAttempts value.
     */
    public Integer totalRetryAttempts() {
        return this.totalRetryAttempts;
    }

    /**
     * Get the operationInfo property: Operational information of the rollout.
     *
     * @return the operationInfo value.
     */
    public RolloutOperationInfo operationInfo() {
        return this.operationInfo;
    }

    /**
     * Get the services property: The detailed information on the services being deployed.
     *
     * @return the services value.
     */
    public List<Service> services() {
        return this.services;
    }

    /** {@inheritDoc} */
    @Override
    public RolloutProperties withBuildVersion(String buildVersion) {
        super.withBuildVersion(buildVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RolloutProperties withArtifactSourceId(String artifactSourceId) {
        super.withArtifactSourceId(artifactSourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RolloutProperties withTargetServiceTopologyId(String targetServiceTopologyId) {
        super.withTargetServiceTopologyId(targetServiceTopologyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RolloutProperties withStepGroups(List<StepGroup> stepGroups) {
        super.withStepGroups(stepGroups);
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
        if (operationInfo() != null) {
            operationInfo().validate();
        }
        if (services() != null) {
            services().forEach(e -> e.validate());
        }
    }
}
