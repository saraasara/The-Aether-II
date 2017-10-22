package com.gildedgames.orbis.client.gui.util.directory.nodes;

import com.gildedgames.aether.common.AetherCore;
import com.gildedgames.aether.common.util.helpers.FileHelper;
import com.gildedgames.orbis.client.gui.data.DropdownElement;
import com.gildedgames.orbis.client.gui.data.IDropdownElement;
import com.gildedgames.orbis.client.gui.data.directory.IDirectoryNavigator;
import com.gildedgames.orbis.client.gui.data.directory.IDirectoryNode;
import com.gildedgames.orbis.client.gui.util.GuiDropdownList;
import com.gildedgames.orbis.client.gui.util.GuiTexture;
import com.gildedgames.orbis.client.util.rect.Dim2D;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BlueprintNode implements IDirectoryNode
{
	private static final ResourceLocation TEXTURE = AetherCore.getResource("orbis/navigator/blueprint_file.png");

	private final File file;

	private final GuiTexture icon = new GuiTexture(Dim2D.build().area(32).flush(), TEXTURE);

	public BlueprintNode(final File file)
	{
		if (file.isDirectory())
		{
			throw new RuntimeException("File given to BlueprintNode is a directory! Aborting.");
		}

		this.file = file;
	}

	@Override
	public File getFile()
	{
		return this.file;
	}

	@Override
	public GuiTexture getIcon()
	{
		return this.icon;
	}

	@Override
	public void onOpen(final IDirectoryNavigator navigator)
	{

	}

	@Override
	public void onDelete(final IDirectoryNavigator navigator)
	{

	}

	@Override
	public Collection<IDropdownElement> getRightClickElements(final IDirectoryNavigator navigator)
	{
		final List<IDropdownElement> elements = Lists.newArrayList();

		elements.add(new DropdownElement(new TextComponentString("Delete"))
		{
			@Override
			public void onClick(final GuiDropdownList list, final EntityPlayer player)
			{
				final File file = BlueprintNode.this.file;

				if (file.isDirectory())
				{
					FileHelper.deleteDirectory(file);
				}
				else
				{
					file.delete();
				}

				list.setDropdownElements(Collections.emptyList());
				list.setVisible(false);

				navigator.refresh();
			}
		});

		elements.add(new DropdownElement(new TextComponentString("Rename"))
		{
			@Override
			public void onClick(final GuiDropdownList list, final EntityPlayer player)
			{

			}
		});

		elements.add(new DropdownElement(new TextComponentString("Close"))
		{
			@Override
			public void onClick(final GuiDropdownList list, final EntityPlayer player)
			{
				list.setDropdownElements(Collections.emptyList());
			}
		});

		return elements;
	}
}
