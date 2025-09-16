public class CircleWithChaining {
    // Attribute
    private double radius;

    // Default constructor
    public CircleWithChaining() {
        // Calls the parameterized constructor with a default radius of 1.0
        // This is constructor chaining.
        this(1.0);
        System.out.println("Default constructor called, radius set to 1.0.");
    }

    // Parameterized constructor
    public CircleWithChaining(double radius) {
        this.radius = radius;
        System.out.println("Parameterized constructor called with radius: " + radius);
    }

    // Method to display the area
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The circle with radius " + radius + " has an area of " + String.format("%.2f", area) + ".");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Creating Circle 1 (using default constructor):");
        CircleWithChaining circle1 = new CircleWithChaining();
        circle1.displayArea();

        System.out.println("Creating Circle 2 (using parameterized constructor):");
        CircleWithChaining circle2 = new CircleWithChaining(5.0);
        circle2.displayArea();
    }
}
