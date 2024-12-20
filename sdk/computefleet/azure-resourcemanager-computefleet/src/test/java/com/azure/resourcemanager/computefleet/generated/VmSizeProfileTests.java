// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.VmSizeProfile;
import org.junit.jupiter.api.Assertions;

public final class VmSizeProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VmSizeProfile model
            = BinaryData.fromString("{\"name\":\"lljfmppeeb\",\"rank\":2027059656}").toObject(VmSizeProfile.class);
        Assertions.assertEquals("lljfmppeeb", model.name());
        Assertions.assertEquals(2027059656, model.rank());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VmSizeProfile model = new VmSizeProfile().withName("lljfmppeeb").withRank(2027059656);
        model = BinaryData.fromObject(model).toObject(VmSizeProfile.class);
        Assertions.assertEquals("lljfmppeeb", model.name());
        Assertions.assertEquals(2027059656, model.rank());
    }
}
