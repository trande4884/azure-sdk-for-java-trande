// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataLakeStoreWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureDataLakeStoreWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataLakeStoreWriteSettings model = BinaryData.fromString(
            "{\"type\":\"AzureDataLakeStoreWriteSettings\",\"expiryDateTime\":\"dataismsggja\",\"maxConcurrentConnections\":\"dataazilqgvmiproqpyb\",\"disableMetricsCollection\":\"datakmdklwbqkmt\",\"copyBehavior\":\"dataaqqqtmpgr\",\"metadata\":[{\"name\":\"datatwedllpnoeb\",\"value\":\"datahyiohcj\"},{\"name\":\"dataduoggx\",\"value\":\"datam\"},{\"name\":\"dataguykrpzpmwz\",\"value\":\"datacrzdwebs\"},{\"name\":\"datapk\",\"value\":\"dataraidjeddnqm\"}],\"\":{\"xtnuc\":\"datahrhcfeqjkac\",\"hvfdosq\":\"dataojqoxpw\",\"cptvkbcykntdzze\":\"datadoyqbpzxushmltih\",\"e\":\"datarzpggs\"}}")
            .toObject(AzureDataLakeStoreWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataLakeStoreWriteSettings model
            = new AzureDataLakeStoreWriteSettings().withMaxConcurrentConnections("dataazilqgvmiproqpyb")
                .withDisableMetricsCollection("datakmdklwbqkmt")
                .withCopyBehavior("dataaqqqtmpgr")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datatwedllpnoeb").withValue("datahyiohcj"),
                    new MetadataItem().withName("dataduoggx").withValue("datam"),
                    new MetadataItem().withName("dataguykrpzpmwz").withValue("datacrzdwebs"),
                    new MetadataItem().withName("datapk").withValue("dataraidjeddnqm")))
                .withExpiryDateTime("dataismsggja");
        model = BinaryData.fromObject(model).toObject(AzureDataLakeStoreWriteSettings.class);
    }
}
