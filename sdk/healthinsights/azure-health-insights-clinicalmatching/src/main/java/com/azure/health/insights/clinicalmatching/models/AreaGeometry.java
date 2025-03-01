// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * `GeoJSON` geometry, representing the area circle's center.
 */
@Immutable
public final class AreaGeometry implements JsonSerializable<AreaGeometry> {

    /*
     * `GeoJSON` geometry type.
     */
    @Generated
    private final GeoJsonGeometryType type;

    /*
     * Coordinates of the area circle's center, represented according to the `GeoJSON` standard.
     * This is an array of 2 decimal numbers, longitude and latitude (precisely in this order).
     */
    @Generated
    private final List<Double> coordinates;

    /**
     * Creates an instance of AreaGeometry class.
     *
     * @param type the type value to set.
     * @param coordinates the coordinates value to set.
     */
    @Generated
    public AreaGeometry(GeoJsonGeometryType type, List<Double> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    /**
     * Get the type property: `GeoJSON` geometry type.
     *
     * @return the type value.
     */
    @Generated
    public GeoJsonGeometryType getType() {
        return this.type;
    }

    /**
     * Get the coordinates property: Coordinates of the area circle's center, represented according to the `GeoJSON`
     * standard.
     * This is an array of 2 decimal numbers, longitude and latitude (precisely in this order).
     *
     * @return the coordinates value.
     */
    @Generated
    public List<Double> getCoordinates() {
        return this.coordinates;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("coordinates", this.coordinates, (writer, element) -> writer.writeDouble(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AreaGeometry from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AreaGeometry if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AreaGeometry.
     */
    @Generated
    public static AreaGeometry fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeoJsonGeometryType type = null;
            List<Double> coordinates = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    type = GeoJsonGeometryType.fromString(reader.getString());
                } else if ("coordinates".equals(fieldName)) {
                    coordinates = reader.readArray(reader1 -> reader1.getDouble());
                } else {
                    reader.skipChildren();
                }
            }
            return new AreaGeometry(type, coordinates);
        });
    }
}
