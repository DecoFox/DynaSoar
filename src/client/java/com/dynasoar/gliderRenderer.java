package com.dynasoar;

import com.dynasoar.entities.glider;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class gliderRenderer extends EntityRenderer<glider>{
    protected final EntityModel<glider> model;
    public gliderRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.shadowRadius = 0.8F;
        this.model = new gliderModel<>(context.getPart(DynaSoarClient.MODEL_CUBE_LAYER));
    }
 
    @Override
    public Identifier getTexture(glider entity) {
        return new Identifier("dynasoar", "cube.png");
    }

    @Override
    public void render(glider gliderEnt, float f, float g, MatrixStack ms, VertexConsumerProvider vertexConsumerProvider, int i){
        super.render(gliderEnt, g, i, ms, vertexConsumerProvider, i);
    }
}