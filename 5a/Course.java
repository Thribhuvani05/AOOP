package Com.Student_Info;
import java.util.ArrayList;
import java.util.List;
public class Course {
	private String courseId;
    private String courseName;
    private List<Student> students;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollInCourse(this);
        }
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}
