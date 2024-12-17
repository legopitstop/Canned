package dev.lpsmods.canned.item;

import dev.lpsmods.canned.core.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Author: legopitstop
 */
public class CanOpenerItem extends DiggerItem {
    public CanOpenerItem(Tier tier, Item.Properties settings) {
        super(tier, BlockTags.MINEABLE_WITH_AXE, settings);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player user, InteractionHand hand) {
        user.getCooldowns().addCooldown(this, 10);
        ItemStack mainHand = user.getItemInHand(InteractionHand.MAIN_HAND);
        ItemStack offHand = user.getItemInHand(InteractionHand.OFF_HAND);
        if (level.isClientSide) {return InteractionResultHolder.pass(user.getItemInHand(hand));}
        boolean isCan = offHand.getItem() instanceof CanFoodItem;
        if (isCan && mainHand.is(this)) {
            ItemStack stack = new ItemStack(((CanFoodItem) offHand.getItem()).getResultItem(), 8);
            user.addItem(stack);
            user.addItem(new ItemStack(ModItems.CAN));
            mainHand.setDamageValue(1);
            offHand.shrink(1);
            return InteractionResultHolder.success(mainHand);
        }
        return super.use(level, user, hand);
    }

    @Override
    public boolean canAttackBlock(BlockState state, Level level, BlockPos pos, Player player) {
        return !player.isCreative();
    }
}
