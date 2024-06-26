// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * private cloud provisioning state.
 */
public final class PrivateCloudProvisioningState extends ExpandableStringEnum<PrivateCloudProvisioningState> {
    /**
     * Static value Succeeded for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Cancelled for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState CANCELLED = fromString("Cancelled");

    /**
     * Static value Pending for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState PENDING = fromString("Pending");

    /**
     * Static value Building for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState BUILDING = fromString("Building");

    /**
     * Static value Deleting for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Updating for PrivateCloudProvisioningState.
     */
    public static final PrivateCloudProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of PrivateCloudProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateCloudProvisioningState() {
    }

    /**
     * Creates or finds a PrivateCloudProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateCloudProvisioningState.
     */
    public static PrivateCloudProvisioningState fromString(String name) {
        return fromString(name, PrivateCloudProvisioningState.class);
    }

    /**
     * Gets known PrivateCloudProvisioningState values.
     * 
     * @return known PrivateCloudProvisioningState values.
     */
    public static Collection<PrivateCloudProvisioningState> values() {
        return values(PrivateCloudProvisioningState.class);
    }
}
