package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entities.projectiles.CustomArrowEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInitializer {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            ExampleMod.MODID);

    // TODO 7: Create A CustomArrowEntity.
    public static final RegistryObject<EntityType<CustomArrowEntity>> CUSTOM_ARROW_ENTITIES = ENTITIES.register(
            "custom_arrow",
            () -> EntityType.Builder
                    .of((EntityType.EntityFactory<CustomArrowEntity>) CustomArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f)
                    .build(ExampleMod.MODID + ":custom_arrow"));
}
