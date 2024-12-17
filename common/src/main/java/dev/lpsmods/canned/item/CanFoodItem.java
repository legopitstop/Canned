package dev.lpsmods.canned.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * Author: legopitstop
 */
public class CanFoodItem extends BlockItem {
    private final Item resultItem;
    public CanFoodItem(Block block, Item resultItem, Item.Properties settings) {
        super(block, settings);
        this.resultItem = resultItem;
    }

    public Item getResultItem() {
        return this.resultItem;
    }
}
