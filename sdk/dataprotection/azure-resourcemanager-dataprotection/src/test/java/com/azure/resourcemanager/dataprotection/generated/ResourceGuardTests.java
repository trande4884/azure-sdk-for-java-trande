// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ResourceGuard;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuard model = BinaryData.fromString(
            "{\"provisioningState\":\"Succeeded\",\"allowAutoApprovals\":true,\"resourceGuardOperations\":[{\"vaultCriticalOperation\":\"uqlcvydy\",\"requestResourceType\":\"tdooaoj\"},{\"vaultCriticalOperation\":\"iodkooebwnujhem\",\"requestResourceType\":\"bvdkcrodtjin\"},{\"vaultCriticalOperation\":\"jlfltkacjvefkdlf\",\"requestResourceType\":\"kggkfpa\"},{\"vaultCriticalOperation\":\"owpulpq\",\"requestResourceType\":\"ylsyxkqjnsje\"}],\"vaultCriticalOperationExclusionList\":[\"iagxsdszuempsbz\",\"f\"],\"description\":\"eyvpnqicvinvkj\"}")
            .toObject(ResourceGuard.class);
        Assertions.assertEquals("iagxsdszuempsbz", model.vaultCriticalOperationExclusionList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuard model
            = new ResourceGuard().withVaultCriticalOperationExclusionList(Arrays.asList("iagxsdszuempsbz", "f"));
        model = BinaryData.fromObject(model).toObject(ResourceGuard.class);
        Assertions.assertEquals("iagxsdszuempsbz", model.vaultCriticalOperationExclusionList().get(0));
    }
}
