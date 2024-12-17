package dev.lpsmods.canned.core;

import dev.lpsmods.canned.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Author: legopitstop
 */
public class ModCreativeTabs {
    public static final CreativeModeTab MAIN;

    private static CreativeModeTab registerTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
    }

    public static void init() {}

    static {
        MAIN = registerTab("cans", CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("itemGroup."+Constants.MOD_ID)).icon(() -> {
            return new ItemStack(ModItems.CAN);
        }).displayItems((CreativeModeTab.ItemDisplayParameters params, CreativeModeTab.Output out) -> {
            out.accept(ModItems.CAN_OPENER);
            out.accept(ModItems.CAN);
            out.accept(ModItems.APPLE_CAN);
            out.accept(ModItems.BAKED_POTATO_CAN);
            out.accept(ModItems.BEETROOT_CAN);
            out.accept(ModItems.BEETROOT_SOUP_CAN);
            out.accept(ModItems.BREAD_CAN);
            out.accept(ModItems.CAKE_CAN);
            out.accept(ModItems.CARROT_CAN);
            out.accept(ModItems.CHORUS_FRUIT_CAN);
            out.accept(ModItems.COOKED_BEEF_CAN);
            out.accept(ModItems.COOKED_CHICKEN_CAN);
            out.accept(ModItems.COOKED_COD_CAN);
            out.accept(ModItems.COOKED_MUTTON_CAN);
            out.accept(ModItems.COOKED_PORKCHOP_CAN);
            out.accept(ModItems.COOKED_RABBIT_CAN);
            out.accept(ModItems.COOKED_SALMON_CAN);
            out.accept(ModItems.COOKIE_CAN);
            out.accept(ModItems.DRIED_KELP_CAN);
            out.accept(ModItems.ENCHANTED_GOLDEN_APPLE_CAN);
            out.accept(ModItems.GLOW_BERRIES_CAN);
            out.accept(ModItems.GOLDEN_APPLE_CAN);
            out.accept(ModItems.GOLDEN_CARROT_CAN);
            out.accept(ModItems.HONEY_CAN);
            out.accept(ModItems.MELON_CAN);
            out.accept(ModItems.MUSHROOM_STEW_CAN);
            out.accept(ModItems.POISONOUS_POTATO_CAN);
            out.accept(ModItems.POTATO_CAN);
            out.accept(ModItems.PUFFERFISH_CAN);
            out.accept(ModItems.PUMPKIN_PIE_CAN);
            out.accept(ModItems.RABBIT_STEW_CAN);
            out.accept(ModItems.ROTTEN_FLESH_CAN);
            out.accept(ModItems.SPIDER_EYE_CAN);
            out.accept(ModItems.SUSPICIOUS_STEW_CAN);
            out.accept(ModItems.SWEET_BERRIES_CAN);
            out.accept(ModItems.TROPICAL_FISH_CAN);
        }).build());
    }
}
