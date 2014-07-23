package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.lib.Names;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by ACharLuk on 23/07/2014.
 */
public class VoidSlab extends BlockSlab {
    public VoidSlab(boolean opaque, Material material) {
        super(opaque, material);
        this.setBlockName(Names.Blocks.voidSlab);
        this.setCreativeTab(VC2.getCreativeTabBlock());
    }

    @Override
    public String func_150002_b(int p_150002_1_) {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Strings.TEXTURELOC + Names.Blocks.voidBlock);
    }

}
