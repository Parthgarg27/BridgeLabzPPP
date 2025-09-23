public class Product {
    // Instance variables: each Product object will have its own copy
    String productName;
    double price;

    // Class variable (static): shared by all Product objects
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the shared counter each time a new product is created
    }

    // Instance method: operates on the instance variables of a specific object
    public void displayProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: $" + String.format("%.2f", this.price));
    }

    // Class method (static): belongs to the class, not a specific object
    public static void displayTotalProducts() {
        System.out.println("Total number of products created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Display total products before creating any
        System.out.println("--- Initial State ---");
        Product.displayTotalProducts();

        // Create product instances
        System.out.println("\n--- Creating Products ---");
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.00);
        Product p3 = new Product("Keyboard", 75.50);

        System.out.println("\n--- Product Details ---");
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products after creation
        System.out.println("\n--- Final State ---");
        // The static method is called on the class itself
        Product.displayTotalProducts();
    }
}
