// Similarly, write the DoubleOpt program by taking double values and doing the same operations.


import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for a, b, and c as double
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Step 2: Compute operations respecting operator precedence
        double result1 = a + b * c;   // Multiplication before addition
        double result2 = a * b + c;   // Multiplication first, then addition
        double result3 = c + a / b;   // Division first, then addition
        double result4 = a % b + c;   // Modulus first, then addition

        // Step 3: Display results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        sc.close();
    }
}
