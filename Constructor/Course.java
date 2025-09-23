public class Course {
    // Instance variables: specific to each course
    String courseName;
    int duration; // in months
    double fee;

    // Class variable (static): common for all courses
    static String instituteName = "Global Tech Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method: displays details for a specific course object
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName); // Accessing static variable
        System.out.println("Course: " + this.courseName);
        System.out.println("Duration: " + this.duration + " months");
        System.out.println("Fee: $" + String.format("%.2f", this.fee));
        System.out.println("---------------------------");
    }

    // Class method (static): modifies the shared institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 500.00);
        Course c2 = new Course("Data Science", 12, 1500.00);

        System.out.println("--- Initial Course Details ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update the institute name using the static method
        Course.updateInstituteName("Future Coders Institute");
        System.out.println("\n*** Institute Name Updated ***\n");

        System.out.println("--- Updated Course Details ---");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
