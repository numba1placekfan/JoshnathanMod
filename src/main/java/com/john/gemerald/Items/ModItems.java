package com.john.gemerald.Items;

import com.john.gemerald.Items.special.Soyringe;
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
    public static Item empty_syringe;
    public static Item soyringe;

    public static void init()
    {
        empty_syringe = new Item().setUnlocalizedName("empty_syringe").setCreativeTab(CreativeTabs.tabBrewing).setTextureName(gemerald.MODID + ":empty_syringe");
        coal_gem = new Item().setUnlocalizedName("coal_gem").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(gemerald.MODID + ":coal_gem");
        tangerinerald = new ItemFood(20,1.0F, false).setUnlocalizedName("tangerinerald").setCreativeTab(CreativeTabs.tabFood).setTextureName(gemerald.MODID + ":tangerinerald");
        josh_ingot = new Item().setUnlocalizedName("josh_ingot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(gemerald.MODID + ":josh_ingot");
        soyringe = new Soyringe();

        GameRegistry.registerItem(tangerinerald, tangerinerald.getUnlocalizedName());
        GameRegistry.registerItem(coal_gem, coal_gem.getUnlocalizedName());
        GameRegistry.registerItem(josh_ingot, josh_ingot.getUnlocalizedName());
        GameRegistry.registerItem(empty_syringe, empty_syringe.getUnlocalizedName());

    }

}
