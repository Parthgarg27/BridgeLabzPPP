public class LibraryBook {
    // Attributes
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // A new book is always available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Thank you for borrowing '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }

    public void displayStatus() {
        System.out.println("\nTitle: " + title + " by " + author);
        System.out.println("Status: " + (isAvailable ? "Available" : "Checked Out"));
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Hobbit", "J.R.R. Tolkien", 12.50);

        book.displayStatus(); // Check initial status

        book.borrowBook(); // First borrow attempt
        book.displayStatus(); // Check status after borrowing

        book.borrowBook(); // Second borrow attempt
    }
}
