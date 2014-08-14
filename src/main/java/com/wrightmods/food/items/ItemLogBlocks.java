package com.wrightmods.food.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks extends ItemBlock{

	public static final String[] logs = new String[] {"Banana"};
	
	public ItemLogBlocks(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= logs.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + logs[i];
	}

}
// http://www.youtube.com/watch?v=qgsZK60grrk&index=3&list=UUCZTT2mbRpOPjIxd5qM9b8A 21:01