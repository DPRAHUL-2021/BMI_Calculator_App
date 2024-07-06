# BMI Calculator App

BMI Calculator is an Android application built with Kotlin that calculates the Body Mass Index (BMI) based on user input for weight, height, and age. The application also categorizes the BMI result and displays it in a user-friendly interface.

## Features
- **User Input:** Enter weight, height, and age.
- **BMI Calculation:** Computes BMI using the standard formula.
- **BMI Categorization:** Categorizes results into Underweight, Normal, Overweight, or Obese.
- **Result Display:** Shows BMI and category on a separate result screen.
- **Intuitive UI:** Simple and easy-to-use interface.

## Screenshots
![Step1](/Details.png)

![Step2](/Result.png)

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/DPRAHUL-2021/bmi-calculator.git
    ```
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or physical device.

## Usage
1. Enter your weight in kilograms, height in centimeters, and age in years.
2. Tap the "Calculate" button.
3. View your BMI and its category on the result screen.

## Code Overview
### MainActivity
Handles user input, BMI calculation, and navigation to the `ResultActivity` to display the results.

### ResultActivity
Displays the calculated BMI and its category.
