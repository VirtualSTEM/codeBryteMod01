package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInitializer {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> CUSTOM_TAB_ITEM = ITEMS.register("custom_tab_item",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUSTOM_ITEM = ITEMS.register("custom_item",
            () -> new Item(new Item.Properties()));

    // TODO 2: In `ItemInitializer.java`, register a custom Item to be used as a food.


    // TODO 3: In `ItemInitializer.java`, register a custom FuelItem.

}
