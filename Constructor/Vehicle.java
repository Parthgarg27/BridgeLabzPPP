public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (static)
    static double registrationFee = 150.00;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Fee: $" + String.format("%.2f", registrationFee));
        System.out.println("---------------------------");
    }

    // Class method (static) to update the fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Charles Davis", "Sedan");
        Vehicle v2 = new Vehicle("Diana Prince", "Motorcycle");

        System.out.println("--- Initial Vehicle Registrations ---");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(175.50);
        System.out.println("\n*** Registration Fee Updated ***\n");

        System.out.println("--- Updated Vehicle Registrations ---");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
