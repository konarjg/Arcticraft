package com.github.konarjg.arcticraft.item;

import com.github.konarjg.arcticraft.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.TierSortingRegistry;

public class ItemDrill extends DiggerItem
{
	public ItemDrill(Tier tier) 
	{
		super(2, 0.75f, tier, Main.DRILL, new Properties());
	}
	
	@Override
	public float getDestroySpeed(ItemStack item, BlockState state) 
	{
		if (getTier() == Tiers.STONE)
			return 3f;
		else if (getTier() == Tiers.IRON)
			return 6f;
		
		return 1.5f;
	}
	
	@Override
	public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) 
	{
		if (state.is(Main.DRILL) || state.is(BlockTags.MINEABLE_WITH_PICKAXE))
		{
			Main.LOGGER.debug("XD");
			return TierSortingRegistry.isCorrectTierForDrops(getTier(), state);
		}
		return false;
	}
}
