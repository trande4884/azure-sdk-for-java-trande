// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.CloudLinkInner;
import com.azure.resourcemanager.avs.models.CloudLinkList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudLinkListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudLinkList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"status\":\"Failed\",\"linkedCloud\":\"nxkrx\"},\"id\":\"mi\",\"name\":\"tthzrvqd\",\"type\":\"abhjybi\"},{\"properties\":{\"provisioningState\":\"Failed\",\"status\":\"Failed\",\"linkedCloud\":\"owskanyktz\"},\"id\":\"u\",\"name\":\"y\",\"type\":\"gqywgndrv\"},{\"properties\":{\"provisioningState\":\"Canceled\",\"status\":\"Failed\",\"linkedCloud\":\"hrc\"},\"id\":\"nc\",\"name\":\"cpecfvmmcoofs\",\"type\":\"lzevgbmqjqab\"}],\"nextLink\":\"pmivkwlzu\"}")
            .toObject(CloudLinkList.class);
        Assertions.assertEquals("nxkrx", model.value().get(0).linkedCloud());
        Assertions.assertEquals("pmivkwlzu", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudLinkList model = new CloudLinkList()
            .withValue(Arrays.asList(new CloudLinkInner().withLinkedCloud("nxkrx"),
                new CloudLinkInner().withLinkedCloud("owskanyktz"), new CloudLinkInner().withLinkedCloud("hrc")))
            .withNextLink("pmivkwlzu");
        model = BinaryData.fromObject(model).toObject(CloudLinkList.class);
        Assertions.assertEquals("nxkrx", model.value().get(0).linkedCloud());
        Assertions.assertEquals("pmivkwlzu", model.nextLink());
    }
}
