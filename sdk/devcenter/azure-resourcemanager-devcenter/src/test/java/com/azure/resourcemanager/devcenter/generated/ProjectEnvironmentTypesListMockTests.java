// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeEnableStatus;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProjectEnvironmentTypesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\",\"environmentCount\":979398617,\"deploymentTargetId\":\"jibuzphdug\",\"displayName\":\"iknp\",\"status\":\"Enabled\",\"creatorRoleAssignment\":{\"roles\":{\"x\":{\"roleName\":\"qhibtozipqwjedm\",\"description\":\"r\"},\"gcl\":{\"roleName\":\"wpktvqylkmqpzoyh\",\"description\":\"bcg\"},\"hpzpo\":{\"roleName\":\"oebqinjipn\",\"description\":\"fujqlafcba\"},\"uartvti\":{\"roleName\":\"iyjwpfilkmkkho\",\"description\":\"dndviauogp\"}}},\"userRoleAssignments\":{\"xffi\":{\"roles\":{\"chnmna\":{},\"mnxhkxjqirwrweo\":{}}},\"ttaboidvmfqh\":{\"roles\":{\"wrsnewmozqvbu\":{},\"qmamhsycxhxzga\":{}}}}},\"tags\":{\"g\":\"bowsepd\",\"c\":\"mtdherngb\",\"obkauxofsh\":\"uahokq\"},\"identity\":{\"principalId\":\"b94ba13a-1c22-400b-a7da-a2393c00981f\",\"tenantId\":\"541a15cb-ce37-4a92-8dda-83b2234f8669\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"iywzejy\":{\"principalId\":\"2815ab5f-48af-485c-ac2b-b548a7f4e323\",\"clientId\":\"9f1a4e70-20b1-4f3e-956c-4c194e95d371\"},\"lwkojpllndnpdw\":{\"principalId\":\"8a73e6d2-b0c8-48c2-b3b8-c9363e736fe6\",\"clientId\":\"6eab5337-e72f-4889-bd4d-0b903c759efb\"},\"afgfugsnn\":{\"principalId\":\"a04c3369-41b8-4bd0-bca4-a3c27226eef7\",\"clientId\":\"75ba48d5-8663-4b44-9b8f-73ad78febf95\"},\"et\":{\"principalId\":\"bc0c0ab8-9a76-4621-8e36-e8052dd6f0be\",\"clientId\":\"3041e329-a286-41b9-aacc-15b1314e5559\"}}},\"location\":\"ypococtfjgtixr\",\"id\":\"zuyt\",\"name\":\"rmlmuowo\",\"type\":\"bauiropi\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ProjectEnvironmentType> response = manager.projectEnvironmentTypes()
            .list("vtxnjmxmcuqud", "cvclxynpdk", 1887329670, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bowsepd", response.iterator().next().tags().get("g"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("ypococtfjgtixr", response.iterator().next().location());
        Assertions.assertEquals("jibuzphdug", response.iterator().next().deploymentTargetId());
        Assertions.assertEquals("iknp", response.iterator().next().displayName());
        Assertions.assertEquals(EnvironmentTypeEnableStatus.ENABLED, response.iterator().next().status());
    }
}
