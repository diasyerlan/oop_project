package proj;

import java.util.Date;
/**
 * Manager class representing a managerial employee, extending the Employee class.
 */
public class Manager extends Employee {
    /**
     * Default constructor for Manager class.
     */
    public Manager(){
        super();
    };
    /**
     * Parameterized constructor for Manager class.
     *
     * @param firstName      First name of the manager.
     * @param lastName       Last name of the manager.
     * @param username       Username of the manager.
     * @param email          Email of the manager.
     * @param password       Password of the manager.
     * @param ID             ID of the manager.
     * @param hireDate       Date when the manager was hired.
     * @param workExperience Work experience of the manager.
     */
    public Manager(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
    }

    /**
     * View information method.
     *
     * @return An empty string for this implementation.
     */
    public String view_info(){
        return "";
    }
    /**
     * Send notification method.
     * This method can be overridden in subclasses to implement specific notification logic.
     */
    public void send_notification() {
        // Implementation for sending notifications can be added in subclasses.

    }

}
