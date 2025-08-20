// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result

import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // Formula calculation
            int formulaSum = n * (n + 1) / 2;

            // For loop calculation
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            // Print results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);

            // Compare results
            if (formulaSum == forSum) {
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
