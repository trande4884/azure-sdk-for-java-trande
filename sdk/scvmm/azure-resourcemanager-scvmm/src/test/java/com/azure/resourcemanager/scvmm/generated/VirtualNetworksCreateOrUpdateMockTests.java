// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.scvmm.ScvmmManager;
import com.azure.resourcemanager.scvmm.models.ExtendedLocation;
import com.azure.resourcemanager.scvmm.models.VirtualNetwork;
import com.azure.resourcemanager.scvmm.models.VirtualNetworkProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VirtualNetworksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"inventoryItemId\":\"vbxngr\",\"uuid\":\"wggahttzlswvaj\",\"vmmServerId\":\"utlxjoqzasunwqrj\",\"networkName\":\"rg\",\"provisioningState\":\"Succeeded\"},\"extendedLocation\":{\"type\":\"hcmbuocnjrohmbp\",\"name\":\"yx\"},\"location\":\"eblydyv\",\"tags\":{\"ocxnehvsmtodl\":\"m\",\"unssxlghieegjl\":\"pyapucygvoav\"},\"id\":\"vvpa\",\"name\":\"eksgbuxantuygd\",\"type\":\"gaqi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ScvmmManager manager = ScvmmManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        VirtualNetwork response = manager.virtualNetworks()
            .define("krtt")
            .withRegion("pcohhoucqpqojx")
            .withExistingResourceGroup("xcptsoqfyiaseqc")
            .withExtendedLocation(new ExtendedLocation().withType("gnzxojpslsvj").withName("liufiqwoyxq"))
            .withTags(mapOf("tzqdd", "rzdcgdzbenribcaw", "mzwcjjncqt", "jwfljhznamtua"))
            .withProperties(new VirtualNetworkProperties().withInventoryItemId("zisgykiuemvanb")
                .withUuid("ohmn")
                .withVmmServerId("xbsojkli"))
            .create();

        Assertions.assertEquals("eblydyv", response.location());
        Assertions.assertEquals("m", response.tags().get("ocxnehvsmtodl"));
        Assertions.assertEquals("vbxngr", response.properties().inventoryItemId());
        Assertions.assertEquals("wggahttzlswvaj", response.properties().uuid());
        Assertions.assertEquals("utlxjoqzasunwqrj", response.properties().vmmServerId());
        Assertions.assertEquals("hcmbuocnjrohmbp", response.extendedLocation().type());
        Assertions.assertEquals("yx", response.extendedLocation().name());
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
