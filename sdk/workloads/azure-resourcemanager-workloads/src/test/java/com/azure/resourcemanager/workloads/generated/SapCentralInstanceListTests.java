// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.fluent.models.SapCentralServerInstanceInner;
import com.azure.resourcemanager.workloads.models.SapCentralInstanceList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapCentralInstanceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapCentralInstanceList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"instanceNo\":\"iywgqywgndrvynh\",\"subnet\":\"pphrcgynco\",\"kernelVersion\":\"m\",\"kernelPatch\":\"oo\",\"vmDetails\":[],\"status\":\"Stopping\",\"health\":\"Unknown\",\"provisioningState\":\"Deleting\"},\"location\":\"jqabcypmivkwlzuv\",\"tags\":{\"onlebxetqgtzxdpn\":\"wnfnbacf\",\"eallnwsubisnj\":\"bqqwxrj\"},\"id\":\"mpmngnzscxaqwoo\",\"name\":\"hcbonqvpkvlr\",\"type\":\"njeaseipheofloke\"},{\"properties\":{\"instanceNo\":\"enjbdlwtgrhp\",\"subnet\":\"pj\",\"kernelVersion\":\"zj\",\"kernelPatch\":\"yegu\",\"vmDetails\":[],\"status\":\"Offline\",\"health\":\"Healthy\",\"provisioningState\":\"Deleting\"},\"location\":\"zvdudgwdslfhotwm\",\"tags\":{\"cftadeh\":\"pwlbjnpg\",\"dejbavo\":\"nltyfsoppusuesnz\",\"vudwx\":\"xzdmohctb\"},\"id\":\"ndnvo\",\"name\":\"gujjugwdkcglh\",\"type\":\"lazjdyggdtjixhbk\"},{\"properties\":{\"instanceNo\":\"qweykhmenev\",\"subnet\":\"exfwhy\",\"kernelVersion\":\"vdcsitynn\",\"kernelPatch\":\"mdectehfiqscjey\",\"vmDetails\":[],\"status\":\"Offline\",\"health\":\"Unhealthy\",\"provisioningState\":\"Failed\"},\"location\":\"jrefovgmkqsle\",\"tags\":{\"k\":\"xyqj\",\"jh\":\"attpngjcrcczsq\",\"ysou\":\"mdajv\",\"canoaeupf\":\"q\"},\"id\":\"yhltrpmopjmcm\",\"name\":\"tuo\",\"type\":\"thfuiuaodsfcpkvx\"},{\"properties\":{\"instanceNo\":\"uozmyzydagfua\",\"subnet\":\"ezyiuokktwhrdxw\",\"kernelVersion\":\"bsureximo\",\"kernelPatch\":\"ocfs\",\"vmDetails\":[],\"status\":\"Running\",\"health\":\"Degraded\",\"provisioningState\":\"Creating\"},\"location\":\"i\",\"tags\":{\"vyifqrvkdvjsl\":\"hqyudxorrqnbpoc\",\"vdfwatkpn\":\"rm\",\"wiqzbqjvsovmyo\":\"ulexxbczwtr\",\"zdobpxjmflbvvnch\":\"acspkwl\"},\"id\":\"kcciwwzjuqkhr\",\"name\":\"ajiwkuo\",\"type\":\"oskg\"}],\"nextLink\":\"auu\"}")
            .toObject(SapCentralInstanceList.class);
        Assertions.assertEquals("jqabcypmivkwlzuv", model.value().get(0).location());
        Assertions.assertEquals("wnfnbacf", model.value().get(0).tags().get("onlebxetqgtzxdpn"));
        Assertions.assertEquals("auu", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCentralInstanceList model = new SapCentralInstanceList().withValue(Arrays.asList(
            new SapCentralServerInstanceInner().withLocation("jqabcypmivkwlzuv")
                .withTags(mapOf("onlebxetqgtzxdpn", "wnfnbacf", "eallnwsubisnj", "bqqwxrj")),
            new SapCentralServerInstanceInner().withLocation("zvdudgwdslfhotwm")
                .withTags(mapOf("cftadeh", "pwlbjnpg", "dejbavo", "nltyfsoppusuesnz", "vudwx", "xzdmohctb")),
            new SapCentralServerInstanceInner().withLocation("jrefovgmkqsle")
                .withTags(mapOf("k", "xyqj", "jh", "attpngjcrcczsq", "ysou", "mdajv", "canoaeupf", "q")),
            new SapCentralServerInstanceInner().withLocation("i")
                .withTags(mapOf("vyifqrvkdvjsl", "hqyudxorrqnbpoc", "vdfwatkpn", "rm", "wiqzbqjvsovmyo", "ulexxbczwtr",
                    "zdobpxjmflbvvnch", "acspkwl"))))
            .withNextLink("auu");
        model = BinaryData.fromObject(model).toObject(SapCentralInstanceList.class);
        Assertions.assertEquals("jqabcypmivkwlzuv", model.value().get(0).location());
        Assertions.assertEquals("wnfnbacf", model.value().get(0).tags().get("onlebxetqgtzxdpn"));
        Assertions.assertEquals("auu", model.nextLink());
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
