// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.resourcemanager.peering.models.CheckServiceProviderAvailabilityInput;

/**
 * Samples for ResourceProvider CheckServiceProviderAvailability.
 */
public final class ResourceProviderCheckServiceProviderAvailabilitySamples {
    /*
     * x-ms-original-file: specification/peering/resource-manager/Microsoft.Peering/stable/2021-01-01/examples/
     * CheckServiceProviderAvailability.json
     */
    /**
     * Sample code: Check if peering service provider is available in customer location.
     * 
     * @param manager Entry point to PeeringManager.
     */
    public static void checkIfPeeringServiceProviderIsAvailableInCustomerLocation(
        com.azure.resourcemanager.peering.PeeringManager manager) {
        manager.resourceProviders()
            .checkServiceProviderAvailabilityWithResponse(
                new CheckServiceProviderAvailabilityInput().withPeeringServiceLocation("peeringServiceLocation1")
                    .withPeeringServiceProvider("peeringServiceProvider1"),
                com.azure.core.util.Context.NONE);
    }
}
