package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.VC2;
import com.acharluk.voidcraft2.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

/**
 * Created by ACharLuk on 23/07/2014.
 */
public class VoidStairs extends BlockStairs {
    protected VoidStairs(Block block, int p_i45428_2_) {
        super(block, p_i45428_2_);
        this.setBlockName(Names.Blocks.voidStairs);
        this.setCreativeTab(VC2.getCreativeTabBlock());
    }
}
