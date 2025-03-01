// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ManagementNetworkConfigurationProperties;
import com.azure.resourcemanager.managednetworkfabric.models.OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import com.azure.resourcemanager.managednetworkfabric.models.RouteTargetInformation;
import com.azure.resourcemanager.managednetworkfabric.models.VpnConfigurationProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VpnConfigurationPropertiesOptionAProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagementNetworkConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagementNetworkConfigurationProperties model = BinaryData.fromString(
            "{\"infrastructureVpnConfiguration\":{\"networkToNetworkInterconnectId\":\"saudoejtighsx\",\"administrativeState\":\"Disabled\",\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"bala\",\"ovu\",\"wxhmehjnhjiot\",\"ffbbcngkegxcypxb\"],\"exportRouteTargets\":[\"twilyrzoxp\",\"xql\",\"r\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"wnk\"],\"importIpv6RouteTargets\":[\"jew\",\"ahwkxjjm\"],\"exportIpv4RouteTargets\":[\"lmsoodtmve\",\"dhdyswcrptveaj\"],\"exportIpv6RouteTargets\":[\"vlgsrgkrfiz\"]}},\"optionAProperties\":{\"primaryIpv4Prefix\":\"wlp\",\"primaryIpv6Prefix\":\"uqhrlmcskykp\",\"secondaryIpv4Prefix\":\"ofix\",\"secondaryIpv6Prefix\":\"pcfykkpy\",\"mtu\":401462028,\"vlanId\":1800967897,\"peerASN\":8498572481806754395,\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"intervalInMilliSeconds\":2048384787,\"multiplier\":1708534342}}},\"workloadVpnConfiguration\":{\"networkToNetworkInterconnectId\":\"fpcfjf\",\"administrativeState\":\"RMA\",\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"kgyepe\"],\"exportRouteTargets\":[\"nnidmdiawpzxk\",\"rntmkctdhu\",\"sgwqpsqaz\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"dvqgcnbhcbmjkz\",\"ibniynts\",\"jmfmeftvhkm\",\"ogjrhskbwgm\"],\"importIpv6RouteTargets\":[\"u\",\"cfogxhcxnwjt\"],\"exportIpv4RouteTargets\":[\"zxcouzf\",\"ofwakukzk\",\"tzxsoednlwglihe\"],\"exportIpv6RouteTargets\":[\"ucmqgisnione\",\"bzdrdpuenxkgt\"]}},\"optionAProperties\":{\"primaryIpv4Prefix\":\"mtrlxczn\",\"primaryIpv6Prefix\":\"zkbnbmxl\",\"secondaryIpv4Prefix\":\"wtyg\",\"secondaryIpv6Prefix\":\"zusitoqcahfs\",\"mtu\":1997837951,\"vlanId\":1957504225,\"peerASN\":547030463156659693,\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":1665599980,\"multiplier\":2049458072}}}}")
            .toObject(ManagementNetworkConfigurationProperties.class);
        Assertions.assertEquals("saudoejtighsx",
            model.infrastructureVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.infrastructureVpnConfiguration().peeringOption());
        Assertions.assertEquals("bala",
            model.infrastructureVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("twilyrzoxp",
            model.infrastructureVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("wnk",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("jew",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("lmsoodtmve",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("vlgsrgkrfiz",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals(401462028, model.infrastructureVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(1800967897, model.infrastructureVpnConfiguration().optionAProperties().vlanId());
        Assertions.assertEquals(8498572481806754395L,
            model.infrastructureVpnConfiguration().optionAProperties().peerAsn());
        Assertions.assertEquals(2048384787,
            model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1708534342,
            model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("wlp", model.infrastructureVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("uqhrlmcskykp",
            model.infrastructureVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("ofix",
            model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("pcfykkpy",
            model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals("fpcfjf", model.workloadVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.workloadVpnConfiguration().peeringOption());
        Assertions.assertEquals("kgyepe",
            model.workloadVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("nnidmdiawpzxk",
            model.workloadVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("dvqgcnbhcbmjkz",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("u",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("zxcouzf",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("ucmqgisnione",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals(1997837951, model.workloadVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(1957504225, model.workloadVpnConfiguration().optionAProperties().vlanId());
        Assertions.assertEquals(547030463156659693L, model.workloadVpnConfiguration().optionAProperties().peerAsn());
        Assertions.assertEquals(1665599980,
            model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(2049458072,
            model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("mtrlxczn", model.workloadVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("zkbnbmxl", model.workloadVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("wtyg", model.workloadVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("zusitoqcahfs",
            model.workloadVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagementNetworkConfigurationProperties model = new ManagementNetworkConfigurationProperties()
            .withInfrastructureVpnConfiguration(
                new VpnConfigurationProperties().withNetworkToNetworkInterconnectId("saudoejtighsx")
                    .withPeeringOption(PeeringOption.OPTIONA)
                    .withOptionBProperties(new OptionBProperties()
                        .withImportRouteTargets(Arrays.asList("bala", "ovu", "wxhmehjnhjiot", "ffbbcngkegxcypxb"))
                        .withExportRouteTargets(Arrays.asList("twilyrzoxp", "xql", "r"))
                        .withRouteTargets(new RouteTargetInformation().withImportIpv4RouteTargets(Arrays.asList("wnk"))
                            .withImportIpv6RouteTargets(Arrays.asList("jew", "ahwkxjjm"))
                            .withExportIpv4RouteTargets(Arrays.asList("lmsoodtmve", "dhdyswcrptveaj"))
                            .withExportIpv6RouteTargets(Arrays.asList("vlgsrgkrfiz"))))
                    .withOptionAProperties(new VpnConfigurationPropertiesOptionAProperties().withMtu(401462028)
                        .withVlanId(1800967897)
                        .withPeerAsn(8498572481806754395L)
                        .withBfdConfiguration(
                            new BfdConfiguration().withIntervalInMilliSeconds(2048384787).withMultiplier(1708534342))
                        .withPrimaryIpv4Prefix("wlp")
                        .withPrimaryIpv6Prefix("uqhrlmcskykp")
                        .withSecondaryIpv4Prefix("ofix")
                        .withSecondaryIpv6Prefix("pcfykkpy")))
            .withWorkloadVpnConfiguration(new VpnConfigurationProperties().withNetworkToNetworkInterconnectId("fpcfjf")
                .withPeeringOption(PeeringOption.OPTIONA)
                .withOptionBProperties(new OptionBProperties().withImportRouteTargets(Arrays.asList("kgyepe"))
                    .withExportRouteTargets(Arrays.asList("nnidmdiawpzxk", "rntmkctdhu", "sgwqpsqaz"))
                    .withRouteTargets(new RouteTargetInformation()
                        .withImportIpv4RouteTargets(
                            Arrays.asList("dvqgcnbhcbmjkz", "ibniynts", "jmfmeftvhkm", "ogjrhskbwgm"))
                        .withImportIpv6RouteTargets(Arrays.asList("u", "cfogxhcxnwjt"))
                        .withExportIpv4RouteTargets(Arrays.asList("zxcouzf", "ofwakukzk", "tzxsoednlwglihe"))
                        .withExportIpv6RouteTargets(Arrays.asList("ucmqgisnione", "bzdrdpuenxkgt"))))
                .withOptionAProperties(new VpnConfigurationPropertiesOptionAProperties().withMtu(1997837951)
                    .withVlanId(1957504225)
                    .withPeerAsn(547030463156659693L)
                    .withBfdConfiguration(
                        new BfdConfiguration().withIntervalInMilliSeconds(1665599980).withMultiplier(2049458072))
                    .withPrimaryIpv4Prefix("mtrlxczn")
                    .withPrimaryIpv6Prefix("zkbnbmxl")
                    .withSecondaryIpv4Prefix("wtyg")
                    .withSecondaryIpv6Prefix("zusitoqcahfs")));
        model = BinaryData.fromObject(model).toObject(ManagementNetworkConfigurationProperties.class);
        Assertions.assertEquals("saudoejtighsx",
            model.infrastructureVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.infrastructureVpnConfiguration().peeringOption());
        Assertions.assertEquals("bala",
            model.infrastructureVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("twilyrzoxp",
            model.infrastructureVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("wnk",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("jew",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("lmsoodtmve",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("vlgsrgkrfiz",
            model.infrastructureVpnConfiguration().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals(401462028, model.infrastructureVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(1800967897, model.infrastructureVpnConfiguration().optionAProperties().vlanId());
        Assertions.assertEquals(8498572481806754395L,
            model.infrastructureVpnConfiguration().optionAProperties().peerAsn());
        Assertions.assertEquals(2048384787,
            model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1708534342,
            model.infrastructureVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("wlp", model.infrastructureVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("uqhrlmcskykp",
            model.infrastructureVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("ofix",
            model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("pcfykkpy",
            model.infrastructureVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals("fpcfjf", model.workloadVpnConfiguration().networkToNetworkInterconnectId());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.workloadVpnConfiguration().peeringOption());
        Assertions.assertEquals("kgyepe",
            model.workloadVpnConfiguration().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("nnidmdiawpzxk",
            model.workloadVpnConfiguration().optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("dvqgcnbhcbmjkz",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("u",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("zxcouzf",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("ucmqgisnione",
            model.workloadVpnConfiguration().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals(1997837951, model.workloadVpnConfiguration().optionAProperties().mtu());
        Assertions.assertEquals(1957504225, model.workloadVpnConfiguration().optionAProperties().vlanId());
        Assertions.assertEquals(547030463156659693L, model.workloadVpnConfiguration().optionAProperties().peerAsn());
        Assertions.assertEquals(1665599980,
            model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(2049458072,
            model.workloadVpnConfiguration().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("mtrlxczn", model.workloadVpnConfiguration().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("zkbnbmxl", model.workloadVpnConfiguration().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("wtyg", model.workloadVpnConfiguration().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("zusitoqcahfs",
            model.workloadVpnConfiguration().optionAProperties().secondaryIpv6Prefix());
    }
}
