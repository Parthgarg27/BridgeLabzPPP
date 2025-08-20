// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            // For loop for factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
