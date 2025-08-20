// Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P => 
// Is the first number the largest? ____
// Is the second number the largest? ___
// Is the third number the largest? ___

import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Check conditions
        boolean firstLargest = (number1 > number2 && number1 > number3);
        boolean secondLargest = (number2 > number1 && number2 > number3);
        boolean thirdLargest = (number3 > number1 && number3 > number2);

        // Output
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        sc.close();
    }
}
