// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.databoxedge.models.ArmBaseModel;
import com.azure.resourcemanager.databoxedge.models.NodeStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a single node in a Data box Edge/Gateway device Gateway devices, standalone Edge devices and a single node
 * cluster Edge device will all have 1 node Multi-node Edge devices will have more than 1 nodes.
 */
@Immutable
public final class NodeInner extends ArmBaseModel {
    /*
     * The properties of the node
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private NodeProperties innerProperties;

    /** Creates an instance of NodeInner class. */
    public NodeInner() {
    }

    /**
     * Get the innerProperties property: The properties of the node.
     *
     * @return the innerProperties value.
     */
    private NodeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the nodeStatus property: The current status of the individual node.
     *
     * @return the nodeStatus value.
     */
    public NodeStatus nodeStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeStatus();
    }

    /**
     * Get the nodeChassisSerialNumber property: Serial number of the Chassis.
     *
     * @return the nodeChassisSerialNumber value.
     */
    public String nodeChassisSerialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeChassisSerialNumber();
    }

    /**
     * Get the nodeSerialNumber property: Serial number of the individual node.
     *
     * @return the nodeSerialNumber value.
     */
    public String nodeSerialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeSerialNumber();
    }

    /**
     * Get the nodeDisplayName property: Display Name of the individual node.
     *
     * @return the nodeDisplayName value.
     */
    public String nodeDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeDisplayName();
    }

    /**
     * Get the nodeFriendlySoftwareVersion property: Friendly software version name that is currently installed on the
     * node.
     *
     * @return the nodeFriendlySoftwareVersion value.
     */
    public String nodeFriendlySoftwareVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeFriendlySoftwareVersion();
    }

    /**
     * Get the nodeHcsVersion property: HCS version that is currently installed on the node.
     *
     * @return the nodeHcsVersion value.
     */
    public String nodeHcsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeHcsVersion();
    }

    /**
     * Get the nodeInstanceId property: Guid instance id of the node.
     *
     * @return the nodeInstanceId value.
     */
    public String nodeInstanceId() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeInstanceId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
