package proj;

import java.io.Serializable;
import java.util.Vector;
/**
 * Represents a course offered in an educational institution.
 * This class is Serializable to support object serialization.
 */
public class Course implements Serializable {
private static final long serialVersionUID = 8391106857665650604L;
    private String courseName;
    private Integer creditsNumber;
    private Vector<Course> prerequisites;
    private Vector<Teacher> listOfInstructors;
    private String courseCode;
    private Integer maxStudentNumber;
    private Mark mark;
    /**
     * Constructs a Course object with specified attributes.
     *
     * @param courseName       The name of the course.
     * @param creditsNumber    The number of credits assigned to the course.
     * @param courseCode       The unique code associated with the course.
     * @param maxStudentNumber The maximum number of students allowed in the course.
     */

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
        this.mark = null;
        // Initialize other attributes as needed
    }
    /**
     * Gets the name of the course.
     *
     * @return The name of the course.
     */
    // Getters and setters
    public String getCourseName() {
        return this.courseName;
    }
    /**
     * Sets the name of the course.
     *
     * @param courseName The name to set for the course.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    /**
     * Gets the number of credits assigned to the course.
     *
     * @return The number of credits assigned to the course.
     */
    public Integer getCreditsNumber() {
        return this.creditsNumber;
    }
    /**
     * Sets the number of credits assigned to the course.
     *
     * @param creditsNumber The number of credits to set for the course.
     */
    public void setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }
    /**
     * Gets the prerequisites for the course.
     *
     * @return The prerequisites for the course.
     */
    public Vector<Course> getPrerequisites() {
        return this.prerequisites;
    }
    /**
     * Sets the prerequisites for the course.
     *
     * @param prerequisites The prerequisites to set for the course.
     */
    public void setPrerequisites(Vector<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
    /**
     * Gets the list of instructors teaching the course.
     *
     * @return The list of instructors teaching the course.
     */
    public Vector<Teacher> getListOfInstructors() {
        return this.listOfInstructors;
    }
    /**
     * Sets the list of instructors teaching the course.
     *
     * @param listOfInstructors The list of instructors to set for the course.
     */
    public void setListOfInstructors(Vector<Teacher> listOfInstructors) {
        this.listOfInstructors = listOfInstructors;
    }
    /**
     * Gets the unique code associated with the course.
     *
     * @return The course code.
     */
    public String getCourseCode() {
        return this.courseCode;
    }
    /**
     * Sets the unique code associated with the course.
     *
     * @param courseCode The course code to set.
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    /**
     * Gets the maximum number of students allowed in the course.
     *
     * @return The maximum number of students.
     */
    public Integer getMaxStudentNumber() {
        return this.maxStudentNumber;
    }
    /**
     * Sets the maximum number of students allowed in the course.
     *
     * @param maxStudentNumber The maximum number of students to set.
     */
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

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    // TODO: Implement other methods

}
