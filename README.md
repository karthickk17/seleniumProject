# Selenium WebDriver TestNG Framework
Automating functional UI and end to end tests for https://grocery-glide.vercel.app 

## Stack & Libraries
- Java
- Selenium WebDriver
- TestNG 
- Maven
- Extent Reports and logging

## Prerequisites
- IDE (Eclipse)
- JDK (version 7 or 8)
- Maven configuration

## How to run tests
1. Ensure that the maven dependencies are added.
2. Open the testSuite.xml file and run the xml file as a TestNG test Suite.
3. Once the test is completed, open the report folder in the explorer and view the resulting dashboard in Test Suite_Results.html

## Project components
- Page objects are in the directory *src/main/java/pageObjects*
- Test classes are in the the directory *src/test/java/tests*
- Listener class is in the directory *src/main/java/util*

## Highlights
- This framework supports Chrome browser
- This uses **WebDriverManager**, an open source browser binary manager. Selenium WebDriver requires you to download the binaries for each driver and hardcode the path of the driver. The disadvantage of this is each user must change the code to match their path, and they must manually check when new versions of the binaries are released. WebDriverManager automatically checks the latest version of the browser downloaded on your machine and downloads the required driver binary into the cache, eliminating the need to manually download and store binary files.
- Screenshot on test failure: A screenshot of the active browser is captured and stored in the screenshots folder
- Extent reporting and logging: After the test finishes, a visual report is generated for all the executed test cases from the suite. This report can be found in the 'report' folder
