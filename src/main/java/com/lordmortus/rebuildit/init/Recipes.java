package com.lordmortus.rebuildit.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Lord Mortus on 7/29/2014.
 */
public class Recipes
{
    public static void init()
    {
        //Vanilla Shaped
        //GameRegistry.addRecipe(new ItemStack(ModItems.glue), "   ", " s ", "   ", new ItemStack(Items.stick));
        //the ""'s equal the crafting grid - s is just a token that represents what to use (in this case, a stick)
        //Vanilla Shapeless
        //GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.resin), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue), new ItemStack(ModItems.glue) ,new ItemStack(ModItems.glue));
        // This is a 3x3 recipe (all nine squares with glue = 1 resin
        //Shaped Ore Dictionary Recipe
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.glue), "   ", " s ", "   ", "stickWood"));
        //Same as Vanilla but you can now use ANY equal ore dictionary item (in this case s = any stickWood
        //Shapeless Ore Dictionary Recipe
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.resin), "stickWood", new ItemStack(ModItems.glue)));
        //Here you can use stickWood as well as any other specific item to get the result
    }
}
