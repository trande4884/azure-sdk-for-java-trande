// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Log file URL payload.
 */
@Fluent
public final class LogFileUrlResponseInner {
    /*
     * URL of the log file
     */
    @JsonProperty(value = "url", required = true)
    private String url;

    /**
     * Creates an instance of LogFileUrlResponseInner class.
     */
    public LogFileUrlResponseInner() {
    }

    /**
     * Get the url property: URL of the log file.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL of the log file.
     * 
     * @param url the url value to set.
     * @return the LogFileUrlResponseInner object itself.
     */
    public LogFileUrlResponseInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property url in model LogFileUrlResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogFileUrlResponseInner.class);
}
