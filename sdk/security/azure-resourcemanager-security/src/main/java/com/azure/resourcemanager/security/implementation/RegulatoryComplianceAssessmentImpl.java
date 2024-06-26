// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceAssessmentInner;
import com.azure.resourcemanager.security.models.RegulatoryComplianceAssessment;
import com.azure.resourcemanager.security.models.State;

public final class RegulatoryComplianceAssessmentImpl implements RegulatoryComplianceAssessment {
    private RegulatoryComplianceAssessmentInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    RegulatoryComplianceAssessmentImpl(RegulatoryComplianceAssessmentInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public String description() {
        return this.innerModel().description();
    }

    public String assessmentType() {
        return this.innerModel().assessmentType();
    }

    public String assessmentDetailsLink() {
        return this.innerModel().assessmentDetailsLink();
    }

    public State state() {
        return this.innerModel().state();
    }

    public Integer passedResources() {
        return this.innerModel().passedResources();
    }

    public Integer failedResources() {
        return this.innerModel().failedResources();
    }

    public Integer skippedResources() {
        return this.innerModel().skippedResources();
    }

    public Integer unsupportedResources() {
        return this.innerModel().unsupportedResources();
    }

    public RegulatoryComplianceAssessmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
