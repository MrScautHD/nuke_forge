package net.mrscauthd.nuke;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.mrscauthd.nuke.entities.renderer.NukeRenderer;

@Mod.EventBusSubscriber(modid = "nuke", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModRegistry.NUKE.get(), NukeRenderer::new);
    }
}

