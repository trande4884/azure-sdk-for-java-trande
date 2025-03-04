// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SapDatabaseInstances.
 */
public interface SapDatabaseInstances {
    /**
     * Gets the SAP Database Instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance resource along with {@link Response}.
     */
    Response<SapDatabaseInstance> getWithResponse(String resourceGroupName, String sapVirtualInstanceName,
        String databaseInstanceName, Context context);

    /**
     * Gets the SAP Database Instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance resource.
     */
    SapDatabaseInstance get(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource.
     * &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult delete(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource.
     * &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult delete(String resourceGroupName, String sapVirtualInstanceName, String databaseInstanceName,
        Context context);

    /**
     * Lists the Database resources associated with a Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Database Instances as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SapDatabaseInstance> list(String resourceGroupName, String sapVirtualInstanceName);

    /**
     * Lists the Database resources associated with a Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Database Instances as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SapDatabaseInstance> list(String resourceGroupName, String sapVirtualInstanceName, Context context);

    /**
     * Starts the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult startInstance(String resourceGroupName, String sapVirtualInstanceName,
        String databaseInstanceName);

    /**
     * Starts the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult startInstance(String resourceGroupName, String sapVirtualInstanceName,
        String databaseInstanceName, Context context);

    /**
     * Stops the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stopInstance(String resourceGroupName, String sapVirtualInstanceName,
        String databaseInstanceName);

    /**
     * Stops the database instance of the SAP system.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param databaseInstanceName Database resource name string modeled as parameter for auto generation to work
     * correctly.
     * @param body Stop request for the database instance of the SAP system.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stopInstance(String resourceGroupName, String sapVirtualInstanceName,
        String databaseInstanceName, StopRequest body, Context context);

    /**
     * Gets the SAP Database Instance resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance resource along with {@link Response}.
     */
    SapDatabaseInstance getById(String id);

    /**
     * Gets the SAP Database Instance resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Database Instance resource along with {@link Response}.
     */
    Response<SapDatabaseInstance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource.
     * &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteById(String id);

    /**
     * Deletes the Database resource corresponding to a Virtual Instance for SAP solutions resource.
     * &lt;br&gt;&lt;br&gt;This will be used by service only. Delete by end user will return a Bad Request error.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SapDatabaseInstance resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SapDatabaseInstance definition.
     */
    SapDatabaseInstance.DefinitionStages.Blank define(String name);
}
