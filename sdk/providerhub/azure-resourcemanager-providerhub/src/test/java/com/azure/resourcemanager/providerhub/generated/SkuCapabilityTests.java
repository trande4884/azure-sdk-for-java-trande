// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.models.SkuCapability;
import org.junit.jupiter.api.Assertions;

public final class SkuCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuCapability model = BinaryData.fromString("{\"name\":\"pttaqutd\",\"value\":\"wemxswvruunzz\"}")
            .toObject(SkuCapability.class);
        Assertions.assertEquals("pttaqutd", model.name());
        Assertions.assertEquals("wemxswvruunzz", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuCapability model = new SkuCapability().withName("pttaqutd").withValue("wemxswvruunzz");
        model = BinaryData.fromObject(model).toObject(SkuCapability.class);
        Assertions.assertEquals("pttaqutd", model.name());
        Assertions.assertEquals("wemxswvruunzz", model.value());
    }
}
