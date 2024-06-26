// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupRequest;

public final class BackupRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupRequest model = BinaryData.fromString("{\"objectType\":\"BackupRequest\"}").toObject(BackupRequest.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupRequest model = new BackupRequest();
        model = BinaryData.fromObject(model).toObject(BackupRequest.class);
    }
}
