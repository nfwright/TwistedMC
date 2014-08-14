package com.twistedmc.common.handlers;

import java.util.ListIterator;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeHandler {

	public static void init(){
		removeRecipes();
	}

	@SuppressWarnings({ "unchecked" })
	static void removeRecipes()
	{
		ListIterator<IRecipe> iterator = CraftingManager.getInstance().getRecipeList().listIterator();
		while (iterator.hasNext())
		{
			iterator.remove();
		}
	}
}