// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MarketplaceSubscriptionStatus. */
public final class MarketplaceSubscriptionStatus extends ExpandableStringEnum<MarketplaceSubscriptionStatus> {
    /** Static value Active for MarketplaceSubscriptionStatus. */
    public static final MarketplaceSubscriptionStatus ACTIVE = fromString("Active");

    /** Static value Suspended for MarketplaceSubscriptionStatus. */
    public static final MarketplaceSubscriptionStatus SUSPENDED = fromString("Suspended");

    /**
     * Creates or finds a MarketplaceSubscriptionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MarketplaceSubscriptionStatus.
     */
    @JsonCreator
    public static MarketplaceSubscriptionStatus fromString(String name) {
        return fromString(name, MarketplaceSubscriptionStatus.class);
    }

    /**
     * Gets known MarketplaceSubscriptionStatus values.
     *
     * @return known MarketplaceSubscriptionStatus values.
     */
    public static Collection<MarketplaceSubscriptionStatus> values() {
        return values(MarketplaceSubscriptionStatus.class);
    }
}
