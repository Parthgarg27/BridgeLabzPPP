// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Formula calculation
            int formulaSum = n * (n + 1) / 2;

            // While loop calculation
            int whileSum = 0;
            int i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            // Print results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

            // Compare results
            if (formulaSum == whileSum) {
                System.out.println("Both computations are correct ✅");
            } else {
                System.out.println("There is a mismatch ❌");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}
