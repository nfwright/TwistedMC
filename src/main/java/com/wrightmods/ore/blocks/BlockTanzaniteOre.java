package com.wrightmods.ore.blocks;

import com.wrightmods.ore.NFWrightOre;

import net.minecraft.block.BlockOre;
import net.minecraft.item.ItemStack;

public class BlockTanzaniteOre extends BlockOre{

	public static ItemStack dropBlockAsItem() {
		return new ItemStack(NFWrightOre.TanzaniteGem);
	}

}
