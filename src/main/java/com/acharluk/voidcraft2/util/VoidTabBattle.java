package com.acharluk.voidcraft2.util;

import com.acharluk.voidcraft2.item.VItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by ACharLuk on 19/06/2014.
 */
public class VoidTabBattle extends CreativeTabs {
    public VoidTabBattle(int id,String modid) {
        super(id, modid);
    }

    @Override
    public Item getTabIconItem() {
        return VItem.voidSword;
    }
}
