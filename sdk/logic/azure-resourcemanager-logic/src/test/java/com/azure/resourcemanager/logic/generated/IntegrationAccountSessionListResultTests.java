// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountSessionInner;
import com.azure.resourcemanager.logic.models.IntegrationAccountSessionListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationAccountSessionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationAccountSessionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"createdTime\":\"2021-10-29T23:02:28Z\",\"changedTime\":\"2021-06-19T10:33:49Z\",\"content\":\"dataiosmgbzahgxqdly\"},\"location\":\"tlt\",\"tags\":{\"nbsoqeqalarv\":\"rltzkatbhjmz\",\"nbmhyree\":\"agunbtgfebw\",\"lgouwtlmjj\":\"dzqavbpdqmjxlyyz\",\"baxk\":\"uojqt\"},\"id\":\"eytu\",\"name\":\"lbfjkwr\",\"type\":\"snkq\"},{\"properties\":{\"createdTime\":\"2021-10-27T03:00:47Z\",\"changedTime\":\"2021-11-28T23:19:16Z\",\"content\":\"dataunjqh\"},\"location\":\"enx\",\"tags\":{\"kifmjn\":\"kpak\"},\"id\":\"awtqabpxuckpgg\",\"name\":\"oweyirdhlis\",\"type\":\"gwflq\"},{\"properties\":{\"createdTime\":\"2021-12-03T06:49:04Z\",\"changedTime\":\"2021-11-21T20:48:50Z\",\"content\":\"datauwnpqxpxiwfcng\"},\"location\":\"saasiixtmkzj\",\"tags\":{\"gratzvzbglbyvict\":\"iirhgfgrwsd\",\"rgxffmshkw\":\"tbrxkjz\",\"qaclnapxbiy\":\"bkgozxwopdbydpi\"},\"id\":\"nugj\",\"name\":\"nfsm\",\"type\":\"cttuxuu\"},{\"properties\":{\"createdTime\":\"2021-07-13T11:30:30Z\",\"changedTime\":\"2021-03-10T09:25:33Z\",\"content\":\"dataoiquvrehmrnjhvs\"},\"location\":\"jztczytqj\",\"tags\":{\"mr\":\"auunfprnjletlx\"},\"id\":\"ddoui\",\"name\":\"amowaziynknlqwzd\",\"type\":\"piwhxqs\"}],\"nextLink\":\"tmaaj\"}")
            .toObject(IntegrationAccountSessionListResult.class);
        Assertions.assertEquals("tlt", model.value().get(0).location());
        Assertions.assertEquals("rltzkatbhjmz", model.value().get(0).tags().get("nbsoqeqalarv"));
        Assertions.assertEquals("tmaaj", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationAccountSessionListResult model = new IntegrationAccountSessionListResult().withValue(Arrays.asList(
            new IntegrationAccountSessionInner().withLocation("tlt")
                .withTags(mapOf("nbsoqeqalarv", "rltzkatbhjmz", "nbmhyree", "agunbtgfebw", "lgouwtlmjj",
                    "dzqavbpdqmjxlyyz", "baxk", "uojqt"))
                .withContent("dataiosmgbzahgxqdly"),
            new IntegrationAccountSessionInner().withLocation("enx")
                .withTags(mapOf("kifmjn", "kpak"))
                .withContent("dataunjqh"),
            new IntegrationAccountSessionInner().withLocation("saasiixtmkzj")
                .withTags(
                    mapOf("gratzvzbglbyvict", "iirhgfgrwsd", "rgxffmshkw", "tbrxkjz", "qaclnapxbiy", "bkgozxwopdbydpi"))
                .withContent("datauwnpqxpxiwfcng"),
            new IntegrationAccountSessionInner().withLocation("jztczytqj")
                .withTags(mapOf("mr", "auunfprnjletlx"))
                .withContent("dataoiquvrehmrnjhvs")))
            .withNextLink("tmaaj");
        model = BinaryData.fromObject(model).toObject(IntegrationAccountSessionListResult.class);
        Assertions.assertEquals("tlt", model.value().get(0).location());
        Assertions.assertEquals("rltzkatbhjmz", model.value().get(0).tags().get("nbsoqeqalarv"));
        Assertions.assertEquals("tmaaj", model.nextLink());
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
