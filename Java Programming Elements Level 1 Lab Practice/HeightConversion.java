// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        if (heightCm <= 0) {
            System.out.println("Height must be a positive number.");
        } else {
            // Step 2: Convert cm to inches (1 inch = 2.54 cm)
            double totalInches = heightCm / 2.54;

            // Step 3: Convert inches to feet and remaining inches
            int feet = (int) (totalInches / 12);
            double inches = totalInches % 12;

            // Step 4: Display result
            System.out.println("Your Height in cm is " + heightCm +
                    " while in feet is " + feet + " and inches is " + inches + ".");
        }

        sc.close();
    }
}

