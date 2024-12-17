package dev.lpsmods.canned.data;

import dev.lpsmods.canned.Constants;
import dev.lpsmods.canned.block.CanBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void generate() {
//        addCanDrops(ModBlocks.CAN);
        BuiltInRegistries.BLOCK.stream().filter(block -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(Constants.MOD_ID)).forEach(this::addCanDrops);
    }

    public void addCanDrops(Block canBlock) {
        add(canBlock, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add((LootPoolEntryContainer.Builder)this.applyExplosionDecay(canBlock, LootItem.lootTableItem(canBlock).apply(List.of(2, 3, 4, 5, 6, 7, 8), (integer) -> {
            return SetItemCountFunction.setCount(ConstantValue.exactly((float)integer)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(canBlock).setProperties(net.minecraft.advancements.critereon.StatePropertiesPredicate.Builder.properties().hasProperty(CanBlock.CANS, integer)));
        })))));
    }
}
