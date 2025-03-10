package access_modifiers;

class Student {
    public int rollNumber; 
    protected String name; 
    private double CGPA; 

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0 and 10.");
        }
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGStudentInfo() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name); 
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); 
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Rithik", 8.5);
        student1.displayStudentInfo();

        // Modifying CGPA using setter
        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(222, "Bob", 9.0, "Machine Learning");
        pgStudent.displayPGStudentInfo();
    }
}