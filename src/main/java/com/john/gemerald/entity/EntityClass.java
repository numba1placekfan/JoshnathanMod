package com.john.gemerald.entity;

import com.john.gemerald.gemerald;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class EntityClass {

    public static void init() {
        registerEntity();
    }

    public static void registerEntity() {
        createEntity(EntityJoshpc.class, "humanoid_josh", 0x8f5528, 0x8f5528);
    }

    public static void createEntity(Class entityClass, String entityName, int SolidColor, int SpotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, gemerald.modInstance, 32, 1, true);
        createEgg(randomId, SolidColor, SpotColor);
    }
        private static void createEgg(int randomId, int SolidColor, int SpotColor) {
            EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, SolidColor, SpotColor));

        }
}


