// Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;

            // While loop for factorial
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
