// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.FabricModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.FabricModel;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.FabricModelProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.FabricModelSystemData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.FabricModelUpdate;
import java.util.Collections;
import java.util.Map;

public final class FabricModelImpl implements FabricModel, FabricModel.Definition, FabricModel.Update {
    private FabricModelInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public FabricModelProperties properties() {
        return this.innerModel().properties();
    }

    public FabricModelSystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FabricModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String fabricName;

    private FabricModelUpdate updateBody;

    public FabricModelImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public FabricModel create() {
        this.innerObject = serviceManager.serviceClient()
            .getFabrics()
            .create(resourceGroupName, fabricName, this.innerModel(), Context.NONE);
        return this;
    }

    public FabricModel create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFabrics()
            .create(resourceGroupName, fabricName, this.innerModel(), context);
        return this;
    }

    FabricModelImpl(String name,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager) {
        this.innerObject = new FabricModelInner();
        this.serviceManager = serviceManager;
        this.fabricName = name;
    }

    public FabricModelImpl update() {
        this.updateBody = new FabricModelUpdate();
        return this;
    }

    public FabricModel apply() {
        this.innerObject = serviceManager.serviceClient()
            .getFabrics()
            .update(resourceGroupName, fabricName, updateBody, Context.NONE);
        return this;
    }

    public FabricModel apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getFabrics().update(resourceGroupName, fabricName, updateBody, context);
        return this;
    }

    FabricModelImpl(FabricModelInner innerObject,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fabricName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "replicationFabrics");
    }

    public FabricModel refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getFabrics()
            .getByResourceGroupWithResponse(resourceGroupName, fabricName, Context.NONE)
            .getValue();
        return this;
    }

    public FabricModel refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFabrics()
            .getByResourceGroupWithResponse(resourceGroupName, fabricName, context)
            .getValue();
        return this;
    }

    public FabricModelImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FabricModelImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FabricModelImpl withProperties(FabricModelProperties properties) {
        if (isInCreateMode()) {
            this.innerModel().withProperties(properties);
            return this;
        } else {
            this.updateBody.withProperties(properties);
            return this;
        }
    }

    public FabricModelImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
