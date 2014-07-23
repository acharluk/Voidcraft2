package com.acharluk.voidcraft2.block;

import com.acharluk.voidcraft2.item.VItem;
import com.acharluk.voidcraft2.lib.Names;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class VoidOre extends BlockVC2 {

    public VoidOre() {
        super();
        this.setBlockName(Names.Blocks.voidOre);
        this.setHardness(3.0F).setResistance(1000.0F);
    }

    public int quantityDropped(Random random) {
        return 1 + random.nextInt(2);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_) {
        return VItem.voidShard;
    }

}