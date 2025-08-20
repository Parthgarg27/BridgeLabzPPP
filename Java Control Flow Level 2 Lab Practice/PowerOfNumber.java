// Create a program to find the power of a number.
// Hint => 
// Get integer input for two variables - number and power and check for positive integer
// Create a result variable with an initial value of 1.
// Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power should be a positive integer.");
        } else {
            int result = 1;

            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}

