package proj;

public class Security extends Employee {

    private String Name;
    private Integer Age;

    public Security(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
    }

    private String getName() {
        return this.Name;
    }

    private void setName(String Name) {
        this.Name = Name;
    }

    private Integer getAge() {
        return this.Age;
    }

    private void setAge(Integer Age) {
        this.Age = Age;
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
}
