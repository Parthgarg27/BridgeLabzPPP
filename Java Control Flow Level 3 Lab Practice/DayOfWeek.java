// Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):


public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide 3 command-line arguments: month day year");
            return;
        }

        // Step 1: Parse command-line arguments
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid date input.");
            return;
        }

        // Step 2: Adjust month and year for Zeller's Congruence
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;       // year of the century
        int j = y / 100;       // zero-based century

        // Step 3: Zeller's formula
        int h = (d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Step 4: Map result to 0=Sunday, 1=Monday, ... 6=Saturday
        int dayOfWeek = ((h + 6) % 7); // Adjust to make 0=Sunday

        // Step 5: Print the result
        System.out.println("Day of the week (0=Sunday, 1=Monday, ..., 6=Saturday): " + dayOfWeek);
    }
}


