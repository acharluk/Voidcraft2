package com.acharluk.voidcraft2.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * Created by ACharLuk on 23/06/2014.
 */
public class VC2Event {

    @SubscribeEvent
    public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event) {
        //event.player.addChatComponentMessage(IChatComponent.Serializer.func_150699_a("No updates for Voidcraft 2"));
    }

}
