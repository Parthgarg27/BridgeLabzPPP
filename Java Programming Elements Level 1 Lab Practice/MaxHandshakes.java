// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.


import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for handshakes.");
        } else {
            // Step 2: Calculate maximum number of handshakes using combination formula
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Step 3: Display result
            System.out.println("The maximum number of handshakes among " 
                               + numberOfStudents + " students is " + maxHandshakes + ".");
        }

        sc.close();
    }
}

