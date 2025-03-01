// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Model class for event details of a VMwareAzureV2 event.
 */
@Fluent
public final class InMageAzureV2EventDetails extends EventProviderSpecificDetails {
    /*
     * Gets the class type. Overridden in derived classes.
     */
    private String instanceType = "InMageAzureV2";

    /*
     * InMage Event type. Takes one of the values of InMageDataContract.InMageMonitoringEventType.
     */
    private String eventType;

    /*
     * InMage Event Category.
     */
    private String category;

    /*
     * InMage Event Component.
     */
    private String component;

    /*
     * Corrective Action string for the event.
     */
    private String correctiveAction;

    /*
     * InMage Event Details.
     */
    private String details;

    /*
     * InMage Event Summary.
     */
    private String summary;

    /*
     * VMware Site name.
     */
    private String siteName;

    /**
     * Creates an instance of InMageAzureV2EventDetails class.
     */
    public InMageAzureV2EventDetails() {
    }

    /**
     * Get the instanceType property: Gets the class type. Overridden in derived classes.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the eventType property: InMage Event type. Takes one of the values of
     * InMageDataContract.InMageMonitoringEventType.
     * 
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: InMage Event type. Takes one of the values of
     * InMageDataContract.InMageMonitoringEventType.
     * 
     * @param eventType the eventType value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the category property: InMage Event Category.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: InMage Event Category.
     * 
     * @param category the category value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the component property: InMage Event Component.
     * 
     * @return the component value.
     */
    public String component() {
        return this.component;
    }

    /**
     * Set the component property: InMage Event Component.
     * 
     * @param component the component value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * Get the correctiveAction property: Corrective Action string for the event.
     * 
     * @return the correctiveAction value.
     */
    public String correctiveAction() {
        return this.correctiveAction;
    }

    /**
     * Set the correctiveAction property: Corrective Action string for the event.
     * 
     * @param correctiveAction the correctiveAction value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
        return this;
    }

    /**
     * Get the details property: InMage Event Details.
     * 
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: InMage Event Details.
     * 
     * @param details the details value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Get the summary property: InMage Event Summary.
     * 
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: InMage Event Summary.
     * 
     * @param summary the summary value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the siteName property: VMware Site name.
     * 
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Set the siteName property: VMware Site name.
     * 
     * @param siteName the siteName value to set.
     * @return the InMageAzureV2EventDetails object itself.
     */
    public InMageAzureV2EventDetails withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("eventType", this.eventType);
        jsonWriter.writeStringField("category", this.category);
        jsonWriter.writeStringField("component", this.component);
        jsonWriter.writeStringField("correctiveAction", this.correctiveAction);
        jsonWriter.writeStringField("details", this.details);
        jsonWriter.writeStringField("summary", this.summary);
        jsonWriter.writeStringField("siteName", this.siteName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InMageAzureV2EventDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InMageAzureV2EventDetails if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InMageAzureV2EventDetails.
     */
    public static InMageAzureV2EventDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InMageAzureV2EventDetails deserializedInMageAzureV2EventDetails = new InMageAzureV2EventDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.instanceType = reader.getString();
                } else if ("eventType".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.eventType = reader.getString();
                } else if ("category".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.category = reader.getString();
                } else if ("component".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.component = reader.getString();
                } else if ("correctiveAction".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.correctiveAction = reader.getString();
                } else if ("details".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.details = reader.getString();
                } else if ("summary".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.summary = reader.getString();
                } else if ("siteName".equals(fieldName)) {
                    deserializedInMageAzureV2EventDetails.siteName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInMageAzureV2EventDetails;
        });
    }
}
