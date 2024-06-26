// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.AgentProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.FabricProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devopsinfrastructure.models.OrganizationProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.PoolUpdate;
import com.azure.resourcemanager.devopsinfrastructure.models.PoolUpdateProperties;
import com.azure.resourcemanager.devopsinfrastructure.models.ProvisioningState;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourcePredictionsProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PoolUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PoolUpdate model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"fqpte\",\"tenantId\":\"zzvypyqrimzinp\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"kwh\":{\"principalId\":\"kirsoodqxhc\",\"clientId\":\"nohjt\"},\"vsnb\":{\"principalId\":\"oifiyipjxsqwpgr\",\"clientId\":\"znorcj\"},\"rzafbljjgpbtoqcj\":{\"principalId\":\"qabnmoc\",\"clientId\":\"ysh\"}}},\"tags\":{\"ulpkudjkrl\":\"javbqidtqajz\",\"gqexzlocxs\":\"hbzhfepg\"},\"properties\":{\"provisioningState\":\"Provisioning\",\"maximumConcurrency\":1450066184,\"organizationProfile\":{\"kind\":\"OrganizationProfile\"},\"agentProfile\":{\"kind\":\"AgentProfile\",\"resourcePredictions\":\"datacsglum\",\"resourcePredictionsProfile\":{\"kind\":\"ResourcePredictionsProfile\"}},\"fabricProfile\":{\"kind\":\"FabricProfile\"},\"devCenterProjectResourceId\":\"j\"}}")
            .toObject(PoolUpdate.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("javbqidtqajz", model.tags().get("ulpkudjkrl"));
        Assertions.assertEquals(ProvisioningState.PROVISIONING, model.properties().provisioningState());
        Assertions.assertEquals(1450066184, model.properties().maximumConcurrency());
        Assertions.assertEquals("j", model.properties().devCenterProjectResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PoolUpdate model = new PoolUpdate()
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("kwh", new UserAssignedIdentity(), "vsnb", new UserAssignedIdentity(),
                    "rzafbljjgpbtoqcj", new UserAssignedIdentity())))
            .withTags(mapOf("ulpkudjkrl", "javbqidtqajz", "gqexzlocxs", "hbzhfepg"))
            .withProperties(new PoolUpdateProperties().withProvisioningState(ProvisioningState.PROVISIONING)
                .withMaximumConcurrency(1450066184)
                .withOrganizationProfile(new OrganizationProfile())
                .withAgentProfile(new AgentProfile().withResourcePredictions("datacsglum")
                    .withResourcePredictionsProfile(new ResourcePredictionsProfile()))
                .withFabricProfile(new FabricProfile())
                .withDevCenterProjectResourceId("j"));
        model = BinaryData.fromObject(model).toObject(PoolUpdate.class);
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("javbqidtqajz", model.tags().get("ulpkudjkrl"));
        Assertions.assertEquals(ProvisioningState.PROVISIONING, model.properties().provisioningState());
        Assertions.assertEquals(1450066184, model.properties().maximumConcurrency());
        Assertions.assertEquals("j", model.properties().devCenterProjectResourceId());
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
