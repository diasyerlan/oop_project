package proj;

import java.util.Date;

public class Manager extends Employee {
    public Manager(){
        super();
    };
    public Manager(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
    }

    public String view_info(){
        return "";
    }

    public void send_notification() {

    }

}
