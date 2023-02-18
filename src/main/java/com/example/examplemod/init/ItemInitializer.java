package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;

import com.example.examplemod.items.FuelItem;
import com.example.examplemod.util.CustomTier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitializer {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> CUSTOM_TAB_ITEM = ITEMS.register("custom_tab_item",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUSTOM_ITEM = ITEMS.register("custom_item",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUSTOM_FOOD = ITEMS.register("custom_food",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationMod(0.6f)
                            .alwaysEat()
                            .meat()
                            .fast()
                            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1.0f).build())));

    public static final RegistryObject<Item> CUSTOM_FUEL = ITEMS.register("custom_fuel",
            () -> new FuelItem(new Item.Properties(), 500));

    // TODO: Add custom Tools (sword, pickaxe, shovel, axe, hoe)
    public static final RegistryObject<SwordItem> CUSTOM_SWORD = ITEMS.register("custom_sword",
            () -> new SwordItem(CustomTier.CUSTOM_TOOL_TIER, 5, 3.5f, new Item.Properties()));

    public static final RegistryObject<PickaxeItem> CUSTOM_PICKAXE = ITEMS.register("custom_pickaxe",
            () -> new PickaxeItem(CustomTier.CUSTOM_TOOL_TIER, 4, 3.5f, new Item.Properties()));

    public static final RegistryObject<ShovelItem> CUSTOM_SHOVEL = ITEMS.register("custom_shovel",
            () -> new ShovelItem(CustomTier.CUSTOM_TOOL_TIER, 3, 3.5f, new Item.Properties()));

    public static final RegistryObject<AxeItem> CUSTOM_AXE = ITEMS.register("custom_axe",
            () -> new AxeItem(CustomTier.CUSTOM_TOOL_TIER, 7, 3.5f, new Item.Properties()));

    public static final RegistryObject<HoeItem> CUSTOM_HOE = ITEMS.register("custom_hoe",
            () -> new HoeItem(CustomTier.CUSTOM_TOOL_TIER, 1, 3.5f, new Item.Properties()));


}