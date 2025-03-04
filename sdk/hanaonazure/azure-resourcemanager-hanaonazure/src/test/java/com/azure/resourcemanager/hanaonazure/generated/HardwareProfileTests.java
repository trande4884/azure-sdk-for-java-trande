// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hanaonazure.models.HardwareProfile;

public final class HardwareProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HardwareProfile model = BinaryData.fromString("{\"hardwareType\":\"Cisco_UCS\",\"hanaInstanceSize\":\"S144\"}")
            .toObject(HardwareProfile.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HardwareProfile model = new HardwareProfile();
        model = BinaryData.fromObject(model).toObject(HardwareProfile.class);
    }
}
