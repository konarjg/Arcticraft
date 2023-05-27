package com.github.konarjg.arcticraft.registry;

import com.github.konarjg.arcticraft.Main;
import com.github.konarjg.arcticraft.item.ItemDrill;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Items 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	//Items
	public static final RegistryObject<Item> ICE_SHARD = ITEMS.register("ice_shard", () -> new Item(new Properties()));
	public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard", () -> new Item(new Properties().stacksTo(32)));
	public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", () -> new Item(new Properties()));
	
	//Blocks
	public static final RegistryObject<Item> HARD_SNOW = ITEMS.register("hard_snow", () -> new BlockItem(Blocks.HARD_SNOW.get(), new Item.Properties()));
	public static final RegistryObject<Item> HARD_ICE = ITEMS.register("hard_ice", () -> new BlockItem(Blocks.HARD_ICE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRYSTAL_ORE = ITEMS.register("crystal_ore", () -> new BlockItem(Blocks.CRYSTAL_ORE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRYSTAL_BLOCK = ITEMS.register("crystal_block", () -> new BlockItem(Blocks.CRYSTAL_BLOCK.get(), new Item.Properties()));
	
	//Tools
	public static final RegistryObject<Item> STONE_DRILL = ITEMS.register("stone_drill", () -> new ItemDrill(Tiers.STONE));
	public static final RegistryObject<Item> IRON_DRILL = ITEMS.register("iron_drill", () -> new ItemDrill(Tiers.IRON));
	public static final RegistryObject<Item> GOLDEN_DRILL = ITEMS.register("golden_drill", () -> new ItemDrill(Tiers.GOLD));
	public static final RegistryObject<Item> DIAMOND_DRILL = ITEMS.register("diamond_drill", () -> new ItemDrill(Tiers.DIAMOND));
	public static final RegistryObject<Item> NETHERITE_DRILL = ITEMS.register("netherite_drill", () -> new ItemDrill(Tiers.NETHERITE));
	public static final RegistryObject<Item> CRYSTAL_DRILL = ITEMS.register("crystal_drill", () -> new ItemDrill(ItemDrill.CRYSTAL));
}
