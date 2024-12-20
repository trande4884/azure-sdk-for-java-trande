// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/**
 * Samples for ApplicationDefinitions Delete.
 */
public final class ApplicationDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/
     * deleteApplicationDefinition.json
     */
    /**
     * Sample code: delete managed application definition.
     * 
     * @param manager Entry point to ApplicationManager.
     */
    public static void
        deleteManagedApplicationDefinition(com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.applicationDefinitions()
            .deleteByResourceGroupWithResponse("rg", "myManagedApplicationDef", com.azure.core.util.Context.NONE);
    }
}
