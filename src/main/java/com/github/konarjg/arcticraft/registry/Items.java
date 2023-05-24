package com.github.konarjg.arcticraft.registry;

import com.github.konarjg.arcticraft.Main;
import com.github.konarjg.arcticraft.item.ItemDrill;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Items 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> HARD_SNOW = ITEMS.register("hard_snow", () -> new BlockItem(Blocks.HARD_SNOW.get(), new Item.Properties()));
	public static final RegistryObject<Item> HARD_ICE = ITEMS.register("hard_ice", () -> new BlockItem(Blocks.HARD_ICE.get(), new Item.Properties()));

	public static final RegistryObject<Item> STONE_DRILL = ITEMS.register("stone_drill", () -> new ItemDrill(Tiers.STONE));
	public static final RegistryObject<Item> IRON_DRILL = ITEMS.register("iron_drill", () -> new ItemDrill(Tiers.IRON));
}
