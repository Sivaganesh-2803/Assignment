# Automation Framework Overview

This is an **automation framework** that supports both **Web** and **Mobile** automation testing.

---

## Supported Platforms

### Web Automation
- Airbnb web application
- Supported browsers: **Chrome, Firefox, Edge**

### Mobile Automation
- CultFit mobile app on **Android**
- Runs on **LambdaTest** cloud

---

## Test Management
- **TestNG**: For running tests
- **RetryAnalyzer**: Automatically retries failed tests (up to 2 times)

---

## Reporting
- **ExtentReports**: Generates detailed HTML reports with:
  - Pass/Fail logs
  - Step-by-step execution details

---

## Project Structure

src/
├── main/
│ ├── base/
│ │ └── BaseTest.java // Driver setup for web & mobile, either locally or on LambdaTest, and ExtentReports initialization
│ ├── pages/
│ │ ├── AirbnbPage.java // Page class for Airbnb web
│ │ └── CultFitPage.java // Page class for CultFit mobile
│ └── utils/
│ ├── RetryAnalyzer.java // Retries failed tests
│ └── PropertiesReader.java // Reads properties file
└── test/
└── tests/
└── TestClass.java // Calls methods from Page classes
