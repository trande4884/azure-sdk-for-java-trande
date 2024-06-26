// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Oracle sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = OracleSink.class, visible = true)
@JsonTypeName("OracleSink")
@Fluent
public final class OracleSink extends CopySink {
    /*
     * Copy sink type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "OracleSink";

    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Creates an instance of OracleSink class.
     */
    public OracleSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the OracleSink object itself.
     */
    public OracleSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
