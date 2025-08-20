// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
// Hint => NA
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___


import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        // Step 2: Take user input for quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        if (unitPrice < 0 || quantity < 0) {
            System.out.println("Unit price and quantity cannot be negative.");
        } else {
            // Step 3: Calculate total price
            double totalPrice = unitPrice * quantity;

            // Step 4: Display result
            System.out.println("The total purchase price is INR " + totalPrice +
                    " if the quantity " + quantity + " and unit price is INR " + unitPrice + ".");
        }

        sc.close();
    }
}
