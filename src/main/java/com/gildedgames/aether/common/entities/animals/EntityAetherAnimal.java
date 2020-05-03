package com.gildedgames.aether.common.entities.animals;

import com.gildedgames.aether.api.entity.damage.IDefenseLevelsHolder;
import com.gildedgames.aether.api.registrar.BlocksAether;
import com.gildedgames.aether.common.entities.ai.AetherNavigateGround;
import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

public abstract class EntityAetherAnimal extends EntityAnimal implements IDefenseLevelsHolder
{
	public EntityAetherAnimal(World world)
	{
		super(world);
	}

	@Override
	public float getBlockPathWeight(BlockPos pos)
	{
		return this.world.getBlockState(pos.down()).getBlock() == BlocksAether.aether_grass ? 10.0F :
				this.world.getLightBrightness(pos) - 0.5F;
	}

	@Override
	protected PathNavigate createNavigator(final World worldIn)
	{
		return new AetherNavigateGround(this, worldIn);
	}

	protected void applyStatusEffectOnAttack(final Entity target)
	{

	}
}
