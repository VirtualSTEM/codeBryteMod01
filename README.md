# CodeBryte Modding Minecraft With Java - Module 6

## Goal:
In Module 6, we'll create a custom Minecraft `Block` and configure it to drop a version of itself upon breaking.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.  The loot table for the custom Block is located at `src/main/resources/data/examplemod/loot_tables/blocks/custom_block.json`.  The `pickaxe.json` resource file at `src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json` indicates that the custom block can only be mined with a pickaxe.

## Steps:
* In `BlockInitializer.java`, create a `DeferredRegister` to hold custom `Block`s.
* In `BlockInitializer.java`, register a custom `Block` to be used in the game.
* In `BlockInitializer.java`, create a `register()` method to register the custom Block in the Block `DeferredRegister` AND the Item `DeferredRegister`.
* In `ModCommonEvents.java`, add the new `Block`s to the creative tab.
* In `ExampleMod.java` register the `modEventBus` with our custom Blocks `DeferredRegister`.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/init/BlockInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/java/com/example/examplemod/init/BlockInitializer.java)

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/java/com/example/examplemod/ExampleMod.java)

## Files Added For Module 6:

[`src/main/resources/data/assets/examplemod/blockstates/custom_block.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/resources/assets/examplemod/blockstates/custom_block.json)

[`src/main/resources/data/assets/examplemod/models/block/custom_block.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/resources/assets/examplemod/models/block/custom_block.json)

[`src/main/resources/data/assets/examplemod/textures/block/custom_block.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/resources/assets/examplemod/textures/block/custom_block.png)

[`src/main/resources/data/examplemod/loot_tables/blocks/custom_block.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/resources/data/examplemod/loot_tables/blocks/custom_block.json)

[`src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/resources/data/minecraft/tags/blocks/mineable/pickaxe.json)

## Updated Language File:

[`src/main/resources/assets/examplemod/lang/en_us.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_06_BEGIN/src/main/resources/assets/examplemod/lang/en_us.json)