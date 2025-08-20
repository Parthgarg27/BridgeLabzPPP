// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____

import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = (number1 < number2 && number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}
