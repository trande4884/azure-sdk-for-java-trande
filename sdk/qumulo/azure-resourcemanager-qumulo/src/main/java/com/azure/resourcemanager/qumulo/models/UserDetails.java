// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User Details of Qumulo FileSystem resource. */
@Fluent
public final class UserDetails {
    /*
     * User Email
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /** Creates an instance of UserDetails class. */
    public UserDetails() {
    }

    /**
     * Get the email property: User Email.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: User Email.
     *
     * @param email the email value to set.
     * @return the UserDetails object itself.
     */
    public UserDetails withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (email() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property email in model UserDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserDetails.class);
}
