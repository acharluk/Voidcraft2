package com.acharluk.voidcraft2.dimension;

import net.minecraftforge.common.DimensionManager;

/**
 * Created by ACharLuk on 24/07/2014.
 */
public class VWorld {

    public static int dimID = -97;

    public static void init() {
        DimensionManager.registerProviderType(dimID, VWorldProvider.class, true);
        DimensionManager.registerDimension(dimID, dimID);

    }

}
