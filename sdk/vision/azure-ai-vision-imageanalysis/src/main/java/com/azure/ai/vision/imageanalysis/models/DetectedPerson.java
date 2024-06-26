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
 * Represents a person detected in an image.
 */
@Immutable
public final class DetectedPerson implements JsonSerializable<DetectedPerson> {

    /*
     * A rectangular boundary where the person was detected.
     */
    @Generated
    private ImageBoundingBox boundingBox;

    /*
     * A score, in the range of 0 to 1 (inclusive), representing the confidence that this detection was accurate.
     * Higher values indicating higher confidence.
     */
    @Generated
    private double confidence;

    /**
     * Creates an instance of DetectedPerson class.
     */
    @Generated
    private DetectedPerson() {
    }

    /**
     * Get the boundingBox property: A rectangular boundary where the person was detected.
     *
     * @return the boundingBox value.
     */
    @Generated
    public ImageBoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Get the confidence property: A score, in the range of 0 to 1 (inclusive), representing the confidence that this
     * detection was accurate.
     * Higher values indicating higher confidence.
     *
     * @return the confidence value.
     */
    @Generated
    public double getConfidence() {
        return this.confidence;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DetectedPerson from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DetectedPerson if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DetectedPerson.
     */
    @Generated
    public static DetectedPerson fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DetectedPerson deserializedDetectedPerson = new DetectedPerson();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("boundingBox".equals(fieldName)) {
                    deserializedDetectedPerson.boundingBox = ImageBoundingBox.fromJson(reader);
                } else if ("confidence".equals(fieldName)) {
                    deserializedDetectedPerson.confidence = reader.getDouble();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDetectedPerson;
        });
    }
}
