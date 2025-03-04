// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties and filters for ShareQuota. The request parameter is optional, if there are no filters specified.
 */
@Fluent
public class GroupQuotasEntityBasePatch implements JsonSerializable<GroupQuotasEntityBasePatch> {
    /*
     * Display name of the GroupQuota entity.
     */
    private String displayName;

    /*
     * Provisioning state of the operation.
     */
    private RequestState provisioningState;

    /**
     * Creates an instance of GroupQuotasEntityBasePatch class.
     */
    public GroupQuotasEntityBasePatch() {
    }

    /**
     * Get the displayName property: Display name of the GroupQuota entity.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the GroupQuota entity.
     * 
     * @param displayName the displayName value to set.
     * @return the GroupQuotasEntityBasePatch object itself.
     */
    public GroupQuotasEntityBasePatch withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the operation.
     * 
     * @return the provisioningState value.
     */
    public RequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the operation.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the GroupQuotasEntityBasePatch object itself.
     */
    GroupQuotasEntityBasePatch withProvisioningState(RequestState provisioningState) {
        this.provisioningState = provisioningState;
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
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GroupQuotasEntityBasePatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GroupQuotasEntityBasePatch if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GroupQuotasEntityBasePatch.
     */
    public static GroupQuotasEntityBasePatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GroupQuotasEntityBasePatch deserializedGroupQuotasEntityBasePatch = new GroupQuotasEntityBasePatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayName".equals(fieldName)) {
                    deserializedGroupQuotasEntityBasePatch.displayName = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedGroupQuotasEntityBasePatch.provisioningState
                        = RequestState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGroupQuotasEntityBasePatch;
        });
    }
}
