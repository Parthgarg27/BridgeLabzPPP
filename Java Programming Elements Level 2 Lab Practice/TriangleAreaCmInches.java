// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___

import java.util.Scanner;

public class TriangleAreaCmInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = sc.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = sc.nextDouble();

        if (baseCm <= 0 || heightCm <= 0) {
            System.out.println("Base and height must be positive numbers.");
        } else {
            // Step 2: Calculate area in square centimeters
            double areaCm = 0.5 * baseCm * heightCm;

            // Step 3: Convert area to square inches (1 inch = 2.54 cm)
            double areaInches = areaCm / (2.54 * 2.54);

            // Step 4: Display results
            System.out.println("The Area of the triangle in sq in is " + areaInches + 
                               " and sq cm is " + areaCm + ".");
        }

        sc.close();
    }
}

