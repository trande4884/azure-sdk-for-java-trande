// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.azure.resourcemanager.maintenance.models.ApplyUpdate;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApplyUpdatesCreateOrUpdateOrCancelWithResponseMockTests {
    @Test
    public void testCreateOrUpdateOrCancelWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"status\":\"RetryNow\",\"resourceId\":\"tmnubexkpzksmon\",\"lastUpdateTime\":\"2021-05-01T02:18:47Z\"},\"id\":\"uxvypomgkopkwh\",\"name\":\"jvp\",\"type\":\"jqg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MaintenanceManager manager = MaintenanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplyUpdate response = manager.applyUpdates()
            .createOrUpdateOrCancelWithResponse("dopcjwvnh", "ld", "mgxcxrslpm", "twuoegrpkhjwni", "qsluicp",
                new ApplyUpdateInner().withStatus(UpdateStatus.CANCELLED)
                    .withResourceId("zl")
                    .withLastUpdateTime(OffsetDateTime.parse("2021-11-07T19:34:24Z")),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(UpdateStatus.RETRY_NOW, response.status());
        Assertions.assertEquals("tmnubexkpzksmon", response.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-01T02:18:47Z"), response.lastUpdateTime());
    }
}
