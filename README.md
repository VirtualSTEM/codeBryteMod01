# CodeBryte Modding Minecraft With Java - Module 1

## Goal:
In Module 1, we want to display a message when the `Player` breaks a `Block`.  We also want to spawn a `Chicken` above and in front of the `Player`.

## Steps:
* Add a handler method in `ModCommonEvents.java` which responds to the `BreakEvent`.
* In this method, display a message to the `Player`.
* In this method, get the coordinates of the `Player`, and spawn a `Chicken` in front of and above the `Player`. 
* Add a Listener for the `BreakEvent` to the `MinecraftForge.EVENT_BUS`.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_BEGIN/src/main/java/com/example/examplemod/ExampleMod.java)

## Files Added For Module 1:
[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_BEGIN/src/main/java/com/example/examplemod/events/ModCommonEvents.java)