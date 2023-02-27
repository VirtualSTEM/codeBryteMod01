package com.example.examplemod.events;

import com.example.examplemod.client.renderer.CustomArrowRenderer;
import com.example.examplemod.init.EntityInitializer;

import net.minecraftforge.client.event.EntityRenderersEvent;

public class ModClientEvents {

    public static void addEntityRenders(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInitializer.CUSTOM_ARROW_ENTITIES.get(), CustomArrowRenderer::new);
    }
}
