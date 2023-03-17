package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;

import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ItemInitializer {

    // TODO 1: In `ItemInitializer.java`, Create a `DeferredRegister` to hold custom Items.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    // TODO 2: In `ItemInitializer.java`, Register a custom Item, the image for which will be displayed on our custom creative tab.
    public static final RegistryObject<Item> CUSTOM_TAB_ITEM = ITEMS.register("custom_tab_item",
            () -> new Item(new Item.Properties()));

    // TODO 3: In `ItemInitializer.java`, Register a custom Item, which will (eventually) be used in the game.
    public static final RegistryObject<Item> CUSTOM_ITEM = ITEMS.register("custom_item",
            () -> new Item(new Item.Properties()));

}
