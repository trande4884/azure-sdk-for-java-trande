// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.QueryCompilationResultInner;

public final class QueryCompilationResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryCompilationResultInner model = BinaryData.fromString(
            "{\"errors\":[{\"message\":\"wvlqdqgb\",\"startLine\":629213684,\"startColumn\":878153378,\"endLine\":946081931,\"endColumn\":1540120272,\"isGlobal\":true}],\"warnings\":[\"vfcivfsnkymuc\",\"qhjfbebr\",\"cxerf\"],\"inputs\":[\"tttxfvjrb\",\"rp\",\"xepcyvahfn\",\"jky\"],\"outputs\":[\"vuujq\"],\"functions\":[\"ok\",\"jljyoxgv\"]}")
            .toObject(QueryCompilationResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryCompilationResultInner model = new QueryCompilationResultInner();
        model = BinaryData.fromObject(model).toObject(QueryCompilationResultInner.class);
    }
}
