public class BookWithConstructors {
    // Attributes
    String title;
    String author;
    double price;

    // 1. Default constructor
    // Initializes the object with default values.
    public BookWithConstructors() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // 2. Parameterized constructor
    // Initializes the object with user-provided values.
    public BookWithConstructors(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        System.out.println("Book 1 (Default Constructor):");
        BookWithConstructors book1 = new BookWithConstructors();
        book1.displayDetails();

        // Create an object using the parameterized constructor
        System.out.println("Book 2 (Parameterized Constructor):");
        BookWithConstructors book2 = new BookWithConstructors("1984", "George Orwell", 15.99);
        book2.displayDetails();
    }
}