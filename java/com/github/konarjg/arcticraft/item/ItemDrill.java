package com.github.konarjg.arcticraft.item;

import java.util.List;

import com.github.konarjg.arcticraft.Main;
import com.github.konarjg.arcticraft.registry.Items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

public class ItemDrill extends DiggerItem
{
	public static final TagKey<Block> DRILL = BlockTags.create(new ResourceLocation(Main.MODID, "mineable/drill"));
	public static final TagKey<Block> NEEDS_CRYSTAL_TOOL = BlockTags.create(new ResourceLocation(Main.MODID, "needs_crystal_tool"));
	public static final Tier CRYSTAL = TierSortingRegistry.registerTier(new ForgeTier(6, 10000, 20, 10, 100, NEEDS_CRYSTAL_TOOL, () -> Ingredient.of(Items.CRYSTAL.get())), new ResourceLocation(Main.MODID, "crystal_tier"), List.of(Tiers.NETHERITE), List.of());
		
	public ItemDrill(Tier tier) 
	{
		super(2, 0.75f, tier, DRILL, new Properties());
	}
	
	@Override
	public float getDestroySpeed(ItemStack item, BlockState state) 
	{
		if (getTier() == Tiers.STONE)
			return 4f;
		else if (getTier() == Tiers.IRON)
			return 7f;
		else if (getTier() == Tiers.GOLD)
			return 10f;
		else if (getTier() == Tiers.DIAMOND)
			return 12f;
		else if (getTier() == Tiers.NETHERITE)
			return 15f;
		else if (getTier() == CRYSTAL)
			return 20f;
		
		return 2f;
	}
	
	@Override
	public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) 
	{
		if (state.is(DRILL))
			return TierSortingRegistry.isCorrectTierForDrops(getTier(), state);
		else if (state.is(BlockTags.MINEABLE_WITH_PICKAXE))
			return TierSortingRegistry.isCorrectTierForDrops(getTier(), state);
		
		return false;
	}
}
