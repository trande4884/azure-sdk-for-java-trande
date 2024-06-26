// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.storagemover.StorageMoverManager;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import com.azure.resourcemanager.storagemover.models.JobDefinition;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JobDefinitionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"description\":\"n\",\"copyMode\":\"Additive\",\"sourceName\":\"glzpswiydm\",\"sourceResourceId\":\"yhz\",\"sourceSubpath\":\"ss\",\"targetName\":\"dbzm\",\"targetResourceId\":\"dfznudaodv\",\"targetSubpath\":\"bncblylpstdbhhx\",\"latestJobRunName\":\"zdzucerscdntnevf\",\"latestJobRunResourceId\":\"jmygtdsslswtmwer\",\"latestJobRunStatus\":\"Started\",\"agentName\":\"pyqs\",\"agentResourceId\":\"wab\",\"provisioningState\":\"Failed\"},\"id\":\"hhszh\",\"name\":\"d\",\"type\":\"lvwiwubmwmbesl\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StorageMoverManager manager = StorageMoverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JobDefinition> response
            = manager.jobDefinitions().list("bgycduiertgccym", "aolps", "lqlfm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("n", response.iterator().next().description());
        Assertions.assertEquals(CopyMode.ADDITIVE, response.iterator().next().copyMode());
        Assertions.assertEquals("glzpswiydm", response.iterator().next().sourceName());
        Assertions.assertEquals("ss", response.iterator().next().sourceSubpath());
        Assertions.assertEquals("dbzm", response.iterator().next().targetName());
        Assertions.assertEquals("bncblylpstdbhhx", response.iterator().next().targetSubpath());
        Assertions.assertEquals("pyqs", response.iterator().next().agentName());
    }
}
