package com.gildedgames.aether.client.renderer.entities.living;

import com.gildedgames.aether.client.models.entities.living.ModelSwet;
import com.gildedgames.aether.client.renderer.entities.living.layers.LayerSwetGel;
import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.entities.living.mobs.EntitySwet;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSwet extends RenderLiving<EntitySwet>
{

	private final static ResourceLocation TEXTURE = AetherCore.getResource("textures/entities/swet/swet.png");

	public RenderSwet(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelSwet(), 0.5F);

		this.addLayer(new LayerSwetGel(this));
	}

	@Override
	protected void preRenderCallback(EntitySwet entity, float partialTickTime)
	{
		GlStateManager.scale(0.35F, 0.35F, 0.35F);
		float f1 = 2.0F;
		float f2 = (entity.prevSquishFactor + (entity.squishFactor - entity.prevSquishFactor) * partialTickTime) / (f1 * 0.5F + 1.0F);
		float f3 = 1.0F / (f2 + 1.0F);
		GlStateManager.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
	}

	@Override
	public void doRender(EntitySwet entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitySwet entity)
	{
		return TEXTURE;
	}
}
