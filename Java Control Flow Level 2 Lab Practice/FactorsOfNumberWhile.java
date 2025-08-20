// Rewrite the above program 7 to find the factors of a number using the while loop
// Hint => 
// Get the input value for a variable named number and check if it is a positive integer.
// Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.

import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer.");
        } else {
            System.out.println("The factors of " + number + " are:");
            int counter = 1;

            // While loop to find factors
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; // increment counter
            }
        }

        sc.close();
    }
}
