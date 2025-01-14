package com.aetherteam.aetherii.data.resources.registries;

import com.aetherteam.aetherii.data.resources.builders.AetherIIDensityFunctionBuilders;
import com.aetherteam.aetherii.world.density.PerlinNoiseFunction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.DensityFunctions;
import net.minecraft.world.level.levelgen.synth.BlendedNoise;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

public class AetherIIDensityFunctions extends AetherIIDensityFunctionBuilders {
    public static void bootstrap(BootstapContext<DensityFunction> context) {
        HolderGetter<DensityFunction> function = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noise = context.lookup(Registries.NOISE);
        DensityFunction shiftX = getFunction(function, SHIFT_X);
        DensityFunction shiftZ = getFunction(function, SHIFT_Z);

        context.register(TEMPERATURE, DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.375D, noise.getOrThrow(AetherIINoises.TEMPERATURE)));
        context.register(VEGETATION, DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.5D, noise.getOrThrow(AetherIINoises.VEGETATION)));
        context.register(CONTINENTS, DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.75D, noise.getOrThrow(AetherIINoises.EROSION)).abs());
        context.register(EROSION, DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.375D, noise.getOrThrow(AetherIINoises.EROSION)).abs());
        context.register(DEPTH, DensityFunctions.yClampedGradient(0, 384, -1.5, 1.5));
        context.register(ELEVATION, DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.75D, noise.getOrThrow(AetherIINoises.ELEVATION)).abs());

        context.register(BASE_3D_NOISE, BlendedNoise.createUnseeded(
                0.1D, // xz scale
                0.02D, // y scale
                80D, // xz factor
                160D, // y factor
                1.0D // smear scale multiplier, capped at 8
        ));

        context.register(VEGETATION_RARITY_MAPPER, makeVegetationRarityMapper(function));

        context.register(FACTOR, buildFactor(function));
        context.register(AMPLIFICATION, DensityFunctions.weirdScaledSampler(getFunction(function, AetherIIDensityFunctions.BASE_3D_NOISE), noise.getOrThrow(AetherIINoises.AMPLIFICATION), DensityFunctions.WeirdScaledSampler.RarityValueMapper.TYPE1));
        context.register(ISLAND_DENSITY, buildIslandDensity(function));
        context.register(TERRAIN_SHAPER, finalizeTerrainShaper(function));
        context.register(FINAL_DENSITY, buildFinalDensity(function));

        context.register(VEGETATION_RARE, new PerlinNoiseFunction(new NormalNoise.NoiseParameters(-8, 1.5, 0.0, 0.5, 0.0, 0.0, 0.0), 0.375D, 0.0D, 76).abs());

        context.register(LAKES_NOISE,
                DensityFunctions.add(
                        new PerlinNoiseFunction(new NormalNoise.NoiseParameters(-8, 1.0, 1.75, 0.0, 0.0), 0.5D, 0.0D, 64),
                        DensityFunctions.constant(0.1D)
                ));

        context.register(LAKES_FLOOR, new PerlinNoiseFunction(new NormalNoise.NoiseParameters(-6, 2.5, 1.0, 0.0, 0.0, 0.0, 0.0), 1.0D, 0.0D, 17).abs());
        context.register(LAKES_BARRIER, new PerlinNoiseFunction(new NormalNoise.NoiseParameters(-5, 1.5, 1.0, 0.0, 0.0), 1.0D, 0.0D, 38).abs());

        context.register(CLOUDBED_NOISE,
                DensityFunctions.add(
                        DensityFunctions.mul(new PerlinNoiseFunction(new NormalNoise.NoiseParameters(0, 1, 1, 1, 1, 1, 1), 0.005D, 0.0D, 42), DensityFunctions.constant(1.5D)),
                        DensityFunctions.constant(0.1D)
                        ));

        context.register(CLOUDBED_Y_OFFSET, DensityFunctions.mul(new PerlinNoiseFunction(new NormalNoise.NoiseParameters(0, 1, 1), 0.001D, 0.0D, 95), DensityFunctions.constant(1.5D)));
    }
}