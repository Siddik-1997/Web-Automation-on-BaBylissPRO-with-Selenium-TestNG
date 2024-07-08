# Web Automation on BaBylissPRO Website with Selenium TestNG

## What is Automation?

Automation is the process of using software tools and scripts to perform tasks that would typically be done manually by a human. In the context of software testing, automation involves using tools to execute test cases and compare the actual results with the expected results automatically.

## Why we use Selenium TestNG for Automation?

Selenium is a popular open-source testing tool widely used for automating web browsers. It allows developers and testers to automate web-based applications' testing across multiple browsers and platforms. Selenium provides a set of APIs to interact with web elements and manipulate their properties and behaviors, making it an ideal tool for automating UI tests.

TestNG is a testing framework for Java that is designed to be more flexible and powerful than JUnit. It supports a wide range of testing functionalities, including unit, integration, and end-to-end testing, as well as parallel execution, data-driven testing, and reporting. TestNG is often used with Selenium to create robust and scalable test automation frameworks.

## Technology used:
- Selenium Webdriver
- TestNG Framework
- Java
- Gradle
- Intellij idea
- Allure

## How to run this project

- Clone this project
- Hit the following command into the terminal:
 ```gradle clean test```
 
- For generating Allure Report use these commands:
```allure generate allure-results --clean -o allure-report``` and
```allure serve allure-results```

## Scenerio:

- Visit the BaBylissPRO site: https://staging-na-conair.demandware.net/s/us-babylisspro/
- Create an account
- Validate the account
- Login with that account
- Go to Contact Support section
- Do Logout

## Test case check list based on the Scenerio:

- Create a customer account
- Customer login with Invalid credentials. 
- Customer Login with valid credentials.
- Check the Customer contact section
- Logout the user

## Allure Report:
![2024-07-08_20-47-11](https://github.com/Siddik-1997/Web-Automation-on-BaBylissPRO-with-Selenium-TestNG/assets/123433625/b9a3129c-65f9-4fae-a8d2-340c22cd29e3)

![2024-07-08_20-47-49](https://github.com/Siddik-1997/Web-Automation-on-BaBylissPRO-with-Selenium-TestNG/assets/123433625/81672777-00db-4998-8031-04aaebe8af6d)





## Automation Output Video:

https://github.com/Siddik-1997/Web-Automation-on-BaBylissPRO-with-Selenium-TestNG/assets/123433625/0309bf4e-e1a6-47e8-b6b4-97e58f8c7f6b

