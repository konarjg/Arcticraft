package com.github.konarjg.arcticraft.block_entity;

import com.github.konarjg.arcticraft.registry.BlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityCrystalAssembler extends BlockEntity
{
	private final int ASSEMBLE_TIME = 10;
	private int timeToAssemble;
	private final ItemStack[] CRYSTALS = new ItemStack[2];
	private ItemStack output;
	
	
	public BlockEntityCrystalAssembler(BlockPos pos, BlockState state) 
	{
		super(BlockEntities.CRYSTAL_ASSEMBLER.get(), pos, state);
		CRYSTALS[0] = ItemStack.EMPTY;
		CRYSTALS[1] = ItemStack.EMPTY;
		output = ItemStack.EMPTY;
	}
	
	public ItemStack getRecipe()
	{
		return ItemStack.EMPTY;
	}
	
	public void start() throws Exception
	{
		if (CRYSTALS[0] == ItemStack.EMPTY || CRYSTALS[1] == ItemStack.EMPTY)
			throw new Exception("Needs two crystals");
		
		timeToAssemble = ASSEMBLE_TIME;
	}

	public static <T extends BlockEntity> void tick(Level level, BlockPos pos, BlockState state, T entityGeneral) 
	{
		BlockEntityCrystalAssembler entity = (BlockEntityCrystalAssembler) entityGeneral;
		
		if (entity.timeToAssemble > 0)
			--entity.timeToAssemble;
		else
		{
			entity.CRYSTALS[0].setCount(entity.CRYSTALS[0].getCount() - 1);
			entity.CRYSTALS[1].setCount(entity.CRYSTALS[1].getCount() - 1);
			entity.output = entity.getRecipe();
			entity.timeToAssemble = 0;
		}
	}

}
