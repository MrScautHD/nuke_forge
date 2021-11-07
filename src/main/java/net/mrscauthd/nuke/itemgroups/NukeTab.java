package net.mrscauthd.nuke.itemgroups;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.mrscauthd.nuke.ModInnet;

public class NukeTab {
    public static CreativeModeTab nuke_tab = new CreativeModeTab("nuke") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModInnet.NUKE_ITEM.get(), 1);
        }
    };
}
