package com.example.examplemod.util;

import com.example.examplemod.init.ItemInitializer;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

// TODO: 1. DONE FOR YOU - Create the class `CustomTier.java` enum class. This class will define a custom Tier for our
//  custom tools (note: Axes, Pickaxes, Shovels, and Hoes are Tiered Tools. Swords are Tiered items as well).

public enum CustomTier implements Tier {
    CUSTOM_TOOL_TIER(4, 3000, 10.0F, 5.0F, 25, () -> {
        return Ingredient.of(ItemInitializer.CUSTOM_ITEM.get());
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    CustomTier(int level, int durability, float miningSpeed, float damage, int enchantmentValue,
               Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}