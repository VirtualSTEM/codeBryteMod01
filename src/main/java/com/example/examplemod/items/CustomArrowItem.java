package com.example.examplemod.items;


import com.example.examplemod.entities.projectiles.CustomArrowEntity;
import com.example.examplemod.init.EntityInitializer;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CustomArrowItem extends ArrowItem {


    public CustomArrowItem(Properties properties) {
        super(properties);
    }

    // TODO 4: In Override the ArrowItem createArrow() method to return a new CustomArrowEntity.


}