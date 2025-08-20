// Create a program to convert distance in kilometers to miles.
// Hint => 
// Create a variable km and assign type as double as in double km;
// Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
// Use Scanner Object to take user input for km as in km = input.nextInt();
// Use 1 mile = 1.6 km formulae to calculate miles and show the output
// I/P => km
// O/P => The total miles is ___ mile for the given ___ km


import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        if (km < 0) {
            System.out.println("Distance cannot be negative.");
        } else {
            // Step 3: Convert kilometers to miles (1 mile = 1.6 km)
            double miles = km / 1.6;

            // Step 4: Display result
            System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
        }

        input.close();
    }
}

