# katalon-example-project - Automation Practice Project

This repository contains an automated testing project for the [Sauce Demo](https://www.saucedemo.com/) website and [req](https://app.reqres.in/) API . It is built using **Katalon Studio** as part of my automation testing learning journey.

## 🚀 Project Overview
The main goal of this project is to practice and implement various automation testing techniques, including:
- **Web UI Testing**: Automating end-to-end scenarios for a web application.
- **API Testing**: Testing REST API endpoints (e.g., login and booking scenarios).
- **Data-Driven Testing (DDT)**: Running tests with multiple sets of data from external files.
- **Git Workflow**: Managing branches (main, web-extra, api-extra) and practicing merging processes.

## 🛠️ Technologies Used
- **Testing Tool**: Katalon Studio
- **Language**: Groovy
- **Version Control**: Git (managed via Fork/GitHub)
- **Reporting**: Katalon Basic Report

## 📂 Key Features & Scenarios
1. **Web Automation**:
   - Authentication (Positive and Negative login scenarios).
   - Cart management and Checkout process.
   - Dynamic element handling (Math Captcha/Calculations).
2. **API Automation**:
   - Validating API responses and status codes.
3. **Advanced Logic**:
   - Custom Keywords and Test Listeners for hooks.
   - Dynamic math question validation using Regex.

## ⚙️ How to Run
1. Clone this repository:
   ```bash
   git clone [https://github.com/rbianca14/katalon-example-project.git](https://github.com/rbianca14/katalon-example-project.git)
2. Open Project in Katalon:
   - Launch Katalon Studio.
   - Click on File > Open Project.
   - Browse to the cloned folder and select the Sauce Demo.prj file.
3. Restore Dependencies (If prompted):
   - Let Katalon build the project indices and load the keywords.
4. Running a Test Case:
   - Go to the Tests Explorer on the left sidebar.
   - Navigate to Test Cases > Login (or any other folder).
   - Double-click on a Test Case to open it.
   - Click the Run button (top toolbar) or press Ctrl + R.
5. Running a Test Suite (Recommended for DDT):
   - Navigate to the Test Suites folder in Tests Explorer.
   - Open a specific Suite (e.g., Regression Suite).
   - Click the Run button. This will execute multiple tests and generate a report.
6. View Results:
   - Once execution finishes, check the Log Viewer at the bottom to see step-by-step results.
   - Detailed reports can be found in the Reports folder within the project directory.
