// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.resourcemanager.devcenter.fluent.models.CatalogResourceValidationErrorDetailsInner;
import com.azure.resourcemanager.devcenter.models.CatalogErrorDetails;
import com.azure.resourcemanager.devcenter.models.CatalogResourceValidationErrorDetails;
import java.util.Collections;
import java.util.List;

public final class CatalogResourceValidationErrorDetailsImpl implements CatalogResourceValidationErrorDetails {
    private CatalogResourceValidationErrorDetailsInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    CatalogResourceValidationErrorDetailsImpl(CatalogResourceValidationErrorDetailsInner innerObject,
        com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<CatalogErrorDetails> errors() {
        List<CatalogErrorDetails> inner = this.innerModel().errors();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CatalogResourceValidationErrorDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}
