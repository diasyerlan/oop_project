package proj;

import java.util.Queue;

public class FacultyManager extends Manager {

    private FacultyName faculty;
    private Queue<Request> listOfRequestsFaculty;

    // Constructors
    public FacultyManager(String firstName, String lastName, String username, String email,
                          String password, String ID, Integer salary, Integer hireDate,
                          Integer workExperience, FacultyName faculty) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
        this.faculty = faculty;
    }

    // Getters and setters
    public FacultyName getFaculty() {
        return this.faculty;
    }

    public void setFaculty(FacultyName faculty) {
        this.faculty = faculty;
    }

    public Queue<Request> getListOfRequestsFaculty() {
        return this.listOfRequestsFaculty;
    }

    public void setListOfRequestsFaculty(Queue<Request> listOfRequestsFaculty) {
        this.listOfRequestsFaculty = listOfRequestsFaculty;
    }

    // Operations

    public boolean deleteNews() {
        // TODO: Implement deleteNews method
        return false;
    }

    public void manageNews() {
        // TODO: Implement manageNews method
    }

    public FacultyName getCurrentFaculty() {
        // TODO: Implement getCurrentFaculty method
        return FacultyName.FIT;
    }

    public void setFaculty() {
        // TODO: Implement setFaculty method
    }

    public Queue<Request> getListOfRequestFaculty() {
        // TODO: Implement getListOfRequestFaculty method
        return null;
    }

    public void setListOfRequestFaculty() {
        // TODO: Implement setListOfRequestFaculty method
    }

    public boolean createNews() {
        // TODO: Implement createNews method
        return false;
    }

    public void updateNews() {
        // TODO: Implement updateNews method
    }

    public void showNews() {
        // TODO: Implement showNews method
    }

    public void printOptions() {
        // TODO: Implement printOptions method
    }

    public void getMenu() {
        // TODO: Implement getMenu method
    }

    public void adviseStudents() {
        // TODO: Implement adviseStudents method
    }
}
