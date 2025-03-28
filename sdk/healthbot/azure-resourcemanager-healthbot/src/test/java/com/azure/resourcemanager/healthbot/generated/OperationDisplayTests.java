// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthbot.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"provider\":\"kbasyypn\",\"resource\":\"hsgcbacphejkot\",\"operation\":\"qgoulznd\",\"description\":\"kwy\"}")
            .toObject(OperationDisplay.class);
        Assertions.assertEquals("kbasyypn", model.provider());
        Assertions.assertEquals("hsgcbacphejkot", model.resource());
        Assertions.assertEquals("qgoulznd", model.operation());
        Assertions.assertEquals("kwy", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay().withProvider("kbasyypn")
            .withResource("hsgcbacphejkot")
            .withOperation("qgoulznd")
            .withDescription("kwy");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("kbasyypn", model.provider());
        Assertions.assertEquals("hsgcbacphejkot", model.resource());
        Assertions.assertEquals("qgoulznd", model.operation());
        Assertions.assertEquals("kwy", model.description());
    }
}
