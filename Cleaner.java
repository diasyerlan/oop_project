package proj;

import java.util.Date;

public class Cleaner extends Employee {
    private static final long serialVersionUID = 1L;


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
    public String toString() {
        return String.format("Security %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience());
    }
}
