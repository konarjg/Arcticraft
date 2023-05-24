package com.github.konarjg.arcticraft.registry;

import com.github.konarjg.arcticraft.Main;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);
	
	public static final RegistryObject<Block> HARD_SNOW = BLOCKS.register("hard_snow", () -> new Block(Properties.of(Material.ICE).requiresCorrectToolForDrops().destroyTime(2f)));
	public static final RegistryObject<Block> HARD_ICE = BLOCKS.register("hard_ice", () -> new Block(Properties.of(Material.ICE_SOLID).requiresCorrectToolForDrops().destroyTime(3f)));
}
