package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.lib.Names;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VoidBlock extends BlockVC2 {

    public VoidBlock() {
        this.setBlockName(Names.Blocks.voidBlock);
        this.setHardness(1.0F);
        this.setResistance(0.5F);
        BlockVC2.register(this);
    }

}
