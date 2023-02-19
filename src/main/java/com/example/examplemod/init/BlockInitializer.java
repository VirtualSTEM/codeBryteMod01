package com.example.examplemod.init;

import java.util.function.Supplier;

import com.example.examplemod.ExampleMod;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInitializer {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ExampleMod.MODID);

    public static final RegistryObject<Block> CUSTOM_BLOCK = register("custom_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f).strength(1f, 5f)
                    .requiresCorrectToolForDrops()),
            new Item.Properties());

    // TODO: Register a custom animated Block to be used in the game.
    public static final RegistryObject<Block> CUSTOM_ANIMATION_BLOCK = register("custom_animation_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f).strength(1f, 5f)),
            new Item.Properties());

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier,
                                                                Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInitializer.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

}
