package com.wrightmods.food.items;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class InfinityEnergy implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		return 25600;
	}

}
