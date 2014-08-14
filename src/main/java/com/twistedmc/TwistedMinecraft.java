package com.twistedmc;

import com.twistedmc.common.CommonProxy;
import com.twistedmc.common.handlers.RecipeHandler;
import com.twistedmc.common.lib.CraftingRecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = TwistedMinecraft.NAME, modid = TwistedMinecraft.MODID, version = TwistedMinecraft.VERSION)
public class TwistedMinecraft {

	public static final String NAME = "Twisted Minecraft";
	public static final String MODID = "twistedmc";
	public static final String VERSION = "0.0.1";

	@SidedProxy(clientSide = "com.twistedmc.client.ClientProxy",
			serverSide = "com.twistedmc.common.CommonProxy")
	public static CommonProxy proxy;

	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit();
		RecipeHandler.init();
		CraftingRecipes.registerRecipes();
	}

	public void init(FMLInitializationEvent event){
		proxy.init();
		proxy.registerRenderThings(); //Can remove this, we might not do any special rendering anyways
	}

	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit();
	}
}