package com.indiangamer9.letsmodreboot.creativetab;

import com.indiangamer9.letsmodreboot.init.ModItems;
import com.indiangamer9.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MODID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.gem;
        }
    };
}