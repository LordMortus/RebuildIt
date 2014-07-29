package com.lordmortus.rebuildit.creativetab;

import com.lordmortus.rebuildit.init.ModItems;
import com.lordmortus.rebuildit.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Lord Mortus on 7/28/2014.
 */
public class CreativeTabRBIT
{
    public static final CreativeTabs RBIT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.glue;
        }

    };
}
