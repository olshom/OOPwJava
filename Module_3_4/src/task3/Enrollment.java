package task3;

import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student=student;
        this.course=course;
        this.enrollmentDate=enrollmentDate;
    }

    public Enrollment() {
        student = null;
        course = null;
        enrollmentDate = "";
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return student.getName() + " is enrolled to " + course.getCoursename();
    }
}
