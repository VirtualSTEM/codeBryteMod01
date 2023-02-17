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
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.event.level.BlockEvent.BreakEvent;

public class ModCommonEvents {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static void handleBreakEvent(@NotNull BreakEvent event) {

        // TODO: Display a message and spawn a Chicken when the Player breaks a block.
        //  Spawn the Chicken in front of and above the Player.

    }


}
