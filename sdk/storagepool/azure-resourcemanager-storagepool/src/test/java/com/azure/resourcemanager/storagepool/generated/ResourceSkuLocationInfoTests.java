// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.models.ResourceSkuLocationInfo;

public final class ResourceSkuLocationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSkuLocationInfo model = BinaryData.fromString(
            "{\"location\":\"dbhrbnlankxm\",\"zones\":[\"pbh\"],\"zoneDetails\":[{\"name\":[\"cxy\",\"ny\"],\"capabilities\":[{\"name\":\"yn\",\"value\":\"idybyxczf\"}]},{\"name\":[\"aaxdbabphlwrq\",\"fkts\",\"hsucoc\"],\"capabilities\":[{\"name\":\"azt\",\"value\":\"twwrqp\"},{\"name\":\"dckzywbiexz\",\"value\":\"yueaxibxujwb\"}]},{\"name\":[\"almuzyoxaepdkzja\"],\"capabilities\":[{\"name\":\"rhdwbavxbniw\",\"value\":\"swzts\"}]},{\"name\":[\"gnxytxhpzxbz\"],\"capabilities\":[{\"name\":\"b\",\"value\":\"cuh\"},{\"name\":\"tcty\",\"value\":\"klbb\"},{\"name\":\"plwzbhvgyugu\",\"value\":\"vmkfssxqu\"}]}]}")
            .toObject(ResourceSkuLocationInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSkuLocationInfo model = new ResourceSkuLocationInfo();
        model = BinaryData.fromObject(model).toObject(ResourceSkuLocationInfo.class);
    }
}
