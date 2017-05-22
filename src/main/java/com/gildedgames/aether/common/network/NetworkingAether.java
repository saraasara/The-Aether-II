package com.gildedgames.aether.common.network;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.network.packets.*;
import com.gildedgames.aether.common.network.packets.dialog.PacketCloseDialog;
import com.gildedgames.aether.common.network.packets.dialog.PacketOpenDialog;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityTracker;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NetworkingAether
{
	private static SimpleNetworkWrapper instance;

	private static int discriminant = 0;

	public static void preInit()
	{
		instance = NetworkRegistry.INSTANCE.newSimpleChannel(AetherCore.MOD_ID);

		instance.registerMessage(PacketSpecialMovement.HandlerServer.class, PacketSpecialMovement.class, discriminant++, Side.SERVER);
		instance.registerMessage(PacketOpenTab.HandlerServer.class, PacketOpenTab.class, discriminant++, Side.SERVER);
		instance.registerMessage(PacketCloseDialog.HandlerServer.class, PacketCloseDialog.class, discriminant++, Side.SERVER);
		instance.registerMessage(PacketUpdateStructure.HandlerServer.class, PacketUpdateStructure.class, discriminant++, Side.SERVER);
		instance.registerMessage(PacketSaveStructure.HandlerServer.class, PacketSaveStructure.class, discriminant++, Side.SERVER);

		if (AetherCore.isClient())
		{
			registerClientPackets();
		}

		NetworkRegistry.INSTANCE.registerGuiHandler(AetherCore.INSTANCE, new AetherGuiHandler());
	}

	@SideOnly(Side.CLIENT)
	private static void registerClientPackets()
	{
		instance.registerMessage(PacketEquipment.HandlerClient.class, PacketEquipment.class, discriminant++, Side.CLIENT);
		instance.registerMessage(PacketMarkPlayerDeath.HandlerClient.class, PacketMarkPlayerDeath.class, discriminant++, Side.CLIENT);
		instance.registerMessage(PacketMoaJump.HandlerClient.class, PacketMoaJump.class, discriminant++, Side.CLIENT);
		instance.registerMessage(PacketOpenDialog.HandlerClient.class, PacketOpenDialog.class, discriminant++, Side.CLIENT);
		instance.registerMessage(PacketUpdateStructure.HandlerClient.class, PacketUpdateStructure.class, discriminant++, Side.CLIENT);
	}

	public static void sendPacketToAllPlayers(IMessage message)
	{
		NetworkingAether.instance.sendToAll(message);
	}

	public static void sendPacketToPlayer(IMessage message, EntityPlayerMP player)
	{
		NetworkingAether.instance.sendTo(message, player);
	}

	public static void sendPacketToWatching(IMessage message, EntityLivingBase entity, boolean includeSelf)
	{
		WorldServer world = (WorldServer) entity.world;

		EntityTracker tracker = world.getEntityTracker();

		for (EntityPlayer player : tracker.getTrackingPlayers(entity))
		{
			NetworkingAether.sendPacketToPlayer(message, (EntityPlayerMP) player);
		}

		// Entities don't watch themselves, take special care here
		if (includeSelf && entity instanceof EntityPlayer)
		{
			NetworkingAether.sendPacketToPlayer(message, (EntityPlayerMP) entity);
		}
	}

	@SideOnly(Side.CLIENT)
	public static void sendPacketToServer(IMessage message)
	{
		NetworkingAether.instance.sendToServer(message);
	}
}
