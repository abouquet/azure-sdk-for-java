/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlVirtualMachine;
import rx.Observable;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ResourceIdentity;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlServerLicenseType;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlManagementMode;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.SqlImageSku;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.WsfcDomainCredentials;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.AutoPatchingSettings;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.AutoBackupSettings;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.KeyVaultCredentialSettings;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.ServerConfigurationsManagementSettings;

class SqlVirtualMachineImpl extends GroupableResourceCoreImpl<SqlVirtualMachine, SqlVirtualMachineInner, SqlVirtualMachineImpl, SqlVirtualMachineManager> implements SqlVirtualMachine, SqlVirtualMachine.Definition, SqlVirtualMachine.Update {
    SqlVirtualMachineImpl(String name, SqlVirtualMachineInner inner, SqlVirtualMachineManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<SqlVirtualMachine> createResourceAsync() {
        SqlVirtualMachinesInner client = this.manager().inner().sqlVirtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlVirtualMachine> updateResourceAsync() {
        SqlVirtualMachinesInner client = this.manager().inner().sqlVirtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlVirtualMachineInner> getInnerAsync() {
        SqlVirtualMachinesInner client = this.manager().inner().sqlVirtualMachines();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AutoBackupSettings autoBackupSettings() {
        return this.inner().autoBackupSettings();
    }

    @Override
    public AutoPatchingSettings autoPatchingSettings() {
        return this.inner().autoPatchingSettings();
    }

    @Override
    public ResourceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public KeyVaultCredentialSettings keyVaultCredentialSettings() {
        return this.inner().keyVaultCredentialSettings();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ServerConfigurationsManagementSettings serverConfigurationsManagementSettings() {
        return this.inner().serverConfigurationsManagementSettings();
    }

    @Override
    public String sqlImageOffer() {
        return this.inner().sqlImageOffer();
    }

    @Override
    public SqlImageSku sqlImageSku() {
        return this.inner().sqlImageSku();
    }

    @Override
    public SqlManagementMode sqlManagement() {
        return this.inner().sqlManagement();
    }

    @Override
    public SqlServerLicenseType sqlServerLicenseType() {
        return this.inner().sqlServerLicenseType();
    }

    @Override
    public String sqlVirtualMachineGroupResourceId() {
        return this.inner().sqlVirtualMachineGroupResourceId();
    }

    @Override
    public String virtualMachineResourceId() {
        return this.inner().virtualMachineResourceId();
    }

    @Override
    public WsfcDomainCredentials wsfcDomainCredentials() {
        return this.inner().wsfcDomainCredentials();
    }

    @Override
    public SqlVirtualMachineImpl withAutoBackupSettings(AutoBackupSettings autoBackupSettings) {
        this.inner().withAutoBackupSettings(autoBackupSettings);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withAutoPatchingSettings(AutoPatchingSettings autoPatchingSettings) {
        this.inner().withAutoPatchingSettings(autoPatchingSettings);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withIdentity(ResourceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withKeyVaultCredentialSettings(KeyVaultCredentialSettings keyVaultCredentialSettings) {
        this.inner().withKeyVaultCredentialSettings(keyVaultCredentialSettings);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withServerConfigurationsManagementSettings(ServerConfigurationsManagementSettings serverConfigurationsManagementSettings) {
        this.inner().withServerConfigurationsManagementSettings(serverConfigurationsManagementSettings);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withSqlImageOffer(String sqlImageOffer) {
        this.inner().withSqlImageOffer(sqlImageOffer);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withSqlImageSku(SqlImageSku sqlImageSku) {
        this.inner().withSqlImageSku(sqlImageSku);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withSqlManagement(SqlManagementMode sqlManagement) {
        this.inner().withSqlManagement(sqlManagement);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withSqlServerLicenseType(SqlServerLicenseType sqlServerLicenseType) {
        this.inner().withSqlServerLicenseType(sqlServerLicenseType);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withSqlVirtualMachineGroupResourceId(String sqlVirtualMachineGroupResourceId) {
        this.inner().withSqlVirtualMachineGroupResourceId(sqlVirtualMachineGroupResourceId);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withVirtualMachineResourceId(String virtualMachineResourceId) {
        this.inner().withVirtualMachineResourceId(virtualMachineResourceId);
        return this;
    }

    @Override
    public SqlVirtualMachineImpl withWsfcDomainCredentials(WsfcDomainCredentials wsfcDomainCredentials) {
        this.inner().withWsfcDomainCredentials(wsfcDomainCredentials);
        return this;
    }

}