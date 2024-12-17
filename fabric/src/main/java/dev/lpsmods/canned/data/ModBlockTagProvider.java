package dev.lpsmods.canned.data;

import dev.lpsmods.canned.Constants;
import dev.lpsmods.canned.core.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider<Block> {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, Registries.BLOCK, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        FabricTagBuilder can = getOrCreateTagBuilder(ModTags.Blocks.CANS);
        BuiltInRegistries.BLOCK.keySet().stream().filter((block) -> block.getNamespace().equals(Constants.MOD_ID)).forEach(can::add);
    }
}
