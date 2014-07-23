package com.acharluk.voidcraft2.item;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.fluid.VFluid;
import com.acharluk.voidcraft2.item.battle.*;
import com.acharluk.voidcraft2.lib.Names;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VItem {

    public static final Item.ToolMaterial VOID = EnumHelper.addToolMaterial("VOID", 3, 1192, 320.0F, 170.0F, 32);

    public static Item voidIngot,
                       voidShard,
                       voidStick,

                       voidSword,
                       voidPickaxe,
                       voidShovel,
                       voidAxe,
                       voidHoe,
                       voidSickle,
                       voidBow,

                       voidBucket;


    public static void init() {
        voidIngot = new VoidIngot();
        voidShard = new VoidShard();
        voidStick = new VoidStick().setUnlocalizedName(Names.Items.voidStick);


        voidSword = new VoidSword(VItem.VOID).setUnlocalizedName(Names.Items.voidSword).setCreativeTab(VC2.getCreativeTabBattle());
        voidPickaxe = new VoidPickaxe(VItem.VOID).setUnlocalizedName(Names.Items.voidPickaxe).setCreativeTab(VC2.getCreativeTabBattle());
        voidShovel = new VoidShovel(VItem.VOID).setUnlocalizedName(Names.Items.voidShovel).setCreativeTab(VC2.getCreativeTabBattle());
        voidAxe = new VoidAxe(VItem.VOID).setUnlocalizedName(Names.Items.voidAxe).setCreativeTab(VC2.getCreativeTabBattle());
        voidHoe = new VoidHoe(VItem.VOID).setUnlocalizedName(Names.Items.voidHoe).setCreativeTab(VC2.getCreativeTabBattle());
        voidSickle = new VoidSickle(VItem.VOID).setUnlocalizedName(Names.Items.voidSickle).setCreativeTab(VC2.getCreativeTabBattle());
        //voidBow = new VoidBow(VItem.VOID).setUnlocalizedName(Names.Items.voidSickle).setCreativeTab(VC2.getCreativeTabBattle());

        //voidBucket = new VoidBucket(VFluid.voidFluidBlock).setContainerItem(Items.bucket);

        registerItems();
    }

    public static void registerItems() {

        GameRegistry.registerItem(voidSword, voidSword.getUnlocalizedName());
        GameRegistry.registerItem(voidPickaxe, voidPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(voidShovel, voidShovel.getUnlocalizedName());
        GameRegistry.registerItem(voidAxe, voidAxe.getUnlocalizedName());
        GameRegistry.registerItem(voidHoe, voidHoe.getUnlocalizedName());
        GameRegistry.registerItem(voidSickle, voidSickle.getUnlocalizedName());

        //GameRegistry.registerItem(voidBucket, voidBucket.getUnlocalizedName());
        //FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.voidFluid, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(voidBucket), FluidContainerRegistry.EMPTY_BUCKET /*new ItemStack(Items.bucket)*/);
    }

}
