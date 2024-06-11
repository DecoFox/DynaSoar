package com.dynasoar.entities;


import org.jetbrains.annotations.ApiStatus.OverrideOnly;

import com.dynasoar.DynaSoar;

import net.minecraft.entity.EntityType;

import net.minecraft.entity.vehicle.VehicleEntity;
import net.minecraft.item.Item;

import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;

import net.minecraft.world.World;

public class GliderEntity extends VehicleEntity {

 
    public GliderEntity(EntityType<? extends VehicleEntity> entityType, World world) {
        super(entityType, world);
    }

    
   public GliderEntity(World world, double x, double y, double z) {
    this(DynaSoar.GLIDER, world);
    this.setPosition(x, y, z);
    this.prevX = x;
    this.prevY = y;
    this.prevZ = z;
    }

    @Override
    public boolean shouldRenderName(){
        return true;
    }

    /* 
    @Override
    public boolean shouldRender(double distance){
        return true;
    }
    */
    public Item asItem() {
        // TODO Auto-generated method stub
        return Items.ACACIA_BOAT;
    }

    public void createGliderAttributes(){
        
    }

    /*
        public static DefaultAttributeContainer.Builder createGliderAttributes(){
            return Entity.
        
        }
    */

    protected void readCustomDataFromNbt(NbtCompound var1) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'readCustomDataFromNbt'");
    }


    protected void writeCustomDataToNbt(NbtCompound var1) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'writeCustomDataToNbt'");

    }

}
