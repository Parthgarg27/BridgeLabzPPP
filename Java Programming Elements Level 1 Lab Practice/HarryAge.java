// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___ 

public class HarryAge {
    public static void main(String[] args) {
        // Step 1: Initialize birth year and current year
        int birthYear = 2000;
        int currentYear = 2024;

        // Step 2: Calculate age
        int age = currentYear - birthYear;

        // Step 3: Display the result
        System.out.println("Harry's age in " + currentYear + " is " + age + ".");
    }
}

