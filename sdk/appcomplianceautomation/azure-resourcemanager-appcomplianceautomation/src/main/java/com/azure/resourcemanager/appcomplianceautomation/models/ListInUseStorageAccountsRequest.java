// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Parameters for listing in use storage accounts operation. If subscription list is null, it will check the user's all
 * subscriptions.
 */
@Fluent
public final class ListInUseStorageAccountsRequest implements JsonSerializable<ListInUseStorageAccountsRequest> {
    /*
     * List of subscription ids to be query. If the list is null or empty, the API will query all the subscriptions of
     * the user.
     */
    private List<String> subscriptionIds;

    /**
     * Creates an instance of ListInUseStorageAccountsRequest class.
     */
    public ListInUseStorageAccountsRequest() {
    }

    /**
     * Get the subscriptionIds property: List of subscription ids to be query. If the list is null or empty, the API
     * will query all the subscriptions of the user.
     * 
     * @return the subscriptionIds value.
     */
    public List<String> subscriptionIds() {
        return this.subscriptionIds;
    }

    /**
     * Set the subscriptionIds property: List of subscription ids to be query. If the list is null or empty, the API
     * will query all the subscriptions of the user.
     * 
     * @param subscriptionIds the subscriptionIds value to set.
     * @return the ListInUseStorageAccountsRequest object itself.
     */
    public ListInUseStorageAccountsRequest withSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
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
        jsonWriter.writeArrayField("subscriptionIds", this.subscriptionIds,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListInUseStorageAccountsRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListInUseStorageAccountsRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListInUseStorageAccountsRequest.
     */
    public static ListInUseStorageAccountsRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListInUseStorageAccountsRequest deserializedListInUseStorageAccountsRequest
                = new ListInUseStorageAccountsRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscriptionIds".equals(fieldName)) {
                    List<String> subscriptionIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedListInUseStorageAccountsRequest.subscriptionIds = subscriptionIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListInUseStorageAccountsRequest;
        });
    }
}
