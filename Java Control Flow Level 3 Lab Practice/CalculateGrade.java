// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

        // Check for valid marks
        if (physics < 0 || chemistry < 0 || maths < 0 || physics > 100 || chemistry > 100 || maths > 100) {
            System.out.println("Marks should be between 0 and 100 for all subjects.");
        } else {
            // Compute total and percentage
            double total = physics + chemistry + maths;
            double percentage = (total / 300) * 100;

            // Calculate grade based on percentage
            String grade;
            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else if (percentage >= 40) {
                grade = "D";
            } else {
                grade = "F"; // Fail
            }

            // Display results
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
