# CodeBryte Modding Minecraft With Java - Module 5

## Goal:
In Module 5, we'll create a custom set of Minecraft Armor (Boots, Chestplate, Helmet, Leggings).  We'll also see how to create custom recipes for our tools and armor.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.  Recipes for our custom boots and custom sword are provided.  Students should use these as guides to create other recipes.

## Steps:
* In `ItemInitializer.java`, register a custom Item for each Armor Item (Boots, Chestplate, Helmet, Leggings) using the `ArmorMaterial` created in the `CustomArmorMaterial.java` class provided for you.

* In `ModCommonEvents.java`, add the new `Item`s to the creative tab.
* Use the resources located in `src/main/resources/data/examplemod/recipes` to create recipes for each of the custom tools and pieces of armor.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_BEGIN/src/main/java/com/example/examplemod/init/ItemInitializer.java)

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_02_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

## Files Added For Module 5:

[`src/main/java/com/example/examplemod/util/CustomArmorMaterial.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/java/com/example/examplemod/util/CustomArmorMaterial.java)

[`src/main/resources/assets/examplemod/models/item/custom_boots.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/models/item/custom_boots.json)

[`src/main/resources/assets/examplemod/textures/item/custom_boots.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_boots.png)

[`src/main/resources/assets/examplemod/models/item/custom_chestplate.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/models/item/custom_chestplate.json)

[`src/main/resources/assets/examplemod/textures/item/custom_chestplate.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_chestplate.png)

[`src/main/resources/assets/examplemod/models/item/custom_helmet.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/models/item/custom_helmet.json)

[`src/main/resources/assets/examplemod/textures/item/custom_helmet.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_helmet.png)

[`src/main/resources/assets/examplemod/models/item/custom_leggings.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/models/item/custom_leggings.json)

[`src/main/resources/assets/examplemod/textures/item/custom_leggings.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_leggings.png)

[`src/main/resources/data/examplemod/recipes/custom_boots.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/data/examplemod/recipes/custom_boots.json)

[`src/main/resources/data/examplemod/recipes/custom_sword.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_05_BEGIN/src/main/resources/data/examplemod/recipes/custom_sword.json)