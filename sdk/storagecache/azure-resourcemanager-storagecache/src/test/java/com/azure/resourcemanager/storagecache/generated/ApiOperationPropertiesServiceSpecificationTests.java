// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.ApiOperationPropertiesServiceSpecification;
import com.azure.resourcemanager.storagecache.models.LogSpecification;
import com.azure.resourcemanager.storagecache.models.MetricAggregationType;
import com.azure.resourcemanager.storagecache.models.MetricDimension;
import com.azure.resourcemanager.storagecache.models.MetricSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApiOperationPropertiesServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiOperationPropertiesServiceSpecification model = BinaryData.fromString(
            "{\"metricSpecifications\":[{\"name\":\"hsmtxpsiebtfhvp\",\"displayName\":\"apskrdqm\",\"displayDescription\":\"jdhtldwkyzxu\",\"unit\":\"kn\",\"aggregationType\":\"scwsv\",\"supportedAggregationTypes\":[\"None\",\"Minimum\",\"Average\"],\"metricClass\":\"wrupqsxvnmicykvc\",\"dimensions\":[{\"name\":\"ilovnot\",\"displayName\":\"jfcn\",\"internalName\":\"k\",\"toBeExportedForShoebox\":false}]},{\"name\":\"hbttkphyw\",\"displayName\":\"vjtoqnermclfp\",\"displayDescription\":\"hoxus\",\"unit\":\"pabgyeps\",\"aggregationType\":\"tazqugxywpmueefj\",\"supportedAggregationTypes\":[\"Minimum\",\"Maximum\"],\"metricClass\":\"ujidsuyono\",\"dimensions\":[{\"name\":\"ocqxtccmg\",\"displayName\":\"dxyt\",\"internalName\":\"oyrxvwfudwpzntxh\",\"toBeExportedForShoebox\":false},{\"name\":\"rqjbhckfrl\",\"displayName\":\"xsbkyvpyca\",\"internalName\":\"z\",\"toBeExportedForShoebox\":false},{\"name\":\"afkuwb\",\"displayName\":\"nwbmeh\",\"internalName\":\"eyvjusrtslhspkde\",\"toBeExportedForShoebox\":true}]},{\"name\":\"fm\",\"displayName\":\"gkvtmelmqkrhah\",\"displayDescription\":\"juahaquhcdhmdual\",\"unit\":\"xqpvfadmw\",\"aggregationType\":\"crgvxpvgom\",\"supportedAggregationTypes\":[\"NotSpecified\",\"Average\"],\"metricClass\":\"gwb\",\"dimensions\":[{\"name\":\"ldawkzbaliourqha\",\"displayName\":\"uhashsfwx\",\"internalName\":\"owzxcu\",\"toBeExportedForShoebox\":true},{\"name\":\"ooxdjebwpuc\",\"displayName\":\"fvovbvmeuecivy\",\"internalName\":\"ce\",\"toBeExportedForShoebox\":true},{\"name\":\"jrwjueiotwm\",\"displayName\":\"ytdxwit\",\"internalName\":\"rjaw\",\"toBeExportedForShoebox\":false},{\"name\":\"xhniskxfbkpycgk\",\"displayName\":\"ndnhj\",\"internalName\":\"uwhvylwzbtdhxujz\",\"toBeExportedForShoebox\":false}]}],\"logSpecifications\":[{\"name\":\"uwprzql\",\"displayName\":\"ualupjmkh\"}]}")
            .toObject(ApiOperationPropertiesServiceSpecification.class);
        Assertions.assertEquals("hsmtxpsiebtfhvp", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("apskrdqm", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("jdhtldwkyzxu", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("kn", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("scwsv", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(MetricAggregationType.NONE,
            model.metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("wrupqsxvnmicykvc", model.metricSpecifications().get(0).metricClass());
        Assertions.assertEquals("ilovnot", model.metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("jfcn", model.metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals("k", model.metricSpecifications().get(0).dimensions().get(0).internalName());
        Assertions.assertEquals(false,
            model.metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals("uwprzql", model.logSpecifications().get(0).name());
        Assertions.assertEquals("ualupjmkh", model.logSpecifications().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiOperationPropertiesServiceSpecification model = new ApiOperationPropertiesServiceSpecification()
            .withMetricSpecifications(Arrays.asList(
                new MetricSpecification().withName("hsmtxpsiebtfhvp")
                    .withDisplayName("apskrdqm")
                    .withDisplayDescription("jdhtldwkyzxu")
                    .withUnit("kn")
                    .withAggregationType("scwsv")
                    .withSupportedAggregationTypes(Arrays.asList(MetricAggregationType.NONE,
                        MetricAggregationType.MINIMUM, MetricAggregationType.AVERAGE))
                    .withMetricClass("wrupqsxvnmicykvc")
                    .withDimensions(Arrays.asList(new MetricDimension().withName("ilovnot")
                        .withDisplayName("jfcn")
                        .withInternalName("k")
                        .withToBeExportedForShoebox(false))),
                new MetricSpecification().withName("hbttkphyw")
                    .withDisplayName("vjtoqnermclfp")
                    .withDisplayDescription("hoxus")
                    .withUnit("pabgyeps")
                    .withAggregationType("tazqugxywpmueefj")
                    .withSupportedAggregationTypes(
                        Arrays.asList(MetricAggregationType.MINIMUM, MetricAggregationType.MAXIMUM))
                    .withMetricClass("ujidsuyono")
                    .withDimensions(Arrays.asList(
                        new MetricDimension().withName("ocqxtccmg")
                            .withDisplayName("dxyt")
                            .withInternalName("oyrxvwfudwpzntxh")
                            .withToBeExportedForShoebox(false),
                        new MetricDimension().withName("rqjbhckfrl")
                            .withDisplayName("xsbkyvpyca")
                            .withInternalName("z")
                            .withToBeExportedForShoebox(false),
                        new MetricDimension().withName("afkuwb")
                            .withDisplayName("nwbmeh")
                            .withInternalName("eyvjusrtslhspkde")
                            .withToBeExportedForShoebox(true))),
                new MetricSpecification().withName("fm")
                    .withDisplayName("gkvtmelmqkrhah")
                    .withDisplayDescription("juahaquhcdhmdual")
                    .withUnit("xqpvfadmw")
                    .withAggregationType("crgvxpvgom")
                    .withSupportedAggregationTypes(
                        Arrays.asList(MetricAggregationType.NOT_SPECIFIED, MetricAggregationType.AVERAGE))
                    .withMetricClass("gwb")
                    .withDimensions(Arrays.asList(
                        new MetricDimension().withName("ldawkzbaliourqha")
                            .withDisplayName("uhashsfwx")
                            .withInternalName("owzxcu")
                            .withToBeExportedForShoebox(true),
                        new MetricDimension().withName("ooxdjebwpuc")
                            .withDisplayName("fvovbvmeuecivy")
                            .withInternalName("ce")
                            .withToBeExportedForShoebox(true),
                        new MetricDimension().withName("jrwjueiotwm")
                            .withDisplayName("ytdxwit")
                            .withInternalName("rjaw")
                            .withToBeExportedForShoebox(false),
                        new MetricDimension().withName("xhniskxfbkpycgk")
                            .withDisplayName("ndnhj")
                            .withInternalName("uwhvylwzbtdhxujz")
                            .withToBeExportedForShoebox(false)))))
            .withLogSpecifications(
                Arrays.asList(new LogSpecification().withName("uwprzql").withDisplayName("ualupjmkh")));
        model = BinaryData.fromObject(model).toObject(ApiOperationPropertiesServiceSpecification.class);
        Assertions.assertEquals("hsmtxpsiebtfhvp", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("apskrdqm", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("jdhtldwkyzxu", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("kn", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("scwsv", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(MetricAggregationType.NONE,
            model.metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("wrupqsxvnmicykvc", model.metricSpecifications().get(0).metricClass());
        Assertions.assertEquals("ilovnot", model.metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("jfcn", model.metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals("k", model.metricSpecifications().get(0).dimensions().get(0).internalName());
        Assertions.assertEquals(false,
            model.metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals("uwprzql", model.logSpecifications().get(0).name());
        Assertions.assertEquals("ualupjmkh", model.logSpecifications().get(0).displayName());
    }
}
