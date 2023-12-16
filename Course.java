package proj;

import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable {

    private String courseName;
    private Integer creditsNumber;
    private Vector<Course> prerequisites;
    private Vector<Teacher> listOfInstructors;
    private String courseCode;
    private Integer maxStudentNumber;

    // Constructors, getters, and setters for the class attributes

    // Constructors

//    public Course(String courseName) {
//        if(courseName.equals())
//    }
    public Course(String courseName, Integer creditsNumber, String courseCode, Integer maxStudentNumber) {
        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
        this.courseCode = courseCode;
        this.maxStudentNumber = maxStudentNumber;
        this.prerequisites = new Vector<>();
        this.listOfInstructors = new Vector<>();
        // Initialize other attributes as needed
    }

    // Getters and setters
    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCreditsNumber() {
        return this.creditsNumber;
    }

    public void setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    public Vector<Course> getPrerequisites() {
        return this.prerequisites;
    }

    public void setPrerequisites(Vector<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public Vector<Teacher> getListOfInstructors() {
        return this.listOfInstructors;
    }

    public void setListOfInstructors(Vector<Teacher> listOfInstructors) {
        this.listOfInstructors = listOfInstructors;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getMaxStudentNumber() {
        return this.maxStudentNumber;
    }

    public void setMaxStudentNumber(Integer maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    // Other methods - implement as needed
    // TODO: Implement remaining methods

    @Override
    public String toString() {
        // TODO: Implement toString method
        return "";
    }

    // TODO: Implement other methods

}
