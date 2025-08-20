// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // To store the sum

        while (true) {
            // Take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // Check for stop condition
            if (number <= 0) {
                break; // Exit the loop
            }

            // Add number to total
            total += number;
        }

        // Print result
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
