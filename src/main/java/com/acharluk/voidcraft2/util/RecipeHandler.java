package com.acharluk.voidcraft2.util;

import com.acharluk.voidcraft2.block.VBlock;
import com.acharluk.voidcraft2.item.VItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created by ACharLuk on 23/07/2014.
 */
public class RecipeHandler {

    public static void init() {

        //Block, 9 Shards
        GameRegistry.addShapelessRecipe(new ItemStack(VItem.voidShard, 9), new Object[]{
                VBlock.voidBlock
        });
        GameRegistry.addRecipe(new ItemStack(VBlock.voidBlock), new Object[] {
                "III",
                "III",
                "III",
                'I', VItem.voidShard
        });

        //Battle Items
        GameRegistry.addRecipe(new ItemStack(VItem.voidSword), new Object[]{
                " I ",
                " I ",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidPickaxe), new Object[]{
                "III",
                " S ",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidAxe), new Object[]{
                "II ",
                "IS ",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidAxe), new Object[]{
                " II",
                " SI",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidShovel), new Object[]{
                " I ",
                " S ",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidHoe), new Object[]{
                "II ",
                " S ",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidHoe), new Object[]{
                " II",
                " S ",
                " S ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidSickle), new Object[]{
                " I ",
                "  I",
                "SI ",
                'I', VItem.voidIngot, 'S', VItem.voidStick
        });
        GameRegistry.addRecipe(new ItemStack(VItem.voidStick, 4), new Object[] {
                " I ",
                " I ",
                'I', VItem.voidIngot,
        });

        //Decoration blocks
        GameRegistry.addRecipe(new ItemStack(VBlock.voidStairs, 4), new Object[] {
                "I  ",
                "II ",
                "III",
                'I', VBlock.voidBlock
        });
        GameRegistry.addRecipe(new ItemStack(VBlock.voidStairs, 4), new Object[] {
                "  I",
                " II",
                "III",
                'I', VBlock.voidBlock
        });
        GameRegistry.addRecipe(new ItemStack(VBlock.voidSlab, 6), new Object[] {
                "III",
                'I', VBlock.voidBlock
        });
        GameRegistry.addRecipe(new ItemStack(VBlock.voidBlock), new Object[] {
                "I",
                "I",
                'I', VBlock.voidSlab
        });

        //Furnace recipes
        GameRegistry.addSmelting(VBlock.voidBlock, new ItemStack(VItem.voidIngot, 2), 97.0F);

    }

}
