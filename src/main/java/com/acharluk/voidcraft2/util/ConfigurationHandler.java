package com.acharluk.voidcraft2.util;

import com.acharluk.voidcraft2.lib.Strings;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by ACharLuk on 15/07/2014.
 */
public class ConfigurationHandler {

    public static Configuration conf;

    //Confs
    public static boolean HDTextures = false;

    public static void init(File configFile) {
        if (conf == null) {
            conf = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Strings.MODID)) {
            loadConfiguration();
        }
    }

    public static void loadConfiguration() {
        HDTextures = conf.getBoolean("HD Textures", Configuration.CATEGORY_GENERAL, false, "Activates 32x textures");

        if (conf.hasChanged()) conf.save();
    }

    public static String getResourcesPrefix() {
        if (HDTextures) {
            return Strings.TEXTURELOC = Strings.MODID + "_32x:";
        } else {
            return Strings.TEXTURELOC = Strings.MODID + ":";
        }
    }

}
