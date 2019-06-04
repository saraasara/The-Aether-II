package com.gildedgames.aether.common.travellers_guidebook;

import com.gildedgames.aether.api.player.conditions.IConditionResolution;
import com.gildedgames.aether.api.player.conditions.IPlayerCondition;
import com.gildedgames.aether.api.travellers_guidebook.ITGDefinition;
import com.gildedgames.aether.api.travellers_guidebook.ITGEntry;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Map;

public class TGDefinition implements ITGDefinition
{
	@SerializedName("conditions")
	private final Collection<IPlayerCondition> conditions;

	@SerializedName("conditionResolution")
	private final IConditionResolution conditionResolution;

	@SerializedName("entries")
	private final Map<String, ITGEntry> entries;

	public TGDefinition(final Collection<IPlayerCondition> conditions, final IConditionResolution conditionResolution,
			final Map<String, ITGEntry> entries)
	{
		this.conditions = conditions;
		this.conditionResolution = conditionResolution;
		this.entries = entries;
	}

	@Nonnull
	@Override
	public Collection<IPlayerCondition> conditions()
	{
		return this.conditions;
	}

	@Nonnull
	@Override
	public IConditionResolution conditionResolution()
	{
		return this.conditionResolution;
	}

	@Nonnull
	@Override
	public Map<String, ITGEntry> entries()
	{
		return this.entries;
	}
}
