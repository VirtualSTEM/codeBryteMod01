# CodeBryte Modding Minecraft With Java - Module 1

## Goal:
In Module 1, we want to display a message when the `Player` breaks a `Block`.  We also want to spawn a `Chicken` above and in front of the `Player`.

## Steps:
1. Add a handler method in `ModCommonEvents.java` which responds to the `BreakEvent`.
2. In this method, display a message to the `Player`.
3. In this method, get the coordinates of the `Player`, and spawn a `Chicken` in front of and above the `Player`.
4. In `ExampleMod.java` Add a Listener for the `BreakEvent` to the `MinecraftForge.EVENT_BUS`.

## Files Needing Modification:

[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_END/src/main/java/com/example/examplemod/ExampleMod.java)

## Files Added For Module 1:
[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)

## Challenges
* Can you display a different message to the user when a block is broken?
* Can you spawn a different `Entity` when a block is broken?