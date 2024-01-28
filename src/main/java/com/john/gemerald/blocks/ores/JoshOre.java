package com.john.gemerald.blocks.ores;

import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class JoshOre extends Block {

    private static final String name = "josh_ore";

    public JoshOre() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(gemerald.MODID + ":josh_ore");
        setHardness(6.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
