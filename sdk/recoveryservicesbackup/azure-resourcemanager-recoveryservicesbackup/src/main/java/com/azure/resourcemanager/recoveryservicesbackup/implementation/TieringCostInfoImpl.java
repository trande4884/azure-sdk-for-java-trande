// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.TieringCostInfoInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringCostInfo;

public final class TieringCostInfoImpl implements TieringCostInfo {
    private TieringCostInfoInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    TieringCostInfoImpl(TieringCostInfoInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String objectType() {
        return this.innerModel().objectType();
    }

    public TieringCostInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
