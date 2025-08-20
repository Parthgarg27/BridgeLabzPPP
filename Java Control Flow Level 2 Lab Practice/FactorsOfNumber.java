// Create a program to find the factors of a number taken as user input.
// Hint => 
// Get the input value for a variable named number and check if it is a positive integer.
// Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            System.out.println("The factors of " + number + " are:");
            // Loop from 1 to number-1 to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
