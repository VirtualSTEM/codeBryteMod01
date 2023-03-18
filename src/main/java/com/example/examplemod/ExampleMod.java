package com.example.examplemod;

import java.util.ArrayList;
import java.util.Collection;

import com.example.examplemod.init.ItemInitializer;

import com.example.examplemod.events.ModCommonEvents;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod {

    public static final String MODID = "examplemod";

    public static Collection<ItemStack> ITEM_STACK_COLLECTION = new ArrayList<ItemStack>();

    public ExampleMod() {

        // We use 2 Event Busses to do things when certain events occur
        // MinecraftForge.EVENT_BUS is the event bus for vanilla Minecraft events
        // Here, we register this mod (note @Mod class annotation above) with vanilla Minecraft
        MinecraftForge.EVENT_BUS.register(this);

        // Here we add a listener to send a message whenever the Player breaks a Block
        MinecraftForge.EVENT_BUS.addListener(ModCommonEvents::handleBreakEvent);

        // The other event bus is the Mod-specific event bus created here
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // We register our custom things (Items, Blocks, Entities) with the Mod-specific event bus
        // TODO 4: In `ExampleMod.java`, register the modEventBus with our custom `ITEMS` Deferred Register


        // We add listeners for Mod-specific events -
        modEventBus.addListener(ModCommonEvents::handleCreativeModeTabEvent);

    }























}