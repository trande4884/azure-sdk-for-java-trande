// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelInner;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelListInner;
import com.azure.resourcemanager.security.models.IoTSecurityAlertedDevice;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceAlert;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceRecommendation;
import java.util.Arrays;

public final class IoTSecuritySolutionAnalyticsModelListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionAnalyticsModelListInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metrics\":{\"high\":2218388246099346962,\"medium\":5112966990971322380,\"low\":8774476596508707591},\"unhealthyDeviceCount\":3661064636862986309,\"devicesMetrics\":[{\"date\":\"2021-07-22T08:18:11Z\",\"devicesMetrics\":{}},{\"date\":\"2021-10-06T09:12:42Z\",\"devicesMetrics\":{}}],\"topAlertedDevices\":[{\"deviceId\":\"jnspydp\",\"alertsCount\":6790725601421268512},{\"deviceId\":\"kouknvudwtiu\",\"alertsCount\":197428282694257583},{\"deviceId\":\"gkpocipazyxoe\",\"alertsCount\":3704814944116897589}],\"mostPrevalentDeviceAlerts\":[{\"alertDisplayName\":\"iucgygevqzn\",\"reportedSeverity\":\"Informational\",\"alertsCount\":6591773504682672223},{\"alertDisplayName\":\"izcdrqjsd\",\"reportedSeverity\":\"High\",\"alertsCount\":5766056983460655346},{\"alertDisplayName\":\"xdeoejzic\",\"reportedSeverity\":\"Informational\",\"alertsCount\":6694189583402716643},{\"alertDisplayName\":\"gzfbishcbk\",\"reportedSeverity\":\"Medium\",\"alertsCount\":5121289277423210616}],\"mostPrevalentDeviceRecommendations\":[{\"recommendationDisplayName\":\"dphagalpbuxwgip\",\"reportedSeverity\":\"Low\",\"devicesCount\":1678466052810360813}]},\"id\":\"kgshwa\",\"name\":\"kix\",\"type\":\"bin\"},{\"properties\":{\"metrics\":{\"high\":3847794462075612695,\"medium\":4034395875426050930,\"low\":4290539980849845271},\"unhealthyDeviceCount\":4868014576917618697,\"devicesMetrics\":[{\"date\":\"2021-02-14T21:37:04Z\",\"devicesMetrics\":{}},{\"date\":\"2021-11-21T21:02:37Z\",\"devicesMetrics\":{}},{\"date\":\"2021-03-23T19:50:56Z\",\"devicesMetrics\":{}}],\"topAlertedDevices\":[{\"deviceId\":\"lwh\",\"alertsCount\":5878187875852963260}],\"mostPrevalentDeviceAlerts\":[{\"alertDisplayName\":\"oqqnwvlryav\",\"reportedSeverity\":\"Informational\",\"alertsCount\":4772874387505873752},{\"alertDisplayName\":\"mqhgyxzkonocuk\",\"reportedSeverity\":\"Low\",\"alertsCount\":8621613228572794905},{\"alertDisplayName\":\"conuqszfkbeype\",\"reportedSeverity\":\"Medium\",\"alertsCount\":7599893872867185704},{\"alertDisplayName\":\"vjektcxsenh\",\"reportedSeverity\":\"High\",\"alertsCount\":8716446086725067251}],\"mostPrevalentDeviceRecommendations\":[{\"recommendationDisplayName\":\"wvlqdqgb\",\"reportedSeverity\":\"Medium\",\"devicesCount\":3771640037814416953}]},\"id\":\"kaet\",\"name\":\"kt\",\"type\":\"fcivfsnkym\"}],\"nextLink\":\"tqhjfbebrjcx\"}")
            .toObject(IoTSecuritySolutionAnalyticsModelListInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionAnalyticsModelListInner model
            = new IoTSecuritySolutionAnalyticsModelListInner().withValue(Arrays.asList(
                new IoTSecuritySolutionAnalyticsModelInner()
                    .withTopAlertedDevices(Arrays.asList(new IoTSecurityAlertedDevice(), new IoTSecurityAlertedDevice(),
                        new IoTSecurityAlertedDevice()))
                    .withMostPrevalentDeviceAlerts(Arrays.asList(new IoTSecurityDeviceAlert(),
                        new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert()))
                    .withMostPrevalentDeviceRecommendations(Arrays.asList(new IoTSecurityDeviceRecommendation())),
                new IoTSecuritySolutionAnalyticsModelInner()
                    .withTopAlertedDevices(Arrays.asList(new IoTSecurityAlertedDevice()))
                    .withMostPrevalentDeviceAlerts(Arrays.asList(new IoTSecurityDeviceAlert(),
                        new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert()))
                    .withMostPrevalentDeviceRecommendations(Arrays.asList(new IoTSecurityDeviceRecommendation()))));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionAnalyticsModelListInner.class);
    }
}
