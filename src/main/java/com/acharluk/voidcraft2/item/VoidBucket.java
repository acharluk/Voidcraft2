package com.acharluk.voidcraft2.item;

import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBucket;

/**
 * Created by ACharLuk on 15/07/2014.
 */
public class VoidBucket extends ItemBucket {
    public VoidBucket(Block p_i45331_1_) {
        super(p_i45331_1_);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Strings.TEXTURELOC + (super.getUnlocalizedName().substring(5)));
    }

}
