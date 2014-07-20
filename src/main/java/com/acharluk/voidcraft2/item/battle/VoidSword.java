package com.acharluk.voidcraft2.item.battle;

import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VoidSword extends ItemSword {

    public VoidSword(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Strings.TEXTURELOC + (super.getUnlocalizedName().substring(5)));
    }
}
