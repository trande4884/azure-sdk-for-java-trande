// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for AutonomousDatabaseCharacterSets Get.
 */
public final class AutonomousDatabaseCharacterSetsGetSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/stable/2023-09-01/examples/
     * autonomousDatabaseCharacterSet_get.json
     */
    /**
     * Sample code: Get autonomous db character set.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        getAutonomousDbCharacterSet(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.autonomousDatabaseCharacterSets()
            .getWithResponse("eastus", "DATABASE", com.azure.core.util.Context.NONE);
    }
}
