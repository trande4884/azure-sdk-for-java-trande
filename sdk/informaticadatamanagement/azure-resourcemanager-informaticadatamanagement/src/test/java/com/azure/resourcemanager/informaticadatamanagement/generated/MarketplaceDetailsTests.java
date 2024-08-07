// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.MarketplaceDetails;
import com.azure.resourcemanager.informaticadatamanagement.models.OfferDetails;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceDetails model = BinaryData.fromString(
            "{\"marketplaceSubscriptionId\":\"rwclxxwrljdo\",\"offerDetails\":{\"publisherId\":\"skcqvkocrcjd\",\"offerId\":\"wtnhxbnjbiksqr\",\"planId\":\"lssai\",\"planName\":\"qpjwnzlljfm\",\"termUnit\":\"eebvmgxsab\",\"termId\":\"yqduujit\"}}")
            .toObject(MarketplaceDetails.class);
        Assertions.assertEquals("rwclxxwrljdo", model.marketplaceSubscriptionId());
        Assertions.assertEquals("skcqvkocrcjd", model.offerDetails().publisherId());
        Assertions.assertEquals("wtnhxbnjbiksqr", model.offerDetails().offerId());
        Assertions.assertEquals("lssai", model.offerDetails().planId());
        Assertions.assertEquals("qpjwnzlljfm", model.offerDetails().planName());
        Assertions.assertEquals("eebvmgxsab", model.offerDetails().termUnit());
        Assertions.assertEquals("yqduujit", model.offerDetails().termId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceDetails model = new MarketplaceDetails().withMarketplaceSubscriptionId("rwclxxwrljdo")
            .withOfferDetails(new OfferDetails().withPublisherId("skcqvkocrcjd")
                .withOfferId("wtnhxbnjbiksqr")
                .withPlanId("lssai")
                .withPlanName("qpjwnzlljfm")
                .withTermUnit("eebvmgxsab")
                .withTermId("yqduujit"));
        model = BinaryData.fromObject(model).toObject(MarketplaceDetails.class);
        Assertions.assertEquals("rwclxxwrljdo", model.marketplaceSubscriptionId());
        Assertions.assertEquals("skcqvkocrcjd", model.offerDetails().publisherId());
        Assertions.assertEquals("wtnhxbnjbiksqr", model.offerDetails().offerId());
        Assertions.assertEquals("lssai", model.offerDetails().planId());
        Assertions.assertEquals("qpjwnzlljfm", model.offerDetails().planName());
        Assertions.assertEquals("eebvmgxsab", model.offerDetails().termUnit());
        Assertions.assertEquals("yqduujit", model.offerDetails().termId());
    }
}
