package net.mrscauthd.nuke;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("nuke")
public class NukeMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public NukeMod() {
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModRegistry.ENTITYS.register(bus);
        ModRegistry.BLOCKS.register(bus);
        ModRegistry.ITEMS.register(bus);
    }
}
