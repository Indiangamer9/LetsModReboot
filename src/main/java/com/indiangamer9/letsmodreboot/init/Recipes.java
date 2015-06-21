package com.indiangamer9.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gem), "sss", "sss", "sss", 's', "stickWood"));;
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.compressedGem), "sss", "sss", "sss", 's', new ItemStack(ModItems.gem)));
    }
}