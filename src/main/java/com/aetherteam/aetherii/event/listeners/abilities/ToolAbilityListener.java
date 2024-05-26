package com.aetherteam.aetherii.event.listeners.abilities;

import com.aetherteam.aetherii.event.hooks.AbilityHooks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.ToolAction;
import net.neoforged.neoforge.event.level.BlockEvent;

public class ToolAbilityListener {

    /**
     * @see com.aetherteam.aetherii.AetherII#eventSetup(IEventBus)
     */
    public static void listen(IEventBus bus) {
        bus.addListener(ToolAbilityListener::setupToolModifications);
    }

    /**
     * @see com.aetherteam.aetherii.event.hooks.AbilityHooks.ToolHooks#setupToolActions(LevelAccessor, BlockPos, BlockState, ToolAction)
     */
    public static void setupToolModifications(BlockEvent.BlockToolModificationEvent event) {
        LevelAccessor levelAccessor = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState oldState = event.getState();
        ToolAction toolAction = event.getToolAction();
        BlockState newState = AbilityHooks.ToolHooks.setupToolActions(levelAccessor, pos, oldState, toolAction);
        if (newState != oldState && !event.isSimulated() && !event.isCanceled()) {
            event.setFinalState(newState);
        }
    }
}