package proj;

import java.util.Date;
import java.util.Objects;
import java.util.Queue;
/**
 * The FacultyManager class represents a manager associated with a specific faculty in an educational institution.
 * It extends the Manager class and includes additional attributes related to the faculty.
 */
public class FacultyManager extends Manager {
    private static final long serialVersionUID = -1475904321287980890L;
    private Faculty faculty;
    private Queue<Request> listOfRequestsFaculty;
    /**
     * Constructs a FacultyManager with the specified attributes.
     *
     * @param firstName      The first name of the faculty manager.
     * @param lastName       The last name of the faculty manager.
     * @param username       The username of the faculty manager.
     * @param email          The email address of the faculty manager.
     * @param password       The password of the faculty manager.
     * @param ID             The ID of the faculty manager.
     * @param hireDate       The date on which the faculty manager was hired.
     * @param workExperience The work experience of the faculty manager in years.
     * @param faculty        The faculty to which the manager is associated.
     */
    // Constructors
    public FacultyManager(String firstName, String lastName, String username, String email,
                          String password, String ID, Date hireDate,
                          Integer workExperience, Faculty faculty) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
        this.faculty = faculty;
    }

    /**
     * Gets the faculty to which the manager is associated.
     *
     * @return The faculty of the manager.
     */
    // Getters and setters
    public Faculty getFaculty() {
        return this.faculty;
    }
    /**
     * Sets the faculty to which the manager is associated.
     *
     * @param faculty The new faculty to be set.
     */
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    /**
     * Gets the queue of requests specific to the faculty managed by the FacultyManager.
     *
     * @return The queue of faculty-specific requests.
     */
    public Queue<Request> getListOfRequestsFaculty() {
        return this.listOfRequestsFaculty;
    }
    /**
     * Sets the queue of requests specific to the faculty managed by the FacultyManager.
     *
     * @param listOfRequestsFaculty The new queue of faculty-specific requests to be set.
     */
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
    public String toString() {
        return String.format("Faculty Manager %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n" +
                        "  Faculty: %s%n",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience(), getFaculty());
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to the correct type
        FacultyManager other = (FacultyManager) obj;

        // Perform field-by-field comparison using Objects.equals
        return Objects.equals(this.getUsername(), other.getUsername()) && Objects.equals(this.getPassword(), other.getPassword());
    }
}
