package maxhyper.dtterralith;

import maxhyper.dtterralith.registry.DTTRegistries;
import com.ferreusveritas.dynamictrees.api.GatherDataHelper;
import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import com.ferreusveritas.dynamictrees.block.leaves.LeavesProperties;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import com.ferreusveritas.dynamictrees.tree.species.Species;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.resource.PathPackResources;

import java.io.IOException;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DynamicTreesTerralith.MOD_ID)
public class DynamicTreesTerralith {

	public static final String MOD_ID = "dtterralith";

	public DynamicTreesTerralith() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModLoadingContext.get().registerConfig(Type.COMMON, DTTConfigs.GENERAL_SPEC, "dtterralithconfig.toml");

		modEventBus.addListener(this::gatherData);
		modEventBus.addListener(this::setupBuiltInDatapack);
		MinecraftForge.EVENT_BUS.register(this);

		RegistryHandler.setup(MOD_ID);

		DTTRegistries.setup();
	}

	private void gatherData(final GatherDataEvent event) {
		GatherDataHelper.gatherAllData(MOD_ID, event,
				Family.REGISTRY,
				Species.REGISTRY,
				LeavesProperties.REGISTRY);
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(MOD_ID, name);
	}

	private void setupBuiltInDatapack(AddPackFindersEvent event) {

		String MODID = "dtterralith";

		if ((event.getPackType() == PackType.SERVER_DATA)) {
			if (DTTConfigs.REPLACE_TREE_FEATURES_FIX.get()) {
				var resourcePath = ModList.get().getModFileById(MODID).getFile().findResource("resourcepacks/replace_tree_features_fix");
				var pack = Pack.readMetaAndCreate("builtin/replace_tree_features_fix", Component.literal("dtterralith fixes: replace_tree_features_fix"), false,
						(path) -> new PathPackResources(path, false, resourcePath), PackType.SERVER_DATA, Pack.Position.TOP, PackSource.BUILT_IN);
				event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
			}
		}

		if ((event.getPackType() == PackType.SERVER_DATA)) {
			if (DTTConfigs.SKYLANDS_WINTER_FIX.get()) {
				var resourcePath = ModList.get().getModFileById(MODID).getFile().findResource("resourcepacks/skylands_winter_fix");
				var pack = Pack.readMetaAndCreate("builtin/skylands_winter_fix", Component.literal("dtterralith fixes: skylands_winter_fix"), false,
						(path) -> new PathPackResources(path, false, resourcePath), PackType.SERVER_DATA, Pack.Position.TOP, PackSource.BUILT_IN);
				event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
			}
		}

	}
}

