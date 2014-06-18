package com.acharluk.voidcraft2.block;

import net.minecraft.block.Block;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class VBlock {

    public static Block void_ore;
    public static Block void_block;

    public static void init() {
        void_ore = new VoidOre();
        void_block = new VoidBlock();
    }

}
