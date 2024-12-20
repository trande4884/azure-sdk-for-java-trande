// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Pipeline topology describes the processing steps to be applied when processing media for a particular outcome. The
 * topology should be defined according to the scenario to be achieved and can be reused across many pipeline instances
 * which share the same processing characteristics. For instance, a pipeline topology which acquires data from a RTSP
 * camera, process it with an specific AI model and stored the data on the cloud can be reused across many different
 * cameras, as long as the same processing should be applied across all the cameras. Individual instance properties can
 * be defined through the use of user-defined parameters, which allow for a topology to be parameterized, thus allowing
 * individual pipelines to refer to different values, such as individual cameras RTSP endpoints and credentials. Overall
 * a topology is composed of the following:
 * 
 * - Parameters: list of user defined parameters that can be references across the topology nodes.
 * - Sources: list of one or more data sources nodes such as an RTSP source which allows for media to be ingested from
 * cameras.
 * - Processors: list of nodes which perform data analysis or transformations.
 * -Sinks: list of one or more data sinks which allow for data to be stored or exported to other destinations.
 */
@Fluent
public class PipelineTopology implements JsonSerializable<PipelineTopology> {
    /*
     * Pipeline topology unique identifier.
     */
    private final String name;

    /*
     * Read-only system metadata associated with this object.
     */
    private SystemData systemData;

    /*
     * Pipeline topology properties.
     */
    private PipelineTopologyProperties properties;

    /**
     * Creates an instance of PipelineTopology class.
     * 
     * @param name the name value to set.
     */
    public PipelineTopology(String name) {
        this.name = name;
    }

    /**
     * Get the name property: Pipeline topology unique identifier.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the systemData property: Read-only system metadata associated with this object.
     * 
     * @return the systemData value.
     */
    public SystemData getSystemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Read-only system metadata associated with this object.
     * 
     * @param systemData the systemData value to set.
     * @return the PipelineTopology object itself.
     */
    public PipelineTopology setSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the properties property: Pipeline topology properties.
     * 
     * @return the properties value.
     */
    public PipelineTopologyProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Pipeline topology properties.
     * 
     * @param properties the properties value to set.
     * @return the PipelineTopology object itself.
     */
    public PipelineTopology setProperties(PipelineTopologyProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("systemData", this.systemData);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PipelineTopology from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PipelineTopology if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PipelineTopology.
     */
    public static PipelineTopology fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            SystemData systemData = null;
            PipelineTopologyProperties properties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("systemData".equals(fieldName)) {
                    systemData = SystemData.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    properties = PipelineTopologyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                PipelineTopology deserializedPipelineTopology = new PipelineTopology(name);
                deserializedPipelineTopology.systemData = systemData;
                deserializedPipelineTopology.properties = properties;

                return deserializedPipelineTopology;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
