// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.implementation;

import com.azure.resourcemanager.costmanagement.fluent.models.GenerateDetailedCostReportOperationResultInner;
import com.azure.resourcemanager.costmanagement.models.GenerateDetailedCostReportOperationResult;
import java.time.OffsetDateTime;

public final class GenerateDetailedCostReportOperationResultImpl implements GenerateDetailedCostReportOperationResult {
    private GenerateDetailedCostReportOperationResultInner innerObject;

    private final com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager;

    GenerateDetailedCostReportOperationResultImpl(GenerateDetailedCostReportOperationResultInner innerObject,
        com.azure.resourcemanager.costmanagement.CostManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime expiryTime() {
        return this.innerModel().expiryTime();
    }

    public OffsetDateTime validTill() {
        return this.innerModel().validTill();
    }

    public String downloadUrl() {
        return this.innerModel().downloadUrl();
    }

    public GenerateDetailedCostReportOperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.costmanagement.CostManagementManager manager() {
        return this.serviceManager;
    }
}
