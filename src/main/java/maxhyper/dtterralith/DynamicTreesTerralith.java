package maxhyper.dtterralith;

import java.nio.file.Path;
import java.util.Optional;

import com.dtteam.dynamictrees.block.leaves.LeavesProperties;
import com.dtteam.dynamictrees.data.GatherDataHelper;
import com.dtteam.dynamictrees.registry.NeoForgeRegistryHandler;
import com.dtteam.dynamictrees.tree.family.Family;
import com.dtteam.dynamictrees.tree.species.Species;

import maxhyper.dtterralith.registry.DTTRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.AddPackFindersEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DynamicTreesTerralith.MOD_ID)
public class DynamicTreesTerralith {

	public static final String MOD_ID = "dtterralith";

	public DynamicTreesTerralith(IEventBus modEventBus, ModContainer modContainer) {
		modContainer.registerConfig(ModConfig.Type.COMMON, DTTConfigs.GENERAL_SPEC, "dtterralithconfig.toml");

		modEventBus.addListener(this::gatherData);
		modEventBus.addListener(this::setupBuiltInDatapack);
		// RegistryHandler.setup(MOD_ID);

		NeoForgeRegistryHandler.setup(MOD_ID, modEventBus);

		DTTRegistries.setup();
	}

	private void gatherData(final GatherDataEvent event) {
		GatherDataHelper.gatherAllData(MOD_ID, event,
				Family.REGISTRY,
				Species.REGISTRY,
				LeavesProperties.REGISTRY);
	}

	public static ResourceLocation location(String name) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
	}

	private void setupBuiltInDatapack(AddPackFindersEvent event) {

		String MODID = "dtterralith";
		if ((event.getPackType() == PackType.SERVER_DATA)) {
			if (DTTConfigs.REPLACE_TREE_FEATURES_FIX.get()) {
				PackLocationInfo locationInfo = new PackLocationInfo("builtin/replace_tree_features_fix", Component.literal("dtterralith fixes: replace_tree_features_fix"), PackSource.BUILT_IN, Optional.empty());
				Path resourcePath = ModList.get().getModFileById(MODID).getFile().findResource("resourcepacks/replace_tree_features_fix");
				Pack.ResourcesSupplier resourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
				PackSelectionConfig selectionConfig = new PackSelectionConfig(false, Pack.Position.TOP, false);
				Pack pack = Pack.readMetaAndCreate(locationInfo, resourcesSupplier, PackType.CLIENT_RESOURCES, selectionConfig);
				event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
			}
		}

		if ((event.getPackType() == PackType.SERVER_DATA)) {
			if (DTTConfigs.SKYLANDS_WINTER_FIX.get()) {
				PackLocationInfo locationInfo = new PackLocationInfo("builtin/skylands_winter_fix", Component.literal("dtterralith fixes: skylands_winter_fix"), PackSource.BUILT_IN, Optional.empty());
				Path resourcePath = ModList.get().getModFileById(MODID).getFile().findResource("resourcepacks/skylands_winter_fix");
				Pack.ResourcesSupplier resourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
				PackSelectionConfig selectionConfig = new PackSelectionConfig(false, Pack.Position.TOP, false);
				Pack pack = Pack.readMetaAndCreate(locationInfo, resourcesSupplier, PackType.SERVER_DATA, selectionConfig);
				event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
			}
		}

	}
}

