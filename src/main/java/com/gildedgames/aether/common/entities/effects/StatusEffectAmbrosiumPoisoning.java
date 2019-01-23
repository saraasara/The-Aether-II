package com.gildedgames.aether.common.entities.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingHealEvent;

public class StatusEffectAmbrosiumPoisoning extends StatusEffect
{
	public StatusEffectAmbrosiumPoisoning(EntityLivingBase livingBase)
	{
		super(effectTypes.AMBROSIUM_POISONING, null, livingBase);
	}

	@Override
	public void applyEffect(EntityLivingBase livingBase, int timer)
	{
		/**
		 * Ambrosium Poisoning has a unique effect, and is handled elsewhere.
		 * reduce all resistances by 50%.
		 * @see com.gildedgames.aether.common.capabilities.entity.effects.StatusEffectPool#applyStatusEffect(effectTypes, int)
		 *
		 * Negate weak player HP regeneration.
		 * @see com.gildedgames.aether.common.capabilities.entity.player.PlayerAetherHooks#onLivingHeal(LivingHealEvent)
		 */
	}

	@Override
	public void onEffectEnd()
	{

	}
}
