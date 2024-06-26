// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.AzureADAdministratorInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorName;

/**
 * An instance of this class provides access to all the operations defined in AzureADAdministratorsClient.
 */
public interface AzureADAdministratorsClient {
    /**
     * Creates or updates an existing Azure Active Directory administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param parameters The required parameters for creating or updating an aad administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a Administrator.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureADAdministratorInner>, AzureADAdministratorInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, AdministratorName administratorName,
        AzureADAdministratorInner parameters);

    /**
     * Creates or updates an existing Azure Active Directory administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param parameters The required parameters for creating or updating an aad administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a Administrator.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureADAdministratorInner>, AzureADAdministratorInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, AdministratorName administratorName,
        AzureADAdministratorInner parameters, Context context);

    /**
     * Creates or updates an existing Azure Active Directory administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param parameters The required parameters for creating or updating an aad administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Administrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureADAdministratorInner createOrUpdate(String resourceGroupName, String serverName,
        AdministratorName administratorName, AzureADAdministratorInner parameters);

    /**
     * Creates or updates an existing Azure Active Directory administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param parameters The required parameters for creating or updating an aad administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Administrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureADAdministratorInner createOrUpdate(String resourceGroupName, String serverName,
        AdministratorName administratorName, AzureADAdministratorInner parameters, Context context);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName,
        AdministratorName administratorName);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName,
        AdministratorName administratorName, Context context);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, AdministratorName administratorName);

    /**
     * Deletes an Azure AD Administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, AdministratorName administratorName, Context context);

    /**
     * Gets information about an azure ad administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an azure ad administrator along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureADAdministratorInner> getWithResponse(String resourceGroupName, String serverName,
        AdministratorName administratorName, Context context);

    /**
     * Gets information about an azure ad administrator.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param administratorName The name of the Azure AD Administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about an azure ad administrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureADAdministratorInner get(String resourceGroupName, String serverName, AdministratorName administratorName);

    /**
     * List all the AAD administrators in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of azure ad administrators as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureADAdministratorInner> listByServer(String resourceGroupName, String serverName);

    /**
     * List all the AAD administrators in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of azure ad administrators as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureADAdministratorInner> listByServer(String resourceGroupName, String serverName, Context context);
}
