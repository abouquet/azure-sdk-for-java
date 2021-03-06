// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppServiceCertificatePatchResource model. */
@JsonFlatten
@Fluent
public class AppServiceCertificatePatchResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServiceCertificatePatchResource.class);

    /*
     * Key Vault resource Id.
     */
    @JsonProperty(value = "properties.keyVaultId")
    private String keyVaultId;

    /*
     * Key Vault secret name.
     */
    @JsonProperty(value = "properties.keyVaultSecretName")
    private String keyVaultSecretName;

    /*
     * Status of the Key Vault secret.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus provisioningState;

    /**
     * Get the keyVaultId property: Key Vault resource Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: Key Vault resource Id.
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the AppServiceCertificatePatchResource object itself.
     */
    public AppServiceCertificatePatchResource withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the AppServiceCertificatePatchResource object itself.
     */
    public AppServiceCertificatePatchResource withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get the provisioningState property: Status of the Key Vault secret.
     *
     * @return the provisioningState value.
     */
    public KeyVaultSecretStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
