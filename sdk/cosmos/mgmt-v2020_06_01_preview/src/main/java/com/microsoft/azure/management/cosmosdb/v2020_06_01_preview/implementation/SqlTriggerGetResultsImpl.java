/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SqlTriggerGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SqlTriggerCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SqlTriggerGetPropertiesResource;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ManagedServiceIdentity;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.CreateUpdateOptions;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.SqlTriggerResource;
import rx.functions.Func1;

class SqlTriggerGetResultsImpl extends CreatableUpdatableImpl<SqlTriggerGetResults, SqlTriggerGetResultsInner, SqlTriggerGetResultsImpl> implements SqlTriggerGetResults, SqlTriggerGetResults.Definition, SqlTriggerGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String containerName;
    private String triggerName;
    private SqlTriggerCreateUpdateParameters createOrUpdateParameter;

    SqlTriggerGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new SqlTriggerGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.triggerName = name;
        //
        this.createOrUpdateParameter = new SqlTriggerCreateUpdateParameters();
    }

    SqlTriggerGetResultsImpl(SqlTriggerGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.triggerName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlDatabases");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        this.triggerName = IdParsingUtils.getValueFromIdByName(inner.id(), "triggers");
        //
        this.createOrUpdateParameter = new SqlTriggerCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlTriggerGetResults> createResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlTriggerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.triggerName, this.createOrUpdateParameter)
            .map(new Func1<SqlTriggerGetResultsInner, SqlTriggerGetResultsInner>() {
               @Override
               public SqlTriggerGetResultsInner call(SqlTriggerGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlTriggerGetResults> updateResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlTriggerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.triggerName, this.createOrUpdateParameter)
            .map(new Func1<SqlTriggerGetResultsInner, SqlTriggerGetResultsInner>() {
               @Override
               public SqlTriggerGetResultsInner call(SqlTriggerGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlTriggerGetResultsInner> getInnerAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.getSqlTriggerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.triggerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SqlTriggerCreateUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SqlTriggerGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SqlTriggerGetResultsImpl withExistingContainer(String resourceGroupName, String accountName, String databaseName, String containerName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        this.containerName = containerName;
        return this;
    }

    @Override
    public SqlTriggerGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public SqlTriggerGetResultsImpl withOptions(CreateUpdateOptions options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public SqlTriggerGetResultsImpl withResource(SqlTriggerResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public SqlTriggerGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        this.createOrUpdateParameter.withIdentity(identity);
        return this;
    }

    @Override
    public SqlTriggerGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
