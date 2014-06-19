package com.acharluk.voidcraft2.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VItem {

    //TODO Battle Items

    public static Item void_ingot;
    public static Item void_sword;

    public static void init() {
        void_ingot = new VoidIngot();
        void_sword = new VoidSword();
        GameRegistry.registerItem(void_sword, void_sword.getUnlocalizedName());
    }

}
