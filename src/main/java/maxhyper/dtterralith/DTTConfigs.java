package maxhyper.dtterralith;

import net.neoforged.neoforge.common.ModConfigSpec;

public class DTTConfigs {

	public static final ModConfigSpec GENERAL_SPEC;

	static {
		ModConfigSpec.Builder configBuilder = new ModConfigSpec.Builder();
		setupConfig(configBuilder);
		GENERAL_SPEC = configBuilder.build();
	}

	public static ModConfigSpec.ConfigValue<Boolean> REPLACE_TREE_FEATURES_FIX;
	public static ModConfigSpec.ConfigValue<Boolean> SKYLANDS_WINTER_FIX;

	private static void setupConfig(ModConfigSpec.Builder builder) {

		builder.push("Dynamic Trees + Terralith Compat Mod Config");

		SKYLANDS_WINTER_FIX = builder
                .comment("If \"true\", implements fix for terralith's winter skylands. \n" +
                		"Changes ordering of biome features to enable dynamic trees to generate. \n" +
                		"Defaults to \"true\".")
                .define("skylands_winter_fix_entry", true);

		REPLACE_TREE_FEATURES_FIX = builder
                .comment("If \"true\", implements fixes for failed tree cancellation in terralith biomes. \n" +
                		"Replaces tree features in biomes that tree cancellation has failed. \n" +
                		"Defaults to \"true\".")
                .define("replace_tree_features_fix_entry", true);

		builder.pop();
	}
}
