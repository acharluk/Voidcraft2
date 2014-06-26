package com.acharluk.voidcraft2.util;

import com.acharluk.voidcraft2.block.VBlock;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by ACharLuk on 19/06/2014.
 */
public class VoidTabBlock extends CreativeTabs {
    public VoidTabBlock(int id,String modid) {
        super(id, modid);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(VBlock.void_block);
    }
}
