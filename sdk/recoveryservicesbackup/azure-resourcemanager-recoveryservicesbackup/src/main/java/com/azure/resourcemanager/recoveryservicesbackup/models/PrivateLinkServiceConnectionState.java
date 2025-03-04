// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Private Link Service Connection State.
 */
@Fluent
public final class PrivateLinkServiceConnectionState implements JsonSerializable<PrivateLinkServiceConnectionState> {
    /*
     * Gets or sets the status
     */
    private PrivateEndpointConnectionStatus status;

    /*
     * Gets or sets description
     */
    private String description;

    /*
     * Gets or sets actions required
     */
    private String actionRequired;

    /**
     * Creates an instance of PrivateLinkServiceConnectionState class.
     */
    public PrivateLinkServiceConnectionState() {
    }

    /**
     * Get the status property: Gets or sets the status.
     * 
     * @return the status value.
     */
    public PrivateEndpointConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Gets or sets the status.
     * 
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: Gets or sets description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets description.
     * 
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionRequired property: Gets or sets actions required.
     * 
     * @return the actionRequired value.
     */
    public String actionRequired() {
        return this.actionRequired;
    }

    /**
     * Set the actionRequired property: Gets or sets actions required.
     * 
     * @param actionRequired the actionRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("actionsRequired", this.actionRequired);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServiceConnectionState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServiceConnectionState if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServiceConnectionState.
     */
    public static PrivateLinkServiceConnectionState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServiceConnectionState deserializedPrivateLinkServiceConnectionState
                = new PrivateLinkServiceConnectionState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.status
                        = PrivateEndpointConnectionStatus.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.description = reader.getString();
                } else if ("actionsRequired".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.actionRequired = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServiceConnectionState;
        });
    }
}
