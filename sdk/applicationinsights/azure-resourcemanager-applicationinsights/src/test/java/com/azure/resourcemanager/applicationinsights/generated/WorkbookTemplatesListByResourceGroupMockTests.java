// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplate;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkbookTemplatesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"priority\":883576169,\"author\":\"dakchzyvl\",\"templateData\":\"dataxqnrkcxk\",\"galleries\":[{\"name\":\"nxm\",\"category\":\"uxswqrntvl\",\"type\":\"jpsttexoq\",\"order\":1231024606,\"resourceType\":\"yyufmhruncuw\"}],\"localized\":{\"egy\":[{\"templateData\":\"datacdqzhlctddu\",\"galleries\":[{}]},{\"templateData\":\"datayfp\",\"galleries\":[{},{}]},{\"templateData\":\"databnjj\",\"galleries\":[{},{},{},{}]}],\"ihrraiouaub\":[{\"templateData\":\"databoxjumvq\",\"galleries\":[{},{},{},{}]}]}},\"location\":\"jtlo\",\"tags\":{\"pasccbi\":\"uojrngiflr\",\"fqwmkyoquf\":\"imzdlyj\",\"xotngfdguge\":\"vruzslzojhpctfnm\"},\"id\":\"zihgrkyu\",\"name\":\"zabs\",\"type\":\"mfp\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ApplicationInsightsManager manager = ApplicationInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkbookTemplate> response
            = manager.workbookTemplates().listByResourceGroup("yb", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jtlo", response.iterator().next().location());
        Assertions.assertEquals("uojrngiflr", response.iterator().next().tags().get("pasccbi"));
        Assertions.assertEquals(883576169, response.iterator().next().priority());
        Assertions.assertEquals("dakchzyvl", response.iterator().next().author());
        Assertions.assertEquals("nxm", response.iterator().next().galleries().get(0).name());
        Assertions.assertEquals("uxswqrntvl", response.iterator().next().galleries().get(0).category());
        Assertions.assertEquals("jpsttexoq", response.iterator().next().galleries().get(0).type());
        Assertions.assertEquals(1231024606, response.iterator().next().galleries().get(0).order());
        Assertions.assertEquals("yyufmhruncuw", response.iterator().next().galleries().get(0).resourceType());
    }
}
