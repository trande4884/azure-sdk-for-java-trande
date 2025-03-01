// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents a Database.
 */
@Fluent
public final class DatabaseInner extends ProxyResource {
    /*
     * The properties of a database.
     */
    private DatabaseProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of DatabaseInner class.
     */
    public DatabaseInner() {
    }

    /**
     * Get the innerProperties property: The properties of a database.
     * 
     * @return the innerProperties value.
     */
    private DatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the charset property: The charset of the database.
     * 
     * @return the charset value.
     */
    public String charset() {
        return this.innerProperties() == null ? null : this.innerProperties().charset();
    }

    /**
     * Set the charset property: The charset of the database.
     * 
     * @param charset the charset value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCharset(String charset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseProperties();
        }
        this.innerProperties().withCharset(charset);
        return this;
    }

    /**
     * Get the collation property: The collation of the database.
     * 
     * @return the collation value.
     */
    public String collation() {
        return this.innerProperties() == null ? null : this.innerProperties().collation();
    }

    /**
     * Set the collation property: The collation of the database.
     * 
     * @param collation the collation value to set.
     * @return the DatabaseInner object itself.
     */
    public DatabaseInner withCollation(String collation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseProperties();
        }
        this.innerProperties().withCollation(collation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DatabaseInner.
     */
    public static DatabaseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseInner deserializedDatabaseInner = new DatabaseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDatabaseInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDatabaseInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDatabaseInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDatabaseInner.innerProperties = DatabaseProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedDatabaseInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseInner;
        });
    }
}
