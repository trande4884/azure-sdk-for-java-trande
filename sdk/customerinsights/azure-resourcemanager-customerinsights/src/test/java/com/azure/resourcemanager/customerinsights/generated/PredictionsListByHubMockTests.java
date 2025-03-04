// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.customerinsights.CustomerInsightsManager;
import com.azure.resourcemanager.customerinsights.models.PredictionResourceFormat;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PredictionsListByHubMockTests {
    @Test
    public void testListByHub() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"description\":{\"motahbqsvnk\":\"mwwpnt\",\"gc\":\"mytzuaedrlh\",\"zmiemqyftgp\":\"myrhkvx\"},\"displayName\":{\"ghpakbqyhlsorn\":\"wgfqvj\"},\"involvedInteractionTypes\":[\"eq\",\"gkncjm\",\"bnyevztnjawrhule\"],\"involvedKpiTypes\":[\"mbwppxirxbkitzmn\",\"itaxju\"],\"involvedRelationships\":[\"j\",\"xsgcemegd\",\"dvyljubvfjy\",\"ufl\"],\"negativeOutcomeExpression\":\"ifnivlut\",\"positiveOutcomeExpression\":\"g\",\"primaryProfileType\":\"aacxauhvc\",\"provisioningState\":\"Failed\",\"predictionName\":\"klsqxt\",\"scopeExpression\":\"iyygktsrjyxxoxwf\",\"tenantId\":\"kvecnxfx\",\"autoAnalyze\":true,\"mappings\":{\"score\":\"sowbeb\",\"grade\":\"nbwutlvuwmsu\",\"reason\":\"ustihtgrafjajvky\"},\"scoreLabel\":\"mmjczvog\",\"grades\":[{\"gradeName\":\"j\",\"minScoreThreshold\":1626752894,\"maxScoreThreshold\":1828224372},{\"gradeName\":\"aeuwqdwxhhlbmyph\",\"minScoreThreshold\":315137806,\"maxScoreThreshold\":363730494}],\"systemGeneratedEntities\":{\"generatedInteractionTypes\":[\"wokyqsf\",\"xfsyw\",\"ihqbtod\"],\"generatedLinks\":[\"xbvkvwzdmvdd\",\"wcrugyozzz\",\"wnjdvvlrh\"],\"generatedKpis\":{\"dqzbvbpsuvqhx\":\"kkvxu\",\"dkwbkurklpiig\":\"ozf\",\"clzjwaqdz\":\"uzkeutuip\"}}},\"id\":\"ydewuwxyll\",\"name\":\"zzevtzqwczochwb\",\"type\":\"k\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CustomerInsightsManager manager = CustomerInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PredictionResourceFormat> response
            = manager.predictions().listByHub("krfnkcni", "kswxmfu", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mwwpnt", response.iterator().next().description().get("motahbqsvnk"));
        Assertions.assertEquals("wgfqvj", response.iterator().next().displayName().get("ghpakbqyhlsorn"));
        Assertions.assertEquals("eq", response.iterator().next().involvedInteractionTypes().get(0));
        Assertions.assertEquals("mbwppxirxbkitzmn", response.iterator().next().involvedKpiTypes().get(0));
        Assertions.assertEquals("j", response.iterator().next().involvedRelationships().get(0));
        Assertions.assertEquals("ifnivlut", response.iterator().next().negativeOutcomeExpression());
        Assertions.assertEquals("g", response.iterator().next().positiveOutcomeExpression());
        Assertions.assertEquals("aacxauhvc", response.iterator().next().primaryProfileType());
        Assertions.assertEquals("klsqxt", response.iterator().next().predictionName());
        Assertions.assertEquals("iyygktsrjyxxoxwf", response.iterator().next().scopeExpression());
        Assertions.assertEquals(true, response.iterator().next().autoAnalyze());
        Assertions.assertEquals("sowbeb", response.iterator().next().mappings().score());
        Assertions.assertEquals("nbwutlvuwmsu", response.iterator().next().mappings().grade());
        Assertions.assertEquals("ustihtgrafjajvky", response.iterator().next().mappings().reason());
        Assertions.assertEquals("mmjczvog", response.iterator().next().scoreLabel());
        Assertions.assertEquals("j", response.iterator().next().grades().get(0).gradeName());
        Assertions.assertEquals(1626752894, response.iterator().next().grades().get(0).minScoreThreshold());
        Assertions.assertEquals(1828224372, response.iterator().next().grades().get(0).maxScoreThreshold());
    }
}
