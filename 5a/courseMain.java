package Com.Student_Info;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Physics");

        EnrollmentManager enrollmentManager = new EnrollmentManager();

        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course1);
        enrollmentManager.enroll(student2, course2);

        System.out.println("\nStudents enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student);
        }

        System.out.println("\nStudents enrolled in " + course2.getCourseName() + ":");
        for (Student student : course2.getStudents()) {
            System.out.println(student);
        }

        System.out.println("\nCourses " + student1.getName() + " is enrolled in:");
        for (Course course : student1.getCourses()) {
            System.out.println(course);
        }
    }
}
