// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRun;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UpdateRunsStartMockTests {
    @Test
    public void testStart() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"updateStrategyId\":\"lla\",\"strategy\":{\"stages\":[{\"name\":\"lwuip\",\"groups\":[{\"name\":\"jzkzi\"},{\"name\":\"gvvcnayrhyr\"},{\"name\":\"xxmueedn\"},{\"name\":\"rdvstkwqqtch\"}],\"afterStageWaitInSeconds\":96926313},{\"name\":\"mfmtdaaygdvw\",\"groups\":[{\"name\":\"iohgwxrtfud\"},{\"name\":\"epxgyqagvr\"},{\"name\":\"mnpkukghimdblxg\"}],\"afterStageWaitInSeconds\":1230098756}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"Full\",\"kubernetesVersion\":\"jhfjxwm\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-09-21T20:48:34Z\",\"completedTime\":\"2021-04-21T14:21:09Z\",\"state\":\"Stopped\"},\"stages\":[{\"status\":{},\"name\":\"jawneaiv\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{},{}]}}},\"eTag\":\"irels\",\"id\":\"aenwabf\",\"name\":\"tkl\",\"type\":\"dxbjhwuaanozj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerServiceFleetManager manager = ContainerServiceFleetManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateRun response = manager.updateRuns()
            .start("h", "syocogjltdtbnnha", "oocrkvcikhnv", "amqgxqquezikyw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lla", response.updateStrategyId());
        Assertions.assertEquals("lwuip", response.strategy().stages().get(0).name());
        Assertions.assertEquals("jzkzi", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(96926313, response.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions.assertEquals(ManagedClusterUpgradeType.FULL, response.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("jhfjxwm", response.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions.assertEquals(NodeImageSelectionType.LATEST,
            response.managedClusterUpdate().nodeImageSelection().type());
    }
}
