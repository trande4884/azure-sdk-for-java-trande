// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.DscNodeProperties;
import com.azure.resourcemanager.automation.models.DscNodeExtensionHandlerAssociationProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DscNodePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DscNodeProperties model = BinaryData.fromString(
            "{\"lastSeen\":\"2021-01-19T09:55:19Z\",\"registrationTime\":\"2020-12-26T05:08:12Z\",\"ip\":\"dsoifiyipj\",\"accountId\":\"qwpgrjbzn\",\"nodeConfiguration\":{\"name\":\"jxvsnbyxqabn\"},\"status\":\"cpc\",\"nodeId\":\"hurzafblj\",\"etag\":\"pbtoqcjmkl\",\"totalCount\":1217713745,\"extensionHandler\":[{\"name\":\"dtqajzyulpkudj\",\"version\":\"lkhbz\"},{\"name\":\"epgzgqexz\",\"version\":\"c\"},{\"name\":\"c\",\"version\":\"ierhhbcsglummaj\"}]}")
            .toObject(DscNodeProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-19T09:55:19Z"), model.lastSeen());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-26T05:08:12Z"), model.registrationTime());
        Assertions.assertEquals("dsoifiyipj", model.ip());
        Assertions.assertEquals("qwpgrjbzn", model.accountId());
        Assertions.assertEquals("cpc", model.status());
        Assertions.assertEquals("hurzafblj", model.nodeId());
        Assertions.assertEquals("pbtoqcjmkl", model.etag());
        Assertions.assertEquals(1217713745, model.totalCount());
        Assertions.assertEquals("dtqajzyulpkudj", model.extensionHandler().get(0).name());
        Assertions.assertEquals("lkhbz", model.extensionHandler().get(0).version());
        Assertions.assertEquals("jxvsnbyxqabn", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DscNodeProperties model = new DscNodeProperties().withLastSeen(OffsetDateTime.parse("2021-01-19T09:55:19Z"))
            .withRegistrationTime(OffsetDateTime.parse("2020-12-26T05:08:12Z"))
            .withIp("dsoifiyipj")
            .withAccountId("qwpgrjbzn")
            .withStatus("cpc")
            .withNodeId("hurzafblj")
            .withEtag("pbtoqcjmkl")
            .withTotalCount(1217713745)
            .withExtensionHandler(Arrays.asList(
                new DscNodeExtensionHandlerAssociationProperty().withName("dtqajzyulpkudj").withVersion("lkhbz"),
                new DscNodeExtensionHandlerAssociationProperty().withName("epgzgqexz").withVersion("c"),
                new DscNodeExtensionHandlerAssociationProperty().withName("c").withVersion("ierhhbcsglummaj")))
            .withName("jxvsnbyxqabn");
        model = BinaryData.fromObject(model).toObject(DscNodeProperties.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-19T09:55:19Z"), model.lastSeen());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-26T05:08:12Z"), model.registrationTime());
        Assertions.assertEquals("dsoifiyipj", model.ip());
        Assertions.assertEquals("qwpgrjbzn", model.accountId());
        Assertions.assertEquals("cpc", model.status());
        Assertions.assertEquals("hurzafblj", model.nodeId());
        Assertions.assertEquals("pbtoqcjmkl", model.etag());
        Assertions.assertEquals(1217713745, model.totalCount());
        Assertions.assertEquals("dtqajzyulpkudj", model.extensionHandler().get(0).name());
        Assertions.assertEquals("lkhbz", model.extensionHandler().get(0).version());
        Assertions.assertEquals("jxvsnbyxqabn", model.name());
    }
}
