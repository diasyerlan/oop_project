package proj;

import java.util.Date;
/**
 * A class representing a Cleaner, extending the Employee class.
 * This class includes specific methods related to cleaning tasks.
 */
public class Cleaner extends Employee {
    // Serial version UID for serialization
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a Cleaner object with the specified attributes.
     *
     * @param firstName      The first name of the cleaner.
     * @param lastName       The last name of the cleaner.
     * @param username       The username of the cleaner.
     * @param email          The email of the cleaner.
     * @param password       The password of the cleaner.
     * @param ID             The ID of the cleaner.
     * @param hireDate       The hire date of the cleaner.
     * @param workExperience The work experience of the cleaner in years.
     */
    public Cleaner(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID,hireDate, workExperience);
    }

    // Constructo

    public void cleanTheRestroom() {
        // TODO: Implement cleanTheRestroom method
    }

    public void cleanTheCorridors() {
        // TODO: Implement cleanTheCorridors method
    }

    public void cleanTheAudience() {
        // TODO: Implement cleanTheAudience method
    }

    public void makeReport() {
        // TODO: Implement makeReport method
    }
    /**
     * Returns a string representation of the Cleaner object.
     *
     * @return A formatted string with cleaner details.
     */
    public String toString() {
        return String.format("Security %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience());
    }
}
