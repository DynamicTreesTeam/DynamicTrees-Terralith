package com.djs.dtterralith.registry;

import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterTerralithBiomes {

	public static final DeferredRegister<Biome> REGISTER = DeferredRegister.create(ForgeRegistries.BIOMES, "terralith");
	
	public static final RegistryObject<Biome> DESERT_CANYON = REGISTER.register("desert_canyon", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ANDESITE_CAVES = REGISTER.register("andesite_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> CRYSTAL_CAVES = REGISTER.register("crystal_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> DEEP_CAVES = REGISTER.register("deep_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> DESERT_CAVES = REGISTER.register("desert_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> DIORITE_CAVES = REGISTER.register("diorite_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> FROSTFIRE_CAVES = REGISTER.register("frostfire_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> FUNGAL_CAVES = REGISTER.register("fungal_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> GRANITE_CAVES = REGISTER.register("granite_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ICE_CAVES = REGISTER.register("ice_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> INFESTED_CAVES = REGISTER.register("infested_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> MANTLE_CAVES = REGISTER.register("mantle_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> THERMAL_CAVES = REGISTER.register("thermal_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> TUFF_CAVES = REGISTER.register("tuff_caves", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ALPHA_ISLANDS_WINTER = REGISTER.register("alpha_islands_winter", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ALPHA_ISLANDS = REGISTER.register("alpha_islands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ALPINE_GROVE = REGISTER.register("alpine_grove", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ALPINE_HIGHLANDS = REGISTER.register("alpine_highlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> AMETHYST_CANYON = REGISTER.register("amethyst_canyon", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> RAINFOREST = REGISTER.register("amethyst_rainforest", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ANCIENT_SANDS = REGISTER.register("ancient_sands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ARID_HIGHLANDS = REGISTER.register("arid_highlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ASHEN_SAVANNA = REGISTER.register("ashen_savanna", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> BASALT_CLIFFS = REGISTER.register("basalt_cliffs", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> BIRCH_TAIGA = REGISTER.register("birch_taiga", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> BLOOMING_PLATEAU = REGISTER.register("blooming_plateau", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> BLOOMING_VALLEY = REGISTER.register("blooming_valley", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> BRUSHLAND = REGISTER.register("brushland", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> BRYCE_CANYON = REGISTER.register("bryce_canyon", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> CALDERA = REGISTER.register("caldera", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> CLOUD_FOREST = REGISTER.register("cloud_forest", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> COLD_SHRUBLAND = REGISTER.register("cold_shrubland", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> DESERT_OASIS = REGISTER.register("desert_oasis", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> DESERT_SPIRES = REGISTER.register("desert_spires", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> EMERALD_PEAKS = REGISTER.register("emerald_peaks", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> FORESTED_HIGHLANDS = REGISTER.register("forested_highlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> FRACTURED_SAVANNA = REGISTER.register("fractured_savanna", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> FROZEN_CLIFFS = REGISTER.register("frozen_cliffs", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> GLACIAL_CHASM = REGISTER.register("glacial_chasm", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> GRANITE_CLIFFS = REGISTER.register("granite_cliffs", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> GRAVEL_BEACH = REGISTER.register("gravel_beach", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> GRAVEL_DESERT = REGISTER.register("gravel_desert", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> HAZE_MOUNTAIN = REGISTER.register("haze_mountain", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> HIGHLANDS = REGISTER.register("highlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> HOT_SHRUBLAND = REGISTER.register("hot_shrubland", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ICE_MARSH = REGISTER.register("ice_marsh", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> JUNGLE_MOUNTAINS = REGISTER.register("jungle_mountains", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> LAVENDER_FOREST = REGISTER.register("lavender_forest", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> LAVENDER_VALLEY = REGISTER.register("lavender_valley", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> LUSH_VALLEY = REGISTER.register("lush_valley", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> MIRAGE_ISLES = REGISTER.register("mirage_isles", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> MOONLIGHT_GROVE = REGISTER.register("moonlight_grove", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> MOONLIGHT_VALLEY = REGISTER.register("moonlight_valley", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> MOUNTAIN_STEPPE = REGISTER.register("mountain_steppe", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ORCHID_SWAMP = REGISTER.register("orchid_swamp", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> PAINTED_MOUNTAINS = REGISTER.register("painted_mountains", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> RED_OASIS = REGISTER.register("red_oasis", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ROCKY_JUNGLE = REGISTER.register("rocky_jungle", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ROCKY_MOUNTAINS = REGISTER.register("rocky_mountains", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> ROCKY_SHRUBLAND = REGISTER.register("rocky_shrubland", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SAKURA_GROVE = REGISTER.register("sakura_grove", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SAKURA_VALLEY = REGISTER.register("sakura_valley", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SANDSTONE_VALLEY = REGISTER.register("sandstone_valley", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SAVANNA_BADLANDS = REGISTER.register("savanna_badlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SAVANNA_SLOPES = REGISTER.register("savanna_slopes", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SCARLET_MOUNTAINS = REGISTER.register("scarlet_mountains", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SHIELD_CLEARING = REGISTER.register("shield_clearing", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SHIELD = REGISTER.register("shield", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SHRUBLAND = REGISTER.register("shrubland", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SIBERIAN_GROVE = REGISTER.register("siberian_grove", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SIBERIAN_TAIGA = REGISTER.register("siberian_taiga", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SKYLANDS_AUTUMN = REGISTER.register("skylands_autumn", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SKYLANDS_SPRING = REGISTER.register("skylands_spring", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SKYLANDS_SUMMER = REGISTER.register("skylands_summer", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SKYLANDS_WINTER = REGISTER.register("skylands_winter", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SKYLANDS = REGISTER.register("skylands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SNOWY_BADLANDS = REGISTER.register("snowy_badlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SNOWY_MAPLE_FOREST = REGISTER.register("snowy_maple_forest", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> SNOWY_SHIELD = REGISTER.register("snowy_shield", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> STEPPE = REGISTER.register("steppe", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> STONY_SPIRES = REGISTER.register("stony_spires", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> TEMPERATE_HIGHLANDS = REGISTER.register("temperate_highlands", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> TROPICAL_JUNGLE = REGISTER.register("tropical_jungle", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> VALLEY_CLEARING = REGISTER.register("valley_clearing", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> VOLCANIC_CRATER = REGISTER.register("volcanic_crater", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> VOLCANIC_PEAKS = REGISTER.register("volcanic_peaks", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> WARM_RIVER = REGISTER.register("warm_river", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> WARPED_MESA = REGISTER.register("warped_mesa", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> WHITE_CLIFFS = REGISTER.register("white_cliffs", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> WHITE_MESA = REGISTER.register("white_mesa", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> WINDSWEPT_SPIRES = REGISTER.register("windswept_spires", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> WINTRY_FOREST = REGISTER.register("wintry_forest", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> YELLOWSTONE = REGISTER.register("yellowstone", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> YOSEMITE_CLIFFS = REGISTER.register("yosemite_cliffs", OverworldBiomes::theVoid);
	public static final RegistryObject<Biome> YOSEMITE_LOWLANDS = REGISTER.register("yosemite_lowlands", OverworldBiomes::theVoid);

    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }

}
