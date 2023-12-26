package proj;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Teacher extends Employee{
    private static final long serialVersionUID = 1L;

    private TeacherType teacherType;
    private Faculty faculty;
    public Vector<Course> coursesTaken;
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

    public String getCoursesTaken() {
        String ans = "";
        for(Course c : coursesTaken) ans += c.getCourseName() + ", ";
        return ans;
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
                        "  Password: %s%n" +
                        "  Email: %s%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d%n years" +
                        "  Courses taken: %s",
                getFirstName(), getLastName(), getID(),
                getUsername(), getPassword(), getEmail(), getHireDate(), getWorkExperience(), getCoursesTaken());
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
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to the correct type
        Teacher other = (Teacher) obj;

        // Perform field-by-field comparison using Objects.equals
        return Objects.equals(this.getUsername(), other.getUsername()) && Objects.equals(this.getPassword(), other.getPassword());
    }
}
