package dev.lpsmods.canned.core;

import dev.lpsmods.canned.Constants;
import dev.lpsmods.canned.block.CanBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

/**
* Author: legopitstop
*/
public class ModBlocks {
    public static final Block CAN;
    public static final Block APPLE_CAN;
    public static final Block BAKED_POTATO_CAN;
    public static final Block BEETROOT_CAN;
    public static final Block BEETROOT_SOUP_CAN;
    public static final Block BREAD_CAN;
    public static final Block CAKE_CAN;
    public static final Block CARROT_CAN;
    public static final Block CHORUS_FRUIT_CAN;
    public static final Block COOKED_BEEF_CAN;
    public static final Block COOKED_CHICKEN_CAN;
    public static final Block COOKED_COD_CAN;
    public static final Block COOKED_MUTTON_CAN;
    public static final Block COOKED_PORKCHOP_CAN;
    public static final Block COOKED_RABBIT_CAN;
    public static final Block COOKED_SALMON_CAN;
    public static final Block COOKIE_CAN;
    public static final Block DRIED_KELP_CAN;
    public static final Block ENCHANTED_GOLDEN_APPLE_CAN;
    public static final Block GLOW_BERRIES_CAN;
    public static final Block GOLDEN_APPLE_CAN;
    public static final Block GOLDEN_CARROT_CAN;
    public static final Block HONEY_CAN;
    public static final Block MELON_CAN;
    public static final Block MUSHROOM_STEW_CAN;
    public static final Block POISONOUS_POTATO_CAN;
    public static final Block POTATO_CAN;
    public static final Block PUFFERFISH_CAN;
    public static final Block PUMPKIN_PIE_CAN;
    public static final Block RABBIT_STEW_CAN;
    public static final Block ROTTEN_FLESH_CAN;
    public static final Block SPIDER_EYE_CAN;
    public static final Block SUSPICIOUS_STEW_CAN;
    public static final Block SWEET_BERRIES_CAN;
    public static final Block TROPICAL_FISH_CAN;
    
    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), block);
    }

    private static Block registerCan(String name) {
        return registerBlock(name, new CanBlock(BlockBehaviour.Properties.of().destroyTime(0.5F).explosionResistance(0.5F).sound(SoundType.LANTERN).mapColor(MapColor.COLOR_GRAY).forceSolidOn().noOcclusion()));
    }

    public static void init() {}

    static {
        CAN = registerCan("can");
        APPLE_CAN = registerCan("apple_can");
        BAKED_POTATO_CAN = registerCan("baked_potato_can");
        BEETROOT_CAN = registerCan("beetroot_can");
        BEETROOT_SOUP_CAN = registerCan("beetroot_soup_can");
        BREAD_CAN = registerCan("bread_can");
        CAKE_CAN = registerCan("cake_can");
        CARROT_CAN = registerCan("carrot_can");
        CHORUS_FRUIT_CAN = registerCan("chorus_fruit_can");
        COOKED_BEEF_CAN = registerCan("cooked_beef_can");
        COOKED_CHICKEN_CAN = registerCan("cooked_chicken_can");
        COOKED_COD_CAN = registerCan("cooked_cod_can");
        COOKED_MUTTON_CAN = registerCan("cooked_mutton_can");
        COOKED_PORKCHOP_CAN = registerCan("cooked_porkchop_can");
        COOKED_RABBIT_CAN = registerCan("cooked_rabbit_can");
        COOKED_SALMON_CAN = registerCan("cooked_salmon_can");
        COOKIE_CAN = registerCan("cookie_can");
        DRIED_KELP_CAN = registerCan("dried_kelp_can");
        ENCHANTED_GOLDEN_APPLE_CAN = registerCan("enchanted_golden_apple_can");
        GLOW_BERRIES_CAN = registerCan("glow_berries_can");
        GOLDEN_APPLE_CAN = registerCan("golden_apple_can");
        GOLDEN_CARROT_CAN = registerCan("golden_carrot_can");
        HONEY_CAN = registerCan("honey_can");
        MELON_CAN = registerCan("melon_can");
        MUSHROOM_STEW_CAN = registerCan("mushroom_stew_can");
        POISONOUS_POTATO_CAN = registerCan("poisonous_potato_can");
        POTATO_CAN = registerCan("potato_can");
        PUFFERFISH_CAN = registerCan("pufferfish_can");
        PUMPKIN_PIE_CAN = registerCan("pumpkin_pie_can");
        RABBIT_STEW_CAN = registerCan("rabbit_stew_can");
        ROTTEN_FLESH_CAN = registerCan("rotten_flesh_can");
        SPIDER_EYE_CAN = registerCan("spider_eye_can");
        SUSPICIOUS_STEW_CAN = registerCan("suspicious_stew_can");
        SWEET_BERRIES_CAN = registerCan("sweet_berries_can");
        TROPICAL_FISH_CAN = registerCan("tropical_fish_can");
    }
}
