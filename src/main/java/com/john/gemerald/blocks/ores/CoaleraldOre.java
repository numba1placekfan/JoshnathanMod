package com.john.gemerald.blocks.ores;

import com.john.gemerald.Items.ModItems;
import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class CoaleraldOre extends Block {
    private static final String name = "coalerald_ore";

    public CoaleraldOre() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(gemerald.MODID + ":coalerald_ore");
        setHardness(7.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return ModItems.coal_gem;
    }
}
