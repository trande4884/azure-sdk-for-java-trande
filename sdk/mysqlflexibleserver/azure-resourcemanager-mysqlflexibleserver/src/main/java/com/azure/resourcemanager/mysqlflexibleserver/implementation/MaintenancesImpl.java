// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.MaintenancesClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.MaintenanceInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.Maintenance;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceUpdate;
import com.azure.resourcemanager.mysqlflexibleserver.models.Maintenances;

public final class MaintenancesImpl implements Maintenances {
    private static final ClientLogger LOGGER = new ClientLogger(MaintenancesImpl.class);

    private final MaintenancesClient innerClient;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    public MaintenancesImpl(MaintenancesClient innerClient,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Maintenance> readWithResponse(String resourceGroupName, String serverName, String maintenanceName,
        Context context) {
        Response<MaintenanceInner> inner
            = this.serviceClient().readWithResponse(resourceGroupName, serverName, maintenanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new MaintenanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Maintenance read(String resourceGroupName, String serverName, String maintenanceName) {
        MaintenanceInner inner = this.serviceClient().read(resourceGroupName, serverName, maintenanceName);
        if (inner != null) {
            return new MaintenanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Maintenance update(String resourceGroupName, String serverName, String maintenanceName) {
        MaintenanceInner inner = this.serviceClient().update(resourceGroupName, serverName, maintenanceName);
        if (inner != null) {
            return new MaintenanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Maintenance update(String resourceGroupName, String serverName, String maintenanceName,
        MaintenanceUpdate parameters, Context context) {
        MaintenanceInner inner
            = this.serviceClient().update(resourceGroupName, serverName, maintenanceName, parameters, context);
        if (inner != null) {
            return new MaintenanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Maintenance> list(String resourceGroupName, String serverName) {
        PagedIterable<MaintenanceInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MaintenanceImpl(inner1, this.manager()));
    }

    public PagedIterable<Maintenance> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<MaintenanceInner> inner = this.serviceClient().list(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new MaintenanceImpl(inner1, this.manager()));
    }

    private MaintenancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
