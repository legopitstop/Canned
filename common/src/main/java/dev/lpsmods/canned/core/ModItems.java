package dev.lpsmods.canned.core;

import dev.lpsmods.canned.Constants;
import dev.lpsmods.canned.item.CanFoodItem;
import dev.lpsmods.canned.item.CanOpenerItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.Block;

/**
 * Author: legopitstop
 */
public class ModItems {
    public static final Item CAN_OPENER;
    public static final Item CAN;
    public static final Item APPLE_CAN;
    public static final Item BAKED_POTATO_CAN;
    public static final Item BEETROOT_CAN;
    public static final Item BEETROOT_SOUP_CAN;
    public static final Item BREAD_CAN;
    public static final Item CAKE_CAN;
    public static final Item CARROT_CAN;
    public static final Item CHORUS_FRUIT_CAN;
    public static final Item COOKED_BEEF_CAN;
    public static final Item COOKED_CHICKEN_CAN;
    public static final Item COOKED_COD_CAN;
    public static final Item COOKED_MUTTON_CAN;
    public static final Item COOKED_PORKCHOP_CAN;
    public static final Item COOKED_RABBIT_CAN;
    public static final Item COOKED_SALMON_CAN;
    public static final Item COOKIE_CAN;
    public static final Item DRIED_KELP_CAN;
    public static final Item ENCHANTED_GOLDEN_APPLE_CAN;
    public static final Item GLOW_BERRIES_CAN;
    public static final Item GOLDEN_APPLE_CAN;
    public static final Item GOLDEN_CARROT_CAN;
    public static final Item HONEY_CAN;
    public static final Item MELON_CAN;
    public static final Item MUSHROOM_STEW_CAN;
    public static final Item POISONOUS_POTATO_CAN;
    public static final Item POTATO_CAN;
    public static final Item PUFFERFISH_CAN;
    public static final Item PUMPKIN_PIE_CAN;
    public static final Item RABBIT_STEW_CAN;
    public static final Item ROTTEN_FLESH_CAN;
    public static final Item SPIDER_EYE_CAN;
    public static final Item SUSPICIOUS_STEW_CAN;
    public static final Item SWEET_BERRIES_CAN;
    public static final Item TROPICAL_FISH_CAN;

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
    }
    
    private static Item registerCan(String name, Block block, Item resultItem) {
        return registerItem(name, new CanFoodItem(block, resultItem, new Item.Properties()));
    }

    public static void init() {}

    static {
        CAN_OPENER = registerItem("can_opener", new CanOpenerItem(Tiers.IRON,  new Item.Properties().attributes(CanOpenerItem.createAttributes(Tiers.IRON, 1, -3.1f))));
        CAN = registerItem("can", new BlockItem(ModBlocks.CAN, new Item.Properties()));
        APPLE_CAN = registerCan("apple_can", ModBlocks.APPLE_CAN, Items.APPLE);
        BAKED_POTATO_CAN = registerCan("baked_potato_can", ModBlocks.BAKED_POTATO_CAN, Items.BAKED_POTATO);
        BEETROOT_CAN = registerCan("beetroot_can", ModBlocks.BEETROOT_CAN, Items.BEETROOT);
        BEETROOT_SOUP_CAN = registerCan("beetroot_soup_can", ModBlocks.BEETROOT_SOUP_CAN, Items.BEETROOT_SOUP);
        BREAD_CAN = registerCan("bread_can", ModBlocks.BREAD_CAN, Items.BREAD);
        CAKE_CAN = registerCan("cake_can", ModBlocks.CAKE_CAN, Items.CAKE);
        CARROT_CAN = registerCan("carrot_can", ModBlocks.CARROT_CAN, Items.CARROT);
        CHORUS_FRUIT_CAN = registerCan("chorus_fruit_can", ModBlocks.CHORUS_FRUIT_CAN, Items.CHORUS_FRUIT);
        COOKED_BEEF_CAN = registerCan("cooked_beef_can", ModBlocks.COOKED_BEEF_CAN, Items.COOKED_BEEF);
        COOKED_CHICKEN_CAN = registerCan("cooked_chicken_can", ModBlocks.COOKED_CHICKEN_CAN, Items.COOKED_CHICKEN);
        COOKED_COD_CAN = registerCan("cooked_cod_can", ModBlocks.COOKED_COD_CAN, Items.COOKED_COD);
        COOKED_MUTTON_CAN = registerCan("cooked_mutton_can", ModBlocks.COOKED_MUTTON_CAN, Items.COOKED_MUTTON);
        COOKED_PORKCHOP_CAN = registerCan("cooked_porkchop_can", ModBlocks.COOKED_PORKCHOP_CAN, Items.COOKED_PORKCHOP);
        COOKED_RABBIT_CAN = registerCan("cooked_rabbit_can", ModBlocks.COOKED_RABBIT_CAN, Items.COOKED_RABBIT);
        COOKED_SALMON_CAN = registerCan("cooked_salmon_can", ModBlocks.COOKED_SALMON_CAN, Items.COOKED_SALMON);
        COOKIE_CAN = registerCan("cookie_can", ModBlocks.COOKIE_CAN, Items.COOKIE);
        DRIED_KELP_CAN = registerCan("dried_kelp_can", ModBlocks.DRIED_KELP_CAN, Items.DRIED_KELP);
        ENCHANTED_GOLDEN_APPLE_CAN = registerCan("enchanted_golden_apple_can", ModBlocks.ENCHANTED_GOLDEN_APPLE_CAN, Items.ENCHANTED_GOLDEN_APPLE);
        GLOW_BERRIES_CAN = registerCan("glow_berries_can", ModBlocks.GLOW_BERRIES_CAN, Items.GLOW_BERRIES);
        GOLDEN_APPLE_CAN = registerCan("golden_apple_can", ModBlocks.GOLDEN_APPLE_CAN, Items.GOLDEN_APPLE);
        GOLDEN_CARROT_CAN = registerCan("golden_carrot_can", ModBlocks.GOLDEN_CARROT_CAN, Items.GOLDEN_CARROT);
        HONEY_CAN = registerCan("honey_can", ModBlocks.HONEY_CAN, Items.HONEY_BOTTLE);
        MELON_CAN = registerCan("melon_can", ModBlocks.MELON_CAN, Items.MELON);
        MUSHROOM_STEW_CAN = registerCan("mushroom_stew_can", ModBlocks.MUSHROOM_STEW_CAN, Items.MUSHROOM_STEW);
        POISONOUS_POTATO_CAN = registerCan("poisonous_potato_can", ModBlocks.POISONOUS_POTATO_CAN, Items.POISONOUS_POTATO);
        POTATO_CAN = registerCan("potato_can", ModBlocks.POTATO_CAN, Items.POTATO);
        PUFFERFISH_CAN = registerCan("pufferfish_can", ModBlocks.PUFFERFISH_CAN, Items.PUFFERFISH);
        PUMPKIN_PIE_CAN = registerCan("pumpkin_pie_can", ModBlocks.PUMPKIN_PIE_CAN, Items.PUMPKIN_PIE);
        RABBIT_STEW_CAN = registerCan("rabbit_stew_can", ModBlocks.RABBIT_STEW_CAN, Items.RABBIT_STEW);
        ROTTEN_FLESH_CAN = registerCan("rotten_flesh_can", ModBlocks.ROTTEN_FLESH_CAN, Items.ROTTEN_FLESH);
        SPIDER_EYE_CAN = registerCan("spider_eye_can", ModBlocks.SPIDER_EYE_CAN, Items.SPIDER_EYE);
        SUSPICIOUS_STEW_CAN = registerCan("suspicious_stew_can", ModBlocks.SUSPICIOUS_STEW_CAN, Items.SUSPICIOUS_STEW);
        SWEET_BERRIES_CAN = registerCan("sweet_berries_can", ModBlocks.SWEET_BERRIES_CAN, Items.SWEET_BERRIES);
        TROPICAL_FISH_CAN = registerCan("tropical_fish_can", ModBlocks.TROPICAL_FISH_CAN, Items.TROPICAL_FISH);
    }
}
