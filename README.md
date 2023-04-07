# CodeBryte Modding Minecraft With Java - Module 4

## Goal:
In Module 4, we'll create a custom set of Minecraft Tools / Weapons (Sword, Shovel, Pickaxe, Hoe, and Axe).  We'll also create a custom tool `Tier` to control the properties of our tools.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
1. DONE FOR YOU - Create the class `CustomTier.java` enum class. This class will define a custom Tier for our custom tools (note: Axes, Pickaxes, Shovels, and Hoes are Tiered Tools. Swords are Tiered items as well). 
2. In `ItemInitializer.java`, register a custom Item for each of: Shovel, Pickaxe, Hoe, Axe, and Sword) using the `Tier` created in the `CustomTier.java` class provided for you.
3. In `ModCommonEvents.java`, create `ItemStack` variables for each custom tiered Item.
4. In `ModCommonEvents.java`, add each tiered Item `ItemStack` variable to the `ExampleMod.ITEM_STACK_COLLECTION` ArrayList.
5. DONE FOR YOU - In `src/main/resources/assets/examplemod/lang/en_us.json`, add display names for each custom tiered Item.
6. DONE FOR YOU - Create a resource model files for each custom tiered Item.
7. DONE FOR YOU - Create a resource texture files for each custom tiered Item.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/init/ItemInitializer`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/java/com/example/examplemod/init/ItemInitializer.java)

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

## Files Added For Module 4:

[`src/main/java/com/example/examplemod/util/CustomTier.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/java/com/example/examplemod/util/CustomTier.java)

[`src/main/resources/assets/examplemod/models/item/custom_axe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/models/item/custom_axe.json)

[`src/main/resources/assets/examplemod/textures/item/custom_axe.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/textures/item/custom_axe.png)

[`src/main/resources/assets/examplemod/models/item/custom_hoe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/models/item/custom_hoe.json)

[`src/main/resources/assets/examplemod/textures/item/custom_hoe.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/textures/item/custom_hoe.png)

[`src/main/resources/assets/examplemod/models/item/custom_pickaxe.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/models/item/custom_pickaxe.json)

[`src/main/resources/assets/examplemod/textures/item/custom_pickaxe.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/textures/item/custom_pickaxe.png)

[`src/main/resources/assets/examplemod/models/item/custom_shovel.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/models/item/custom_shovel.json)

[`src/main/resources/assets/examplemod/textures/item/custom_shovel.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/textures/item/custom_shovel.png)

[`src/main/resources/assets/examplemod/models/item/custom_sword.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/models/item/custom_sword.json)

[`src/main/resources/assets/examplemod/textures/item/custom_sword.png`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/textures/item/custom_sword.png)

## Updated Language File:

[`src/main/resources/assets/examplemod/lang/en_us.json`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_04_END/src/main/resources/assets/examplemod/lang/en_us.json)

## Challenges
* Change the mining level, uses/durability, speed, damage, and enchantment value for your custom Tier.
* Change the attack damage and attack speed modifiers in the tiered Item constructor calls.
* Create custom texture images from the vanilla Minecraft images provided.