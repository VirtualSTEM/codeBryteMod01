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

        ItemStack customItemItemStack = new ItemStack(ItemInitializer.CUSTOM_ITEM.get());

        ItemStack customFoodItemStack = new ItemStack(ItemInitializer.CUSTOM_FOOD.get());
        ItemStack customFuelItemStack = new ItemStack(ItemInitializer.CUSTOM_FUEL.get());

        // TODO 3: In `ModCommonEvents.java`, create `ItemStack` variables for each custom tiered Item.
        ItemStack customSwordItemStack = new ItemStack(ItemInitializer.CUSTOM_SWORD.get());
        ItemStack customPickaxeItemStack = new ItemStack(ItemInitializer.CUSTOM_PICKAXE.get());
        ItemStack customShovelItemStack = new ItemStack(ItemInitializer.CUSTOM_SHOVEL.get());
        ItemStack customAxeItemStack = new ItemStack(ItemInitializer.CUSTOM_AXE.get());
        ItemStack customHoeItemStack = new ItemStack(ItemInitializer.CUSTOM_HOE.get());


        ExampleMod.ITEM_STACK_COLLECTION.add(customItemItemStack);
        ExampleMod.ITEM_STACK_COLLECTION.add(customFuelItemStack);
        ExampleMod.ITEM_STACK_COLLECTION.add(customFoodItemStack);

        // TODO 4: In `ModCommonEvents.java`, add each tiered Item `ItemStack` variable to the `ExampleMod.ITEM_STACK_COLLECTION` ArrayList.
        ExampleMod.ITEM_STACK_COLLECTION.add(customSwordItemStack);
        ExampleMod.ITEM_STACK_COLLECTION.add(customPickaxeItemStack);
        ExampleMod.ITEM_STACK_COLLECTION.add(customShovelItemStack);
        ExampleMod.ITEM_STACK_COLLECTION.add(customAxeItemStack);
        ExampleMod.ITEM_STACK_COLLECTION.add(customHoeItemStack);


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
