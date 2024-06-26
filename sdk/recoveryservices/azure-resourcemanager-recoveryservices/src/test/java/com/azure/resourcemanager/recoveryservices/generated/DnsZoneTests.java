// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.DnsZone;
import com.azure.resourcemanager.recoveryservices.models.VaultSubResourceType;
import org.junit.jupiter.api.Assertions;

public final class DnsZoneTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DnsZone model = BinaryData.fromString("{\"subResource\":\"AzureBackup\"}").toObject(DnsZone.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP, model.subResource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DnsZone model = new DnsZone().withSubResource(VaultSubResourceType.AZURE_BACKUP);
        model = BinaryData.fromObject(model).toObject(DnsZone.class);
        Assertions.assertEquals(VaultSubResourceType.AZURE_BACKUP, model.subResource());
    }
}
