// Rewrite the above program to find the power of a number using a while loop.
// Hint => 
// Get integer input for two variables named number and power.
// Create a result variable with an initial value of 1.
// Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
// In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
// Finally, print the result

import java.util.Scanner;

public class PowerOfNumberWhile {
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
            int counter = 0;

            // Calculate power using while loop
            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
