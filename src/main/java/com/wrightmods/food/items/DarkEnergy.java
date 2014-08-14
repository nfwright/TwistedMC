package com.wrightmods.food.items;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class DarkEnergy implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		return 12800;
	}
}
