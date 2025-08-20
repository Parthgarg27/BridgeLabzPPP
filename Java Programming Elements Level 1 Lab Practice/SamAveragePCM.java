// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
// I/P => NONE
// O/P => Sam’s average mark in PCM is ___

public class SamAveragePCM {
    public static void main(String[] args) {
        // Step 1: Initialize marks
        double maths = 94;
        double physics = 95;
        double chemistry = 96;

        // Step 2: Calculate average
        double average = (maths + physics + chemistry) / 3;

        // Step 3: Display result
        System.out.println("Sam's average mark in PCM is " + average + ".");
    }
}

