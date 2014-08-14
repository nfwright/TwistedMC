package com.wrightmods.ore;

import com.wrightmods.food.NFWrightFood;
import com.wrightmods.food.blocks.Crate;
import com.wrightmods.ore.blocks.BlockOpalOre;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

//import com.example.wenis.blocks.processor;
//import com.example.wenis.tileentity.TileEntityprocessor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NFWrightOre
{	
    public static CreativeTabs MoOre = new CreativeTabs("WrightOre"){
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem() {
    		return NFWrightFood.Rock;
    	}
    };
    
    public static Item CobaltIngot;
    public static Item ThalliumIngot;
    public static Item LeadIngot;
    public static Item BismuthIngot;
    public static Item TungstenIngot;
    public static Item ActiniumIngot;
    public static Item ProtactiniumIngot;
    public static Item TanzaniteGem;
    public static Item DarkOpalGem;
    public static Item JadeiteGem;
    
    public static Block CobaltOre;
    public static Block ThalliumOre;
    public static Block LeadOre;
    public static Block BismuthOre;
    public static Block TungstenOre;
    public static Block ActiniumOre;
    public static Block ProtactiniumOre;
    public static Block TanzaniteOre;
    public static Block DarkOpalOre;
    public static Block JadeiteOre;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
   	 	 CobaltOre = new BlockOre().setBlockName("CobaltOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Cobalt");
   	 	 ThalliumOre = new BlockOre().setBlockName("ThalliumOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Thallium");
   	 	 LeadOre = new BlockOre().setBlockName("LeadOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Lead");
   	 	 BismuthOre = new BlockOre().setBlockName("BismuthOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Bismuth");
   	 	 TungstenOre = new BlockOre().setBlockName("TungstenOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Tungsten");
   	 	 ActiniumOre = new BlockOre().setBlockName("ActiniumOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Actinium");
   	 	 ProtactiniumOre = new BlockOre().setBlockName("ProtactiniumOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Protactinium");
   	 	 TanzaniteOre = new BlockTanzaniteOre().setBlockName("TanzaniteOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Tanzanite");
   	 	 DarkOpalOre = new BlockOpalOre().setBlockName("DarkOpalOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:DarkOpal");
   	 	 JadeiteOre = new BlockJadeOre().setBlockName("JadeiteOre").setCreativeTab(NFWrightOre.MoOre).setBlockTextureName("Ores:Jadeite");
    	
    	 CobaltIngot = new Item().setUnlocalizedName("CobaltIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Cobalt");
    	 ThalliumIngot = new Item().setUnlocalizedName("ThalliumIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Thallium");
    	 LeadIngot = new Item().setUnlocalizedName("LeadIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Lead");
    	 BismuthIngot = new Item().setUnlocalizedName("BismuthIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Bismuth");
    	 TungstenIngot = new Item().setUnlocalizedName("TungstenIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Tungsten");
    	 ActiniumIngot = new Item().setUnlocalizedName("ActiniumIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Actinium");
    	 ProtactiniumIngot = new Item().setUnlocalizedName("ProtactiniumIngot").setCreativeTab(NFWrightOre.MoOre).setTextureName("ingots:Protactinium");
    	 TanzaniteGem = new Item().setUnlocalizedName("TanzaniteGem").setCreativeTab(NFWrightOre.MoOre).setTextureName("Gems:Tanzanite");
    	 DarkOpalGem = new Item().setUnlocalizedName("DarkOpalGem").setCreativeTab(NFWrightOre.MoOre).setTextureName("Gems:DarkOpal");
    	 JadeiteGem = new Item().setUnlocalizedName("JadeiteGem").setCreativeTab(NFWrightOre.MoOre).setTextureName("Gems:Jadeite");
    	 
    	 GameRegistry.registerItem(CobaltIngot, "CobaltIngot");
    	 GameRegistry.registerItem(ThalliumIngot, "ThalliumIngot");
    	 GameRegistry.registerItem(LeadIngot, "LeadIngot");
    	 GameRegistry.registerItem(BismuthIngot, "BismothIngot");
    	 GameRegistry.registerItem(TungstenIngot, "TungstenIngot");
    	 GameRegistry.registerItem(ActiniumIngot, "ActiniumIngot");
    	 GameRegistry.registerItem(ProtactiniumIngot, "ProactiniumIngot");
    	 GameRegistry.registerItem(TanzaniteGem, "TanzaniteIngot");
    	 GameRegistry.registerItem(DarkOpalGem, "DarkOpalIngot");
    	 GameRegistry.registerItem(JadeiteGem, "JadeiteIngot");
    	 
    	 GameRegistry.registerBlock(CobaltOre, "CobaltOre");
    	 GameRegistry.registerBlock(ThalliumOre, "ThalliumOre");
    	 GameRegistry.registerBlock(LeadOre, "LeadOre");
    	 GameRegistry.registerBlock(BismuthOre, "BismothOre");
    	 GameRegistry.registerBlock(TungstenOre, "TungstenOre");
    	 GameRegistry.registerBlock(ActiniumOre, "ActiniumOre");
    	 GameRegistry.registerBlock(ProtactiniumOre, "ProactiniumOre");
    	 GameRegistry.registerBlock(TanzaniteOre, "TanzaniteOre");
    	 GameRegistry.registerBlock(DarkOpalOre, "DarkOpalOre");
    	 GameRegistry.registerBlock(JadeiteOre, "JadeiteOre");
    	 
    	//Furnace Recipes
    	GameRegistry.addSmelting(NFWrightOre.CobaltOre, new ItemStack(NFWrightOre.CobaltIngot), 1f);
    	GameRegistry.addSmelting(NFWrightOre.ThalliumOre, new ItemStack(NFWrightOre.ThalliumIngot), 1f);
    	GameRegistry.addSmelting(NFWrightOre.LeadOre, new ItemStack(NFWrightOre.LeadIngot), 1f);
    	GameRegistry.addSmelting(NFWrightOre.BismuthOre, new ItemStack(NFWrightOre.BismuthIngot), 1f);
    	GameRegistry.addSmelting(NFWrightOre.TungstenOre, new ItemStack(NFWrightOre.TungstenIngot), 1f);
    	GameRegistry.addSmelting(NFWrightOre.ActiniumOre, new ItemStack(NFWrightOre.ActiniumIngot), 1f);
    	GameRegistry.addSmelting(NFWrightOre.ProtactiniumOre, new ItemStack(NFWrightOre.CobaltIngot), 1f);
    }

	public void Init(FMLInitializationEvent event){
    }

    
}
