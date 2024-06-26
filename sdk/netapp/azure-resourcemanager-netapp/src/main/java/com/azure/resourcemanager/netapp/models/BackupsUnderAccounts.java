// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.Context;

/**
 * Resource collection API of BackupsUnderAccounts.
 */
public interface BackupsUnderAccounts {
    /**
     * Create a new migrate request for backups under account
     * 
     * Migrate the backups under a NetApp account to backup vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param body Migrate backups under an account payload supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void migrateBackups(String resourceGroupName, String accountName, BackupsMigrationRequest body);

    /**
     * Create a new migrate request for backups under account
     * 
     * Migrate the backups under a NetApp account to backup vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the NetApp account.
     * @param body Migrate backups under an account payload supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void migrateBackups(String resourceGroupName, String accountName, BackupsMigrationRequest body, Context context);
}
