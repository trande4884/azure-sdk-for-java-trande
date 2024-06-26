// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakestore.models.FirewallState;
import com.azure.resourcemanager.datalakestore.models.TierType;
import com.azure.resourcemanager.datalakestore.models.TrustedIdProviderState;
import com.azure.resourcemanager.datalakestore.models.UpdateDataLakeStoreAccountParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateEncryptionConfig;
import com.azure.resourcemanager.datalakestore.models.UpdateFirewallRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateTrustedIdProviderWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateVirtualNetworkRuleWithAccountParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateDataLakeStoreAccountParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateDataLakeStoreAccountParameters model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"xv\":\"xsqwpgrjbznorc\",\"xqabnmocpcysh\":\"nb\",\"klj\":\"rzafbljjgpbtoqcj\"},\"properties\":{\"defaultGroup\":\"qidtqajzyu\",\"encryptionConfig\":{},\"firewallRules\":[{\"name\":\"jkrlkhbzhfepg\"}],\"virtualNetworkRules\":[{\"name\":\"xzlocxscp\"}],\"firewallState\":\"Enabled\",\"firewallAllowAzureIps\":\"Enabled\",\"trustedIdProviders\":[{\"name\":\"sglumma\"},{\"name\":\"j\"}],\"trustedIdProviderState\":\"Disabled\",\"newTier\":\"Commitment_1TB\"}}")
                .toObject(UpdateDataLakeStoreAccountParameters.class);
        Assertions.assertEquals("xsqwpgrjbznorc", model.tags().get("xv"));
        Assertions.assertEquals("qidtqajzyu", model.defaultGroup());
        Assertions.assertEquals("jkrlkhbzhfepg", model.firewallRules().get(0).name());
        Assertions.assertEquals("xzlocxscp", model.virtualNetworkRules().get(0).name());
        Assertions.assertEquals(FirewallState.ENABLED, model.firewallState());
        Assertions.assertEquals(FirewallAllowAzureIpsState.ENABLED, model.firewallAllowAzureIps());
        Assertions.assertEquals("sglumma", model.trustedIdProviders().get(0).name());
        Assertions.assertEquals(TrustedIdProviderState.DISABLED, model.trustedIdProviderState());
        Assertions.assertEquals(TierType.COMMITMENT_1TB, model.newTier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateDataLakeStoreAccountParameters model =
            new UpdateDataLakeStoreAccountParameters()
                .withTags(mapOf("xv", "xsqwpgrjbznorc", "xqabnmocpcysh", "nb", "klj", "rzafbljjgpbtoqcj"))
                .withDefaultGroup("qidtqajzyu")
                .withEncryptionConfig(new UpdateEncryptionConfig())
                .withFirewallRules(
                    Arrays.asList(new UpdateFirewallRuleWithAccountParameters().withName("jkrlkhbzhfepg")))
                .withVirtualNetworkRules(
                    Arrays.asList(new UpdateVirtualNetworkRuleWithAccountParameters().withName("xzlocxscp")))
                .withFirewallState(FirewallState.ENABLED)
                .withFirewallAllowAzureIps(FirewallAllowAzureIpsState.ENABLED)
                .withTrustedIdProviders(
                    Arrays
                        .asList(
                            new UpdateTrustedIdProviderWithAccountParameters().withName("sglumma"),
                            new UpdateTrustedIdProviderWithAccountParameters().withName("j")))
                .withTrustedIdProviderState(TrustedIdProviderState.DISABLED)
                .withNewTier(TierType.COMMITMENT_1TB);
        model = BinaryData.fromObject(model).toObject(UpdateDataLakeStoreAccountParameters.class);
        Assertions.assertEquals("xsqwpgrjbznorc", model.tags().get("xv"));
        Assertions.assertEquals("qidtqajzyu", model.defaultGroup());
        Assertions.assertEquals("jkrlkhbzhfepg", model.firewallRules().get(0).name());
        Assertions.assertEquals("xzlocxscp", model.virtualNetworkRules().get(0).name());
        Assertions.assertEquals(FirewallState.ENABLED, model.firewallState());
        Assertions.assertEquals(FirewallAllowAzureIpsState.ENABLED, model.firewallAllowAzureIps());
        Assertions.assertEquals("sglumma", model.trustedIdProviders().get(0).name());
        Assertions.assertEquals(TrustedIdProviderState.DISABLED, model.trustedIdProviderState());
        Assertions.assertEquals(TierType.COMMITMENT_1TB, model.newTier());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
