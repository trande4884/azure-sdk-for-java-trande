// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationListResultInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"value\":\"rlyxwjkcprbnw\",\"currentValue\":\"gjvtbv\",\"description\":\"sszdnru\",\"documentationLink\":\"guhmuouqfpr\",\"defaultValue\":\"wbnguitnwui\",\"dataType\":\"a\",\"allowedValues\":\"ufizuckyf\",\"source\":\"user-override\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"True\"},\"id\":\"dzuhtymwi\",\"name\":\"dkfthwxmnt\",\"type\":\"i\"},{\"properties\":{\"value\":\"pvkmijcmmxdcuf\",\"currentValue\":\"srp\",\"description\":\"zidnsezcxtbzsgfy\",\"documentationLink\":\"sne\",\"defaultValue\":\"dwzjeiach\",\"dataType\":\"osfln\",\"allowedValues\":\"sfqpteehz\",\"source\":\"user-override\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"True\",\"isDynamicConfig\":\"False\"},\"id\":\"inpvswjdkirsoodq\",\"name\":\"hc\",\"type\":\"mnoh\"},{\"properties\":{\"value\":\"kwh\",\"currentValue\":\"oifiyipjxsqwpgr\",\"description\":\"znorcj\",\"documentationLink\":\"snb\",\"defaultValue\":\"qabnmoc\",\"dataType\":\"ysh\",\"allowedValues\":\"zafb\",\"source\":\"system-default\",\"isReadOnly\":\"False\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"True\"},\"id\":\"jmkljavbqidtqajz\",\"name\":\"ulpkudjkrl\",\"type\":\"hbzhfepg\"}],\"nextLink\":\"qex\"}")
            .toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("rlyxwjkcprbnw", model.value().get(0).value());
        Assertions.assertEquals("gjvtbv", model.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.USER_OVERRIDE, model.value().get(0).source());
        Assertions.assertEquals("qex", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationListResultInner model = new ConfigurationListResultInner().withValue(Arrays.asList(
            new ConfigurationInner().withValue("rlyxwjkcprbnw")
                .withCurrentValue("gjvtbv")
                .withSource(ConfigurationSource.USER_OVERRIDE),
            new ConfigurationInner().withValue("pvkmijcmmxdcuf")
                .withCurrentValue("srp")
                .withSource(ConfigurationSource.USER_OVERRIDE),
            new ConfigurationInner().withValue("kwh")
                .withCurrentValue("oifiyipjxsqwpgr")
                .withSource(ConfigurationSource.SYSTEM_DEFAULT)))
            .withNextLink("qex");
        model = BinaryData.fromObject(model).toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("rlyxwjkcprbnw", model.value().get(0).value());
        Assertions.assertEquals("gjvtbv", model.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.USER_OVERRIDE, model.value().get(0).source());
        Assertions.assertEquals("qex", model.nextLink());
    }
}
