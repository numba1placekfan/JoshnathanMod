package com.john.gemerald;

import com.john.gemerald.entity.EntityJoshpc;
import com.john.render.entity.RenderJoshpc;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends CommonProxy {

    public void registerRenderThings() {
        RenderingRegistry.registerEntityRenderingHandler(EntityJoshpc.class, new RenderJoshpc(new ModelBiped(), 0));
    }

    // Override CommonProxy methods here, if you want a different behaviour on the client (e.g. registering renders).
    // Don't forget to call the super methods as well.

}
