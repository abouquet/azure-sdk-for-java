/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation.HDInsightManager;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation.BillingResponseListResultInner;
import java.util.List;

/**
 * Type representing BillingResponseListResult.
 */
public interface BillingResponseListResult extends HasInner<BillingResponseListResultInner>, HasManager<HDInsightManager> {
    /**
     * @return the billingResources value.
     */
    List<BillingResources> billingResources();

    /**
     * @return the vmSizeFilters value.
     */
    List<VmSizeCompatibilityFilterV2> vmSizeFilters();

    /**
     * @return the vmSizes value.
     */
    List<String> vmSizes();

}