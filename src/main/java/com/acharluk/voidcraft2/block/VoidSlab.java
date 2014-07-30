package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.lib.Names;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.World;

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

    @SideOnly(Side.CLIENT)
    private static boolean func_150003_a(Block p_150003_0_)
    {
        return p_150003_0_ == VBlock.voidSlab;
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return func_150003_a(this) ? Item.getItemFromBlock(this) : (this == VBlock.voidSlab ? Item.getItemFromBlock(VBlock.voidSlab) : Item.getItemFromBlock(VBlock.voidSlab));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(Strings.TEXTURELOC + Names.Blocks.voidBlock);
    }

}
