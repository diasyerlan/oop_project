package proj;

import java.util.Vector;

public class Teacher extends Employee implements CanBeResearcher {

    private TeacherType teacherType;
    private String teacherName;
    private Integer teacherId;
    private Faculty faculty;
    private Vector<Course> coursesTaken;
    private Schedule schedule;
    private Mark mark;

    public Teacher(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
    }

    public TeacherType getTeacherType() {
        return this.teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Vector<Course> getCoursesTaken() {
        return this.coursesTaken;
    }

    public void setCoursesTaken(Vector<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }


    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    // Operations (methods)

    public void putMark() {
        // TODO: Implement your method
    }

    public void manageCourse() {
        // TODO: Implement your method
    }

    public String infoStudent() {
        // TODO: Implement your method
        return "";
    }

    public void viewCourse() {
        // TODO: Implement your method
    }

    // Additional methods and toString()...

    @Override
    public String toString() {
        // TODO: Implement your method
        return "";
    }

    public boolean putFirstAttestationMark() {
        // TODO: Implement your method
        return false;
    }

    public boolean putSecondAttestation() {
        // TODO: Implement your method
        return false;
    }

    public boolean putFinalAttestationMark() {
        // TODO: Implement your method
        return false;
    }


    @Override
    public boolean equals(Object obj) {
        // TODO: Implement your method
        return false;
    }
}
