package com.john.gemerald.blocks;

import com.john.gemerald.blocks.decor.JoshBlock;
import com.john.gemerald.blocks.ores.CoaleraldOre;
import com.john.gemerald.blocks.ores.JoshOre;
import net.minecraft.block.Block;

public class ModBlocks {

    public static Block coalerald_ore;
    public static Block josh_block;
    public static Block josh_slab;
    public static Block josh_ore;



    public static void init() {
        coalerald_ore = new CoaleraldOre();
        josh_block = new JoshBlock();
        josh_ore = new JoshOre();

    }
}
