package com.acharluk.voidcraft2.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * Created by ACharLuk on 23/06/2014.
 */
public class VC2Event {

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        //event.player.func_146105_b(new ChatComponentText(event.player.getDisplayName() + " is testing chat messages"));
    }

}
