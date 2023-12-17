package proj;

import java.util.Date;
import java.util.Vector;

public class Teacher extends Employee implements CanBeResearcher {
    private static final long serialVersionUID = 1L;

    private TeacherType teacherType;
    private Faculty faculty;
    private Vector<Course> coursesTaken;
    private Schedule schedule;

    public Teacher(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience, TeacherType teacherType,
                   Faculty faculty, Vector<Course> coursesTaken, Schedule schedule) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
        this.teacherType = teacherType;
        this.faculty = faculty;
        this.coursesTaken = coursesTaken;
        this.schedule = schedule;
    }
    public static void updateTeacher() {
        System.out.println("6 - Change Teacher Type");
        System.out.println("7 - Change Faculty");
        System.out.println("8 - Change Courses Taken");

    }
    public TeacherType getTeacherType() {
        return this.teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
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
        return String.format("Teacher %s %s (ID: %s)%n" +
                        "  Username: %s%n" +
                        "  Email: %s%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years",
                getFirstName(), getLastName(), getID(),
                getUsername(), getEmail(), getHireDate(), getWorkExperience());
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
