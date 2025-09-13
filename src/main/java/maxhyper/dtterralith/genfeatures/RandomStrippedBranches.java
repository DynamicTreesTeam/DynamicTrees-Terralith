package maxhyper.dtterralith.genfeatures;

import com.dtteam.dynamictrees.api.network.MapSignal;
import com.dtteam.dynamictrees.block.branch.BranchBlock;
import com.dtteam.dynamictrees.block.soil.SoilBlock;
import com.dtteam.dynamictrees.systems.genfeature.GenFeature;
import com.dtteam.dynamictrees.systems.genfeature.GenFeatureConfiguration;
import com.dtteam.dynamictrees.systems.genfeature.context.PostGenerationContext;
import com.dtteam.dynamictrees.systems.nodemapper.DenuderNode;
import com.dtteam.dynamictrees.tree.TreeHelper;
import com.dtteam.dynamictrees.tree.family.Family;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class RandomStrippedBranches extends GenFeature {
    public RandomStrippedBranches(ResourceLocation registryName) {
        super(registryName);
    }
    @Override
    protected void registerProperties() {
        register(PLACE_CHANCE);
    }
    @Override @NotNull
    public GenFeatureConfiguration createDefaultConfiguration() {
        return super.createDefaultConfiguration()
                .with(PLACE_CHANCE, 0.2f);
    }

    @Override
    protected boolean postGenerate(GenFeatureConfiguration configuration, PostGenerationContext context) {
        // If the family doesn't have a stripped branch the feature can't be applied.
        if (!context.species().getFamily().hasStrippedBranch()) {
            return false;
        }
        LevelAccessor level = context.level();
        BlockPos rootPos = context.pos();
        final SoilBlock dirt = TreeHelper.getRooty(level.getBlockState(rootPos));
        if (dirt == null) return false;

        Family family = context.species().getFamily();
        float chance = configuration.get(PLACE_CHANCE);
        if (!level.isClientSide()) {
            dirt.startAnalysis(level, rootPos, new MapSignal(new DenuderNode(context.species(), context.species().getFamily()){
                @Override
                public boolean run(BlockState state, LevelAccessor level, BlockPos pos, Direction fromDir) {
                    if (level.getRandom().nextFloat() >= chance) return false;

                    final BranchBlock branch = TreeHelper.getBranch(state);
                    if (branch == null || family.getBranch().map(other -> branch != other).orElse(false)) {
                        return false;
                    }
                    branch.stripBranch(state, level, pos, branch.getRadius(state));
                    return true;
                }
            }));

        }
        return true;
    }
}
