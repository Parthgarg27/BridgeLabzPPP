// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the while loop to check if the counter is 1
// Inside a while loop, print the value of the counter and decrement the counter.

import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement the counter
        }

        // Final message after countdown
        System.out.println("Lift Off! 🚀");

        sc.close();
    }
}
