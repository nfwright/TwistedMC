package com.wrightmods.ore.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.item.ItemStack;

import com.wrightmods.ore.NFWrightOre;

public class BlockOpalOre extends BlockOre{

	public static ItemStack dropBlockAsItem() {
		return new ItemStack(NFWrightOre.DarkOpalGem);
	}
}
