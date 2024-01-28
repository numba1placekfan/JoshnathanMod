package com.john.gemerald.handlers;


import com.john.gemerald.Items.special.Soyringe;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class EventHandler {

    @SubscribeEvent
    public void onPlayerRightClick(PlayerInteractEvent event) {
        EntityPlayer player = event.entityPlayer;
        ItemStack itemStack = player.getHeldItem();

        if (itemStack != null && itemStack.getItem() instanceof Soyringe) {
            // Your custom handling for right-clicking with the soyringe
            // You can add additional logic or effects here
        }
    }
}
