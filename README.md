# CodeBryte Modding Minecraft With Java - Module 3

## Goal:
In Module 3, we want to create a custom Minecraft Food `Item` and a custom Minecraft Fuel `Item`.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
1. DONE FOR YOU - Create a `FuelItem` class which extends Item.
2. In `ItemInitializer.java`, register a custom Item to be used as a food.
3. In `ItemInitializer.java`, register a custom FuelItem.
4. In `ModCommonEvents.java`, create ItemStack variables for the custom food and fuel.
5. In `ModCommonEvents.java`, add food and fuel ItemStack variables to ExampleMod.ITEM_STACK_COLLECTION ArrayList.
6. DONE FOR YOU - In `src/main/resources/assets/examplemod/lang/en_us.json`, add display names for the custom food and custom fuel.
7. DONE FOR YOU - Create a resource model file: `src/main/resources/assets/examplemod/models/item/custom_food.json` and add entry for custom food.
8. DONE FOR YOU - Create a resource model file: `src/main/resources/assets/examplemod/models/item/custom_fuel.json` and add entry for custom fuel.
9. DONE FOR YOU - Create a resource image file: `src/main/resources/assets/examplemod/textures/item/custom_food.png`.
10. DONE FOR YOU - Create a resource image file: `src/main/resources/assets/examplemod/textures/item/custom_fuel.png`.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/java/com/example/examplemod/init/ItemInitializer.java)

## Files Added For Module 3:

[`src/main/resources/assets/examplemod/models/item/custom_food.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/resources/assets/examplemod/models/item/custom_food.json)

[`src/main/resources/assets/examplemod/models/item/custom_fuel.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/resources/assets/examplemod/models/item/custom_fuel.json)

[`src/main/resources/assets/examplemod/textures/item/custom_food.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/resources/assets/examplemod/textures/item/custom_food.png)

[`src/main/resources/assets/examplemod/textures/item/custom_fuel.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/resources/assets/examplemod/textures/item/custom_fuel.png)

## Updated Language File:
[`src/main/resources/assets/examplemod/lang/en_us.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_END/src/main/resources/assets/examplemod/lang/en_us.json)

## Challenges
* Can you change the custom food properties and custom fuel burn time?
* Can you design your own food and fuel textures?