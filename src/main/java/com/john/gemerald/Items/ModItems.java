package com.john.gemerald.Items;

import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems
{
    public static Item coal_gem;
    public static Item tangerinerald;
    public static Item josh_ingot;

    public static void init()
    {
        coal_gem = new Item().setUnlocalizedName("coal_gem").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(gemerald.MODID + ":coal_gem");
        tangerinerald = new ItemFood(20,1.0F, false).setUnlocalizedName("tangerinerald").setCreativeTab(CreativeTabs.tabFood).setTextureName(gemerald.MODID + ":tangerinerald");
        josh_ingot = new Item().setUnlocalizedName("josh_ingot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(gemerald.MODID + ":josh_ingot");

        GameRegistry.registerItem(tangerinerald, tangerinerald.getUnlocalizedName());
        GameRegistry.registerItem(coal_gem, coal_gem.getUnlocalizedName());
        GameRegistry.registerItem(josh_ingot, josh_ingot.getUnlocalizedName());
    }

}
