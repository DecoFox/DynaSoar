package com.dynasoar;

import com.dynasoar.entities.GliderEntity;
import com.google.common.collect.ImmutableList;

import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.fabricmc.api.EnvType;



@Environment(EnvType.CLIENT)
public class GliderModel<T extends GliderEntity> extends EntityModel<T> {
 
    private final ModelPart root;
 
    public GliderModel(ModelPart root) {
        this.root = root.getChild(EntityModelPartNames.CUBE);
        System.out.println("Constructing?");
    }
 
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
    	ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create().uv(0, 0).cuboid(-6F, 12F, -6F, 12F, 12F, 12F), ModelTransform.pivot(0F, 0F, 0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
 
    @Override
    public void setAngles(GliderEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }
 
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.root).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        System.out.println("Rendering?");
    }
}