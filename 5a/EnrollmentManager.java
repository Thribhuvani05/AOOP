package Com.Student_Info;

public class EnrollmentManager {
	public void enroll(Student student, Course course) {
        course.enrollStudent(student);
        System.out.println(student.getName() + " has been enrolled in " + course.getCourseName());
    }
}
