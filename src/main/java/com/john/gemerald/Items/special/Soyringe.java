package com.john.gemerald.Items.special;

import com.john.gemerald.Items.ModItems;
import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Soyringe extends Item {

    private static final String name = "soyringe";

    public Soyringe() {
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabBrewing);
        setTextureName(gemerald.MODID + ":soyringe");
        GameRegistry.registerItem(this, name);
    }


                @Override
            public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
                // Check if the player is not in creative mode
                if (!player.capabilities.isCreativeMode) {
                    // Remove one item from the stack
                    itemStack.stackSize--;

                    // Apply poison effect to the player for 60 seconds (20 ticks per second)
                    player.addPotionEffect(new PotionEffect(Potion.poison.id, 60 * 20, 0));

                    // Give the player an empty syringe
                    ItemStack emptySyringe = new ItemStack(ModItems.empty_syringe); // Assuming you have an "emptySyringe" item
                    if (!player.inventory.addItemStackToInventory(emptySyringe)) {
                        // If the player's inventory is full, spawn the empty syringe in the world
                        player.dropPlayerItemWithRandomChoice(emptySyringe, false);
        }



    }

                    return itemStack;
}
    }
