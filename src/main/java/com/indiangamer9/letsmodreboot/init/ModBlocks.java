package com.indiangamer9.letsmodreboot.init;

import com.indiangamer9.letsmodreboot.block.BlockCompressedGem;
import com.indiangamer9.letsmodreboot.block.BlockLMRB;
import com.indiangamer9.letsmodreboot.reference.Names;
import com.indiangamer9.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks
{
    public static final BlockLMRB compressedGem = new BlockCompressedGem();

    public static void init()
    {
        GameRegistry.registerBlock(compressedGem, Names.Blocks.COMPRESSED_GEM);
    }
//    public static final BlockLMRB flag = new BlockFlag();

    //   public static void init()
    //   {
    //       GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    //   }
}