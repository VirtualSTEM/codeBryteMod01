package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ItemInitializer;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.event.level.BlockEvent.BreakEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

public class ModCommonEvents {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static void handleBreakEvent(@NotNull BreakEvent event) {

        String blockDescription = event.getState().getBlock().getName().getString();
        String text = "You Broke a " + blockDescription + ".  Here is a Chicken";
        event.getPlayer().displayClientMessage(Component.literal(text), true);

        Player player = event.getPlayer();
        if (!player.level.isClientSide()) {
            Direction direction = player.getDirection();
            Vector3f playerVector = direction.step();
            Vec3 moveToVector = new Vec3(player.getX() + (playerVector.x * 5),
                    player.getY() + (10),
                    player.getZ() + (playerVector.z * 5));

            Level level = player.level;
            Chicken chicken = new Chicken(EntityType.CHICKEN, level);
            chicken.moveTo(moveToVector);
            level.addFreshEntity(chicken);
        }

    }

    public static void handleCreativeModeTabEvent(CreativeModeTabEvent.Register event) {
        // TODO: Create a custom tab for the creative inventory menu which will store our custom Items.

        ItemStack customItemItemStack = new ItemStack(ItemInitializer.CUSTOM_ITEM.get());

        ExampleMod.ITEM_STACK_COLLECTION.add(customItemItemStack);

        event.registerCreativeModeTab(new ResourceLocation(ExampleMod.MODID, "tab"),
                (builder) -> {
                    builder.title(Component.literal("Custom Tab"))
                            .icon(() -> new ItemStack(ItemInitializer.CUSTOM_TAB_ITEM.get()))
                            .displayItems(
                                    (enabledFlags, output, hasPermissions) -> {
                                        output.acceptAll(ExampleMod.ITEM_STACK_COLLECTION);
                                    }
                            );
                }
        );


    }


}
