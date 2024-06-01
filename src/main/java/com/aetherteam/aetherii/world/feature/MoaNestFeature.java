package com.aetherteam.aetherii.world.feature;

import com.aetherteam.aetherii.block.AetherIIBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class MoaNestFeature extends Feature<NoneFeatureConfiguration> {
    public MoaNestFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos pos = context.origin();
        this.placeCircle(level, pos.below(), AetherIIBlocks.WOVEN_SKYROOT_STICKS.get().defaultBlockState(), 2, 3); // Bottom layer of the nest
        this.placeCircle(level, pos, AetherIIBlocks.WOVEN_SKYROOT_STICKS.get().defaultBlockState(), 3, 5); // Second Layer of the Nest
        this.placeCircle(level, pos, Blocks.AIR.defaultBlockState(), 2, 3); // Removes the inside from the second layer and only leaves the edges
        this.setBlock(level, pos, Blocks.SNIFFER_EGG.defaultBlockState());
        return true;
    }

    //TODO: Code Clean-Up
    private void placeCircle(WorldGenLevel level, BlockPos pos, BlockState state, int radius, int squareSize) {
        int offset = (int) ((squareSize/2)+0.5); // Generates the inner Floor of the Nest

        for(int i = 0; i < squareSize; i++) {
            for (int y = 0; y < squareSize; y++) {
                this.setBlock(level, pos.relative(Direction.Axis.X,  i-offset).relative(Direction.Axis.Z, y-offset), state);
            }
        }

        // Generates a circle around the nest
        this.setBlock(level, pos.north(radius).east(), state);
        this.setBlock(level, pos.north(radius), state);
        this.setBlock(level, pos.north(radius).west(), state);

        this.setBlock(level, pos.south(radius).east(), state);
        this.setBlock(level, pos.south(radius), state);
        this.setBlock(level, pos.south(radius).west(), state);

        this.setBlock(level, pos.east(radius).south(), state);
        this.setBlock(level, pos.east(radius), state);
        this.setBlock(level, pos.east(radius).north(), state);

        this.setBlock(level, pos.west(radius).south(), state);
        this.setBlock(level, pos.west(radius), state);
        this.setBlock(level, pos.west(radius).north(), state);
    }
}