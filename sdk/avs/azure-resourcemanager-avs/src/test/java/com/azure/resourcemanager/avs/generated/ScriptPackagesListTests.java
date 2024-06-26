// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptPackageInner;
import com.azure.resourcemanager.avs.models.ScriptPackagesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScriptPackagesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptPackagesList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"description\":\"qkdltfz\",\"version\":\"hhvh\",\"company\":\"r\",\"uri\":\"dkwobdagx\"},\"id\":\"bqdxbx\",\"name\":\"akbogqxndlkzgxh\",\"type\":\"ripl\"}],\"nextLink\":\"odxun\"}")
            .toObject(ScriptPackagesList.class);
        Assertions.assertEquals("odxun", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptPackagesList model
            = new ScriptPackagesList().withValue(Arrays.asList(new ScriptPackageInner())).withNextLink("odxun");
        model = BinaryData.fromObject(model).toObject(ScriptPackagesList.class);
        Assertions.assertEquals("odxun", model.nextLink());
    }
}
