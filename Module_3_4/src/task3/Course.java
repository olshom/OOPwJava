package task3;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String coursename;
    private String instructor;

    public Course (String courseCode, String coursename, String instructor) {
        this.courseCode=courseCode;
        this.coursename=coursename;
        this.instructor=instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString(){
        return coursename + " is run by " + instructor;
    }
}
