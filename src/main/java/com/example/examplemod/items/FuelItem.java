package com.example.examplemod.items;

import javax.annotation.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

// TODO 1: DONE FOR YOU - Create a FuelItem class which extends Item
public class FuelItem extends Item {
    private int burnTime;

    public FuelItem(Properties properties, int burnTime) {
        super(properties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }

}