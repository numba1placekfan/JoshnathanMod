package com.john.gemerald.recipes;

import com.john.gemerald.Items.ModItems;
import com.john.gemerald.blocks.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.josh_block, 1, 0), new Object[]{"XXX", "XXX", "XXX", 'X', ModItems.josh_ingot});
        GameRegistry.addSmelting(ModBlocks.coalerald_ore, new ItemStack(ModItems.coal_gem), 0.7F);
        GameRegistry.addSmelting(ModBlocks.josh_ore, new ItemStack(ModItems.josh_ingot), 0.7F);
    }
}
