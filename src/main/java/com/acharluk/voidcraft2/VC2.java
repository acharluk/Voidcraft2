package com.acharluk.voidcraft2;

import com.acharluk.voidcraft2.lib.Strings;
import com.acharluk.voidcraft2.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

/**
 * Created by ACharLuk on 17/06/2014.
 */
@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class VC2 {

    @Mod.Instance
    public static VC2 instance;

    //@SidedProxy(clientSide = Strings.CLIENTPROXYLOC, serverSide = Strings.COMMONPROXYLOC)
    //public static CommonProxy proxy;

}
