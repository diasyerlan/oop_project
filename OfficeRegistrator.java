package proj;

import java.util.*;

public class OfficeRegistrator extends Manager  {
    private static final long serialVersionUID = -304638397009552931L;
    private Queue<Request> listOfRequestsOR;

    public OfficeRegistrator(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
    }

    private Queue<Request> getListOfRequestsOR() {
        return this.listOfRequestsOR;
    }

    private void setListOfRequestsOR(Queue<Request> listOfRequestsOR) {
        this.listOfRequestsOR = listOfRequestsOR;
    }

    public boolean addCourse() {
        // TODO: Implement logic for adding a course
        return false;
    }

    public void manageCourse() {
        // TODO: Implement logic for managing a course
    }

    public boolean deleteCourse() {
        // TODO: Implement logic for deleting a course
        return false;
    }

    public Queue<Request> getlistOfRequestOR() {
        // TODO: Implement logic to get the list of requests
        return null;
    }

    public Queue<Request> setListOfRequests() {
        // TODO: Implement logic to set the list of requests
        return null;
    }

    public Request getRequest() {
        // TODO: Implement logic to get a request
        return null;
    }

    public boolean openCourse() {
        // TODO: Implement logic for opening a course
        return false;
    }

    public void closeCourse() {
        // TODO: Implement logic for closing a course
    }

    public void printOptions() {
        // TODO: Implement logic for printing options
    }

    public void getMenu() {
        // TODO: Implement logic for getting the menu
    }
    public int setCourses(Student student, int semester) {
        System.out.println("You are going to set a list of Courses for a Student");
        if(student.term == Term.FALL) semester = student.getCourse()*2-1;
        else semester = student.getCourse()*2;
        System.out.println("Set courses for " + Integer.toString( semester)+ " semester");

        System.out.println("Please, write the courses by coma: ");
        return semester;
    }
    public void addTranscript(Student s) {
        System.out.println("Here you can add a transcript for a semester: ");

    }

    public String toString() {
        return String.format("Office Registrar %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n" +
                        "  Username: %s" +
                        "  Password: %s",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience(), getUsername(), getPassword());
    }
}
