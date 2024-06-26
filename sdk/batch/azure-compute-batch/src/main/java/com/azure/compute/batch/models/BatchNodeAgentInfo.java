// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Batch Compute Node agent is a program that runs on each Compute Node in the
 * Pool and provides Batch capability on the Compute Node.
 */
@Immutable
public final class BatchNodeAgentInfo implements JsonSerializable<BatchNodeAgentInfo> {

    /*
     * The version of the Batch Compute Node agent running on the Compute Node. This version number can be checked
     * against the Compute Node agent release notes located at
     * https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     */
    @Generated
    private final String version;

    /*
     * The time when the Compute Node agent was updated on the Compute Node. This is the most recent time that the
     * Compute Node agent was updated to a new version.
     */
    @Generated
    private final OffsetDateTime lastUpdateTime;

    /**
     * Creates an instance of BatchNodeAgentInfo class.
     *
     * @param version the version value to set.
     * @param lastUpdateTime the lastUpdateTime value to set.
     */
    @Generated
    private BatchNodeAgentInfo(String version, OffsetDateTime lastUpdateTime) {
        this.version = version;
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * Get the version property: The version of the Batch Compute Node agent running on the Compute Node. This version
     * number can be checked against the Compute Node agent release notes located at
     * https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     *
     * @return the version value.
     */
    @Generated
    public String getVersion() {
        return this.version;
    }

    /**
     * Get the lastUpdateTime property: The time when the Compute Node agent was updated on the Compute Node. This is
     * the most recent time that the Compute Node agent was updated to a new version.
     *
     * @return the lastUpdateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeStringField("lastUpdateTime",
            this.lastUpdateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdateTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchNodeAgentInfo from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchNodeAgentInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchNodeAgentInfo.
     */
    @Generated
    public static BatchNodeAgentInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String version = null;
            OffsetDateTime lastUpdateTime = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("version".equals(fieldName)) {
                    version = reader.getString();
                } else if ("lastUpdateTime".equals(fieldName)) {
                    lastUpdateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return new BatchNodeAgentInfo(version, lastUpdateTime);
        });
    }
}
