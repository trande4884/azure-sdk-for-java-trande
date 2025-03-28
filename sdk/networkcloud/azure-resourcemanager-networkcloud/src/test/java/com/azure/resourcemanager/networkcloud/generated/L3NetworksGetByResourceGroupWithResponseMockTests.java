// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import com.azure.resourcemanager.networkcloud.models.L3Network;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class L3NetworksGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"extendedLocation\":{\"name\":\"wtthaokgksk\",\"type\":\"i\"},\"properties\":{\"associatedResourceIds\":[\"shajqf\",\"kpeexpgeumilh\",\"uitrdexyiono\"],\"clusterId\":\"inbd\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"cw\",\"hybridAksClustersAssociatedIds\":[\"smpcbbp\",\"tugav\",\"zbcyksiv\",\"fogdrtbfcm\"],\"hybridAksIpamEnabled\":\"True\",\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"cwjjxsgmbawvif\",\"ipAllocationType\":\"IPV6\",\"ipv4ConnectedPrefix\":\"cifhocjxwkl\",\"ipv6ConnectedPrefix\":\"zrvtx\",\"l3IsolationDomainId\":\"cmufunlcpxxv\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[\"ngjgvrquvpyg\",\"lpmcrdc\",\"eljtiahxmfqryarv\",\"x\"],\"vlan\":2751363587305463813},\"location\":\"lcjkayspthzodub\",\"tags\":{\"kfmkmfdjxyxgbk\":\"jtgblios\",\"l\":\"qvjcteoe\",\"xv\":\"slskkz\",\"hpcnabxzfsn\":\"nzdpvoco\"},\"id\":\"gyte\",\"name\":\"vzilmhiv\",\"type\":\"kwwwnckn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        L3Network response = manager.l3Networks()
            .getByResourceGroupWithResponse("xhmt", "tvegwqiukvzwy", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("lcjkayspthzodub", response.location());
        Assertions.assertEquals("jtgblios", response.tags().get("kfmkmfdjxyxgbk"));
        Assertions.assertEquals("wtthaokgksk", response.extendedLocation().name());
        Assertions.assertEquals("i", response.extendedLocation().type());
        Assertions.assertEquals(HybridAksIpamEnabled.TRUE, response.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.DPDK, response.hybridAksPluginType());
        Assertions.assertEquals("cwjjxsgmbawvif", response.interfaceName());
        Assertions.assertEquals(IpAllocationType.IPV6, response.ipAllocationType());
        Assertions.assertEquals("cifhocjxwkl", response.ipv4ConnectedPrefix());
        Assertions.assertEquals("zrvtx", response.ipv6ConnectedPrefix());
        Assertions.assertEquals("cmufunlcpxxv", response.l3IsolationDomainId());
        Assertions.assertEquals(2751363587305463813L, response.vlan());
    }
}
