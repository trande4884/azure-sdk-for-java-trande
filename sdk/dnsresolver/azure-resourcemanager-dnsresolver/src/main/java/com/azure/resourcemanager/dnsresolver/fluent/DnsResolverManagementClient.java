// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for DnsResolverManagementClient class.
 */
public interface DnsResolverManagementClient {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the DnsResolversClient object to access its operations.
     * 
     * @return the DnsResolversClient object.
     */
    DnsResolversClient getDnsResolvers();

    /**
     * Gets the InboundEndpointsClient object to access its operations.
     * 
     * @return the InboundEndpointsClient object.
     */
    InboundEndpointsClient getInboundEndpoints();

    /**
     * Gets the OutboundEndpointsClient object to access its operations.
     * 
     * @return the OutboundEndpointsClient object.
     */
    OutboundEndpointsClient getOutboundEndpoints();

    /**
     * Gets the DnsForwardingRulesetsClient object to access its operations.
     * 
     * @return the DnsForwardingRulesetsClient object.
     */
    DnsForwardingRulesetsClient getDnsForwardingRulesets();

    /**
     * Gets the ForwardingRulesClient object to access its operations.
     * 
     * @return the ForwardingRulesClient object.
     */
    ForwardingRulesClient getForwardingRules();

    /**
     * Gets the VirtualNetworkLinksClient object to access its operations.
     * 
     * @return the VirtualNetworkLinksClient object.
     */
    VirtualNetworkLinksClient getVirtualNetworkLinks();

    /**
     * Gets the DnsResolverPoliciesClient object to access its operations.
     * 
     * @return the DnsResolverPoliciesClient object.
     */
    DnsResolverPoliciesClient getDnsResolverPolicies();

    /**
     * Gets the DnsSecurityRulesClient object to access its operations.
     * 
     * @return the DnsSecurityRulesClient object.
     */
    DnsSecurityRulesClient getDnsSecurityRules();

    /**
     * Gets the DnsResolverPolicyVirtualNetworkLinksClient object to access its operations.
     * 
     * @return the DnsResolverPolicyVirtualNetworkLinksClient object.
     */
    DnsResolverPolicyVirtualNetworkLinksClient getDnsResolverPolicyVirtualNetworkLinks();

    /**
     * Gets the DnsResolverDomainListsClient object to access its operations.
     * 
     * @return the DnsResolverDomainListsClient object.
     */
    DnsResolverDomainListsClient getDnsResolverDomainLists();
}
