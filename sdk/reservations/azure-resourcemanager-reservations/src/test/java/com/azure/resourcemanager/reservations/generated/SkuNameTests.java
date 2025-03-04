// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class SkuNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuName model = BinaryData.fromString("{\"name\":\"ubljofxqe\"}").toObject(SkuName.class);
        Assertions.assertEquals("ubljofxqe", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuName model = new SkuName().withName("ubljofxqe");
        model = BinaryData.fromObject(model).toObject(SkuName.class);
        Assertions.assertEquals("ubljofxqe", model.name());
    }
}
