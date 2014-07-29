package com.lordmortus.rebuildit.init;

import com.lordmortus.rebuildit.item.ItemGlue;
import com.lordmortus.rebuildit.item.ItemRBIT;
import com.lordmortus.rebuildit.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Lord Mortus on 7/28/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemRBIT glue = new ItemGlue();

    public static void init()
    {
        GameRegistry.registerItem(glue, "glue");
    }
}
