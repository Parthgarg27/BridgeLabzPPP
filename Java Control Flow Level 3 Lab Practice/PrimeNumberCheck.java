// Write a Program to check if the given number is a prime number or not
// Hint => 
// A number that can be divided exactly only by itself and 1 are Prime Numbers,
// Prime Numbers checks are done for numbers greater than 1
// Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
// Use the isPrime boolean variable to store the result

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Number should be greater than 1.");
        } else {
            boolean isPrime = true;

            // Check for prime
            for (int i = 2; i <= number / 2; i++) { // only need to check till number/2
                if (number % i == 0) {
                    isPrime = false;
                    break; // number is divisible by i, not prime
                }
            }

            // Display result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }

        sc.close();
    }
}
