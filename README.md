# CodeBryte Modding Minecraft With Java - Module 4

## Goal:
In Module 4, we'll create a custom set of Minecraft Tools / Weapons (Sword, Shovel, Pickaxe, Hoe, and Axe).  We'll also create a custom tool `Tier` to control the properties of our tools.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
* In `ItemInitializer.java`, register a custom Item for each Tool (Sword, Shovel, Pickaxe, Hoe, and Axe) using the `Tier` created in the `CustomTier.java` class provided for you.

* In `ModCommonEvents.java`, add the new `Item`s to the creative tab.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/java/com/example/examplemod/init/ItemInitializer.java)

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

## Files Added For Module 4:

[`src/main/java/com/example/examplemod/util/CustomTier.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/java/com/example/examplemod/util/CustomTier.java)

[`src/main/resources/assets/examplemod/models/item/custom_axe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/models/item/custom_axe.json)

[`src/main/resources/assets/examplemod/textures/item/custom_axe.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_axe.png)

[`src/main/resources/assets/examplemod/models/item/custom_hoe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/models/item/custom_hoe.json)

[`src/main/resources/assets/examplemod/textures/item/custom_hoe.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_hoe.png)

[`src/main/resources/assets/examplemod/models/item/custom_pickaxe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/models/item/custom_pickaxe.json)

[`src/main/resources/assets/examplemod/textures/item/custom_pickaxe.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_pickaxe.png)

[`src/main/resources/assets/examplemod/models/item/custom_shovel.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/models/item/custom_shovel.json)

[`src/main/resources/assets/examplemod/textures/item/custom_shovel.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_shovel.png)

[`src/main/resources/assets/examplemod/models/item/custom_sword.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/models/item/custom_sword.json)

[`src/main/resources/assets/examplemod/textures/item/custom_sword.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_BEGIN/src/main/resources/assets/examplemod/textures/item/custom_sword.png)
