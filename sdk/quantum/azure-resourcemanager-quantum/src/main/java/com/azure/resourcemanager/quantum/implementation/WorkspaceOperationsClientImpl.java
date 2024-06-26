// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.quantum.fluent.WorkspaceOperationsClient;
import com.azure.resourcemanager.quantum.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.quantum.fluent.models.ListKeysResultInner;
import com.azure.resourcemanager.quantum.models.ApiKeys;
import com.azure.resourcemanager.quantum.models.CheckNameAvailabilityParameters;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in WorkspaceOperationsClient.
 */
public final class WorkspaceOperationsClientImpl implements WorkspaceOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final WorkspaceOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final AzureQuantumManagementClientImpl client;

    /**
     * Initializes an instance of WorkspaceOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    WorkspaceOperationsClientImpl(AzureQuantumManagementClientImpl client) {
        this.service = RestProxy.create(WorkspaceOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureQuantumManagementClientWorkspaceOperations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureQuantumManageme")
    public interface WorkspaceOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Quantum/locations/{locationName}/checkNameAvailability")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailability(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("locationName") String locationName,
            @BodyParam("application/json") CheckNameAvailabilityParameters checkNameAvailabilityParameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/listKeys")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListKeysResultInner>> listKeys(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/regenerateKey")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> regenerateKeys(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workspaceName") String workspaceName,
            @BodyParam("application/json") ApiKeys keySpecification, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check the availability of the resource name.
     * 
     * @param locationName Location.
     * @param checkNameAvailabilityParameters The name and type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of check name availability along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(String locationName,
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (checkNameAvailabilityParameters == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter checkNameAvailabilityParameters is required and cannot be null."));
        } else {
            checkNameAvailabilityParameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.checkNameAvailability(this.client.getEndpoint(), this.client.getSubscriptionId(),
                    this.client.getApiVersion(), locationName, checkNameAvailabilityParameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check the availability of the resource name.
     * 
     * @param locationName Location.
     * @param checkNameAvailabilityParameters The name and type of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of check name availability along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(String locationName,
        CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (checkNameAvailabilityParameters == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter checkNameAvailabilityParameters is required and cannot be null."));
        } else {
            checkNameAvailabilityParameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.checkNameAvailability(this.client.getEndpoint(), this.client.getSubscriptionId(),
            this.client.getApiVersion(), locationName, checkNameAvailabilityParameters, accept, context);
    }

    /**
     * Check the availability of the resource name.
     * 
     * @param locationName Location.
     * @param checkNameAvailabilityParameters The name and type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of check name availability on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(String locationName,
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        return checkNameAvailabilityWithResponseAsync(locationName, checkNameAvailabilityParameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Check the availability of the resource name.
     * 
     * @param locationName Location.
     * @param checkNameAvailabilityParameters The name and type of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of check name availability along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckNameAvailabilityResultInner> checkNameAvailabilityWithResponse(String locationName,
        CheckNameAvailabilityParameters checkNameAvailabilityParameters, Context context) {
        return checkNameAvailabilityWithResponseAsync(locationName, checkNameAvailabilityParameters, context).block();
    }

    /**
     * Check the availability of the resource name.
     * 
     * @param locationName Location.
     * @param checkNameAvailabilityParameters The name and type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of check name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner checkNameAvailability(String locationName,
        CheckNameAvailabilityParameters checkNameAvailabilityParameters) {
        return checkNameAvailabilityWithResponse(locationName, checkNameAvailabilityParameters, Context.NONE)
            .getValue();
    }

    /**
     * Get the keys to use with the Quantum APIs. A key is used to authenticate and authorize access to the Quantum REST
     * APIs. Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Quantum APIs along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ListKeysResultInner>> listKeysWithResponseAsync(String resourceGroupName,
        String workspaceName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listKeys(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), resourceGroupName, workspaceName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the keys to use with the Quantum APIs. A key is used to authenticate and authorize access to the Quantum REST
     * APIs. Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Quantum APIs along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ListKeysResultInner>> listKeysWithResponseAsync(String resourceGroupName,
        String workspaceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listKeys(this.client.getEndpoint(), this.client.getSubscriptionId(), this.client.getApiVersion(),
            resourceGroupName, workspaceName, accept, context);
    }

    /**
     * Get the keys to use with the Quantum APIs. A key is used to authenticate and authorize access to the Quantum REST
     * APIs. Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Quantum APIs on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ListKeysResultInner> listKeysAsync(String resourceGroupName, String workspaceName) {
        return listKeysWithResponseAsync(resourceGroupName, workspaceName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the keys to use with the Quantum APIs. A key is used to authenticate and authorize access to the Quantum REST
     * APIs. Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Quantum APIs along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ListKeysResultInner> listKeysWithResponse(String resourceGroupName, String workspaceName,
        Context context) {
        return listKeysWithResponseAsync(resourceGroupName, workspaceName, context).block();
    }

    /**
     * Get the keys to use with the Quantum APIs. A key is used to authenticate and authorize access to the Quantum REST
     * APIs. Only one key is needed at a time; two are given to provide seamless key regeneration.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the keys to use with the Quantum APIs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListKeysResultInner listKeys(String resourceGroupName, String workspaceName) {
        return listKeysWithResponse(resourceGroupName, workspaceName, Context.NONE).getValue();
    }

    /**
     * Regenerate either the primary or secondary key for use with the Quantum APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regenerateKeysWithResponseAsync(String resourceGroupName, String workspaceName,
        ApiKeys keySpecification) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (keySpecification == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter keySpecification is required and cannot be null."));
        } else {
            keySpecification.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.regenerateKeys(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), resourceGroupName, workspaceName, keySpecification, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Regenerate either the primary or secondary key for use with the Quantum APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> regenerateKeysWithResponseAsync(String resourceGroupName, String workspaceName,
        ApiKeys keySpecification, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        if (keySpecification == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter keySpecification is required and cannot be null."));
        } else {
            keySpecification.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.regenerateKeys(this.client.getEndpoint(), this.client.getSubscriptionId(),
            this.client.getApiVersion(), resourceGroupName, workspaceName, keySpecification, accept, context);
    }

    /**
     * Regenerate either the primary or secondary key for use with the Quantum APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> regenerateKeysAsync(String resourceGroupName, String workspaceName, ApiKeys keySpecification) {
        return regenerateKeysWithResponseAsync(resourceGroupName, workspaceName, keySpecification)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Regenerate either the primary or secondary key for use with the Quantum APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> regenerateKeysWithResponse(String resourceGroupName, String workspaceName,
        ApiKeys keySpecification, Context context) {
        return regenerateKeysWithResponseAsync(resourceGroupName, workspaceName, keySpecification, context).block();
    }

    /**
     * Regenerate either the primary or secondary key for use with the Quantum APIs. The old key will stop working
     * immediately.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the quantum workspace resource.
     * @param keySpecification Which key to regenerate: primary or secondary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void regenerateKeys(String resourceGroupName, String workspaceName, ApiKeys keySpecification) {
        regenerateKeysWithResponse(resourceGroupName, workspaceName, keySpecification, Context.NONE);
    }
}
