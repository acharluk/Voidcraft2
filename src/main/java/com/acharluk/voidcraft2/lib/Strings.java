package com.acharluk.voidcraft2.lib;

import com.acharluk.voidcraft2.util.ConfigurationHandler;

/**
 * Created by ACharLuk on 17/06/2014.
 */
public class Strings {

    public static final String MODID = "voidcraft2";
    public static final String NAME = "Voidcraft 2";
    public static final String VERSION = "2.0.1";
    public static final String MODPACKAGE = "com.acharluk." + MODID;

    public static final String SERVERPROXYLOC = MODPACKAGE + ".proxy.ServerProxy";
    public static final String CLIENTPROXYLOC = MODPACKAGE + ".proxy.ClientProxy";
    public static final String GUIFACTORYCLASS = MODPACKAGE + ".client.gui.GuiFactory";

    public static final String RESOURCESPREFIX = MODID + ":";

    public static String TEXTURELOC = ConfigurationHandler.getTexturesPrefix();

}