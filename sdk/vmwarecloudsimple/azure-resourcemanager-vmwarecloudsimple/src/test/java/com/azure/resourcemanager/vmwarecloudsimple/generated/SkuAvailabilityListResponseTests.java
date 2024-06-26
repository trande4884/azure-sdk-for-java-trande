// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.SkuAvailabilityInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.SkuAvailabilityListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkuAvailabilityListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuAvailabilityListResponse model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"pmouexhdz\",\"value\":[{\"dedicatedAvailabilityZoneId\":\"eojnxqbzvddn\",\"dedicatedAvailabilityZoneName\":\"ndei\",\"dedicatedPlacementGroupId\":\"twnpzaoqvuhrhcf\",\"dedicatedPlacementGroupName\":\"yd\",\"limit\":1519639894,\"resourceType\":\"mjthjqkwp\",\"skuId\":\"icxm\",\"skuName\":\"iwqvhkh\"}]}")
                .toObject(SkuAvailabilityListResponse.class);
        Assertions.assertEquals("pmouexhdz", model.nextLink());
        Assertions.assertEquals("eojnxqbzvddn", model.value().get(0).dedicatedAvailabilityZoneId());
        Assertions.assertEquals("ndei", model.value().get(0).dedicatedAvailabilityZoneName());
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.value().get(0).dedicatedPlacementGroupId());
        Assertions.assertEquals("yd", model.value().get(0).dedicatedPlacementGroupName());
        Assertions.assertEquals(1519639894, model.value().get(0).limit());
        Assertions.assertEquals("mjthjqkwp", model.value().get(0).resourceType());
        Assertions.assertEquals("icxm", model.value().get(0).skuId());
        Assertions.assertEquals("iwqvhkh", model.value().get(0).skuName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuAvailabilityListResponse model =
            new SkuAvailabilityListResponse()
                .withNextLink("pmouexhdz")
                .withValue(
                    Arrays
                        .asList(
                            new SkuAvailabilityInner()
                                .withDedicatedAvailabilityZoneId("eojnxqbzvddn")
                                .withDedicatedAvailabilityZoneName("ndei")
                                .withDedicatedPlacementGroupId("twnpzaoqvuhrhcf")
                                .withDedicatedPlacementGroupName("yd")
                                .withLimit(1519639894)
                                .withResourceType("mjthjqkwp")
                                .withSkuId("icxm")
                                .withSkuName("iwqvhkh")));
        model = BinaryData.fromObject(model).toObject(SkuAvailabilityListResponse.class);
        Assertions.assertEquals("pmouexhdz", model.nextLink());
        Assertions.assertEquals("eojnxqbzvddn", model.value().get(0).dedicatedAvailabilityZoneId());
        Assertions.assertEquals("ndei", model.value().get(0).dedicatedAvailabilityZoneName());
        Assertions.assertEquals("twnpzaoqvuhrhcf", model.value().get(0).dedicatedPlacementGroupId());
        Assertions.assertEquals("yd", model.value().get(0).dedicatedPlacementGroupName());
        Assertions.assertEquals(1519639894, model.value().get(0).limit());
        Assertions.assertEquals("mjthjqkwp", model.value().get(0).resourceType());
        Assertions.assertEquals("icxm", model.value().get(0).skuId());
        Assertions.assertEquals("iwqvhkh", model.value().get(0).skuName());
    }
}
