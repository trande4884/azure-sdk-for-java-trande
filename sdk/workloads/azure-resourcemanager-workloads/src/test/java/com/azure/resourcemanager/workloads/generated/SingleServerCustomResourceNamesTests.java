// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SingleServerCustomResourceNames;

public final class SingleServerCustomResourceNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SingleServerCustomResourceNames model
            = BinaryData.fromString("{\"namingPatternType\":\"SingleServerCustomResourceNames\"}")
                .toObject(SingleServerCustomResourceNames.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SingleServerCustomResourceNames model = new SingleServerCustomResourceNames();
        model = BinaryData.fromObject(model).toObject(SingleServerCustomResourceNames.class);
    }
}
