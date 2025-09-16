public class PersonWithCopyConstructor {
    // Attributes
    String name;
    int age;

    // Parameterized constructor
    public PersonWithCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    // Creates a new object by copying the attributes from another object.
    public PersonWithCopyConstructor(PersonWithCopyConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Original object
        System.out.println("Original Person:");
        PersonWithCopyConstructor person1 = new PersonWithCopyConstructor("John Doe", 30);
        person1.displayDetails();

        // Create a copy using the copy constructor
        System.out.println("\nCopied Person (using copy constructor):");
        PersonWithCopyConstructor person2 = new PersonWithCopyConstructor(person1);
        person2.displayDetails();

        // Modifying the original object to show the copy is independent
        person1.name = "Jane Doe";
        System.out.println("\nAfter modifying the original:");
        System.out.print("Original: ");
        person1.displayDetails();
        System.out.print("Copied:   ");
        person2.displayDetails(); // The copy remains unchanged
    }
}