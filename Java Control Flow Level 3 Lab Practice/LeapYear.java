// Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
// Hint => 
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
// Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
// Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if year is valid
        if (year < 1582) {
            System.out.println("The year should be 1582 or later.");
        } else {
            // Part 1: Using multiple if-else statements
            if (year % 4 != 0) {
                System.out.println(year + " is not a Leap Year (checked with multiple if-else).");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year (checked with multiple if-else).");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (checked with multiple if-else).");
            } else {
                System.out.println(year + " is not a Leap Year (checked with multiple if-else).");
            }

            // Part 2: Using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year (checked with single if and logical operators).");
            } else {
                System.out.println(year + " is not a Leap Year (checked with single if and logical operators).");
            }
        }

        sc.close();
    }
}
