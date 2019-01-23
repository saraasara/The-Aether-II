package com.gildedgames.aether.common.entities.effects;

import com.gildedgames.aether.common.capabilities.entity.effects.EffectsDamageSource;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;

public class StatusEffectFungalRot extends StatusEffect
{
	public StatusEffectFungalRot(EntityLivingBase livingBase)
	{
		super(effectTypes.FUNGAL_ROT, new AttributeModifier("aether.statusEffectFungalRot", -0.5D, 1).setSaved(false), livingBase);
	}

	@Override
	public void applyEffect(EntityLivingBase livingBase, int timer)
	{
		IAttributeInstance iAttributeInstance = livingBase.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);

		if (this.isEffectApplied && this.effectTimer % (TICKS_PER_SECOND * 2) == 0)
		{
			livingBase.attackEntityFrom(EffectsDamageSource.FUNGAL_ROT, 1f);

			if (!iAttributeInstance.hasModifier(this.getAttributeModifier()))
			{
				iAttributeInstance.applyModifier(this.getAttributeModifier());
			}
		}
		else if (!this.isEffectApplied)
		{
			if (iAttributeInstance.getModifier(this.getAttributeModifier().getID()) != null)
			{
				iAttributeInstance.removeModifier(this.getAttributeModifier());
			}
		}
	}

	@Override
	public void onEffectEnd()
	{

	}
}
