// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.OutboundEnvironmentEndpointInner;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * OutboundNetworkDependenciesEndpointsClient.
 */
public interface OutboundNetworkDependenciesEndpointsClient {
    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     * 
     * Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must configure
     * outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<OutboundEnvironmentEndpointInner>> listWithResponse(String resourceGroupName, String workspaceName,
        Context context);

    /**
     * Gets a list of egress endpoints (network endpoints of all outbound dependencies) in the specified Workspace.
     * 
     * Gets the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane. You must configure
     * outbound access with these endpoints. For more information, see
     * https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/udr.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of endpoints that VNET Injected Workspace calls Azure Databricks Control Plane.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<OutboundEnvironmentEndpointInner> list(String resourceGroupName, String workspaceName);
}
