// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.newrelicobservability.models.AccountCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicAccountProperties;
import com.azure.resourcemanager.newrelicobservability.models.OrgCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.PlanData;
import com.azure.resourcemanager.newrelicobservability.models.UserInfo;
import java.io.IOException;

/**
 * The updatable properties of the NewRelicMonitorResource.
 */
@Fluent
public final class NewRelicMonitorResourceUpdateProperties
    implements JsonSerializable<NewRelicMonitorResourceUpdateProperties> {
    /*
     * MarketplaceSubscriptionStatus of the resource
     */
    private NewRelicAccountProperties newRelicAccountProperties;

    /*
     * User Info
     */
    private UserInfo userInfo;

    /*
     * Plan details
     */
    private PlanData planData;

    /*
     * Source of org creation
     */
    private OrgCreationSource orgCreationSource;

    /*
     * Source of account creation
     */
    private AccountCreationSource accountCreationSource;

    /**
     * Creates an instance of NewRelicMonitorResourceUpdateProperties class.
     */
    public NewRelicMonitorResourceUpdateProperties() {
    }

    /**
     * Get the newRelicAccountProperties property: MarketplaceSubscriptionStatus of the resource.
     * 
     * @return the newRelicAccountProperties value.
     */
    public NewRelicAccountProperties newRelicAccountProperties() {
        return this.newRelicAccountProperties;
    }

    /**
     * Set the newRelicAccountProperties property: MarketplaceSubscriptionStatus of the resource.
     * 
     * @param newRelicAccountProperties the newRelicAccountProperties value to set.
     * @return the NewRelicMonitorResourceUpdateProperties object itself.
     */
    public NewRelicMonitorResourceUpdateProperties
        withNewRelicAccountProperties(NewRelicAccountProperties newRelicAccountProperties) {
        this.newRelicAccountProperties = newRelicAccountProperties;
        return this;
    }

    /**
     * Get the userInfo property: User Info.
     * 
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: User Info.
     * 
     * @param userInfo the userInfo value to set.
     * @return the NewRelicMonitorResourceUpdateProperties object itself.
     */
    public NewRelicMonitorResourceUpdateProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the planData property: Plan details.
     * 
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: Plan details.
     * 
     * @param planData the planData value to set.
     * @return the NewRelicMonitorResourceUpdateProperties object itself.
     */
    public NewRelicMonitorResourceUpdateProperties withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the orgCreationSource property: Source of org creation.
     * 
     * @return the orgCreationSource value.
     */
    public OrgCreationSource orgCreationSource() {
        return this.orgCreationSource;
    }

    /**
     * Set the orgCreationSource property: Source of org creation.
     * 
     * @param orgCreationSource the orgCreationSource value to set.
     * @return the NewRelicMonitorResourceUpdateProperties object itself.
     */
    public NewRelicMonitorResourceUpdateProperties withOrgCreationSource(OrgCreationSource orgCreationSource) {
        this.orgCreationSource = orgCreationSource;
        return this;
    }

    /**
     * Get the accountCreationSource property: Source of account creation.
     * 
     * @return the accountCreationSource value.
     */
    public AccountCreationSource accountCreationSource() {
        return this.accountCreationSource;
    }

    /**
     * Set the accountCreationSource property: Source of account creation.
     * 
     * @param accountCreationSource the accountCreationSource value to set.
     * @return the NewRelicMonitorResourceUpdateProperties object itself.
     */
    public NewRelicMonitorResourceUpdateProperties
        withAccountCreationSource(AccountCreationSource accountCreationSource) {
        this.accountCreationSource = accountCreationSource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newRelicAccountProperties() != null) {
            newRelicAccountProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
        if (planData() != null) {
            planData().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("newRelicAccountProperties", this.newRelicAccountProperties);
        jsonWriter.writeJsonField("userInfo", this.userInfo);
        jsonWriter.writeJsonField("planData", this.planData);
        jsonWriter.writeStringField("orgCreationSource",
            this.orgCreationSource == null ? null : this.orgCreationSource.toString());
        jsonWriter.writeStringField("accountCreationSource",
            this.accountCreationSource == null ? null : this.accountCreationSource.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NewRelicMonitorResourceUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NewRelicMonitorResourceUpdateProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NewRelicMonitorResourceUpdateProperties.
     */
    public static NewRelicMonitorResourceUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NewRelicMonitorResourceUpdateProperties deserializedNewRelicMonitorResourceUpdateProperties
                = new NewRelicMonitorResourceUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("newRelicAccountProperties".equals(fieldName)) {
                    deserializedNewRelicMonitorResourceUpdateProperties.newRelicAccountProperties
                        = NewRelicAccountProperties.fromJson(reader);
                } else if ("userInfo".equals(fieldName)) {
                    deserializedNewRelicMonitorResourceUpdateProperties.userInfo = UserInfo.fromJson(reader);
                } else if ("planData".equals(fieldName)) {
                    deserializedNewRelicMonitorResourceUpdateProperties.planData = PlanData.fromJson(reader);
                } else if ("orgCreationSource".equals(fieldName)) {
                    deserializedNewRelicMonitorResourceUpdateProperties.orgCreationSource
                        = OrgCreationSource.fromString(reader.getString());
                } else if ("accountCreationSource".equals(fieldName)) {
                    deserializedNewRelicMonitorResourceUpdateProperties.accountCreationSource
                        = AccountCreationSource.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNewRelicMonitorResourceUpdateProperties;
        });
    }
}
