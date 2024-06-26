// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The debug setting.
 */
@Fluent
public final class DeploymentStacksDebugSetting {
    /*
     * Specifies the type of information to log for debugging. The permitted values are none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The default is none. When setting this value, carefully consider the type of information that is being passed in during deployment. By logging information about the request or response, sensitive data that is retrieved through the deployment operations could potentially be exposed.
     */
    @JsonProperty(value = "detailLevel")
    private String detailLevel;

    /**
     * Creates an instance of DeploymentStacksDebugSetting class.
     */
    public DeploymentStacksDebugSetting() {
    }

    /**
     * Get the detailLevel property: Specifies the type of information to log for debugging. The permitted values are
     * none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The
     * default is none. When setting this value, carefully consider the type of information that is being passed in
     * during deployment. By logging information about the request or response, sensitive data that is retrieved through
     * the deployment operations could potentially be exposed.
     * 
     * @return the detailLevel value.
     */
    public String detailLevel() {
        return this.detailLevel;
    }

    /**
     * Set the detailLevel property: Specifies the type of information to log for debugging. The permitted values are
     * none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The
     * default is none. When setting this value, carefully consider the type of information that is being passed in
     * during deployment. By logging information about the request or response, sensitive data that is retrieved through
     * the deployment operations could potentially be exposed.
     * 
     * @param detailLevel the detailLevel value to set.
     * @return the DeploymentStacksDebugSetting object itself.
     */
    public DeploymentStacksDebugSetting withDetailLevel(String detailLevel) {
        this.detailLevel = detailLevel;
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
