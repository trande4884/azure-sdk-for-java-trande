// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

/**
 * The type of restrictions.
 */
public enum ApiManagementSkuRestrictionsType {
    /**
     * Enum value Location.
     */
    LOCATION("Location"),

    /**
     * Enum value Zone.
     */
    ZONE("Zone");

    /**
     * The actual serialized value for a ApiManagementSkuRestrictionsType instance.
     */
    private final String value;

    ApiManagementSkuRestrictionsType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ApiManagementSkuRestrictionsType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ApiManagementSkuRestrictionsType object, or null if unable to parse.
     */
    public static ApiManagementSkuRestrictionsType fromString(String value) {
        if (value == null) {
            return null;
        }
        ApiManagementSkuRestrictionsType[] items = ApiManagementSkuRestrictionsType.values();
        for (ApiManagementSkuRestrictionsType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
