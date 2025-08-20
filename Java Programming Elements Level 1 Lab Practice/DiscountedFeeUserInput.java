// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// Hint => 
// Create a variable named fee and take user input for fee.
// Create another variable discountPercent and take user input.
// Compute the discount and assign it to the discount variable.
// Compute and print the fee you have to pay by subtracting the discount from the fee.
// I/P => fee, discountPrecent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;

public class DiscountedFeeUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for fee
        System.out.print("Enter the student fee in INR: ");
        double fee = sc.nextDouble();

        // Step 2: Take user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        if (fee < 0 || discountPercent < 0) {
            System.out.println("Fee and discount percentage cannot be negative.");
        } else {
            // Step 3: Calculate discount
            double discount = (fee * discountPercent) / 100;

            // Step 4: Calculate final fee after discount
            double finalFee = fee - discount;

            // Step 5: Display result
            System.out.println("The discount amount is INR " + discount +
                    " and final discounted fee is INR " + finalFee + ".");
        }

        sc.close();
    }
}

