package dev.lpsmods.canned.data;

import dev.lpsmods.canned.Constants;
import dev.lpsmods.canned.core.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider<Item> {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, Registries.ITEM, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookup) {
        FabricTagBuilder can = getOrCreateTagBuilder(ModTags.Items.CANS);
        BuiltInRegistries.ITEM.keySet().stream().filter((item) -> !item.getPath().equals("can_opener") && item.getNamespace().equals(Constants.MOD_ID)).forEach(can::add);
    }
}
