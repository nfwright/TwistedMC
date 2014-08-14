package com.twistedmc.common.handlers;

import java.util.Iterator;
import java.util.ListIterator;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

public class RecipeHandler {

	public static void init(){
		removeCrafting();
		removeSmelting();
	}

	@SuppressWarnings({ "unchecked" })
	static void removeCrafting(){

		ListIterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().listIterator();
		while (iterator.hasNext())
			iterator.remove();
	}

	static void removeSmelting(){

		Iterator<?> iterator = FurnaceRecipes.smelting().getSmeltingList().entrySet().iterator();
		while(iterator.hasNext())
			iterator.remove();
	}
}