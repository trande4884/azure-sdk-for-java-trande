// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.securityinsights.SecurityInsightsManager;
import com.azure.resourcemanager.securityinsights.models.Incident;
import com.azure.resourcemanager.securityinsights.models.IncidentClassification;
import com.azure.resourcemanager.securityinsights.models.IncidentClassificationReason;
import com.azure.resourcemanager.securityinsights.models.IncidentSeverity;
import com.azure.resourcemanager.securityinsights.models.IncidentStatus;
import com.azure.resourcemanager.securityinsights.models.OwnerType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IncidentsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"additionalData\":{\"alertsCount\":593185294,\"bookmarksCount\":225410271,\"commentsCount\":1614789605,\"alertProductNames\":[\"kdnnyufxuzms\",\"zyq\",\"brnxhjtlxfikj\",\"xaravwwuasnjeglh\"],\"providerIncidentUrl\":\"xbozpcjcnwjz\",\"tactics\":[\"Reconnaissance\"],\"techniques\":[\"nw\"]},\"classification\":\"TruePositive\",\"classificationComment\":\"oq\",\"classificationReason\":\"SuspiciousActivity\",\"createdTimeUtc\":\"2021-09-24T19:24:08Z\",\"description\":\"dsorgfhjxsawo\",\"firstActivityTimeUtc\":\"2021-07-25T08:24:52Z\",\"incidentUrl\":\"fh\",\"incidentNumber\":2033631275,\"labels\":[{\"labelName\":\"wzrdqyoybm\",\"labelType\":\"User\"},{\"labelName\":\"to\",\"labelType\":\"User\"},{\"labelName\":\"zdaiovrb\",\"labelType\":\"User\"}],\"providerName\":\"phkvyyz\",\"providerIncidentId\":\"crxylaypdt\",\"lastActivityTimeUtc\":\"2021-02-03T11:45:23Z\",\"lastModifiedTimeUtc\":\"2021-04-01T17:14:06Z\",\"owner\":{\"email\":\"ohuriwhjdfrwp\",\"assignedTo\":\"h\",\"objectId\":\"44330aad-162c-4c74-a964-cf0277f42ff4\",\"userPrincipalName\":\"kcclpctuo\",\"ownerType\":\"Unknown\"},\"relatedAnalyticRuleIds\":[\"jfsgmospoebnxs\",\"cowscuyfqlam\"],\"severity\":\"Low\",\"status\":\"Active\",\"teamInformation\":{\"teamId\":\"u\",\"primaryChannelUrl\":\"afuzpnxqpwnik\",\"teamCreationTimeUtc\":\"2021-03-11T10:42:02Z\",\"name\":\"jgrbrctsvgooc\",\"description\":\"azmzlpcx\"},\"title\":\"tm\"},\"etag\":\"xrq\",\"id\":\"fzfvwj\",\"name\":\"thkvpyey\",\"type\":\"afinmp\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityInsightsManager manager = SecurityInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Incident> response = manager.incidents()
            .list("nirupkqnst", "aqpibjg", "vswmehfxrtt", "bmsennqfabqcama", 954316010, "ctcxs",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xrq", response.iterator().next().etag());
        Assertions.assertEquals(IncidentClassification.TRUE_POSITIVE, response.iterator().next().classification());
        Assertions.assertEquals("oq", response.iterator().next().classificationComment());
        Assertions.assertEquals(IncidentClassificationReason.SUSPICIOUS_ACTIVITY,
            response.iterator().next().classificationReason());
        Assertions.assertEquals("dsorgfhjxsawo", response.iterator().next().description());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-25T08:24:52Z"),
            response.iterator().next().firstActivityTimeUtc());
        Assertions.assertEquals("wzrdqyoybm", response.iterator().next().labels().get(0).labelName());
        Assertions.assertEquals("phkvyyz", response.iterator().next().providerName());
        Assertions.assertEquals("crxylaypdt", response.iterator().next().providerIncidentId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-03T11:45:23Z"),
            response.iterator().next().lastActivityTimeUtc());
        Assertions.assertEquals("ohuriwhjdfrwp", response.iterator().next().owner().email());
        Assertions.assertEquals("h", response.iterator().next().owner().assignedTo());
        Assertions.assertEquals(UUID.fromString("44330aad-162c-4c74-a964-cf0277f42ff4"),
            response.iterator().next().owner().objectId());
        Assertions.assertEquals("kcclpctuo", response.iterator().next().owner().userPrincipalName());
        Assertions.assertEquals(OwnerType.UNKNOWN, response.iterator().next().owner().ownerType());
        Assertions.assertEquals(IncidentSeverity.LOW, response.iterator().next().severity());
        Assertions.assertEquals(IncidentStatus.ACTIVE, response.iterator().next().status());
        Assertions.assertEquals("tm", response.iterator().next().title());
    }
}
