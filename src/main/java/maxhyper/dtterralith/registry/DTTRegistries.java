package maxhyper.dtterralith.registry;

import maxhyper.dtterralith.DynamicTreesTerralith;
import maxhyper.dtterralith.cellkits.DTTerralithCellKits;
import maxhyper.dtterralith.genfeatures.DTTerralithGenFeatures;
import maxhyper.dtterralith.growthlogic.DTTGrowthLogicKits;
import maxhyper.dtterralith.trees.PoplarSpecies;

import com.dtteam.dynamictrees.api.cell.CellKit;
import com.dtteam.dynamictrees.systems.genfeature.GenFeature;
import com.dtteam.dynamictrees.systems.growthlogic.GrowthLogicKit;
import com.dtteam.dynamictrees.tree.species.Species;

public class DTTRegistries {

    /**
     * Called from the {@code dynamictrees} entrypoint before Dynamic Trees loads
     * and locks its registries. Replaces the old NeoForge mod-bus registry events.
     */
    public static void setup() {
        Species.REGISTRY.registerType(DynamicTreesTerralith.location("poplar"), PoplarSpecies.TYPE);
        DTTerralithCellKits.register(CellKit.REGISTRY);
        DTTGrowthLogicKits.register(GrowthLogicKit.REGISTRY);
        DTTerralithGenFeatures.register(GenFeature.REGISTRY);
    }

}
