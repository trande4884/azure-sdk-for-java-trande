// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.JobStreamInner;
import com.azure.resourcemanager.automation.models.JobStreamType;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JobStreamInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobStreamInner model = BinaryData.fromString(
            "{\"id\":\"kgpwoz\",\"properties\":{\"jobStreamId\":\"fpbsjyofdxl\",\"time\":\"2021-06-15T07:35:54Z\",\"streamType\":\"Debug\",\"streamText\":\"ouwaboekqvkeln\",\"summary\":\"vbxwyjsflhh\",\"value\":{\"joya\":\"datalnjixisxya\"}}}")
            .toObject(JobStreamInner.class);
        Assertions.assertEquals("kgpwoz", model.id());
        Assertions.assertEquals("fpbsjyofdxl", model.jobStreamId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-15T07:35:54Z"), model.time());
        Assertions.assertEquals(JobStreamType.DEBUG, model.streamType());
        Assertions.assertEquals("ouwaboekqvkeln", model.streamText());
        Assertions.assertEquals("vbxwyjsflhh", model.summary());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobStreamInner model = new JobStreamInner().withId("kgpwoz")
            .withJobStreamId("fpbsjyofdxl")
            .withTime(OffsetDateTime.parse("2021-06-15T07:35:54Z"))
            .withStreamType(JobStreamType.DEBUG)
            .withStreamText("ouwaboekqvkeln")
            .withSummary("vbxwyjsflhh")
            .withValue(mapOf("joya", "datalnjixisxya"));
        model = BinaryData.fromObject(model).toObject(JobStreamInner.class);
        Assertions.assertEquals("kgpwoz", model.id());
        Assertions.assertEquals("fpbsjyofdxl", model.jobStreamId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-15T07:35:54Z"), model.time());
        Assertions.assertEquals(JobStreamType.DEBUG, model.streamType());
        Assertions.assertEquals("ouwaboekqvkeln", model.streamText());
        Assertions.assertEquals("vbxwyjsflhh", model.summary());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
