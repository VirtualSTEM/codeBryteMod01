package com.example.examplemod.client.renderer;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entities.projectiles.CustomArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;


public class CustomArrowRenderer extends ArrowRenderer<CustomArrowEntity> {
    public static final ResourceLocation CUSTOM_ARROW_LOCATION = new ResourceLocation(ExampleMod.MODID,
            "textures/entity/custom_arrow.png");

    public CustomArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull CustomArrowEntity entity) {
        return CUSTOM_ARROW_LOCATION;
    }

}
