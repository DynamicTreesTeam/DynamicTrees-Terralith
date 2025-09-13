package maxhyper.dtterralith.growthlogic;

import maxhyper.dtterralith.DynamicTreesTerralith;
import com.dtteam.dynamictrees.api.registry.Registry;
import com.dtteam.dynamictrees.systems.growthlogic.GrowthLogicKit;

public class DTTGrowthLogicKits {

	public static final GrowthLogicKit TALL_DECIDUOUS = new TallDeciduousLogic(
			DynamicTreesTerralith.location("tall_deciduous"));
	public static final GrowthLogicKit TWISTING_TREE = new TwistingTreeLogic(
			DynamicTreesTerralith.location("twisting_tree"));
	public static final GrowthLogicKit VARIATE_HEIGHT = new VariateHeightLogic(
			DynamicTreesTerralith.location("variate_height"));
	public static final GrowthLogicKit POPLAR = new PoplarLogic(DynamicTreesTerralith.location("poplar"));
	public static final GrowthLogicKit BAOBAB = new BaobabLogic(DynamicTreesTerralith.location("baobab"));

	public static void register(final Registry<GrowthLogicKit> registry) {
		registry.registerAll(TALL_DECIDUOUS, TWISTING_TREE, VARIATE_HEIGHT, POPLAR, BAOBAB);
	}

}
