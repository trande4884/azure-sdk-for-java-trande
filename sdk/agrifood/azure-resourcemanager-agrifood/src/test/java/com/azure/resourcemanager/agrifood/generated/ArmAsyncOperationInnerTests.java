// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.ArmAsyncOperationInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ArmAsyncOperationInnerTests {
    @Test
    public void testDeserialize() {
        ArmAsyncOperationInner model
            = BinaryData.fromString("{\"status\":\"hb\"}").toObject(ArmAsyncOperationInner.class);
        Assertions.assertEquals("hb", model.status());
    }

    @Test
    public void testSerialize() {
        ArmAsyncOperationInner model = new ArmAsyncOperationInner().withStatus("hb");
        model = BinaryData.fromObject(model).toObject(ArmAsyncOperationInner.class);
        Assertions.assertEquals("hb", model.status());
    }
}
