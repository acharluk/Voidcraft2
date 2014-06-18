package com.acharluk.voidcraft2.item;

import com.acharluk.voidcraft2.lib.ItemName;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VoidIngot extends ItemVC2 {

    public VoidIngot() {
        this.setUnlocalizedName(ItemName.voidIngot);
        this.setCreativeTab(CreativeTabs.tabBrewing);
        ItemVC2.register(this);
    }

}
