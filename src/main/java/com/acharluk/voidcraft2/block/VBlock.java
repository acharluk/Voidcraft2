package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.lib.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class VBlock {

    public final static Block voidOre = new VoidOre(),
                        voidBlock = new VoidBlock(),
                        voidStairs = new VoidStairs(voidBlock, 1),
                        voidSlab = new VoidSlab(false, Material.rock),
                        voidBlockPortal = new VoidBlockPortal(Material.portal);

    public static void init() {
        GameRegistry.registerBlock(voidOre, Names.Blocks.voidOre);
        GameRegistry.registerBlock(voidBlock, Names.Blocks.voidBlock);
        GameRegistry.registerBlock(voidStairs, Names.Blocks.voidStairs);
        GameRegistry.registerBlock(voidSlab, Names.Blocks.voidSlab);
        GameRegistry.registerBlock(voidBlockPortal, Names.Blocks.voidBlockPortal);
    }

}
