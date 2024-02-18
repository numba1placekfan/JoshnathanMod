package com.john.gemerald;

import com.john.gemerald.Items.ModItems;
import com.john.gemerald.blocks.ModBlocks;
import com.john.gemerald.entity.EntityClass;
import com.john.gemerald.handlers.EventHandler;
import com.john.gemerald.handlers.FuelHandler;
import com.john.gemerald.handlers.OreGen;
import com.john.gemerald.recipes.ModRecipes;
import com.myname.mymodid.Tags;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = gemerald.MODID, version = Tags.VERSION, name = "gemerald", acceptedMinecraftVersions = "[1.7.10]")
public class gemerald {


    public static final String MODID = "gemerald";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "com.john.gemerald.ClientProxy", serverSide = "com.john.gemerald.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(gemerald.MODID)
    public static gemerald modInstance;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(new EventHandler());
        ModItems.init();
        ModBlocks.init();
        EntityClass.init();
        GameRegistry.registerFuelHandler(new FuelHandler());

        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        proxy.preInit(event);
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        proxy.registerRenderThings();
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
