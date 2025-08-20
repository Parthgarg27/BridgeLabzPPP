// Create a program to check if a number taken from the user is a Harshad Number.
// Hint => 
// A Harshad number is an integer which is divisible by the sum of its digits. 
// For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
// Get an integer input for the number variable.
// Create an integer variable sum with initial value 0.
// Create a while loop to access each digit of the number.
// Inside the loop, add each digit of the number to sum.
// Check if the number is perfectly divisible by the sum.
// If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.


import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Step 2: Initialize variables
            int sum = 0;
            int temp = number;

            // Step 3: Sum of digits using while loop
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp = temp / 10; // remove last digit
            }

            // Step 4: Check if number is divisible by sum of digits
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is not a Harshad Number.");
            }
        }

        sc.close();
    }
}

