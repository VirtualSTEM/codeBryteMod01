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


}
