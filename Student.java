package proj;

import java.io.Serializable;
import java.util.Vector;

public class Student extends User implements CanBeResearcher, Serializable {
    

    private Degree studentDegree;
    private double gpa;
    private Integer course;
    private Faculty faculty;
    private String specialization;
    private Vector<Book> booksTaken;
    private Schedule schedule;
    private paymentStrategy paymentStrategy;
    private StudentOrganization studentOrganization;
    private Transcript transcript;


    public Student(String firstName, String lastName, String username, String email, String password, String ID, Degree studentDegree,
                   double gpa, int course, Faculty faculty, String specialization, Vector<Book> booksTaken, Schedule schedule,
                   paymentStrategy paymentStrategy, StudentOrganization studentOrganization, Transcript transcript) {
        super(firstName, lastName, username, email, password, ID);
        this.studentDegree = studentDegree;
        this.gpa = gpa;
        this.course = course;
        this.faculty = faculty;
        this.specialization = specialization;
        this.booksTaken = booksTaken;
        this.schedule = schedule;
        this.paymentStrategy = paymentStrategy;
        this.studentOrganization = studentOrganization;
        this.transcript = transcript;

    }



    private Degree getStudentDegree() {
        return this.studentDegree;
    }

    private void setStudentDegree(Degree studentDegree) {
        this.studentDegree = studentDegree;
    }


    private double getGpa() {
        return this.gpa;
    }

    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private Integer getCourse() {
        return this.course;
    }

    private void setCourse(Integer course) {
        this.course = course;
    }

    private Faculty getFaculty() {
        return this.faculty;
    }

    private void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    private String getSpecialization() {
        return this.specialization;
    }

    private void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private Vector<Book> getBooksTaken() {
        return this.booksTaken;
    }

    private void setBooksTaken(Vector<Book> booksTaken) {
        this.booksTaken = booksTaken;
    }

    private Schedule getSchedule() {
        return this.schedule;
    }

    private void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }



    // Operations (methods)

    public void viewGpa() {
        // TODO: Implement viewGpa
    }

    // Other methods...

    public int payStudentFee() {
        // TODO: Implement payStudentFee
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Student %s %s (ID: %s)%n" +
                        "  Degree: %s%n" +
                        "  GPA: %.2f%n" +
                        "  Course: %d%n" +
                        "  Faculty: %s%n" +
                        "  Specialization: %s%n" +
                        "  Books Taken: %s%n" +
                        "  Schedule: %s%n" +
                        "  Payment Strategy: %s%n" +
                        "  Student Organization: %s%n" +
                        "  Transcript: %s",
                getFirstName(), getLastName(), getID(),
                studentDegree, gpa, course, faculty, specialization,
                booksTaken, schedule, paymentStrategy, studentOrganization, transcript);
    }

}
