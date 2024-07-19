package dev.imb11.naturesparadise.forge;

import dev.imb11.naturesparadise.NP;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NP.MOD_ID)
public final class NPForge {
    public NPForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(NP.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        NP.init();
    }
}
