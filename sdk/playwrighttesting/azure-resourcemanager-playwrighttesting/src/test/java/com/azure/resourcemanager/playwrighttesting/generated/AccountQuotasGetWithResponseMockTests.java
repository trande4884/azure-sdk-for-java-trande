// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.playwrighttesting.PlaywrightTestingManager;
import com.azure.resourcemanager.playwrighttesting.models.AccountQuota;
import com.azure.resourcemanager.playwrighttesting.models.QuotaNames;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AccountQuotasGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"freeTrial\":{\"createdAt\":\"2021-07-23T03:15:47Z\",\"expiryAt\":\"2021-03-19T19:19:25Z\",\"allocatedValue\":526357261,\"usedValue\":1943379246,\"percentageUsed\":30.405001034874335},\"provisioningState\":\"Accepted\"},\"id\":\"ovmclwhijcoejct\",\"name\":\"zaqsqsycbkbfk\",\"type\":\"ukdkexxppofmxa\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PlaywrightTestingManager manager = PlaywrightTestingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        AccountQuota response = manager.accountQuotas()
            .getWithResponse("mexgstxgcp", "dg", QuotaNames.SCALABLE_EXECUTION, com.azure.core.util.Context.NONE)
            .getValue();

    }
}
