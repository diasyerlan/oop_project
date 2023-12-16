package proj;

import java.util.Date;

public class Security extends Employee {
    private static final long serialVersionUID = 1L;



    public Security(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID,hireDate, workExperience);
    }

    // Operations

    public boolean checkingID() {
        // TODO: Implement the logic for checking ID
        // For example:
        // return someCondition;
        return false;
    }

    public void checkingtheBags() {
        // TODO: Implement the logic for checking bags
    }

    public void collectLostThings() {
        // TODO: Implement the logic for collecting lost things
    }

    public void patroltheUniversityGrounds() {
        // TODO: Implement the logic for patrolling the university grounds
    }

    public void callForHelp() {
        // TODO: Implement the logic for calling for help
    }
    public String toString() {
        return String.format("Security %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience());
    }
}
