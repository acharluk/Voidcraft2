package com.acharluk.voidcraft2.item;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.item.battle.*;
import com.acharluk.voidcraft2.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VItem {

    public static final Item.ToolMaterial VOID = EnumHelper.addToolMaterial("VOID", 3, 1192, 320.0F, 170.0F, 32);

    public static Item voidIngot;
    public static Item voidShard;

    public static Item voidSword;
    public static Item voidPickaxe;
    public static Item voidShovel;
    public static Item voidAxe;
    public static Item voidHoe;
    public static Item voidSickle;


    public static void init() {
        voidIngot = new VoidIngot();
        voidShard = new VoidShard();


        voidSword = new VoidSword(VItem.VOID).setUnlocalizedName(Names.Items.voidSword).setCreativeTab(VC2.getCreativeTabBattle());
        voidPickaxe = new VoidPickaxe(VItem.VOID).setUnlocalizedName(Names.Items.voidPickaxe).setCreativeTab(VC2.getCreativeTabBattle());
        voidShovel = new VoidShovel(VItem.VOID).setUnlocalizedName(Names.Items.voidShovel).setCreativeTab(VC2.getCreativeTabBattle());
        voidAxe = new VoidAxe(VItem.VOID).setUnlocalizedName(Names.Items.voidAxe).setCreativeTab(VC2.getCreativeTabBattle());
        voidHoe = new VoidHoe(VItem.VOID).setUnlocalizedName(Names.Items.voidHoe).setCreativeTab(VC2.getCreativeTabBattle());
        voidSickle = new VoidSickle(VItem.VOID).setUnlocalizedName(Names.Items.voidSickle).setCreativeTab(VC2.getCreativeTabBattle());

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.registerItem(voidSword, voidSword.getUnlocalizedName());
        GameRegistry.registerItem(voidPickaxe, voidPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(voidShovel, voidShovel.getUnlocalizedName());
        GameRegistry.registerItem(voidAxe, voidAxe.getUnlocalizedName());
        GameRegistry.registerItem(voidHoe, voidHoe.getUnlocalizedName());
        GameRegistry.registerItem(voidSickle, voidSickle.getUnlocalizedName());
    }

}
