package com.github.konarjg.arcticraft.block;

import javax.annotation.Nullable;

import com.github.konarjg.arcticraft.block_entity.BlockEntityCrystalAssembler;
import com.github.konarjg.arcticraft.registry.BlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class BlockCrystalAssembler extends BaseEntityBlock
{
	public BlockCrystalAssembler() 
	{
		super(Properties.of(Material.METAL));
	}
	
	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) 
	{
		return type == BlockEntities.CRYSTAL_ASSEMBLER.get() ? BlockEntityCrystalAssembler::tick : null;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) 
	{
		return BlockEntities.CRYSTAL_ASSEMBLER.get().create(pos, state);
	}
}
