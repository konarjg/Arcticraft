package com.github.konarjg.arcticraft.registry;

import com.github.konarjg.arcticraft.Main;
import com.github.konarjg.arcticraft.block.BlockCrystalAssembler;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);
	
	public static final RegistryObject<Block> HARD_SNOW = BLOCKS.register("hard_snow", () -> new Block(Properties.of(Material.SNOW).requiresCorrectToolForDrops().destroyTime(2f)));
	public static final RegistryObject<Block> HARD_ICE = BLOCKS.register("hard_ice", () -> new Block(Properties.of(Material.ICE).requiresCorrectToolForDrops().destroyTime(3f)));
	public static final RegistryObject<Block> CRYSTAL_ORE = BLOCKS.register("crystal_ore", () -> new Block(Properties.of(Material.STONE).requiresCorrectToolForDrops().destroyTime(5f)));
	public static final RegistryObject<Block> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", () -> new Block(Properties.of(Material.AMETHYST).requiresCorrectToolForDrops().destroyTime(5f)));
	public static final RegistryObject<Block> CRYSTAL_ASSEMBLER = BLOCKS.register("crystal_assembler", () -> new BlockCrystalAssembler());

}
