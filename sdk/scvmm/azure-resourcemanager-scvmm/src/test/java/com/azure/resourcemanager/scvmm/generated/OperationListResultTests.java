// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"kix\",\"isDataAction\":false,\"display\":{\"provider\":\"eputtmrywnuzoqf\",\"resource\":\"yqzrnkcqvyxlw\",\"operation\":\"lsicohoqqnwv\",\"description\":\"yav\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"mmqhgyxzkonocuk\",\"isDataAction\":false,\"display\":{\"provider\":\"xuconu\",\"resource\":\"zf\",\"operation\":\"eyp\",\"description\":\"rmjmwvvjektc\"},\"origin\":\"user\",\"actionType\":\"Internal\"},{\"name\":\"lrsf\",\"isDataAction\":false,\"display\":{\"provider\":\"v\",\"resource\":\"dqgbiqylihkaetc\",\"operation\":\"vfcivfsnkymuc\",\"description\":\"hjfbebrjcxe\"},\"origin\":\"system\",\"actionType\":\"Internal\"},{\"name\":\"ttxfvjr\",\"isDataAction\":false,\"display\":{\"provider\":\"xepcyvahfn\",\"resource\":\"kyqxjvuujqgidokg\",\"operation\":\"jyoxgvclt\",\"description\":\"sncghkjeszz\"},\"origin\":\"system\",\"actionType\":\"Internal\"}],\"nextLink\":\"xfvgxbfsmxne\"}")
            .toObject(OperationListResult.class);
    }
}
