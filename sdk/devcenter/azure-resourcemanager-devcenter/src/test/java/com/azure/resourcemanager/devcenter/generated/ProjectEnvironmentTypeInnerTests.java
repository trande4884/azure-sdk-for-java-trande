// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeInner;
import com.azure.resourcemanager.devcenter.models.EnvironmentRole;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeEnableStatus;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import com.azure.resourcemanager.devcenter.models.UserRoleAssignmentValue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ProjectEnvironmentTypeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectEnvironmentTypeInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Created\",\"environmentCount\":1492751876,\"deploymentTargetId\":\"jnkaljutiiswacff\",\"displayName\":\"k\",\"status\":\"Disabled\",\"creatorRoleAssignment\":{\"roles\":{\"hdlxyjrxsagafcn\":{\"roleName\":\"hqcrailvpnpp\",\"description\":\"flrwd\"},\"kcvqvpke\":{\"roleName\":\"gwq\",\"description\":\"nedgfbc\"}}},\"userRoleAssignments\":{\"rfouyftaakcpw\":{\"roles\":{\"dldwmgxc\":{\"roleName\":\"hvoodsotbobzd\",\"description\":\"cjwvn\"},\"yqsluic\":{\"roleName\":\"slpmutwuo\",\"description\":\"rpkhjwn\"},\"vmwy\":{\"roleName\":\"ggkzzlvmbmpa\",\"description\":\"odfvuefywsbp\"}}},\"kcbcue\":{\"roles\":{\"xvy\":{\"roleName\":\"qtmnubexkpzk\",\"description\":\"ondjmq\"},\"qgxy\":{\"roleName\":\"mg\",\"description\":\"pkwhojvpa\"},\"dd\":{\"roleName\":\"ocmbqfqvmkcxoza\",\"description\":\"helxprglya\"}}},\"sipqii\":{\"roles\":{\"bahwfl\":{\"roleName\":\"gciqibrh\",\"description\":\"xsdqrhzoymibmrqy\"},\"iexpbtgiwbwo\":{\"roleName\":\"zdtmhrkwofy\",\"description\":\"oqac\"},\"okulpiujwa\":{\"roleName\":\"washr\",\"description\":\"tkcnqxwb\"}}}}},\"tags\":{\"iuqgbdbutauv\":\"uqerpqlpqwc\"},\"identity\":{\"principalId\":\"4a2fc195-908d-4590-9197-d0c5d4bab941\",\"tenantId\":\"38e3119f-f389-43cd-a2cd-a4522834dce5\",\"type\":\"SystemAssigned, UserAssigned\",\"userAssignedIdentities\":{\"hykojoxafnndlpic\":{\"principalId\":\"7c52061d-2563-4c7e-b184-7528a766d0dc\",\"clientId\":\"fc4b6b50-ad36-4ab3-8f56-bbac3d9fde8b\"},\"ymkcdyhb\":{\"principalId\":\"df8dc383-a9e7-42da-b9ae-a00b3eaa25d8\",\"clientId\":\"2aab7ad4-872d-4337-bfc1-784906b7ada4\"},\"pwdreqnovvqf\":{\"principalId\":\"d8fe607a-8292-4f98-9f0c-3018fa5c3bb1\",\"clientId\":\"4a4632a7-158c-431b-89fb-bff482d360a0\"}}},\"location\":\"ljxywsu\",\"id\":\"yrs\",\"name\":\"dsytgadgvr\",\"type\":\"ea\"}")
            .toObject(ProjectEnvironmentTypeInner.class);
        Assertions.assertEquals("uqerpqlpqwc", model.tags().get("iuqgbdbutauv"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("ljxywsu", model.location());
        Assertions.assertEquals("jnkaljutiiswacff", model.deploymentTargetId());
        Assertions.assertEquals("k", model.displayName());
        Assertions.assertEquals(EnvironmentTypeEnableStatus.DISABLED, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectEnvironmentTypeInner model = new ProjectEnvironmentTypeInner()
            .withTags(mapOf("iuqgbdbutauv", "uqerpqlpqwc"))
            .withIdentity(
                new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("hykojoxafnndlpic", new UserAssignedIdentity(), "ymkcdyhb",
                        new UserAssignedIdentity(), "pwdreqnovvqf", new UserAssignedIdentity())))
            .withLocation("ljxywsu")
            .withDeploymentTargetId("jnkaljutiiswacff")
            .withDisplayName("k")
            .withStatus(EnvironmentTypeEnableStatus.DISABLED)
            .withCreatorRoleAssignment(new ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment()
                .withRoles(mapOf("hdlxyjrxsagafcn", new EnvironmentRole(), "kcvqvpke", new EnvironmentRole())))
            .withUserRoleAssignments(mapOf("rfouyftaakcpw",
                new UserRoleAssignmentValue().withRoles(mapOf("dldwmgxc", new EnvironmentRole(), "yqsluic",
                    new EnvironmentRole(), "vmwy", new EnvironmentRole())),
                "kcbcue",
                new UserRoleAssignmentValue().withRoles(
                    mapOf("xvy", new EnvironmentRole(), "qgxy", new EnvironmentRole(), "dd", new EnvironmentRole())),
                "sipqii", new UserRoleAssignmentValue().withRoles(mapOf("bahwfl", new EnvironmentRole(), "iexpbtgiwbwo",
                    new EnvironmentRole(), "okulpiujwa", new EnvironmentRole()))));
        model = BinaryData.fromObject(model).toObject(ProjectEnvironmentTypeInner.class);
        Assertions.assertEquals("uqerpqlpqwc", model.tags().get("iuqgbdbutauv"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("ljxywsu", model.location());
        Assertions.assertEquals("jnkaljutiiswacff", model.deploymentTargetId());
        Assertions.assertEquals("k", model.displayName());
        Assertions.assertEquals(EnvironmentTypeEnableStatus.DISABLED, model.status());
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
