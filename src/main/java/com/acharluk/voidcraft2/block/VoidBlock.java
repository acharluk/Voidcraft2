package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.lib.BlockName;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by ACharLuk on 18/06/2014.
 */
public class VoidBlock extends BlockVC2 {

    public VoidBlock() {
        setBlockName(BlockName.voidBlock);
        setHardness(1.0F);
        setResistance(0.5F);
        setCreativeTab(CreativeTabs.tabBrewing);
        BlockVC2.register(this);
    }

}
