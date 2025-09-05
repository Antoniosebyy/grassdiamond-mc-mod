package com.example.grassdiamond;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("grassdiamond")
public class GrassDiamondMod {

    public GrassDiamondMod() {
        // Constructor
    }

    @SubscribeEvent
    public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.GRASS_BLOCK) {
            event.getEntity().addItem(new ItemStack(Items.DIAMOND));
            event.getEntity().sendSystemMessage(net.minecraft.network.chat.Component.literal("You received a diamond!"));
            event.setCanceled(true);
        }
    }
}
