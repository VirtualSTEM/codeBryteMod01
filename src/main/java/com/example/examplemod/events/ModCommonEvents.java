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

    // TODO 1: Add a handler method in `ModCommonEvents.java` which responds to the `BreakEvent`.
    public static void handleBreakEvent(@NotNull BreakEvent event) {

        // TODO 2: In this method, display a message to the `Player`.


        Player player = event.getPlayer();
        String blockDescription = event.getState().getBlock().getName().getString();
        String text = "You Broke a " + blockDescription + ".  Here is a Chicken";
        player.displayClientMessage(Component.literal(text), true);

        // TODO 3: In this method, get the coordinates of the `Player`, and spawn a `Chicken` in front of and above the `Player`.

        if (!player.level.isClientSide()) {
            Direction direction = player.getDirection();
            Vector3f playerVector = direction.step();
            Vec3 moveToVector = new Vec3(
                    player.getX() + (playerVector.x * 5),
                    player.getY() + (10),
                    player.getZ() + (playerVector.z * 5)
            );

            Level level = player.level;
            Chicken chicken = new Chicken(EntityType.CHICKEN, level);
            chicken.moveTo(moveToVector);
            level.addFreshEntity(chicken);
        }
    }
}
