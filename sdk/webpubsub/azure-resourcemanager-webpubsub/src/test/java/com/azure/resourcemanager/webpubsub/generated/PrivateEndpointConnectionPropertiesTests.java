// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Creating\",\"privateEndpoint\":{\"id\":\"dkcrodt\"},\"groupIds\":[\"fw\",\"lfltka\",\"jvefkdlfoakggkfp\",\"gaowpulpqblylsyx\"],\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"jervtia\",\"actionsRequired\":\"sdszue\"}}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("dkcrodt", model.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.PENDING, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jervtia", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("sdszue", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint().withId("dkcrodt"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.PENDING)
                        .withDescription("jervtia")
                        .withActionsRequired("sdszue"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions.assertEquals("dkcrodt", model.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.PENDING, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jervtia", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("sdszue", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
