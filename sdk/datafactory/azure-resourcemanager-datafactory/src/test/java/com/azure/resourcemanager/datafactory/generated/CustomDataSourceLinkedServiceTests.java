// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CustomDataSourceLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomDataSourceLinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDataSourceLinkedService model = BinaryData.fromString(
            "{\"type\":\"CustomDataSource\",\"typeProperties\":\"datadulymk\",\"connectVia\":{\"referenceName\":\"s\",\"parameters\":{\"npftkgm\":\"dataxfgha\"}},\"description\":\"vxbiu\",\"parameters\":{\"tbame\":{\"type\":\"Float\",\"defaultValue\":\"datas\"}},\"annotations\":[\"datausnaqsvruuh\",\"datancppmmwhjerlurg\"],\"\":{\"mckgpxdxgcq\":\"datanbxlep\"}}")
            .toObject(CustomDataSourceLinkedService.class);
        Assertions.assertEquals("s", model.connectVia().referenceName());
        Assertions.assertEquals("vxbiu", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("tbame").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDataSourceLinkedService model = new CustomDataSourceLinkedService()
            .withConnectVia(
                new IntegrationRuntimeReference().withReferenceName("s").withParameters(mapOf("npftkgm", "dataxfgha")))
            .withDescription("vxbiu")
            .withParameters(
                mapOf("tbame", new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datas")))
            .withAnnotations(Arrays.asList("datausnaqsvruuh", "datancppmmwhjerlurg"))
            .withTypeProperties("datadulymk");
        model = BinaryData.fromObject(model).toObject(CustomDataSourceLinkedService.class);
        Assertions.assertEquals("s", model.connectVia().referenceName());
        Assertions.assertEquals("vxbiu", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("tbame").type());
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
