package com.lordmortus.rebuildit.init;

import com.lordmortus.rebuildit.block.BlockRBIT;
import com.lordmortus.rebuildit.block.BlockResin;
import com.lordmortus.rebuildit.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Lord Mortus on 7/28/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockRBIT resin = new BlockResin();

    public static void init()
    {
        GameRegistry.registerBlock(resin, "resin");
    }
}
