// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecurityConnectorInner;
import com.azure.resourcemanager.security.models.CloudName;
import com.azure.resourcemanager.security.models.CloudOffering;
import com.azure.resourcemanager.security.models.EnvironmentData;
import com.azure.resourcemanager.security.models.SecurityConnectorsList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SecurityConnectorsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityConnectorsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"hierarchyIdentifier\":\"ccxjm\",\"hierarchyIdentifierTrialEndDate\":\"2021-06-04T20:01:35Z\",\"environmentName\":\"Github\",\"offerings\":[{\"offeringType\":\"CloudOffering\",\"description\":\"cypuuwwlt\"}],\"environmentData\":{\"environmentType\":\"EnvironmentData\"}},\"location\":\"qjctzenkeif\",\"tags\":{\"lyhb\":\"mkdasv\",\"chxgs\":\"cu\",\"vizbfhfo\":\"boldforobwj\"},\"id\":\"vacqpbtuodxesz\",\"name\":\"bbelawumuaslzk\",\"type\":\"rrwoycqucwyhahn\"},{\"properties\":{\"hierarchyIdentifier\":\"kywuhpsvfuu\",\"hierarchyIdentifierTrialEndDate\":\"2021-01-22T12:10:56Z\",\"environmentName\":\"AWS\",\"offerings\":[{\"offeringType\":\"CloudOffering\",\"description\":\"wlalniexzsrzp\"},{\"offeringType\":\"CloudOffering\",\"description\":\"pqtybb\"}],\"environmentData\":{\"environmentType\":\"EnvironmentData\"}},\"location\":\"pgdakchzyvli\",\"tags\":{\"bn\":\"rkcxkj\",\"swqrntvlwijp\":\"mysu\"},\"id\":\"ttexoqqpwcyyufmh\",\"name\":\"uncuw\",\"type\":\"qspkcdqzhlctd\"},{\"properties\":{\"hierarchyIdentifier\":\"ndy\",\"hierarchyIdentifierTrialEndDate\":\"2021-08-29T15:16:01Z\",\"environmentName\":\"AWS\",\"offerings\":[{\"offeringType\":\"CloudOffering\",\"description\":\"jjrcgegydc\"}],\"environmentData\":{\"environmentType\":\"EnvironmentData\"}},\"location\":\"oxjumvqqo\",\"tags\":{\"aiouaubrjt\":\"r\",\"fuojrngif\":\"oq\",\"dfqwmkyoq\":\"rzpasccbiuimzdly\"},\"id\":\"fdvruz\",\"name\":\"lzo\",\"type\":\"hpc\"}],\"nextLink\":\"nmdxotngfd\"}")
            .toObject(SecurityConnectorsList.class);
        Assertions.assertEquals("qjctzenkeif", model.value().get(0).location());
        Assertions.assertEquals("mkdasv", model.value().get(0).tags().get("lyhb"));
        Assertions.assertEquals("ccxjm", model.value().get(0).hierarchyIdentifier());
        Assertions.assertEquals(CloudName.GITHUB, model.value().get(0).environmentName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityConnectorsList model = new SecurityConnectorsList().withValue(Arrays.asList(
            new SecurityConnectorInner().withLocation("qjctzenkeif")
                .withTags(mapOf("lyhb", "mkdasv", "chxgs", "cu", "vizbfhfo", "boldforobwj"))
                .withHierarchyIdentifier("ccxjm")
                .withEnvironmentName(CloudName.GITHUB)
                .withOfferings(Arrays.asList(new CloudOffering()))
                .withEnvironmentData(new EnvironmentData()),
            new SecurityConnectorInner().withLocation("pgdakchzyvli")
                .withTags(mapOf("bn", "rkcxkj", "swqrntvlwijp", "mysu"))
                .withHierarchyIdentifier("kywuhpsvfuu")
                .withEnvironmentName(CloudName.AWS)
                .withOfferings(Arrays.asList(new CloudOffering(), new CloudOffering()))
                .withEnvironmentData(new EnvironmentData()),
            new SecurityConnectorInner().withLocation("oxjumvqqo")
                .withTags(mapOf("aiouaubrjt", "r", "fuojrngif", "oq", "dfqwmkyoq", "rzpasccbiuimzdly"))
                .withHierarchyIdentifier("ndy")
                .withEnvironmentName(CloudName.AWS)
                .withOfferings(Arrays.asList(new CloudOffering()))
                .withEnvironmentData(new EnvironmentData())));
        model = BinaryData.fromObject(model).toObject(SecurityConnectorsList.class);
        Assertions.assertEquals("qjctzenkeif", model.value().get(0).location());
        Assertions.assertEquals("mkdasv", model.value().get(0).tags().get("lyhb"));
        Assertions.assertEquals("ccxjm", model.value().get(0).hierarchyIdentifier());
        Assertions.assertEquals(CloudName.GITHUB, model.value().get(0).environmentName());
    }

    // Use "Map.of" if available
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
