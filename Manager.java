package proj;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
    }

    public String view_info(){
        return "";
    }

    public void send_notification() {

    }

}
