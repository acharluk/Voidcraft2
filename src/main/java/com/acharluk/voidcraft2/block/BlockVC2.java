package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class BlockVC2 extends Block {

    public BlockVC2(Material material)
    {
        super(material);
        this.setCreativeTab(VC2.getCreativeTabBlock());
    }

    public BlockVC2()
    {
        this(Material.rock);
        this.setCreativeTab(VC2.getCreativeTabBlock());
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Strings.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Strings.TEXTURELOC + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static void register(BlockVC2 block)
    {
        GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
    }

}
