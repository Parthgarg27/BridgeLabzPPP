// Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch.

// Hint ⇒

// Create a variable counter to take the user input value for the countdown.

// Use a for loop to start from the input value and decrement until 1.

// Inside the loop, print the current countdown number.

// After the loop, print "Lift Off! 🚀".

// I/P ⇒ number
// O/P ⇒
// Countdown numbers printed one by one followed by "Lift Off! 🚀".

// Rewrite program 8 to do the countdown using the for-loop

import java.util.Scanner;

public class ForLoopCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Final message after countdown
        System.out.println("Lift Off! 🚀");

        sc.close();
    }
}
