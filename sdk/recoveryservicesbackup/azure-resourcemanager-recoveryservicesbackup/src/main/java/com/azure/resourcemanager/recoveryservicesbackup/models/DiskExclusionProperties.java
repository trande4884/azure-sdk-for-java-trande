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
import java.util.List;

/**
 * The DiskExclusionProperties model.
 */
@Fluent
public final class DiskExclusionProperties implements JsonSerializable<DiskExclusionProperties> {
    /*
     * List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     */
    private List<Integer> diskLunList;

    /*
     * Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     */
    private Boolean isInclusionList;

    /**
     * Creates an instance of DiskExclusionProperties class.
     */
    public DiskExclusionProperties() {
    }

    /**
     * Get the diskLunList property: List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
     * @return the diskLunList value.
     */
    public List<Integer> diskLunList() {
        return this.diskLunList;
    }

    /**
     * Set the diskLunList property: List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
     * @param diskLunList the diskLunList value to set.
     * @return the DiskExclusionProperties object itself.
     */
    public DiskExclusionProperties withDiskLunList(List<Integer> diskLunList) {
        this.diskLunList = diskLunList;
        return this;
    }

    /**
     * Get the isInclusionList property: Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
     * @return the isInclusionList value.
     */
    public Boolean isInclusionList() {
        return this.isInclusionList;
    }

    /**
     * Set the isInclusionList property: Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
     * @param isInclusionList the isInclusionList value to set.
     * @return the DiskExclusionProperties object itself.
     */
    public DiskExclusionProperties withIsInclusionList(Boolean isInclusionList) {
        this.isInclusionList = isInclusionList;
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
        jsonWriter.writeArrayField("diskLunList", this.diskLunList, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeBooleanField("isInclusionList", this.isInclusionList);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskExclusionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskExclusionProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiskExclusionProperties.
     */
    public static DiskExclusionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskExclusionProperties deserializedDiskExclusionProperties = new DiskExclusionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("diskLunList".equals(fieldName)) {
                    List<Integer> diskLunList = reader.readArray(reader1 -> reader1.getInt());
                    deserializedDiskExclusionProperties.diskLunList = diskLunList;
                } else if ("isInclusionList".equals(fieldName)) {
                    deserializedDiskExclusionProperties.isInclusionList = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskExclusionProperties;
        });
    }
}
