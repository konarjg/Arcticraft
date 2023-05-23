package com.github.konarjg.arcticraft.registry;

import com.github.konarjg.arcticraft.Main;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Items 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> HARD_SNOW = ITEMS.register("hard_snow", () -> new BlockItem(Blocks.HARD_SNOW.get(), new Item.Properties()));
}
