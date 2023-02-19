# CodeBryte Modding Minecraft With Java - Module 3

## Goal:
In Module 3, we want to create a custom Minecraft Food `Item` and a custom Minecraft Fuel `Item`.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
* In `ItemInitializer.java`, Register a custom Item and set its `food()` properties.
* In `ItemInitializer.java`, Register a custom `FuelItem`.
* In `ModCommonEvents.java`, add the new `Item`s to the creative tab.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_BEGIN/src/main/java/com/example/examplemod/init/ItemInitializer.java)

## Files Added For Module 3:

[`src/main/resources/assets/examplemod/models/item/custom_food.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_BEGIN/src/main/resources/assets/examplemod/models/item/custom_food.json)

[`src/main/resources/assets/examplemod/models/item/custom_fuel.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_BEGIN/src/main/resources/assets/examplemod/models/item/custom_fuel.json)

[`src/main/resources/assets/examplemod/textures/item/custom_food.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_food.png)

[`src/main/resources/assets/examplemod/textures/item/custom_fuel.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_03_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_fuel.png)