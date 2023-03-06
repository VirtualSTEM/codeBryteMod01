package com.example.examplemod;

import com.example.examplemod.events.ModCommonEvents;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod {

    public static final String MODID = "examplemod";

    public ExampleMod() {

        // We use 2 Event Buses to do things when certain events occur
        // MinecraftForge.EVENT_BUS is the event bus for vanilla Minecraft events
        // Here, we register this mod (note @Mod class annotation above) with vanilla Minecraft
        MinecraftForge.EVENT_BUS.register(this);

        // The other event bus is the Mod-specific event bus created here
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // TODO 4: In `ExampleMod.java` Add a Listener for the `BreakEvent` to the `MinecraftForge.EVENT_BUS`.

    }

}