/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.SBAuthorizationRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.ServiceBusManager;
import java.util.List;

/**
 * Type representing TopicNamespaceSBAuthorizationRule.
 */
public interface TopicNamespaceSBAuthorizationRule extends HasInner<SBAuthorizationRuleInner>, Indexable, Refreshable<TopicNamespaceSBAuthorizationRule>, Updatable<TopicNamespaceSBAuthorizationRule.Update>, HasManager<ServiceBusManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the rights value.
     */
    List<AccessRights> rights();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the TopicNamespaceSBAuthorizationRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithTopic, DefinitionStages.WithRights, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of TopicNamespaceSBAuthorizationRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a TopicNamespaceSBAuthorizationRule definition.
         */
        interface Blank extends WithTopic {
        }

        /**
         * The stage of the topicnamespacesbauthorizationrule definition allowing to specify Topic.
         */
        interface WithTopic {
           /**
            * Specifies resourceGroupName, namespaceName, topicName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param namespaceName The namespace name
            * @param topicName The topic name
            * @return the next definition stage
            */
            WithRights withExistingTopic(String resourceGroupName, String namespaceName, String topicName);
        }

        /**
         * The stage of the topicnamespacesbauthorizationrule definition allowing to specify Rights.
         */
        interface WithRights {
           /**
            * Specifies rights.
            * @param rights The rights associated with the rule
            * @return the next definition stage
            */
            WithCreate withRights(List<AccessRights> rights);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<TopicNamespaceSBAuthorizationRule> {
        }
    }
    /**
     * The template for a TopicNamespaceSBAuthorizationRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<TopicNamespaceSBAuthorizationRule>, UpdateStages.WithRights {
    }

    /**
     * Grouping of TopicNamespaceSBAuthorizationRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the topicnamespacesbauthorizationrule update allowing to specify Rights.
         */
        interface WithRights {
            /**
             * Specifies rights.
             * @param rights The rights associated with the rule
             * @return the next update stage
             */
            Update withRights(List<AccessRights> rights);
        }

    }
}