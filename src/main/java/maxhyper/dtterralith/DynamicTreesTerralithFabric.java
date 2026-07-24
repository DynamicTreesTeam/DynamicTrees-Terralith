package maxhyper.dtterralith;

import com.dtteam.dynamictrees.api.DynamicTreesAddonEntrypoint;

import fuzs.forgeconfigapiport.fabric.api.v5.ConfigRegistry;
import maxhyper.dtterralith.registry.DTTRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import net.neoforged.fml.config.ModConfig;

public class DynamicTreesTerralithFabric implements ModInitializer, DynamicTreesAddonEntrypoint {

	@Override
	public void onInitialize() {
		ConfigRegistry.INSTANCE.register(DynamicTreesTerralith.MOD_ID, ModConfig.Type.COMMON,
				DTTConfigs.GENERAL_SPEC, "dtterralithconfig.toml");

		registerBuiltInDatapacks();
	}

	@Override
	public void onDynamicTreesPreSetup() {
		DynamicTreesAddonEntrypoint.setupAddon(DynamicTreesTerralith.MOD_ID);
		DTTRegistries.setup();
	}

	/**
	 * Mirrors the NeoForge {@code AddPackFindersEvent} logic: each fix pack is only
	 * offered when enabled in the config, and is opt-in per world (not force-enabled),
	 * matching the original non-required {@code PackSelectionConfig}.
	 */
	private void registerBuiltInDatapacks() {
		ModContainer modContainer = FabricLoader.getInstance()
				.getModContainer(DynamicTreesTerralith.MOD_ID).orElseThrow();

		if (getConfigOrDefault(DTTConfigs.REPLACE_TREE_FEATURES_FIX)) {
			ResourceLoader.registerBuiltinPack(
					DynamicTreesTerralith.location("replace_tree_features_fix"), modContainer,
					Component.literal("dtterralith fixes: replace_tree_features_fix"),
					PackActivationType.NORMAL);
		}

		if (getConfigOrDefault(DTTConfigs.SKYLANDS_WINTER_FIX)) {
			ResourceLoader.registerBuiltinPack(
					DynamicTreesTerralith.location("skylands_winter_fix"), modContainer,
					Component.literal("dtterralith fixes: skylands_winter_fix"),
					PackActivationType.NORMAL);
		}
	}

	private static boolean getConfigOrDefault(net.neoforged.neoforge.common.ModConfigSpec.ConfigValue<Boolean> value) {
		try {
			return value.get();
		} catch (IllegalStateException e) {
			// Config not loaded yet; both fixes default to true.
			return true;
		}
	}

}
