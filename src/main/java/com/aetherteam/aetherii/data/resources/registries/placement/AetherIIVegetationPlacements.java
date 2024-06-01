package com.aetherteam.aetherii.data.resources.registries.placement;

import com.aetherteam.aetherii.data.resources.registries.features.AetherIIFeatureUtils;
import com.aetherteam.aetherii.data.resources.registries.features.AetherIIVegetationFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

public class AetherIIVegetationPlacements {
    public static final ResourceKey<PlacedFeature> SHORT_GRASS_PATCH = AetherIIPlacementUtils.createKey("short_grass_patch");
    public static final ResourceKey<PlacedFeature> MEDIUM_GRASS_PATCH = AetherIIPlacementUtils.createKey("medium_grass_patch");
    public static final ResourceKey<PlacedFeature> LONG_GRASS_PATCH = AetherIIPlacementUtils.createKey("long_grass_patch");

    public static final ResourceKey<PlacedFeature> FLOURISHING_FIELD_TREES = AetherIIPlacementUtils.createKey("flourishing_field_trees");
    public static final ResourceKey<PlacedFeature> VERDANT_WOODS_TREES = AetherIIPlacementUtils.createKey("verdant_woods_trees");
    public static final ResourceKey<PlacedFeature> VIOLET_HIGHWOODS_TREES = AetherIIPlacementUtils.createKey("violet_highwoods_trees");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        AetherIIPlacementUtils.register(context, SHORT_GRASS_PATCH, configuredFeatures.getOrThrow(AetherIIVegetationFeatures.SHORT_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 5, 10),
                CountOnEveryLayerPlacement.of(UniformInt.of(0, 1)),
                BiomeFilter.biome());

        AetherIIPlacementUtils.register(context, MEDIUM_GRASS_PATCH, configuredFeatures.getOrThrow(AetherIIVegetationFeatures.MEDIUM_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 5, 10),
                CountOnEveryLayerPlacement.of(UniformInt.of(0, 1)),
                BiomeFilter.biome());

        AetherIIPlacementUtils.register(context, LONG_GRASS_PATCH, configuredFeatures.getOrThrow(AetherIIVegetationFeatures.LONG_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 5, 10),
                CountOnEveryLayerPlacement.of(UniformInt.of(0, 1)),
                BiomeFilter.biome());

        AetherIIPlacementUtils.register(context, FLOURISHING_FIELD_TREES, configuredFeatures.getOrThrow(AetherIIVegetationFeatures.TREES_FLOURISHING_FIELD),
                VegetationPlacements.treePlacement(RarityFilter.onAverageOnceEvery(2)));

        AetherIIPlacementUtils.register(context, VERDANT_WOODS_TREES, configuredFeatures.getOrThrow(AetherIIVegetationFeatures.TREES_VERDANT_WOODS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(16, 0.1F, 1)));

        AetherIIPlacementUtils.register(context, VIOLET_HIGHWOODS_TREES, configuredFeatures.getOrThrow(AetherIIVegetationFeatures.TREES_VIOLET_HIGHWOODS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(12, 0.1F, 1)));
    }
}