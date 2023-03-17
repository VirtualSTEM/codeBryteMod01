# CodeBryte Modding Minecraft With Java - Module 2

## Goal:
In Module 2, we want to create our first custom Minecraft `Item`.  We'll also want to create a custom tab in the creative game mode of Minecraft where we can locate the custom `Items` and `Blocks` we'll create in this course.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
1. In `ItemInitializer.java`, Create a `DeferredRegister` to hold custom Items.
2. In `ItemInitializer.java`, Register a custom Item, the image for which will be displayed on our custom creative tab.
3. In `ItemInitializer.java`, Register a custom Item, which will (eventually) be used in the game.
4. In `ExampleMod.java`, register the modEventBus with our custom `ITEMS` Deferred Register
5. DONE FOR YOU - In `ModCommonEvents.java`, create a method which adds the custom item to a new custom item tab. 
6. DONE FOR YOU - Create a resource language file: `src/main/resources/assets/examplemod/lang/en_us.json` and add entry for custom item and custom tab item.
7. DONE FOR YOU - Create a resource model file: `src/main/resources/assets/examplemod/models/item/custom_item.json` and add entry for custom item.
8. DONE FOR YOU - Create a resource model file: `src/main/resources/assets/examplemod/models/item/custom_tab_item.json` and add entry for custom tab item.
9. DONE FOR YOU - Create a resource image file: `src/main/resources/assets/examplemod/textures/item/custom_tab_item.png`.
10. DONE FOR YOU - Create a resource image file: `src/main/resources/assets/examplemod/textures/item/custom_tab_item.png`.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/ExampleMod.java)

[`src/main/java/com/example/examplemod/init/ItemInitializer.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/init/ItemInitializer.java)

## Files Added For Module 2:

[`src/main/java/com/example/examplemod/init/ItemInitializer.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/init/ItemInitializer.java)

[`src/main/resources/assets/examplemod/lang/en_us.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/lang/en_us.json)

[`src/main/resources/assets/examplemod/models/item/custom_item.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/models/item/custom_item.json)

[`src/main/resources/assets/examplemod/models/item/custom_tab_item.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/models/item/custom_tab_item.json)

[`src/main/resources/assets/examplemod/textures/item/custom_item.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/textures/item/custom_item.png)

[`src/main/resources/assets/examplemod/textures/item/custom_tab_item.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/textures/item/custom_tab_item.png)

## Challenges:

* Can you change the name displayed in the game for the custom item?  Hint: this doesn't require code changes.  Instead, the display name can be changed in the  `en_us.json` file.
* Following the steps for this module, can you create another custom item?