PROJECT SYNOPSIS:
SauceDemo Automation Testing Project - Using Selenium WebDriver with Java & TestNG

1️⃣ Project Title
Automation Testing of SauceDemo Web Application using Selenium WebDriver

2️⃣ Introduction
Automation testing is a software testing technique that uses automated tools and scripts to execute test cases. It helps reduce manual effort, improve efficiency, and ensure application stability. 
This project focuses on automating the SauceDemo e-commerce web application using Selenium WebDriver with Java and TestNG framework.

3️⃣ Objective

- The main objectives of this project are:
- To automate the login functionality
- To validate dashboard visibility after login
- To automate add to cart functionality
- To verify cart details
- To automate remove from cart functionality
- To automate logout functionality
- To execute all test cases using TestNG suite

4️⃣ Tools & Technologies Used

Tool / Technology	Purpose
Java	Programming Language
Selenium WebDriver	Automation Tool
TestNG	Testing Framework
Maven	Dependency Management
Eclipse IDE	Development Environment
GitHub	Version Control

5️⃣ Project Architecture

The project follows Page Object Model (POM) design pattern.

Packages Used:

base → Contains BaseTest class (WebDriver setup)
pages → Contains page classes with locators & methods
tests → Contains TestNG test classes
testng.xml → Executes all test classes as a suite

6️⃣ Modules Automated
 
- Login Module
- Dashboard Verification Module
- Add To Cart Module
- Cart Verification Module
- Remove From Cart Module
- Logout Module
- Each test case runs independently.

7️⃣ Features of the Project

- Uses Page Object Model (POM)
- Uses TestNG framework
- Separate test suite execution using testng.xml
- Independent test execution
- Clean project structure using Maven
- Version controlled using GitHub

8️⃣ Execution Process

- testng.xml file is executed.
- TestNG runs all test classes.
- WebDriver launches browser.
- Test cases execute step-by-step.
- TestNG generates report.
- Browser closes after execution.

9️⃣ Expected Outcome

All modules should execute successfully.
All test cases should pass.
Automation should reduce manual testing effort.

🔟 Conclusion

This project successfully demonstrates automation testing of a web application using Selenium WebDriver. It improves efficiency, reduces manual effort, and ensures application functionality through automated test cases.
The project also demonstrates understanding of POM design pattern and TestNG framework integration.
