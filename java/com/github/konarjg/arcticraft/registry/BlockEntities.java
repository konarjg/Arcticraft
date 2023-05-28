package com.github.konarjg.arcticraft.registry;

import com.github.konarjg.arcticraft.Main;
import com.github.konarjg.arcticraft.block_entity.BlockEntityCrystalAssembler;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities 
{
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Main.MODID);
	
	public static final RegistryObject<BlockEntityType<BlockEntityCrystalAssembler>> CRYSTAL_ASSEMBLER = BLOCK_ENTITIES.register("crystal_assembler", () -> BlockEntityType.Builder.of(BlockEntityCrystalAssembler::new, Blocks.CRYSTAL_ASSEMBLER.get()).build(null));
}
