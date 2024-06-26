// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.CreateOrUpdateComputePolicyProperties;
import com.azure.resourcemanager.datalakeanalytics.models.AadObjectType;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class CreateOrUpdateComputePolicyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateOrUpdateComputePolicyProperties model =
            BinaryData
                .fromString(
                    "{\"objectId\":\"6e9517e5-70d0-45e9-8495-8aa99c7c1901\",\"objectType\":\"ServicePrincipal\",\"maxDegreeOfParallelismPerJob\":1600466611,\"minPriorityPerJob\":186594005}")
                .toObject(CreateOrUpdateComputePolicyProperties.class);
        Assertions.assertEquals(UUID.fromString("6e9517e5-70d0-45e9-8495-8aa99c7c1901"), model.objectId());
        Assertions.assertEquals(AadObjectType.SERVICE_PRINCIPAL, model.objectType());
        Assertions.assertEquals(1600466611, model.maxDegreeOfParallelismPerJob());
        Assertions.assertEquals(186594005, model.minPriorityPerJob());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateOrUpdateComputePolicyProperties model =
            new CreateOrUpdateComputePolicyProperties()
                .withObjectId(UUID.fromString("6e9517e5-70d0-45e9-8495-8aa99c7c1901"))
                .withObjectType(AadObjectType.SERVICE_PRINCIPAL)
                .withMaxDegreeOfParallelismPerJob(1600466611)
                .withMinPriorityPerJob(186594005);
        model = BinaryData.fromObject(model).toObject(CreateOrUpdateComputePolicyProperties.class);
        Assertions.assertEquals(UUID.fromString("6e9517e5-70d0-45e9-8495-8aa99c7c1901"), model.objectId());
        Assertions.assertEquals(AadObjectType.SERVICE_PRINCIPAL, model.objectType());
        Assertions.assertEquals(1600466611, model.maxDegreeOfParallelismPerJob());
        Assertions.assertEquals(186594005, model.minPriorityPerJob());
    }
}
