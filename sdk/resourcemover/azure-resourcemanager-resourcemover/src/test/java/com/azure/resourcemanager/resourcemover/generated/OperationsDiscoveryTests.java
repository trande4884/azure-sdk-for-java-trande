// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.Display;
import com.azure.resourcemanager.resourcemover.models.OperationsDiscovery;
import org.junit.jupiter.api.Assertions;

public final class OperationsDiscoveryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationsDiscovery model = BinaryData.fromString(
            "{\"name\":\"kdvjsll\",\"isDataAction\":true,\"display\":{\"provider\":\"f\",\"resource\":\"t\",\"operation\":\"n\",\"description\":\"lexxbczwtru\"},\"origin\":\"qzbqjvsov\",\"properties\":\"dataokacspk\"}")
            .toObject(OperationsDiscovery.class);
        Assertions.assertEquals("kdvjsll", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("f", model.display().provider());
        Assertions.assertEquals("t", model.display().resource());
        Assertions.assertEquals("n", model.display().operation());
        Assertions.assertEquals("lexxbczwtru", model.display().description());
        Assertions.assertEquals("qzbqjvsov", model.origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationsDiscovery model = new OperationsDiscovery().withName("kdvjsll")
            .withIsDataAction(true)
            .withDisplay(
                new Display().withProvider("f").withResource("t").withOperation("n").withDescription("lexxbczwtru"))
            .withOrigin("qzbqjvsov")
            .withProperties("dataokacspk");
        model = BinaryData.fromObject(model).toObject(OperationsDiscovery.class);
        Assertions.assertEquals("kdvjsll", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("f", model.display().provider());
        Assertions.assertEquals("t", model.display().resource());
        Assertions.assertEquals("n", model.display().operation());
        Assertions.assertEquals("lexxbczwtru", model.display().description());
        Assertions.assertEquals("qzbqjvsov", model.origin());
    }
}
