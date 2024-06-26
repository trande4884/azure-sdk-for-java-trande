// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Represents the coordinates of a single pixel in the image.
 */
@Immutable
public final class ImagePoint implements JsonSerializable<ImagePoint> {

    /*
     * The horizontal x-coordinate of this point, in pixels. Zero values corresponds to the left-most pixels in the
     * image.
     */
    @Generated
    private final int x;

    /*
     * The vertical y-coordinate of this point, in pixels. Zero values corresponds to the top-most pixels in the image.
     */
    @Generated
    private final int y;

    /**
     * Creates an instance of ImagePoint class.
     *
     * @param x the x value to set.
     * @param y the y value to set.
     */
    @Generated
    private ImagePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the x property: The horizontal x-coordinate of this point, in pixels. Zero values corresponds to the
     * left-most pixels in the image.
     *
     * @return the x value.
     */
    @Generated
    public int getX() {
        return this.x;
    }

    /**
     * Get the y property: The vertical y-coordinate of this point, in pixels. Zero values corresponds to the top-most
     * pixels in the image.
     *
     * @return the y value.
     */
    @Generated
    public int getY() {
        return this.y;
    }

    /**
     * Returns a compact string containing the image point values in a style suitable for printing.
     *
     * @return A string containing the image point values.
     */
    public String toString() {
        return "(x=" + this.getX() + ", y=" + this.getY() + ")";
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("x", this.x);
        jsonWriter.writeIntField("y", this.y);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImagePoint from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImagePoint if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ImagePoint.
     */
    @Generated
    public static ImagePoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int x = 0;
            int y = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("x".equals(fieldName)) {
                    x = reader.getInt();
                } else if ("y".equals(fieldName)) {
                    y = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new ImagePoint(x, y);
        });
    }
}
