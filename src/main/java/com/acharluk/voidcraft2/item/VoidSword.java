package com.acharluk.voidcraft2.item;

import com.acharluk.voidcraft2.lib.ItemName;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VoidSword extends ItemSword {

    public VoidSword() {
        super(ToolMaterial.EMERALD);
        this.setUnlocalizedName(ItemName.voidSword);
        this.setCreativeTab(CreativeTabs.tabBrewing);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Strings.RESOURCESPREFIX + (super.getUnlocalizedName().substring(5)));
    }

}
