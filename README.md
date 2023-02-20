# CodeBryte Modding Minecraft With Java - Module 8

## Goal:
In Module 8, we'll see how to modify Minecraft to prevent fall damage to the `Player` in survival mode.  We'll also create a Parachute-like effect where the `Player` descends slowly when falling if pressing the space bar.

Note: Resource files (i.e., language file, models, and textures) have been added to this module.

## Steps:
* In `ModCommonEvents.java`, create an event handler method for handling the TickEvent.PlayerTickEvent.
* In `ModCommonEvents.java`, create an event handler method for handling the LivingFallEvent.
* In `ExampleMod.java`, add listeners for TickEvent and negateFallDamage event handlers.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_08_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_08_BEGIN/src/main/java/com/example/examplemod/ExampleMod.java)

## Files Added For Module 8:

[`src/main/java/com/example/examplemod/util/KeyboardHelper.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_08_BEGIN/src/main/java/com/example/examplemod/util/KeyboardHelper.java)



