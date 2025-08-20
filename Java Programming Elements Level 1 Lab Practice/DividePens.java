// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
// Hint => 
// Use Modulus Operator (%) to find the reminder.
// Use Division Operator to find the Quantity of pens
// I/P => NONE
// O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___


public class DividePens {
    public static void main(String[] args) {
        // Step 1: Initialize total pens and number of students
        int totalPens = 14;
        int students = 3;

        // Step 2: Calculate pens per student
        int pensPerStudent = totalPens / students;

        // Step 3: Calculate remaining pens
        int remainingPens = totalPens % students;

        // Step 4: Display result
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens + ".");
    }
}

