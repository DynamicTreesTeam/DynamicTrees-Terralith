package com.djs.dtterralith.genfeatures;

import com.djs.dtterralith.DynamicTreesTerralith;
import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;

public class DTTerralithGenFeatures {

    public static final GenFeature RANDOM_STRIPPED_BRANCHES = new RandomStrippedBranches(DynamicTreesTerralith.location("random_stripped_branches"));

    public static void register(final Registry<GenFeature> registry) {
        registry.registerAll(RANDOM_STRIPPED_BRANCHES);
    }

}
