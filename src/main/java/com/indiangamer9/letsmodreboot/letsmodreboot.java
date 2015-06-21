package com.indiangamer9.letsmodreboot;

import com.indiangamer9.letsmodreboot.init.ModBlocks;
import com.indiangamer9.letsmodreboot.init.ModItems;
import com.indiangamer9.letsmodreboot.init.Recipes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import com.indiangamer9.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.indiangamer9.letsmodreboot.proxy.IProxy;
import com.indiangamer9.letsmodreboot.handler.ConfigurationHandler;

@Mod(modid = Reference.MODID , name = Reference.NAME , version = Reference.VERSION)
public class letsmodreboot
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();
        proxy.registerRenderInfo();

        ModItems.init();
        ModBlocks.init();
        Recipes.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
