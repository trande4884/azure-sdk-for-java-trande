// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

/**
 * The Editable status for Reverse Shipping Address and Contact Info.
 */
public enum ReverseShippingDetailsEditStatus {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled"),

    /**
     * Enum value NotSupported.
     */
    NOT_SUPPORTED("NotSupported");

    /**
     * The actual serialized value for a ReverseShippingDetailsEditStatus instance.
     */
    private final String value;

    ReverseShippingDetailsEditStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReverseShippingDetailsEditStatus instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ReverseShippingDetailsEditStatus object, or null if unable to parse.
     */
    public static ReverseShippingDetailsEditStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        ReverseShippingDetailsEditStatus[] items = ReverseShippingDetailsEditStatus.values();
        for (ReverseShippingDetailsEditStatus item : items) {
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
