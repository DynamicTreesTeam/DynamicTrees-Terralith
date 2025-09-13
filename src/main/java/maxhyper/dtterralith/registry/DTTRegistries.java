package maxhyper.dtterralith.registry;

import maxhyper.dtterralith.DynamicTreesTerralith;
import maxhyper.dtterralith.cellkits.DTTerralithCellKits;
import maxhyper.dtterralith.genfeatures.DTTerralithGenFeatures;
import maxhyper.dtterralith.growthlogic.DTTGrowthLogicKits;
import maxhyper.dtterralith.trees.PoplarSpecies;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import com.dtteam.dynamictrees.api.cell.CellKit;
import com.dtteam.dynamictrees.event.RegistryEvent;
import com.dtteam.dynamictrees.event.TypeRegistryEvent;
import com.dtteam.dynamictrees.systems.genfeature.GenFeature;
import com.dtteam.dynamictrees.systems.growthlogic.GrowthLogicKit;
import com.dtteam.dynamictrees.tree.species.Species;

@EventBusSubscriber()
public class DTTRegistries {

    public static void setup() {

    }

    @SubscribeEvent
    public static void registerSpeciesTypes (final TypeRegistryEvent<Species> event) {
        if (event.isEntryOfType(Species.class)) {
            event.registerType(DynamicTreesTerralith.location("poplar"), PoplarSpecies.TYPE);
        }
    }

    @SubscribeEvent
    public static void registerCells(final RegistryEvent<CellKit> event) {
        if (event.isEntryOfType(CellKit.class)) {
            DTTerralithCellKits.register(event.getRegistry());
        }
    }

    @SubscribeEvent
    public static void registerGrowthLogic(final RegistryEvent<GrowthLogicKit> event) {
        if (event.isEntryOfType(GrowthLogicKit.class)) {
            DTTGrowthLogicKits.register(event.getRegistry());
        }
    }

    @SubscribeEvent
    public static void registerGenFeature(final RegistryEvent<GenFeature> event) {
        if (event.isEntryOfType(GenFeature.class)) {
            DTTerralithGenFeatures.register(event.getRegistry());
        }
    }

}

