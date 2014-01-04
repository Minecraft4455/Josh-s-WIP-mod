package Joshcraft;

import net.minecraft.creativetab.CreativeTabs;
import Joshcraft.Powernet.Powernet;
import Joshcraft.blocks.BlockHandler;
import Joshcraft.configuration.config;
import Joshcraft.crafting.CraftingHandler;
import Joshcraft.items.ItemHandler;
import Joshcraft.res.Localization;
import Joshcraft.res.ModInfo;
import Joshcraft.res.SetCreativeTabs;
import Joshcraft.worldGen.WorldGenHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.name, version = ModInfo.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class JoshcraftMain{
       
	public static CreativeTabs tabsJoshCraftBlock = new CreativeTabJoshCraft(CreativeTabs.getNextID(), "tabBlocks");
	public static CreativeTabs tabsJoshCraftItems = new CreativeTabJoshCraftItems(CreativeTabs.getNextID(), "tabItems");
	
	
	@EventHandler
	public void preload(FMLPreInitializationEvent event){
			config.init(event.getSuggestedConfigurationFile());
	}
		
	@EventHandler
	public void load(FMLInitializationEvent event){
		ItemHandler.init();
		BlockHandler.init();
		WorldGenHandler.init();
		CraftingHandler.init();
		SetCreativeTabs.init();
		Powernet.init();
    }
	@EventHandler
	public void postload(FMLPostInitializationEvent event){
		
		Localization.init();
	}
}
