// Create a program to count the number of digits in an integer.
// Hint => 
// Get an integer input for the number variable.
// Create an integer variable count with value 0.
// Use a loop to iterate until number is not equal to 0.
// Remove the last digit from number in each iteration
// Increase count by 1 in each iteration.
// Finally display the count to show the number of digits

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize count
        int count = 0;
        int temp = Math.abs(number); // handle negative numbers

        // Step 3: Loop to count digits
        if (temp == 0) {
            count = 1; // special case for 0
        } else {
            while (temp != 0) {
                temp = temp / 10; // remove last digit
                count++;           // increment count
            }
        }

        // Step 4: Display the number of digits
        System.out.println("The number of digits in " + number + " is: " + count);

        sc.close();
    }
}

