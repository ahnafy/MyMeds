<div align="middle"><a href="https://www.my-meds.com/"><img src="client/src/android-chrome-512x512.png" width="100px" height="100px"/></a></div>


## Medications

The medications page has two distinct views depending on whether the user is on desktop or a mobile device.

 The desktop view contains a sidebar with a **new medication** button and a checkbox toggle to switch between showing today's medications and all medications. If **show all medications** is selected, three options to filter the medications appear: all, complete, and incomplete. The right side of the screen is reserved for medications, which are viewed as material cards.

The mobile view contains a navbar, a toggle to show all medications, and filtering options if **show all medications** is checked at the top of the screen. In the bottom right corner there is a button to add a new medication which is indicated by a plus icon. The center of the screen is reserved for listing medications.

### Adding a medication

To create a medication, click the aforementioned **new medication** button. When creating a medication, it requires the text of the medication, a category, and a frequency. Optionally, you can include text that describes the purpose of the medication and an end date. 

### Using your medication

A medication begins as incomplete and can be marked as complete by clicking on the check box located to the right of the title. A complete medication stays complete once marked if a frequency of *does not repeat* is selected. If a different frequency is selected, the medication will automatically mark itself as incomplete once the specified time period has passed. This behavior will end if an end date was specified once the end date has been reached.

 A medication can be deleted by clicking the trash icon on desktop. On a mobile device, the medication must be selected by clicking on it to open its own page, then deleted by clicking on the trash icon in the top right corner.

 A medication can be edited by clicking on the pen icon on desktop. On a mobile device, the medication must be selected by clicking on it to open its own page, then edited by clicking on the pen icon in the bottom right corner.
 
 
## Development and Deployment

Versions used for required packages:

- OpenJDK v1.8.0_141
- Node v6.11.2
- Npm v3.10.10
- @angular/cli v1.0.0
- Yarn v1.0.2
- IntelliJ Gradle Plugin

## Stack Used:
* Angular 5 
* Apache Spark
* NodeJS
* MongoDB

##Programming Languages:
Java
TypeScript
HTML
CSS
Bash

## Project Setup

For IntelliJ users, you should be able to clone this repository inside IntelliJ 

- When prompted to create a new IntelliJ project, select **yes**.
- Select **import project from existing model** and select **Gradle.**
  - Make sure **Use default Gradle wrapper** is selected.
- Click **Finish.**
- If IDEA asks you if you want to compile JavaScript to TypeScript :fire: DO NOT :fire: – if you do it will break your project.

:warning: IDEA will sometimes decide to "help" you by offering
"Compile TypeScript to JavaScript?" :bangbang: *Never* say "OK" to this
offer -- if you do it will make a complete mess of your project. We're
using other tools (`gradle`, `yarn`, and `ng`) to do that compilation. 
If you let IDEA do it, you'll
have a ton of JavaScript files cluttering up your project and confusing other
tools.

## Running the project

- The **build** task will _build_ the entire project (but not run it)
- The **run** Gradle task will still run your SparkJava server.
(which is available at ``localhost:4567``)



