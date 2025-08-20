// Write a program to find the side of the square whose parameter you read from user 
// Hint => Perimeter of Square is 4 times side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        if (perimeter <= 0) {
            System.out.println("Perimeter must be a positive number.");
        } else {
            // Step 2: Calculate side of the square
            double side = perimeter / 4;

            // Step 3: Display result
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");
        }

        sc.close();
    }
}

