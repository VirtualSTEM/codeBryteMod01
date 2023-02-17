# CodeBryte Modding Minecraft With Java

This repository contains the files needed for the CodeBryte **Modding Minecraft With Java** course.

## Task 1 - Installing Git and Cloning This Repository

### Step 1 - Installing Git
Each course module is represented by two branches - one branch contains the starter code (in which the students will write their code) and one branch contains the finished code with a full example solution.  To clone this repository to your local computer (and to access the different branches) requires version control software called **git**.  Installation instructions for various operating systems are available here: [https://git-scm.com/book/en/v2/Getting-Started-Installing-Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).

### Step 2 - Cloning This Repository
### Create a Folder to Store Our Code
With git installed, let's create a folder on our computer to store our code.  We can do this using the Finder (on Mac) or the File Explorer (on Windows) but here, we show how to do it using Terminal Commands.

Open a Terminal (on Mac) or a Command Line (on Windows) and navigate to the location where you would like to create the new folder.  Let's say we want to create a folder called `PROJECTS` at the location: `User/<username>/PROJECTS`.

### A Few Helpful Terminal Commands
To move UP into a parent directory, use the `cd ../` command:
```console
john@MacBook-Pro ~ % cd ../
john@MacBook-Pro /Users %
```

To move DOWN INTO a directory, use the `cd` command with the name of the directory you want to enter
```console
john@MacBook-Pro /Users % cd john
/Users/john
```

To show the directory your currently in, use the `pwd` command:
```console
john@MacBook-Pro ~ % pwd
/Users/john
```

Once you are in the right location, make a directory to store your code projects.  If I wanted to create a directory called `PROJECTS` I would type:
```console
john@MacBook-Pro ~ % mkdir PROJECTS
```
This would create an empty folder named `PROJECTS`.

Next, enter this directory with the following `cd` command:
```console
john@MacBook-Pro ~ % cd PROJECTS
john@MacBook-Pro PROJECTS %
```

Now, we're ready to use git to download or "clone" this repository to this location using the `git clone` command.
```console
john@MacBook-Pro PROJECTS % git clone https://github.com/codebryte/codeBryteMod01.git
```
This will create a folder named `codeBryteMod01` inside the `PROJECTS` folder which will contain our modding code.

## Task 2-A - Mod Setup (Using IntelliJ)
For writing Minecraft Mods in this course, we can choose between two Integrated Development Environments (IDEs), IntelliJ and Eclipse.  We'll first show the steps for IntelliJ.  The steps for Mod setup using Eclipse are [below](#codebryte-minecraft-mod-setup-using-eclipse).

### Step 1 - Download the Java JDK
If using IntelliJ, We'll first need to install the Java JDK.  The Java JDK is the Java Development Kit.  It allows us to write Java code to develop Java Applications like our Minecraft Mods.  We'll need a Java 17 version of the development Kit available at [https://adoptium.net/](https://adoptium.net/)

![Figure A](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_01.png)
*Figure A - Download the Java 17 JDK from [https://adoptium.net/](https://adoptium.net/).*

Install the downloaded JDK on your system and take note of where the JDK will be stored on your computer.

![Figure B](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_02.png)
*Figure B - Take note of where the JDK will be installed on your computer.*

### Step 2 - Download IntelliJ Community Edition and Open the Project
IntelliJ is an Integrated Development Environment (IDE) we can use to write the code which runs our Minecraft Mods.  You can download IntelliJ Community Edition from [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)

![Figure C](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_03.png)
*Figure C - Download the IntelliJ IDE from [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/).*

Open the IntelliJ IDE and Choose **Open Project**.  Navigate to and open the `CodeBryteMod01` folder which was cloned earlier.

![Figure D](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_04.png)
*Figure D - Open the existing CodeBryteMod01 project in IntelliJ.*

### Step 3 Run Gradle Tasks in IntelliJ
Gradle is a "Build Tool" often used in Java projects. Forge uses Gradle to make it easier to build and run Minecraft Mods. Open the Gradle window on the right side of IntelliJ.  Navigate to `Tasks > forgegradle runs > genIntelliJRuns`.  Right click on it and select `Run`.

![Figure D](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_05.png)
*Figure D - Run the Gradle Task: `genIntelliJRuns`.*

Running the `genIntelliJRuns` Gradle Task will create the various Run Configurations that we will use to launch Minecraft and Test our Minecraft mod.  The various Run Configurations are shown in the image below.

![Figure D](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_06.png)
*Figure D - After running: `genIntelliJRuns`, The various Minecraft Run Configurations will be created.*

### Step 4 - Add JDK to IntelliJ

In order to write Java code in IntelliJ, we'll have to add our Java Development Kit (JDK) to IntelliJ. Then, we'll have to tell IntelliJ to use this JDK in this *particular project*.

In IntelliJ, select `File > Project Structure > Platform Settings`.

Click the `+` button to add a new JDK to IntelliJ.  IntelliJ can usually find the correct location of the JDK Home folder on its own.  In our case (on a Mac) the JDK was located at `Library/Java/JavaVirtualMachines/temurin-17.jdk` and the JDK home path was located at `Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home`.

![Figure D](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_07.png)
*Figure D - Add the JDK to this particular project.*

### Step 5 - Add the JDK to This Project

Now that the JDK has been added to IntelliJ, we need to add it to this particular project.

In IntelliJ, select `File > Project Structure > Project Settings`.

In the SDK dropdown, select the JDK we just added - In the image below, ours is called `temurin-17`.

![Figure D](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_08.png)
*Figure D - Add the JDK to IntelliJ.*

### Step 6 - Run The Mod
In IntelliJ, choose `runClient` from the Run Configurations as shown below.  Click the green run button to launch Minecraft.

![Figure D](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IJ_IMAGE_09.png)
*Figure D - Add the JDK to IntelliJ.*

## Task 2-B - Mod Setup (Using Eclipse)

### Step 1 - Download Eclipse

Eclipse is the other Integrated Development Environment (IDE) we can use to write the code which runs our Minecraft Mods.  You can download the Eclipse IDE from [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)

![Figure 1](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_01_UPDATE.png)
*Figure 1 - Choose your computer architecture (if available) and download the Eclipse IDE from [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/).*

---

![Figure 2](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_02_UPDATE.png)
*Figure 2 - Click the Download button shown above.*

---

![Figure 3](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_03_UPDATE.png)
*Figure 3 - When the download completes, double click the download to run the Eclipse Installer.*

---

![Figure 4](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_04_UPDATE.png)
*Figure 4 - Double-Click to start the Eclipse Installer.*

---

![Figure 5](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_05_UPDATE.png)
*Figure 5 - Many versions of Eclipse are available.  We'll be using the Eclipse IDE for Java Developers.*

---

![Figure 6](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_06_UPDATE.png)
*Figure 6 - It's ideal to install Eclipse in a User-specific directory e.g., `Users/<username>` on Windows or `Users/<username>/Applications` on Mac.  Eclipse downloads its own version of the JDK (Java Development Kit) needed for Java development.*

---

![Figure 7](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_07_UPDATE.png)
*Figure 7 - When you launch Eclipse, it asks you to create a workspace.  Here, the default is `Users/<username>/eclipse-workspace`.  This is where all of your Eclipse projects (including Minecraft Mods) will be located.*

---

![Figure 8](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_08_UPDATE.png)
*Figure 8 - When you launch Eclipse, you can close the Welcome screen.*

---


![Figure 9](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_09_UPDATE.png)
*Figure 9 - The default Eclipse workspace has no projects yet.  Next, we'll create a new project using the files we cloned previously.*

---


### Step 2 - Open the Project in Eclipse

![Figure 15](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_15_UPDATE.png)
*Figure 15 - Copy the directory: `codeBryteMod01` to the `eclipse-workspace` directory created when you installed Eclipse.  Now we can import the project into Eclipse.*

---

![Figure 17](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_17_UPDATE.png)
*Figure 17 - Open the Eclipse App (and select the `eclipse-workspace` if prompted). In the Project Explorer (left panel of Eclipse) select `import projects`.*

---

![Figure 18](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_18_UPDATE.png)
*Figure 18 - Select import `Existing Gradle Project`.  Then select `Next >`.  Gradle is a "Build Tool" often used in Java projects.  Forge uses Gradle to make it easier to build and run Minecraft Mods.*

---

![Figure 19](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_19_UPDATE.png)
*Figure 19 - Select `Next >`.*

---

![Figure 20](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_20_UPDATE.png)
*Figure 20 - When asked to select the root directory of the Gradle Project to import, navigate to the `eclipse-workspace` and select the `codeBryteMod01` directory.*

---

![Figure 21](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_21_UPDATE.png)
*Figure 21 - With the project root directory selected, select `Next >`.*

---

![Figure 22](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_22_UPDATE.png)
*Figure 22 -  On the import options screen, click `Next >`.*

---

![Figure 23](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_23_UPDATE.png)
*Figure 23 -  Eclipse will access the JDK it downloaded, and use the Gradle Wrapper provided in the Forge download files to access the latest version of Gradle.  It can take several minutes to import the project.*

---

![Figure 24](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_24_UPDATE.png)
*Figure 24 -  In the Eclipse's Gradle Tasks panel, click the down arrow next to `forgegradle runs`.  Right-click `genEclipseRuns` and select `Run Gradle Tasks`.  This will generate several Run Configurations for our Mod.*

---

![Figure 25](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_25_UPDATE.png)
*Figure 25 -  It may take several minutes for the Gradle tasks to finish running.  When they are complete, right click on the project in the Package Explorer and select `Refresh`.  The `.launch` configuration files should then appear in the Package Explorer.*

---

![Figure 26](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_26_UPDATE.png)
*Figure 26 -  Select the down arrow to the right of the Run button in Eclipse.  Select Run Configurations.*

---


![Figure 27](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_27_UPDATE.png)
*Figure 27 -  In the Run Configurations panel, we can see that several run configurations were created for our Java Application.  To test-run your mod, select `runClient` and click `Run`.  Minecraft will launch.*

---

![Figure 28](https://static.coronite.net/MINECRAFT_UPLOAD_IMAGES/IMAGE_28_UPDATE.png)
*Figure 28 -  Minecraft launches running our example Mod (even though we haven't begun coding any modifications yet).*

---