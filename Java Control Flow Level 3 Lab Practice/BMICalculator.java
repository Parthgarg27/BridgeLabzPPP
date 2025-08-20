// Create a program to find the BMI of a person
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
// Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Use the table to determine the weight status of the person
 

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for weight and height
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble();

        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Weight and height must be positive numbers.");
        } else {
            // Step 2: Convert height to meters
            double heightM = heightCm / 100;

            // Step 3: Calculate BMI
            double bmi = weight / (heightM * heightM);

            // Step 4: Determine weight status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal weight";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Step 5: Display results
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.println("Weight Status: " + status);
        }

        sc.close();
    }
}


