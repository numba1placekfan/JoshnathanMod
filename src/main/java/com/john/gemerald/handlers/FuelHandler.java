package com.john.gemerald.handlers;

import com.john.gemerald.Items.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel)
    {

        int single = 200;

        if(fuel.getItem() == ModItems.coal_gem) return 700;
        return 0;
    }
}
