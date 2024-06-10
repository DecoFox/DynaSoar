package com.dynasoar;

import com.dynasoar.entities.GliderEntity;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DynaSoar implements ModInitializer {
 

    /* 
    public static final EntityType<glider> GLIDER = register("glider", EntityType.Builder.<glider>create(glider::new, SpawnGroup.MISC)
        .dimensions(0.98F, 0.98F)
        .build()
    );
    */

    /*
    ERROR FIXING: 
    Please add a register Method to the ModEntities class:
    public static void registerModEntities() {
        TutorialMod.LOGGER.info("Registering Entities for " + TutorialMod.MOD_ID);
    }
    and then call it in your TutorialMod class inside the onInitialize - if this is not done, your mod will crash dedicated servers!
    */


     
    public static final EntityType<GliderEntity> GLIDER = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("dynasoar", "glider"),
            EntityType.Builder.<GliderEntity>create(GliderEntity::new, SpawnGroup.MISC)
            .dimensions(0.98F, 0.98F)
            .build()
    );

    
    @Override
    public void onInitialize() {
        //FabricDefaultAttributeRegistry.Register(GLIDER, glider.)
    }
}