// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.selfhelp.fluent.DiscoverySolutionNlpsClient;
import com.azure.resourcemanager.selfhelp.fluent.models.DiscoveryNlpResponseInner;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpRequest;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpResponse;
import com.azure.resourcemanager.selfhelp.models.DiscoverySolutionNlps;

public final class DiscoverySolutionNlpsImpl implements DiscoverySolutionNlps {
    private static final ClientLogger LOGGER = new ClientLogger(DiscoverySolutionNlpsImpl.class);

    private final DiscoverySolutionNlpsClient innerClient;

    private final com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager;

    public DiscoverySolutionNlpsImpl(DiscoverySolutionNlpsClient innerClient,
        com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DiscoveryNlpResponse> discoverSolutionsWithResponse(DiscoveryNlpRequest discoverSolutionRequest,
        Context context) {
        Response<DiscoveryNlpResponseInner> inner
            = this.serviceClient().discoverSolutionsWithResponse(discoverSolutionRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiscoveryNlpResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiscoveryNlpResponse discoverSolutions() {
        DiscoveryNlpResponseInner inner = this.serviceClient().discoverSolutions();
        if (inner != null) {
            return new DiscoveryNlpResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiscoveryNlpResponse> discoverSolutionsBySubscriptionWithResponse(String subscriptionId,
        DiscoveryNlpRequest discoverSolutionRequest, Context context) {
        Response<DiscoveryNlpResponseInner> inner = this.serviceClient()
            .discoverSolutionsBySubscriptionWithResponse(subscriptionId, discoverSolutionRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiscoveryNlpResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiscoveryNlpResponse discoverSolutionsBySubscription(String subscriptionId) {
        DiscoveryNlpResponseInner inner = this.serviceClient().discoverSolutionsBySubscription(subscriptionId);
        if (inner != null) {
            return new DiscoveryNlpResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DiscoverySolutionNlpsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.selfhelp.SelfHelpManager manager() {
        return this.serviceManager;
    }
}
