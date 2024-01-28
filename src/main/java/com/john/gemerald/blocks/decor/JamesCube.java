package com.john.gemerald.blocks.decor;

import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class JamesCube extends Block {

    private static final String name = "james_cube";

    public JamesCube() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(gemerald.MODID + ":james_cube");
        setHardness(6.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
