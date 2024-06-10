package com.dynasoar;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class DynaSoarClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("dynasoar", "cube"), "main");
    @Override
    public void onInitializeClient() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
		/* 
        EntityRendererRegistry.register(DynaSoar.GLIDER, (context) -> {
            return new gliderRenderer(context);
        });
		*/
        EntityRendererRegistry.register(DynaSoar.GLIDER, gliderRenderer::new);
        /* 
		EntityRendererRegistry.register(DynaSoar.GLIDER, (context) -> {
            return new gliderRenderer(context);
        });
        */

 
        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, gliderModel::getTexturedModelData);
    }
}