// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"provider\":\"fj\",\"resource\":\"njbkcnxdhbttkph\",\"operation\":\"pnvjtoqnermclf\",\"description\":\"phoxus\"}")
            .toObject(OperationDisplay.class);
        Assertions.assertEquals("fj", model.provider());
        Assertions.assertEquals("njbkcnxdhbttkph", model.resource());
        Assertions.assertEquals("pnvjtoqnermclf", model.operation());
        Assertions.assertEquals("phoxus", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay().withProvider("fj")
            .withResource("njbkcnxdhbttkph")
            .withOperation("pnvjtoqnermclf")
            .withDescription("phoxus");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("fj", model.provider());
        Assertions.assertEquals("njbkcnxdhbttkph", model.resource());
        Assertions.assertEquals("pnvjtoqnermclf", model.operation());
        Assertions.assertEquals("phoxus", model.description());
    }
}
