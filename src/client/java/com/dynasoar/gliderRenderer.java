package com.dynasoar;

import com.dynasoar.entities.GliderEntity;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GliderRenderer<T extends GliderEntity> extends EntityRenderer<T>{
    protected final EntityModel<T> model;
    private static final Identifier TEXTURE = new Identifier("dynasoar", "cube.png");
    public GliderRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.shadowRadius = 0.8F;
        this.model = new GliderModel<>(context.getPart(DynaSoarClient.MODEL_CUBE_LAYER));
        //this.model = new GliderModel(context.getPart(DynaSoarClient.MODEL_CUBE_LAYER));
    }
 
    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }

    @Override
    public void render(T gliderEnt, float f, float g, MatrixStack ms, VertexConsumerProvider vertexConsumerProvider, int i){
        super.render(gliderEnt, g, i, ms, vertexConsumerProvider, i);
        //System.out.println("Rendering?");
    }
}