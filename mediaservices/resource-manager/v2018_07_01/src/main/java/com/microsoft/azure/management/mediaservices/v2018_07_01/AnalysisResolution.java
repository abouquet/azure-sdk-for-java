/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AnalysisResolution.
 */
public final class AnalysisResolution extends ExpandableStringEnum<AnalysisResolution> {
    /** Static value SourceResolution for AnalysisResolution. */
    public static final AnalysisResolution SOURCE_RESOLUTION = fromString("SourceResolution");

    /** Static value StandardDefinition for AnalysisResolution. */
    public static final AnalysisResolution STANDARD_DEFINITION = fromString("StandardDefinition");

    /**
     * Creates or finds a AnalysisResolution from its string representation.
     * @param name a name to look for
     * @return the corresponding AnalysisResolution
     */
    @JsonCreator
    public static AnalysisResolution fromString(String name) {
        return fromString(name, AnalysisResolution.class);
    }

    /**
     * @return known AnalysisResolution values
     */
    public static Collection<AnalysisResolution> values() {
        return values(AnalysisResolution.class);
    }
}