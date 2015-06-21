package com.indiangamer9.letsmodreboot;

import com.indiangamer9.letsmodreboot.init.ModItems;
import com.indiangamer9.letsmodreboot.init.Recipes;
import cpw.mods.fml.common.Mod;
import com.indiangamer9.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.indiangamer9.letsmodreboot.proxy.IProxy;

@Mod(modid = Reference.MODID , name = Reference.NAME , version = Reference.VERSION)
public class letsmodreboot
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.registerKeyBindings();
        proxy.registerRenderInfo();
        ModItems.init();
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
