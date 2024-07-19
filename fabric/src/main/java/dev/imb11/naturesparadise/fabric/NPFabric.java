package dev.imb11.naturesparadise.fabric;

import dev.imb11.naturesparadise.NP;
import net.fabricmc.api.ModInitializer;

public final class NPFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        NP.init();
    }
}
