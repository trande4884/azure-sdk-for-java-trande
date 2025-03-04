// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Catalog item sync types enable or disable status. Indicates whether project catalogs are allowed to sync catalog
 * items under projects associated to this dev center.
 */
public final class CatalogItemSyncEnableStatus extends ExpandableStringEnum<CatalogItemSyncEnableStatus> {
    /**
     * Static value Enabled for CatalogItemSyncEnableStatus.
     */
    public static final CatalogItemSyncEnableStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for CatalogItemSyncEnableStatus.
     */
    public static final CatalogItemSyncEnableStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of CatalogItemSyncEnableStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CatalogItemSyncEnableStatus() {
    }

    /**
     * Creates or finds a CatalogItemSyncEnableStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CatalogItemSyncEnableStatus.
     */
    public static CatalogItemSyncEnableStatus fromString(String name) {
        return fromString(name, CatalogItemSyncEnableStatus.class);
    }

    /**
     * Gets known CatalogItemSyncEnableStatus values.
     * 
     * @return known CatalogItemSyncEnableStatus values.
     */
    public static Collection<CatalogItemSyncEnableStatus> values() {
        return values(CatalogItemSyncEnableStatus.class);
    }
}
