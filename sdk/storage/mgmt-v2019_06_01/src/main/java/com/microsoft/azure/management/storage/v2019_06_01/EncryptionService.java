/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A service that allows server-side encryption to be used.
 */
public class EncryptionService {
    /**
     * A boolean indicating whether or not the service encrypts the data as it
     * is stored.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Gets a rough estimate of the date/time when the encryption was last
     * enabled by the user. Only returned when encryption is enabled. There
     * might be some unencrypted blobs which were written after this time, as
     * it is just a rough estimate.
     */
    @JsonProperty(value = "lastEnabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastEnabledTime;

    /**
     * Encryption key type to be used for the encryption service. 'Account' key
     * type implies that an account-scoped encryption key will be used.
     * 'Service' key type implies that a default service key is used. Possible
     * values include: 'Service', 'Account'.
     */
    @JsonProperty(value = "keyType")
    private KeyType keyType;

    /**
     * Get a boolean indicating whether or not the service encrypts the data as it is stored.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set a boolean indicating whether or not the service encrypts the data as it is stored.
     *
     * @param enabled the enabled value to set
     * @return the EncryptionService object itself.
     */
    public EncryptionService withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get gets a rough estimate of the date/time when the encryption was last enabled by the user. Only returned when encryption is enabled. There might be some unencrypted blobs which were written after this time, as it is just a rough estimate.
     *
     * @return the lastEnabledTime value
     */
    public DateTime lastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Get encryption key type to be used for the encryption service. 'Account' key type implies that an account-scoped encryption key will be used. 'Service' key type implies that a default service key is used. Possible values include: 'Service', 'Account'.
     *
     * @return the keyType value
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set encryption key type to be used for the encryption service. 'Account' key type implies that an account-scoped encryption key will be used. 'Service' key type implies that a default service key is used. Possible values include: 'Service', 'Account'.
     *
     * @param keyType the keyType value to set
     * @return the EncryptionService object itself.
     */
    public EncryptionService withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

}