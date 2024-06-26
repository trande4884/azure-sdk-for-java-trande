// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Data Lake Analytics compute policy information. */
@Fluent
public final class ComputePolicyInner extends SubResource {
    /*
     * The compute policy properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ComputePolicyProperties innerProperties;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of ComputePolicyInner class. */
    public ComputePolicyInner() {
    }

    /**
     * Get the innerProperties property: The compute policy properties.
     *
     * @return the innerProperties value.
     */
    private ComputePolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ComputePolicyInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.innerProperties() == null ? null : this.innerProperties().objectId();
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     *
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.innerProperties() == null ? null : this.innerProperties().objectType();
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDegreeOfParallelismPerJob();
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().minPriorityPerJob();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
