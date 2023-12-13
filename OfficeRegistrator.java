package proj;

import java.util.Queue;

public class OfficeRegistrator extends Manager {

    private Queue<Request> listOfRequestsOR;

    public OfficeRegistrator(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
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
}
