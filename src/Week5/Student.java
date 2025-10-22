package Week5;

public class Student {
    // Attributes
    private String name;
    private int[] marks; // marks in multiple subjects

    // Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.printf("\nPercentage: %.2f%%\n", calculatePercentage());
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Example marks for 5 subjects
        int[] studentMarks = {85, 90, 78, 88, 92};
        Student student = new Student("Alice", studentMarks);

        // Display student details
        student.display();
    }
}

