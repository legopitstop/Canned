package dev.lpsmods.canned;

import dev.lpsmods.canned.core.*;

/**
* Author: legopitstop
*/
public class Bootstrap {
    public static void init() {
        ModTags.Items.init();
        ModTags.Blocks.init();
        ModBlocks.init();
        ModItems.init();
        ModCreativeTabs.init();

        // Register Supported Mods
//        if (!Services.PLATFORM.isModLoaded("farmersdelight")) {};
//        if (!Services.PLATFORM.isModLoaded("morefood")) {};
//        if (!Services.PLATFORM.isModLoaded("moregold")) {};
//        if (!Services.PLATFORM.isModLoaded("morehoney")) {};
//        FabricLoader loader = FabricLoader.getInstance();
//        loader.getModContainer("farmersdelight").ifPresent(FarmersDelightCans::register);
//        loader.getModContainer("morefood").ifPresent(MoreFoodCans::register);
//        loader.getModContainer("moregold").ifPresent(MoreGoldCans::register);
//        loader.getModContainer("morehoney").ifPresent(MoreHoneyCans::register);
    }
}