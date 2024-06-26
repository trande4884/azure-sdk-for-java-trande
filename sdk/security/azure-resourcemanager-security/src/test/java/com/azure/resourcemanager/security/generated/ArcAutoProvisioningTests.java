// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ArcAutoProvisioning;
import com.azure.resourcemanager.security.models.ArcAutoProvisioningConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ArcAutoProvisioningTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArcAutoProvisioning model = BinaryData
            .fromString("{\"enabled\":true,\"configuration\":{\"proxy\":\"jjnxkby\",\"privateLinkScope\":\"yyxgff\"}}")
            .toObject(ArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("jjnxkby", model.configuration().proxy());
        Assertions.assertEquals("yyxgff", model.configuration().privateLinkScope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArcAutoProvisioning model = new ArcAutoProvisioning().withEnabled(true)
            .withConfiguration(
                new ArcAutoProvisioningConfiguration().withProxy("jjnxkby").withPrivateLinkScope("yyxgff"));
        model = BinaryData.fromObject(model).toObject(ArcAutoProvisioning.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("jjnxkby", model.configuration().proxy());
        Assertions.assertEquals("yyxgff", model.configuration().privateLinkScope());
    }
}
