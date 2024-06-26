// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The move custom error info. */
@Immutable
public final class MoveErrorInfo {
    /*
     * The affected move resources.
     */
    @JsonProperty(value = "moveResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<AffectedMoveResource> moveResources;

    /** Creates an instance of MoveErrorInfo class. */
    public MoveErrorInfo() {
    }

    /**
     * Get the moveResources property: The affected move resources.
     *
     * @return the moveResources value.
     */
    public List<AffectedMoveResource> moveResources() {
        return this.moveResources;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (moveResources() != null) {
            moveResources().forEach(e -> e.validate());
        }
    }
}
