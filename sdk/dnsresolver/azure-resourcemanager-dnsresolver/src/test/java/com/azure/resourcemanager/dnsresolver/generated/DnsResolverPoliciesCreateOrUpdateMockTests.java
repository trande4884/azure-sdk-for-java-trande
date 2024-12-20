// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.DnsResolverPolicy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsResolverPoliciesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"etag\":\"pwoqo\",\"properties\":{\"provisioningState\":\"Succeeded\",\"resourceGuid\":\"ekni\"},\"location\":\"hqvcimpevfgmblr\",\"tags\":{\"rwfscjfnynszquj\":\"bywdxsmicc\",\"gyavu\":\"zdvoqytibyowbb\"},\"id\":\"pthjoxo\",\"name\":\"smsks\",\"type\":\"pi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DnsResolverPolicy response = manager.dnsResolverPolicies()
            .define("nb")
            .withRegion("wbqpl")
            .withExistingResourceGroup("qchiszep")
            .withTags(mapOf("wzsoldweyuqdunv", "nuuepzlrp", "alywjhhgdn", "nnrwrbiork"))
            .withIfMatch("otcubi")
            .withIfNoneMatch("p")
            .create();

        Assertions.assertEquals("hqvcimpevfgmblr", response.location());
        Assertions.assertEquals("bywdxsmicc", response.tags().get("rwfscjfnynszquj"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
