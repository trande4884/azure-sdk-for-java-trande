// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.data.cosmos.core;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.spring.data.cosmos.CosmosFactory;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.core.convert.MappingCosmosConverter;
import org.springframework.data.auditing.IsNewAwareAuditingHandler;

/**
 * Template class for cosmos db
 */
public class MultiTenantDbCosmosTemplate extends CosmosTemplate {

    private static final ThreadLocal<String> databaseName = new ThreadLocal<>();

    /**
     * Initialization
     *
     * @param client must not be {@literal null}
     * @param databaseName must not be {@literal null}
     * @param cosmosConfig must not be {@literal null}
     * @param mappingCosmosConverter must not be {@literal null}
     * @param cosmosAuditingHandler can be {@literal null}
     */
    public MultiTenantDbCosmosTemplate(CosmosAsyncClient client, String databaseName,
                                       CosmosConfig cosmosConfig, MappingCosmosConverter mappingCosmosConverter,
                                       IsNewAwareAuditingHandler cosmosAuditingHandler) {
        super(new CosmosFactory(client, databaseName), cosmosConfig, mappingCosmosConverter, cosmosAuditingHandler);
    }

    /**
     * Initialization
     *
     * @param client must not be {@literal null}
     * @param databaseName must not be {@literal null}
     * @param cosmosConfig must not be {@literal null}
     * @param mappingCosmosConverter must not be {@literal null}
     */
    public MultiTenantDbCosmosTemplate(CosmosAsyncClient client, String databaseName,
                                       CosmosConfig cosmosConfig, MappingCosmosConverter mappingCosmosConverter) {
        super(new CosmosFactory(client, databaseName), cosmosConfig, mappingCosmosConverter, null);
    }

    /**
     * Initialization
     *
     * @param cosmosFactory must not be {@literal null}
     * @param cosmosConfig must not be {@literal null}
     * @param mappingCosmosConverter must not be {@literal null}
     * @param cosmosAuditingHandler can be {@literal null}
     */
    public MultiTenantDbCosmosTemplate(CosmosFactory cosmosFactory,
                                       CosmosConfig cosmosConfig,
                                       MappingCosmosConverter mappingCosmosConverter,
                                       IsNewAwareAuditingHandler cosmosAuditingHandler) {
        super(cosmosFactory, cosmosConfig, mappingCosmosConverter, cosmosAuditingHandler);
    }

    /**
     * Initialization
     *
     * @param cosmosFactory must not be {@literal null}
     * @param cosmosConfig must not be {@literal null}
     * @param mappingCosmosConverter must not be {@literal null}
     */
    public MultiTenantDbCosmosTemplate(CosmosFactory cosmosFactory,
                                       CosmosConfig cosmosConfig,
                                       MappingCosmosConverter mappingCosmosConverter) {
        super(cosmosFactory, cosmosConfig, mappingCosmosConverter, null);
    }

    public void setDatabaseNameForCurrentThread(final String newDatabaseName) {
        LOGGER.debug("Switching to database: " + newDatabaseName);
        createDatabaseIfNotExists(newDatabaseName);
        databaseName.set(newDatabaseName);
    }
}
