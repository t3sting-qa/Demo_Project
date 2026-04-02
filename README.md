#How to run:
script command:
mvn clean test -DsuiteXmlFile=testng.xml


#Framework Choice Justification:
- Used Java for programming, Selenium for navigation and activities, testng as runner to make sure parallael test or other runner configcan be done easily.
- TestNG provided annoatation helps to manage tests in separate environment or separate run
- Used Maven for build version control, easy to maintain all dependenciess at one place.

#Architecture Explanation
-The project follows a Page Object Model (POM) design pattern to keep the code maintainable and avoid duplication. By separating the page-specific locators and actionsfrom the actual test logic the scripts become much more readable. If a UI element changes on the website, we only need to update it in one place within the Page class rather than searching through every test case.
-The framework uses a BaseTest class to handle global setup and teardown process, such as initializing the WebDriver and managing browser timeouts. This structure makes sure that every test starts with a fresh browser instance and clean state. Common utilities, such as JavaScript scrolling actions, are extracted into a separate util package to keep the core page objects focused solely on element interactions.
  
