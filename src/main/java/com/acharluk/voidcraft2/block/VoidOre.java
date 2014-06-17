package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.lib.BlockName;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class VoidOre extends BlockVC2 {

    public VoidOre() {
        setBlockName(BlockName.void_ore);
        setHardness(1F);
        setResistance(0.5F);
        setCreativeTab(CreativeTabs.tabBrewing);
    }

}
