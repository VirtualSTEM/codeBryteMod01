# CodeBryte Modding Minecraft With Java - Module 1

## Goal:
In Module 1, we displayed a message when the `Player` breaks a `Block`.  We also spawned a `Chicken` above and in front of the `Player`.

## Steps Taken:
* Added a handler method in `ModCommonEvents.java` which responds to the `BreakEvent`.
* In this method, displayed a message to the `Player`.
* In this method, get the coordinates of the `Player`, and spawned a `Chicken` in front of and above the `Player`.
* Added a Listener for the `BreakEvent` to the `MinecraftForge.EVENT_BUS`

## Files Modified:
[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)
[`src/main/java/com/example/examplemod/ExampleMod.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_END/src/main/java/com/example/examplemod/ExampleMod.java)

## Files Added For Module 1:
[`src/main/java/com/example/examplemod/events/ModCommonEvents.java`](https://github.com/codebryte/codeBryteMod01/blob/MODULE_01_END/src/main/java/com/example/examplemod/events/ModCommonEvents.java)