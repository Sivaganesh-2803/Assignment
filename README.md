# Assignment
Automation Framework README
Overview

This is a  automation framework which supports:

Web Automation: Airbnb web application (Chrome, Firefox, Edge).

Mobile Automation: CultFit mobile app on Android using LambdaTest.

Test Management: TestNG for running tests and RetryAnalyzer for retrying failed tests.

Reporting: ExtentReports for detailed HTML reports.

Project Structure
src/main
│
├── base
│   └── BaseTest.java               // Driver setup for web , mobile either locally or lambda test and extent report
│
├── pages
│   ├── AirbnbPage.java             // Page class for Airbnb web
│   └── CultFitPage.java            // Page class for CultFit mobile
│
└── utils
    ├── RetryAnalyzer.java          // Retry failed tests
    └── PropertiesReader.java      // Method to properties file

src/test
│
├── tests
│   └── Testclass.java               // Calls the methods from Page classes  



Features

RetryAnalyzer: Automatically retries failed tests up to 2 times.

ExtentReports: Generates detailed HTML reports with:

Pass/Fail logs

Cross-browser support: Chrome, Firefox, Edge

Mobile Support: Android apps on LambdaTest cloud
