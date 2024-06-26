// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HiveSource;

public final class HiveSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HiveSource model = BinaryData.fromString(
            "{\"type\":\"HiveSource\",\"query\":\"datam\",\"queryTimeout\":\"dataklzomdfcp\",\"additionalColumns\":\"dataimijzhrbs\",\"sourceRetryCount\":\"datavublouel\",\"sourceRetryWait\":\"dataqfbgeblp\",\"maxConcurrentConnections\":\"datackmnpzubz\",\"disableMetricsCollection\":\"dataswgfjrg\",\"\":{\"nklfs\":\"datapbshqzzlcfemnry\",\"ygczab\":\"datazsyigxsyx\",\"pcdia\":\"datapeuqyzfdsu\"}}")
            .toObject(HiveSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HiveSource model = new HiveSource().withSourceRetryCount("datavublouel")
            .withSourceRetryWait("dataqfbgeblp")
            .withMaxConcurrentConnections("datackmnpzubz")
            .withDisableMetricsCollection("dataswgfjrg")
            .withQueryTimeout("dataklzomdfcp")
            .withAdditionalColumns("dataimijzhrbs")
            .withQuery("datam");
        model = BinaryData.fromObject(model).toObject(HiveSource.class);
    }
}
