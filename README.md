# CodeBryte Modding Minecraft With Java - Module 9

## Goal:
In Module 9, we'll see how to create custom `Bow` and `Arrow` `Items` in Minecraft.  Our custom `Arrow` will cause an explosion 3 seconds (i.e., 20 `Ticks`) after it lands on a `Block`.

Note: Resource files (i.e., models, and textures) have been added to this module.

## Steps:
1. In `CustomBowItem.java`, which extends Minecraft's `BowItem`, create a `CustomBowItem` constructor which simply calls the super class constructor passing it an instance of `Item.Properties`.
2. In `CustomArrowEntity.java`, override the `AbstractArrow` class' `tickDespawn()` method to cause an explosion when a `CustomArrowItem` has been in a `Block` for 60 `Ticks` (i.e., 3 seconds).
3. In `CustomArrowEntity.java`, override the `AbstractArrow` class' getPickupItem() method to make the pickup item a `CustomArrowItem`.
4. In `CustomArrowItem.java`, override the `ArrowItem` `createArrow()` method to return a new `CustomArrowEntity`.
5. In `ItemInitializer.java`, create a `CustomBowItem`.
6. In `ItemInitializer.java`, create a `CustomArrowItem`.
7. In `EntityInitializer`, create a `CustomArrowEntity`.
8. In `ModCommonEvents.java`, Add the `CustomBowItem` to the creative tab.
9. In `ModCommonEvents.java`, Add the `CustomArrowItem` to the creative tab.
10. In `ExampleMod.java`, register custom entities with the Mod-Specific event bus.
11. In `ExampleMod.java`, add listeners for the `EntityRenderersEvent` and `FMLCommonSetupEvent`;


## Files Needing Modification:
[`src/main/java/com/example/examplemod/items/CustomBowItem`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/items/CustomBowItem)

[`src/main/java/com/example/examplemod/entities/CustomArrowEntity.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/entities/CustomArrowEntity.java)

[`src/main/java/com/example/examplemod/items/CustomArrowItem.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/items/CustomArrowItem.java)

[`src/main/java/com/example/examplemod/init/ItemInitializer.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/init/ItemInitializer.java)

[`src/main/java/com/example/examplemod/init/EntityInitializer.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/init/EntityInitializer.java)

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/ExampleMod.java)


## Files Added For Module 9:

[`src/main/java/com/example/examplemod/util/ModItemProperties.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/util/ModItemProperties.java)

[`src/main/java/com/example/examplemod/events/ModClientEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/events/ModClientEvents.java)

[`src/main/java/com/example/examplemod/entities/projectiles/CustomArrowEntity.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/entities/projectiles/CustomArrowEntity.java)

[`src/main/java/com/example/examplemod/init/EntityInitializer.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/init/EntityInitializer.java)

[`src/main/java/com/example/examplemod/items/CustomArrowItem.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/items/CustomArrowItem.java)

[`src/main/java/com/example/examplemod/items/CustomBowItem`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/items/CustomBowItem.java)

[`src/main/java/com/example/examplemod/client/renderer/CustomArrowRenderer.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/java/com/example/examplemod/client/renderer/CustomArrowRenderer.java)

### Resources

**Models:**

[`src/main/resources/assets/examplemod/models/item/custom_arrow.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/models/item/custom_arrow.json)

[`src/main/resources/assets/examplemod/models/item/custom_bow.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/models/item/custom_bow.json)

[`src/main/resources/assets/examplemod/models/item/custom_bow_pulling_0.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/models/item/custom_bow_pulling_0.json)

[`src/main/resources/assets/examplemod/models/item/custom_bow_pulling_1.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/)

[`src/main/resources/assets/examplemod/models/item/custom_bow_pulling_2.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/models/item/custom_bow_pulling_1.json)

**Textures:**

[`src/main/resources/assets/examplemod/textures/entity/custom_arrow.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/textures/entity/custom_arrow.png)

[`src/main/resources/assets/examplemod/textures/item/custom_arrow.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_arrow.png)

[`src/main/resources/assets/examplemod/textures/item/custom_bow.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_bow.png)

[`src/main/resources/assets/examplemod/textures/item/custom_bow_pulling_0.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_bow_pulling_0.png)

[`src/main/resources/assets/examplemod/textures/item/custom_bow_pulling_1.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_bow_pulling_1.png)

[`src/main/resources/assets/examplemod/textures/item/custom_bow_pulling_2.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_bow_pulling_2.png)

**Tags**

[`src/main/resources/data/minecraft/tags/entity_types/arrows.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/data/minecraft/tags/entity_types/arrows.json)

[`src/main/resources/data/minecraft/tags/items/arrows.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/data/minecraft/tags/items/arrows.json)


## Updated Language File:
[`src/main/resources/assets/examplemod/lang/en_us.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_09_BEGIN/src/main/resources/assets/examplemod/lang/en_us.json)
