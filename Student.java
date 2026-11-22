public class Student {
    private final int rollNumber;
    private final String name;
    private final String department;

    public Student(int rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Student student = new Student(101, "Asha", "Information Technology");
        student.displayDetails();
    }
}
