package net.mrscauthd.nuke;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrscauthd.nuke.blocks.NukeBlock;
import net.mrscauthd.nuke.entities.PrimedNuke;
import net.mrscauthd.nuke.tabs.NukeTab;

public class ModRegistry {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "nuke");

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "nuke");

    public static final DeferredRegister<EntityType<?>> ENTITYS = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "nuke");

    public static RegistryObject<Block> NUKE_BLOCK = BLOCKS.register("nuke",() -> new NukeBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE).instabreak().sound(SoundType.GRASS)));

    public static RegistryObject<Item> NUKE_ITEM = ITEMS.register("nuke",() -> new BlockItem(ModRegistry.NUKE_BLOCK.get(),new Item.Properties().tab(NukeTab.nuke_tab)));

    public static RegistryObject<EntityType<PrimedNuke>> NUKE = ENTITYS.register("nuke", () -> EntityType.Builder.<PrimedNuke>of(PrimedNuke::new, MobCategory.MISC).fireImmune().sized(0.98F, 0.98F).clientTrackingRange(10).updateInterval(10).build("nuke"));
}
