// Write a program to find the distance in yards and miles for the distance provided by the user in feet
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => The distance in yards is ___ while the distance in miles is ___

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        if (distanceInFeet <= 0) {
            System.out.println("Distance must be a positive number.");
        } else {
            // Step 2: Convert feet to yards (1 yard = 3 feet)
            double distanceInYards = distanceInFeet / 3.0;

            // Step 3: Convert yards to miles (1 mile = 1760 yards)
            double distanceInMiles = distanceInYards / 1760.0;

            // Step 4: Display results
            System.out.println("The distance in yards is " + distanceInYards + 
                               " while the distance in miles is " + distanceInMiles + ".");
        }

        sc.close();
    }
}

