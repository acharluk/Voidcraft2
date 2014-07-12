package com.acharluk.voidcraft2.item.battle;

import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by ACharLuk on 19/06/2014.
 */
public class VoidPickaxe extends ItemPickaxe {
    public VoidPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Strings.RESOURCESPREFIX + (super.getUnlocalizedName().substring(5)));
    }

}
