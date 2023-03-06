package com.example.examplemod.events;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;


import net.minecraftforge.event.level.BlockEvent.BreakEvent;

public class ModCommonEvents {

    public static void handleBreakEvent(@NotNull BreakEvent event) {

        // TODO 1: Add a handler method in `ModCommonEvents.java` which responds to the `BreakEvent`.

        // TODO 2: In this method, display a message to the `Player`.

        // TODO 3: In this method, get the coordinates of the `Player`, and spawn a `Chicken` in front of and above the `Player`.

    }
}
