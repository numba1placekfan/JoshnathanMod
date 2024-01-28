package com.john.gemerald.entity;

import com.john.gemerald.Items.ModItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityJoshpc extends EntityAnimal {

    public EntityJoshpc(World par1World) {
        super(par1World);
        this.setSize(1.0F,2.0F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(0, new EntityAIPanic(this, 0.7D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAISwimming(this));
        this.tasks.addTask(3, new EntityAITempt(this,0.4D, ModItems.josh_ingot, false));
    }

    public boolean isAIEnabled() {
        return true;
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.1F);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return new EntityJoshpc(worldObj);
    }
}
