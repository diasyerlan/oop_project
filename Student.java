package proj;

import java.util.Scanner;
import java.util.Vector;

public class Student extends User implements CanBeResearcher {

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

    private String getStudentName() {
        return this.studentName;
    }

    private void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private Integer getStudentId() {
        return this.studentId;
    }

    private void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    private Degree getStudentDegree() {
        return this.studentDegree;
    }

    private void setStudentDegree(Degree studentDegree) {
        this.studentDegree = studentDegree;
    }

    private Integer getAge() {
        return this.age;
    }

    private void setAge(Integer age) {
        this.age = age;
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

    private Boolean getPaymentStrategy() {
        return this.paymentStrategy;
    }

    private void setPaymentStrategy(Boolean paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
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
        // TODO: Implement toString
        return "";
    }
}
