// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointRehydrationInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import com.azure.resourcemanager.recoveryservicesbackup.models.SnapshotRestoreParameters;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryMapping;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedIdentityProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.UserAssignedManagedIdentityDetails;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest model = BinaryData.fromString(
            "{\"objectType\":\"AzureWorkloadSQLPointInTimeRestoreWithRehydrateRequest\",\"recoveryPointRehydrationInfo\":{\"rehydrationRetentionDuration\":\"gbdg\",\"rehydrationPriority\":\"High\"},\"pointInTime\":\"2021-07-03T02:46:04Z\",\"shouldUseAlternateTargetLocation\":true,\"isNonRecoverable\":true,\"alternateDirectoryPaths\":[{\"mappingType\":\"Invalid\",\"sourceLogicalName\":\"exjddvjsaqwot\",\"sourcePath\":\"wllcolsr\",\"targetPath\":\"apte\"},{\"mappingType\":\"Data\",\"sourceLogicalName\":\"cgjokjljnhvlq\",\"sourcePath\":\"ek\",\"targetPath\":\"eksnbksdqhjvyk\"}],\"recoveryType\":\"Offline\",\"sourceResourceId\":\"lkhhu\",\"propertyBag\":{\"avnwqj\":\"poq\"},\"targetInfo\":{\"overwriteOption\":\"Invalid\",\"containerId\":\"lejjjkxy\",\"databaseName\":\"fdb\",\"targetDirectoryForFileRestore\":\"bztensvkzykjtj\"},\"recoveryMode\":\"FileRecovery\",\"targetResourceGroupName\":\"fwushcdpkupn\",\"userAssignedManagedIdentityDetails\":{\"identityArmId\":\"gjfbpkuwxeoi\",\"identityName\":\"fiz\",\"userAssignedIdentityProperties\":{\"clientId\":\"kjzwfbcyayk\",\"principalId\":\"fz\"}},\"snapshotRestoreParameters\":{\"skipAttachAndMount\":true,\"logPointInTimeForDBRecovery\":\"rzx\"},\"targetVirtualMachineId\":\"ewsrsxkrplbjaze\",\"resourceGuardOperationRequests\":[\"viyoypsuhbrnnhjx\"]}")
            .toObject(AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest.class);
        Assertions.assertEquals("viyoypsuhbrnnhjx", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("lkhhu", model.sourceResourceId());
        Assertions.assertEquals("poq", model.propertyBag().get("avnwqj"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("lejjjkxy", model.targetInfo().containerId());
        Assertions.assertEquals("fdb", model.targetInfo().databaseName());
        Assertions.assertEquals("bztensvkzykjtj", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("fwushcdpkupn", model.targetResourceGroupName());
        Assertions.assertEquals("gjfbpkuwxeoi", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("fiz", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("kjzwfbcyayk",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("fz",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
        Assertions.assertEquals(true, model.snapshotRestoreParameters().skipAttachAndMount());
        Assertions.assertEquals("rzx", model.snapshotRestoreParameters().logPointInTimeForDBRecovery());
        Assertions.assertEquals("ewsrsxkrplbjaze", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(true, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("exjddvjsaqwot", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("wllcolsr", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("apte", model.alternateDirectoryPaths().get(0).targetPath());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-03T02:46:04Z"), model.pointInTime());
        Assertions.assertEquals("gbdg", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest model
            = new AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest()
                .withResourceGuardOperationRequests(Arrays.asList("viyoypsuhbrnnhjx"))
                .withRecoveryType(RecoveryType.OFFLINE)
                .withSourceResourceId("lkhhu")
                .withPropertyBag(mapOf("avnwqj", "poq"))
                .withTargetInfo(new TargetRestoreInfo().withOverwriteOption(OverwriteOptions.INVALID)
                    .withContainerId("lejjjkxy")
                    .withDatabaseName("fdb")
                    .withTargetDirectoryForFileRestore("bztensvkzykjtj"))
                .withRecoveryMode(RecoveryMode.FILE_RECOVERY)
                .withTargetResourceGroupName("fwushcdpkupn")
                .withUserAssignedManagedIdentityDetails(
                    new UserAssignedManagedIdentityDetails().withIdentityArmId("gjfbpkuwxeoi")
                        .withIdentityName("fiz")
                        .withUserAssignedIdentityProperties(
                            new UserAssignedIdentityProperties().withClientId("kjzwfbcyayk").withPrincipalId("fz")))
                .withSnapshotRestoreParameters(
                    new SnapshotRestoreParameters().withSkipAttachAndMount(true).withLogPointInTimeForDBRecovery("rzx"))
                .withTargetVirtualMachineId("ewsrsxkrplbjaze")
                .withShouldUseAlternateTargetLocation(true)
                .withIsNonRecoverable(true)
                .withAlternateDirectoryPaths(Arrays.asList(
                    new SqlDataDirectoryMapping().withMappingType(SqlDataDirectoryType.INVALID)
                        .withSourceLogicalName("exjddvjsaqwot")
                        .withSourcePath("wllcolsr")
                        .withTargetPath("apte"),
                    new SqlDataDirectoryMapping().withMappingType(SqlDataDirectoryType.DATA)
                        .withSourceLogicalName("cgjokjljnhvlq")
                        .withSourcePath("ek")
                        .withTargetPath("eksnbksdqhjvyk")))
                .withPointInTime(OffsetDateTime.parse("2021-07-03T02:46:04Z"))
                .withRecoveryPointRehydrationInfo(
                    new RecoveryPointRehydrationInfo().withRehydrationRetentionDuration("gbdg")
                        .withRehydrationPriority(RehydrationPriority.HIGH));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest.class);
        Assertions.assertEquals("viyoypsuhbrnnhjx", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("lkhhu", model.sourceResourceId());
        Assertions.assertEquals("poq", model.propertyBag().get("avnwqj"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("lejjjkxy", model.targetInfo().containerId());
        Assertions.assertEquals("fdb", model.targetInfo().databaseName());
        Assertions.assertEquals("bztensvkzykjtj", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("fwushcdpkupn", model.targetResourceGroupName());
        Assertions.assertEquals("gjfbpkuwxeoi", model.userAssignedManagedIdentityDetails().identityArmId());
        Assertions.assertEquals("fiz", model.userAssignedManagedIdentityDetails().identityName());
        Assertions.assertEquals("kjzwfbcyayk",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().clientId());
        Assertions.assertEquals("fz",
            model.userAssignedManagedIdentityDetails().userAssignedIdentityProperties().principalId());
        Assertions.assertEquals(true, model.snapshotRestoreParameters().skipAttachAndMount());
        Assertions.assertEquals("rzx", model.snapshotRestoreParameters().logPointInTimeForDBRecovery());
        Assertions.assertEquals("ewsrsxkrplbjaze", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(true, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("exjddvjsaqwot", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("wllcolsr", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("apte", model.alternateDirectoryPaths().get(0).targetPath());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-03T02:46:04Z"), model.pointInTime());
        Assertions.assertEquals("gbdg", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
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
