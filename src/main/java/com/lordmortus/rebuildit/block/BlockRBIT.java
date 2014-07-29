package com.lordmortus.rebuildit.block;

import com.lordmortus.rebuildit.creativetab.CreativeTabRBIT;
import com.lordmortus.rebuildit.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


/**
 * Created by Lord Mortus on 7/28/2014.
 */
public class BlockRBIT extends Block
{
    public BlockRBIT(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabRBIT.RBIT_TAB);
    }
    public BlockRBIT()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
