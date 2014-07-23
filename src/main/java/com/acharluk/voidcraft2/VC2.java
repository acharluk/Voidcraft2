package com.acharluk.voidcraft2;

import com.acharluk.voidcraft2.block.VBlock;
import com.acharluk.voidcraft2.event.VC2Event;
import com.acharluk.voidcraft2.fluid.VFluid;
import com.acharluk.voidcraft2.item.VItem;
import com.acharluk.voidcraft2.lib.Strings;
import com.acharluk.voidcraft2.proxy.IProxy;
import com.acharluk.voidcraft2.tab.VoidTabBattle;
import com.acharluk.voidcraft2.tab.VoidTabBlock;
import com.acharluk.voidcraft2.tab.VoidTabItem;
import com.acharluk.voidcraft2.util.BucketHandler;
import com.acharluk.voidcraft2.util.ConfigurationHandler;
import com.acharluk.voidcraft2.util.RecipeHandler;
import com.acharluk.voidcraft2.worldgen.EventManager;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by ACharLuk on 17/06/2014.
 */
@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION, guiFactory = Strings.GUIFACTORYCLASS)
public class VC2 {

    @Mod.Instance
    public static VC2 instance;

    @SidedProxy(clientSide = Strings.CLIENTPROXYLOC, serverSide = Strings.SERVERPROXYLOC)
    public static IProxy proxy;

    private static CreativeTabs voidTabBlock = new VoidTabBlock(CreativeTabs.getNextID(), Strings.MODID + ":" + "voidTabBlock");
    public static CreativeTabs getCreativeTabBlock() {
        return voidTabBlock;
    }

    private static CreativeTabs voidTabItem= new VoidTabItem(CreativeTabs.getNextID(), Strings.MODID + ":" + "voidTabItem");
    public static CreativeTabs getCreativeTabItem() {
        return voidTabItem;
    }

    private static CreativeTabs voidTabBattle = new VoidTabBattle(CreativeTabs.getNextID(), Strings.MODID + ":" + "voidTabBattle");
    public static CreativeTabs getCreativeTabBattle() {
        return voidTabBattle;
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e) {

        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        FMLCommonHandler.instance().bus().register(new VC2Event());
        VBlock.init();
        VItem.init();
        //VFluid.init();

        BucketHandler.INSTANCE.buckets.put(VFluid.voidFluidBlock, VItem.voidBucket);
        MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);

        RecipeHandler.init();

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new EventManager(), 0);
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e) {

    }
}