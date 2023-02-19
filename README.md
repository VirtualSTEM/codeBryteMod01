# CodeBryte Modding Minecraft With Java - Module 2

## Goal:
In Module 2, we want to create our first custom Minecraft `Item`.  We'll also want to create a custom tab in the creative game mode of Minecraft where we can locate the custom `Items` and `Blocks` we'll create in this course.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
* In `ItemInitializer.java`, Create a `DeferredRegister` to hold custom Items.
* In `ItemInitializer.java`, Register a custom Item, the image for which will be displayed on our custom creative tab.
* In `ItemInitializer.java`, Register a custom Item, which will (eventually) be used in the game.
* In `ExampleMod.java`, register the modEventBus with our custom `Items` Deferred Register

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/ExampleMod.java)

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/init/ItemInitializer.java)

## Files Added For Module 2:

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/java/com/example/examplemod/init/ItemInitializer.java)

[`src/main/resources/assets/examplemod/lang/en_us.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/lang/en_us.json)

[`src/main/resources/assets/examplemod/models/item/custom_item.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/models/item/custom_item.json)

[`src/main/resources/assets/examplemod/models/item/custom_tab_item.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/models/item/custom_tab_item.json)

[`src/main/resources/assets/examplemod/textures/item/custom_item.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/textures/item/custom_item.png)

[`src/main/resources/assets/examplemod/textures/item/custom_tab_item.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_END/src/main/resources/assets/examplemod/textures/item/custom_tab_item.png)