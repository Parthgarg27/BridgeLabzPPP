class Student {
    public int rollNumber; // Accessible from anywhere
    protected String name; // Accessible within the package and by subclasses
    private double CGPA; // Accessible only within the Student class

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access the private CGPA
    public double getCGPA() {
        return this.CGPA;
    }

    // Public method to modify the private CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
        }
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

// Subclass
class PostgraduateStudent extends Student {
    String researchArea;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchArea) {
        super(rollNumber, name, CGPA);
        this.researchArea = researchArea;
    }

    public void accessProtectedMember() {
        // Subclass can directly access the protected 'name' member of the superclass
        System.out.println("Accessing protected member from subclass: Name is " + this.name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        System.out.println("--- Postgraduate Student ---");
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Eva Green", 3.8, "AI");

        // Accessing public member
        System.out.println("Public access: Roll Number is " + pgStudent.rollNumber);

        // Accessing protected member from subclass method
        pgStudent.accessProtectedMember();

        // Accessing private member via public method
        System.out.println("Accessing private data via getter: CGPA is " + pgStudent.getCGPA());

        // Cannot access private member directly:
        // pgStudent.CGPA = 3.9; // This would cause a compile error
    }
}
