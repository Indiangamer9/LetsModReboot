package com.indiangamer9.letsmodreboot.init;

import com.indiangamer9.letsmodreboot.item.ItemLMRB;
import com.indiangamer9.letsmodreboot.item.ItemGem;
import com.indiangamer9.letsmodreboot.reference.Names;
import com.indiangamer9.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModItems
{
    public static final ItemLMRB gem = new ItemGem();

    public static void init()
    {
        GameRegistry.registerItem(gem, Names.Items.GEM);
    }
}