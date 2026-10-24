package com.kazet.fastplace;

import com.kazet.fastplace.mixin.MinecraftAccessor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class FastPlace implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player != null) {
                ((MinecraftAccessor) client).setRightClickDelay(0);
            }
        });
    }
}
