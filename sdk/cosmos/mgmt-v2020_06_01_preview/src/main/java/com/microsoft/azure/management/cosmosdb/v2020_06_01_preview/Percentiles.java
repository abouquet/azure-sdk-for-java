/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.PercentilesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Percentiles.
 */
public interface Percentiles extends HasInner<PercentilesInner> {
    /**
     * Retrieves the metrics determined by the given filter for the given database account. This url is only for PBS and Replication Latency data.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PercentileMetric> listMetricsAsync(String resourceGroupName, String accountName, String filter);

}
