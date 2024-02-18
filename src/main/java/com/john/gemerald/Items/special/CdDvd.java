package com.john.gemerald.Items.special;

import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CdDvd extends Item {

    public static final String name = "cddvd";

    public CdDvd() {
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabCombat);
        setTextureName(gemerald.MODID + ":cd");
        GameRegistry.registerItem(this, name);
    }
}
