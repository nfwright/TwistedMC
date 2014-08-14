package com.wrightmods.food;

import com.wrightmods.food.blocks.Crate;

import net.minecraft.block.Block;
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

@Mod(modid = NFWrightFood.MODID, version = NFWrightFood.VERSION)
//day 3, alpha
public class NFWrightFood
{	
	
	//Prelude to the masterpiece
    public static final String MODID = "WrightFood";
    public static final String VERSION = "0.3";
    
    @Instance(MODID)
    public static NFWrightFood instance;
    
    //CreativeTabs
    public static CreativeTabs MoFood = new CreativeTabs("WrightFood"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.diamond_hoe;
		}
    };
    public static CreativeTabs MoOre = new CreativeTabs("WrightOre"){
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem() {
    		return NFWrightFood.Rock;
    	}
    };
    
    
    //items
    public static Item BaconSalad;
    public static Item CeaserSalad;
    
    public static Item Breadsticks;
    
    public static Item DoubleQuarterPounder;
    public static Item CheeseBurger;
    public static Item Bun;
    
    public static Item Nacho;
    public static Item Nachos;
    public static Item Chip;
    public static Item Cheese;
    
    public static Item Tomato;
    public static Item Cabbage;
    public static Item Corn;
    public static Item Celery;
    public static Item Strawberry;
    public static Item Blueberry;
    public static Item Blackberry;
    public static Item Raspberry;
    public static Item Coconut;
    
    public static Item Rock;
    
    public static Item CobaltIngot;
    public static Item ThalliumIngot;
    public static Item LeadIngot;
    public static Item BismuthIngot;
    public static Item TungstenIngot;
    public static Item MercuryIngot;
    public static Item ActiniumIngot;
    public static Item ProtactiniumIngot;
    public static Item TanzaniteGem;
    public static Item DarkOpalGem;
    public static Item JadeiteGem;
    
    //blocks
    public static Block CobaltOre;
    public static Block ThalliumOre;
    public static Block LeadOre;
    public static Block BismuthOre;
    public static Block TungstenOre;
    public static Block MercuryOre;
    public static Block ActiniumOre;
    public static Block ProtactiniumOre;
    public static Block TanzaniteOre;
    public static Block DarkOpalOre;
    public static Block Jadeite;
    
    @EventHandler

    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	//Define Blocks
//    	Crate = new Crate().setBlockName("Crate").setCreativeTab(CreativeTabs.tabTransport);
    	
    	//Define Items
    	CobaltIngot = new Item().setUnlocalizedName("CobaltIngot").setCreativeTab(NFWrightFood.MoFood).setTextureName("ingots:Cobalt");
    	DoubleQuarterPounder = new ItemFood(28, false).setUnlocalizedName("DoubleQuarterPounder").setCreativeTab(NFWrightFood.MoFood).setTextureName("DoubleQuarterPounder");
    	Breadsticks = new ItemFood(18, false).setUnlocalizedName("Breadsticks").setCreativeTab(NFWrightFood.MoFood).setTextureName("Breadstick");
    	BaconSalad = new ItemSoup(10).setUnlocalizedName("BaconSalad").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:BaconSalad");
    	CeaserSalad = new ItemSoup(8).setUnlocalizedName("CeaserSalad").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:CeaserSalad");
    	Nacho = new ItemFood(6, false).setUnlocalizedName("Nacho").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Nacho");
    	Nachos = new ItemFood(18, false).setUnlocalizedName("Nachos").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Nachos");
    	Chip = new ItemFood(1, false).setUnlocalizedName("Chip").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Chip");
    	Cheese = new ItemFood(3, false).setUnlocalizedName("Cheese").setCreativeTab(NFWrightFood.MoFood).setTextureName("food" + ":Cheese");
    	CheeseBurger = new ItemFood(20, false).setUnlocalizedName("CheeseBurger").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Hamburger"); 
    	Bun = new Item().setUnlocalizedName("Bun").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:bun");
    	Rock = new Rock(-5, false).setUnlocalizedName("Rock").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Rock");
    	Tomato = new ItemFood(4, false).setUnlocalizedName("Tomato").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Tomato");
    	Cabbage = new ItemFood(4, false).setUnlocalizedName("Cabbage").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Cabbage");
    	Corn = new ItemFood(4, false).setUnlocalizedName("Corn").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Corn");
    	Celery = new ItemFood(4, false).setUnlocalizedName("Celery").setCreativeTab(NFWrightFood.MoFood).setTextureName("food:Celery");
    	
    	//Register Items
    	GameRegistry.registerItem(Celery, "Celery");
    	GameRegistry.registerItem(Corn, "Corn");
    	GameRegistry.registerItem(Breadsticks, "Breadsticks");
    	GameRegistry.registerItem(DoubleQuarterPounder, "DoubleQuarterPounder");
    	GameRegistry.registerItem(BaconSalad, "BaconSalad");
    	GameRegistry.registerItem(CeaserSalad, "CeaserSalad");
    	GameRegistry.registerItem(Nacho, "Nacho");
    	GameRegistry.registerItem(Nachos, "Nachos");
    	GameRegistry.registerItem(Chip, "Chip");
    	GameRegistry.registerItem(Cheese, "Cheese");
    	GameRegistry.registerItem(Bun, "Bun");
    	GameRegistry.registerItem(CheeseBurger, "CheeseBurger");
    	GameRegistry.registerItem(Rock, "Rock");
    	GameRegistry.registerItem(Tomato, "Tomato");
    	
    	//Register Blocks
   	
    	//recipes
    	GameRegistry.addRecipe(new ItemStack(NFWrightFood.BaconSalad), new Object[]{
    	" S ",
    	" P ",
    	" B ",
    	'S', Items.wheat_seeds, 'P', Items.cooked_porkchop, 'B', Items.bowl
    	});
    	GameRegistry.addRecipe(new ItemStack(NFWrightFood.Cheese), new Object[]{
    	" m ",
    	" m ",
    	'm', Items.milk_bucket
    	});
    	GameRegistry.addRecipe(new ItemStack(NFWrightFood.Nacho, 2), new Object[]{
    	" S ",
    	" P ",
    	" B ",
    	'S', NFWrightFood.Cheese, 'P', NFWrightFood.Chip, 'B', Items.cooked_beef
    	});
    	GameRegistry.addRecipe(new ItemStack(NFWrightFood.Nachos), new Object[]{
    	"SSS",
    	'S', NFWrightFood.Nacho
    	});
    	GameRegistry.addRecipe(new ItemStack(NFWrightFood.BaconSalad), new Object[]{
    	" S ",
    	" P ",
    	" B ",
    	'S', Items.cooked_porkchop, 'P', Items.wheat_seeds, 'B', Items.bowl
    	});
    	GameRegistry.addRecipe(new ItemStack(NFWrightFood.CeaserSalad), new Object[]{
    	" S ",
    	" P ",
    	" B ",
    	'S', Items.cooked_porkchop, 'P', Items.wheat_seeds, 'B', Items.bowl
    	});
    	

    	//Furnace Recipes
    	
    	GameRegistry.addSmelting(Items.wheat, new ItemStack(Chip, 16), 15f);
    	
    	//register dark energy as fuel
    	
//    	GameRegistry.registerFuelHandler(new com.example.wenis.items.DarkEnergy());
    }

    public void Init(FMLInitializationEvent event){
    }

    
}
