// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/**
 * Samples for LocationBasedCapabilitySet List.
 */
public final class LocationBasedCapabilitySetListSamples {
    /*
     * x-ms-original-file:
     * specification/mysql/resource-manager/Microsoft.DBforMySQL/ServiceOperations/stable/2023-12-30/examples/
     * CapabilitySetListByLocation.json
     */
    /**
     * Sample code: CapabilitySetsResult.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void capabilitySetsResult(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.locationBasedCapabilitySets().list("WestUS", com.azure.core.util.Context.NONE);
    }
}
