package com.acharluk.voidcraft2;

import com.acharluk.voidcraft2.block.VBlock;
import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ACharLuk on 17/06/2014.
 */
@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class VC2 {

    @Mod.Instance
    public static VC2 instance;

    //@SidedProxy(clientSide = Strings.CLIENTPROXYLOC, serverSide = Strings.COMMONPROXYLOC)
    //public static CommonProxy proxy;

    public static void preInit(FMLPreInitializationEvent e) {
        VBlock.init();
    }

    public static void init(FMLInitializationEvent e) {

    }

    public static void postInit(FMLPostInitializationEvent e) {

    }

}
