// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.RangerAuditSpec;
import org.junit.jupiter.api.Assertions;

public final class RangerAuditSpecTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RangerAuditSpec model
            = BinaryData.fromString("{\"storageAccount\":\"zjuzgwyz\"}").toObject(RangerAuditSpec.class);
        Assertions.assertEquals("zjuzgwyz", model.storageAccount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RangerAuditSpec model = new RangerAuditSpec().withStorageAccount("zjuzgwyz");
        model = BinaryData.fromObject(model).toObject(RangerAuditSpec.class);
        Assertions.assertEquals("zjuzgwyz", model.storageAccount());
    }
}
