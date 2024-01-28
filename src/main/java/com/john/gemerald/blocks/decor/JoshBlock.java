package com.john.gemerald.blocks.decor;

import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class JoshBlock extends Block {

    private static final String name = "josh_block";

    public JoshBlock() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(gemerald.MODID + ":josh");
        setHardness(7.0F);
        setCreativeTab(CreativeTabs.tabBlock);
    }
 }
