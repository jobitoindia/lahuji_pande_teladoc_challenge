**In order to run the automation tests in this Framework, kindly navigate to the below path:**


      1. way2automation
      2. src/test/java
      3. Features
      4. Open the userRoleValidation.feature file
      5. Right click Run as -> Cucumber Feature

On the console below, it show the test results.

**Below two scenario have been automated:**
   1. Add a new user and validate it
   2. Remove a existing user and validate it.
  
**While developing the BDD Framework, i have utilize below OOPs concepts:**
   1. Inheritance
   2. Abstraction
   3. Encapsulation
   4. Appropriately use the Super and This keywords, at necessity places.
  
In BDD framework, code has been segregated in below folder structure,
  **1. Base:** it contains the code for initizing the browser
  **2. Pages:** here followed the Page Object Model (POM) design patterns, as per this created seperate java classes and maintained the locators in resepctive java page class.
  **3. Config:** this is a configuration file, which contains the common data
  **4. Runner:** it contains the code which act as bridge between feature and stepdefination
  **5. StepDefination:** it contains the code for the steps written in feature file, actual test cases
  **6. Resources:** it contains the exe for chromedriver
  **7. Feature:** it contains the feature files
   
