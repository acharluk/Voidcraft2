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
    public static int OreSpawnMultiplier = 20;

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
        OreSpawnMultiplier = conf.getInt("Ore Spawn Multiplier", Configuration.CATEGORY_GENERAL, 20, 1, 100, "Amount of Void Ore spawned");

        if (conf.hasChanged()) conf.save();
    }

    public static String getTexturesPrefix() {
        if (HDTextures) {
            return Strings.TEXTURELOC = Strings.MODID + "_32x:";
        } else {
            return Strings.TEXTURELOC = Strings.MODID + ":";
        }
    }

}
