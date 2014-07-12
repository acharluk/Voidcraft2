package com.acharluk.voidcraft2;

import com.acharluk.voidcraft2.block.VBlock;
import com.acharluk.voidcraft2.event.VC2Event;
import com.acharluk.voidcraft2.item.VItem;
import com.acharluk.voidcraft2.lib.Strings;
import com.acharluk.voidcraft2.proxy.IProxy;
import com.acharluk.voidcraft2.tab.VoidTabBattle;
import com.acharluk.voidcraft2.tab.VoidTabBlock;
import com.acharluk.voidcraft2.tab.VoidTabItem;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by ACharLuk on 17/06/2014.
 */
@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class VC2 {

    @Mod.Instance
    public static VC2 instance;

    @SidedProxy(clientSide = Strings.CLIENTPROXYLOC, serverSide = Strings.SERVERPROXYLOC)
    public static IProxy proxy;

    private static CreativeTabs voidTabBlock = new VoidTabBlock(CreativeTabs.getNextID(), Strings.MODID);
    public static CreativeTabs getCreativeTabBlock() {
        return voidTabBlock;
    }

    private static CreativeTabs voidTabItem= new VoidTabItem(CreativeTabs.getNextID(), Strings.MODID);
    public static CreativeTabs getCreativeTabItem() {
        return voidTabItem;
    }

    private static CreativeTabs voidTabBattle = new VoidTabBattle(CreativeTabs.getNextID(), Strings.MODID);
    public static CreativeTabs getCreativeTabBattle() {
        return voidTabBattle;
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e) {

        FMLCommonHandler.instance().bus().register(new VC2Event());

        VBlock.init();
        VItem.init();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {
        //TODO Event Manager -> Create ore in The End
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e) {

    }

}