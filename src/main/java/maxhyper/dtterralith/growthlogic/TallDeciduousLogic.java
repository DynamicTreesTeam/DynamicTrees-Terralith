package maxhyper.dtterralith.growthlogic;

import com.dtteam.dynamictrees.api.configuration.ConfigurationProperty;
import com.dtteam.dynamictrees.systems.GrowSignal;
import com.dtteam.dynamictrees.systems.growthlogic.GrowthLogicKit;
import com.dtteam.dynamictrees.systems.growthlogic.GrowthLogicKitConfiguration;
import com.dtteam.dynamictrees.systems.growthlogic.context.DirectionManipulationContext;
import com.dtteam.dynamictrees.systems.growthlogic.context.PositionalSpeciesContext;

import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;

public class TallDeciduousLogic extends GrowthLogicKit {

	public static final ConfigurationProperty<Integer> TRUNK_UP_BOOST = ConfigurationProperty.integer("trunk_up_boost");

	public TallDeciduousLogic(final Identifier registryName) {
		super(registryName);
	}

	@Override
	protected GrowthLogicKitConfiguration createDefaultConfiguration() {
		return super.createDefaultConfiguration().with(TRUNK_UP_BOOST, 5);
	}

	@Override
	protected void registerProperties() {
		this.register(TRUNK_UP_BOOST);
	}

	@Override
	public int[] populateDirectionProbabilityMap(GrowthLogicKitConfiguration configuration,
			DirectionManipulationContext context) {
		final int[] probMap = super.populateDirectionProbabilityMap(configuration, context);

		// boost the trunk continuing up without branching
		if (context.signal().isInTrunk()) {
			probMap[Direction.UP.ordinal()] += configuration.get(TRUNK_UP_BOOST);
		} else {
			// Ensure that the branch gets out of the trunk at least two blocks so it won't
			// interfere with new side branches at the same level
			if (justTurnedOutOfTrunk(context.signal())) {
				probMap[Direction.UP.ordinal()] = 0;
			}
		}

		return probMap;
	}

	@Override
	public float getEnergy(GrowthLogicKitConfiguration configuration, PositionalSpeciesContext context) {
		return super.getEnergy(configuration, context)
				* context.species().biomeSuitability(context.level(), context.pos());
	}

	@Override
	public int getLowestBranchHeight(GrowthLogicKitConfiguration configuration, PositionalSpeciesContext context) {
		return (int) (super.getLowestBranchHeight(configuration, context)
				* context.species().biomeSuitability(context.level(), context.pos()));
	}

	private boolean justTurnedOutOfTrunk(GrowSignal signal) {
		return signal.numTurns == 1 && (Math.abs(signal.delta.getX()) == 1 || Math.abs(signal.delta.getZ()) == 1);
	}

}
