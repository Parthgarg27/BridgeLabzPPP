// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

public class FriendsYoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();

        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();

        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Find the youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngestFriend + " (" + youngestAge + " years)");
        System.out.println("The tallest friend is: " + tallestFriend + " (" + tallestHeight + " cm)");

        sc.close();
    }
}
