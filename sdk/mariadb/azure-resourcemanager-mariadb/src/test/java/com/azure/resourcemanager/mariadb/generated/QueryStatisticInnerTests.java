// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.QueryStatisticInner;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QueryStatisticInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryStatisticInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"queryId\":\"bh\",\"startTime\":\"2021-04-21T20:03:01Z\",\"endTime\":\"2021-10-27T21:49:11Z\",\"aggregationFunction\":\"kx\",\"databaseNames\":[\"k\",\"bhenbtkcxywnyt\",\"rsyn\",\"qidybyx\"],\"queryExecutionCount\":9112730252784738487,\"metricName\":\"haaxdbabphl\",\"metricDisplayName\":\"qlfktsths\",\"metricValue\":97.37790907791091,\"metricValueUnit\":\"nyyazttbtwwrqpue\"},\"id\":\"ckzywbiexzfeyue\",\"name\":\"xibxujwbhqwalm\",\"type\":\"zyoxaepdkzjan\"}")
                .toObject(QueryStatisticInner.class);
        Assertions.assertEquals("bh", model.queryId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-21T20:03:01Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-27T21:49:11Z"), model.endTime());
        Assertions.assertEquals("kx", model.aggregationFunction());
        Assertions.assertEquals("k", model.databaseNames().get(0));
        Assertions.assertEquals(9112730252784738487L, model.queryExecutionCount());
        Assertions.assertEquals("haaxdbabphl", model.metricName());
        Assertions.assertEquals("qlfktsths", model.metricDisplayName());
        Assertions.assertEquals(97.37790907791091D, model.metricValue());
        Assertions.assertEquals("nyyazttbtwwrqpue", model.metricValueUnit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryStatisticInner model =
            new QueryStatisticInner()
                .withQueryId("bh")
                .withStartTime(OffsetDateTime.parse("2021-04-21T20:03:01Z"))
                .withEndTime(OffsetDateTime.parse("2021-10-27T21:49:11Z"))
                .withAggregationFunction("kx")
                .withDatabaseNames(Arrays.asList("k", "bhenbtkcxywnyt", "rsyn", "qidybyx"))
                .withQueryExecutionCount(9112730252784738487L)
                .withMetricName("haaxdbabphl")
                .withMetricDisplayName("qlfktsths")
                .withMetricValue(97.37790907791091D)
                .withMetricValueUnit("nyyazttbtwwrqpue");
        model = BinaryData.fromObject(model).toObject(QueryStatisticInner.class);
        Assertions.assertEquals("bh", model.queryId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-21T20:03:01Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-27T21:49:11Z"), model.endTime());
        Assertions.assertEquals("kx", model.aggregationFunction());
        Assertions.assertEquals("k", model.databaseNames().get(0));
        Assertions.assertEquals(9112730252784738487L, model.queryExecutionCount());
        Assertions.assertEquals("haaxdbabphl", model.metricName());
        Assertions.assertEquals("qlfktsths", model.metricDisplayName());
        Assertions.assertEquals(97.37790907791091D, model.metricValue());
        Assertions.assertEquals("nyyazttbtwwrqpue", model.metricValueUnit());
    }
}
