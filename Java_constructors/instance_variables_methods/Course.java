public class Course {
    public String courseName;
    public int duration;
    public double fee;
    public static String instituteName = "Tech Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 8, 500.0);
        Course course2 = new Course("Web Development", 12, 700.0);

        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Global Tech Institute");

        System.out.println("After Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
