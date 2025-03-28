// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The anomaly SecurityMLAnalyticsSettings status.
 */
public final class SettingsStatus extends ExpandableStringEnum<SettingsStatus> {
    /**
     * Static value Production for SettingsStatus.
     */
    public static final SettingsStatus PRODUCTION = fromString("Production");

    /**
     * Static value Flighting for SettingsStatus.
     */
    public static final SettingsStatus FLIGHTING = fromString("Flighting");

    /**
     * Creates a new instance of SettingsStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SettingsStatus() {
    }

    /**
     * Creates or finds a SettingsStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SettingsStatus.
     */
    public static SettingsStatus fromString(String name) {
        return fromString(name, SettingsStatus.class);
    }

    /**
     * Gets known SettingsStatus values.
     * 
     * @return known SettingsStatus values.
     */
    public static Collection<SettingsStatus> values() {
        return values(SettingsStatus.class);
    }
}
