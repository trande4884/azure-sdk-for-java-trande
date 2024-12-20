// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager;
import com.azure.resourcemanager.streamanalytics.models.CompatibilityLevel;
import com.azure.resourcemanager.streamanalytics.models.CompileQuery;
import com.azure.resourcemanager.streamanalytics.models.FunctionInput;
import com.azure.resourcemanager.streamanalytics.models.FunctionOutput;
import com.azure.resourcemanager.streamanalytics.models.JobType;
import com.azure.resourcemanager.streamanalytics.models.QueryCompilationResult;
import com.azure.resourcemanager.streamanalytics.models.QueryFunction;
import com.azure.resourcemanager.streamanalytics.models.QueryInput;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SubscriptionsCompileQueryWithResponseMockTests {
    @Test
    public void testCompileQueryWithResponse() throws Exception {
        String responseStr
            = "{\"errors\":[{\"message\":\"aecxndtic\",\"startLine\":687349800,\"startColumn\":684499938,\"endLine\":531219676,\"endColumn\":53911189,\"isGlobal\":false}],\"warnings\":[\"x\",\"bf\",\"rclnpkc\"],\"inputs\":[\"zriykhy\",\"wf\"],\"outputs\":[\"b\",\"xqvkjlmxhomdyn\",\"dwdigumb\"],\"functions\":[\"auzzptjazysd\",\"hezwwvaiq\",\"uvvfonkp\",\"hqyikvy\"]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        StreamAnalyticsManager manager = StreamAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        QueryCompilationResult response
            = manager.subscriptions()
                .compileQueryWithResponse("lchpodbzevwrdn",
                    new CompileQuery().withQuery("fukuvsjcswsmystu")
                        .withInputs(Arrays.asList(new QueryInput().withName("ypfcvlerchpqbmf").withType("jbabwidf"),
                            new QueryInput().withName("xsspuunnoxyhk").withType("g")))
                        .withFunctions(Arrays.asList(
                            new QueryFunction().withName("rihpfhoq")
                                .withType("aaewdaomdjv")
                                .withBindingType("pjxxkzb")
                                .withInputs(Arrays.asList(
                                    new FunctionInput().withDataType("geivsiykzkdncj")
                                        .withIsConfigurationParameter(true),
                                    new FunctionInput().withDataType("bzo").withIsConfigurationParameter(true),
                                    new FunctionInput().withDataType("lapzwyrp").withIsConfigurationParameter(false)))
                                .withOutput(new FunctionOutput().withDataType("qxepnylbfuaj")),
                            new QueryFunction().withName("yjt")
                                .withType("vofqzhvfc")
                                .withBindingType("byfmowuxr")
                                .withInputs(Arrays.asList(
                                    new FunctionInput().withDataType("vdwxfzwi").withIsConfigurationParameter(false)))
                                .withOutput(new FunctionOutput().withDataType("jbhyzsxjrkambtr")),
                            new QueryFunction().withName("egv")
                                .withType("nvuqeqvldspa")
                                .withBindingType("tjb")
                                .withInputs(Arrays.asList(
                                    new FunctionInput().withDataType("mflvest").withIsConfigurationParameter(false),
                                    new FunctionInput().withDataType("rriloz").withIsConfigurationParameter(true),
                                    new FunctionInput().withDataType("wchpxlk").withIsConfigurationParameter(true),
                                    new FunctionInput().withDataType("ziycslevufuztck")
                                        .withIsConfigurationParameter(false)))
                                .withOutput(new FunctionOutput().withDataType("tqedcgzulwm")),
                            new QueryFunction().withName("rqzz")
                                .withType("rjvpglydzgkrvqee")
                                .withBindingType("toepryu")
                                .withInputs(Arrays.asList(
                                    new FunctionInput().withDataType("ytp").withIsConfigurationParameter(false)))
                                .withOutput(new FunctionOutput().withDataType("vzvfvaawzqadfl"))))
                        .withJobType(JobType.CLOUD)
                        .withCompatibilityLevel(CompatibilityLevel.ONE_ZERO),
                    com.azure.core.util.Context.NONE)
                .getValue();

    }
}
