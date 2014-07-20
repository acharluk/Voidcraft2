package com.acharluk.voidcraft2.client.gui;

import com.acharluk.voidcraft2.lib.Strings;
import com.acharluk.voidcraft2.util.ConfigurationHandler;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by ACharLuk on 17/07/2014.
 */
public class VGuiConfig extends GuiConfig {

    public VGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.conf.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Strings.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.conf.toString()));
    }

}
