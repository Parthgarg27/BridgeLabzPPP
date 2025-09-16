public class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Economy";
        this.rentalDays = 1;
        this.pricePerDay = 50.0; // Default price
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double pricePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return this.rentalDays * this.pricePerDay;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + String.format("%.2f", calculateTotalCost()));
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Rental 1 (Default):");
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

        System.out.println("Rental 2 (Parameterized):");
        CarRental rental2 = new CarRental("Bob Brown", "SUV", 7, 75.50);
        rental2.displayRentalDetails();
    }
}
