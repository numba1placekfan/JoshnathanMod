package com.john.gemerald.blocks.crops;

import com.john.gemerald.Items.ModItems;
import com.john.gemerald.blocks.RecipeBlockCrops;
import com.john.gemerald.gemerald;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class TangerineraldCrop extends RecipeBlockCrops {

    public TangerineraldCrop() {
        setBlockName("tangerinerald_crop");
        setBlockTextureName(gemerald.MODID + ":tangerinerald_crop_0");
    }

    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }


    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)
    {
        return (ModItems.tangerinerald);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
        iIcon = new IIcon[maxGrowthStage+1];
        // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want

        // to make generic should loop to maxGrowthStage
        iIcon[0] = parIIconRegister.registerIcon("tangerinerald_crop_0");
        iIcon[1] = parIIconRegister.registerIcon("tangerinerald_crop_0");
        iIcon[2] = parIIconRegister.registerIcon("tangerinerald_crop_0");
        iIcon[3] = parIIconRegister.registerIcon("tangerinerald_crop_0");
        iIcon[4] = parIIconRegister.registerIcon("tangerinerald_crop_0");
        iIcon[5] = parIIconRegister.registerIcon("rtangerinerald_crop_0");
        iIcon[6] = parIIconRegister.registerIcon("tangerinerald_crop_0");
        iIcon[7] = parIIconRegister.registerIcon("tangerinerald_crop_0");

    }
}
