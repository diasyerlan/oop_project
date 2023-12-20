package proj;

import java.util.Date;
import java.util.Vector;

public class Employee extends User {
    private static final long serialVersionUID = 5958066297683139454L;
    private Date hireDate;
    private Integer workExperience;
    private Security security;
    private Message message;

    // Constructors
    public Employee(){}
    public Employee(String firstName, String lastName, String username, String email,
                    String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID);
        this.hireDate = hireDate;
        this.workExperience = workExperience;
    }

    // Getters and setters

    public Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getWorkExperience() {
        return this.workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    // Operations
    public static void updateEmployee() {
        System.out.println("7 - Change Hire Date");
        System.out.println("8 - Change Work Experience");

    }
    public boolean sendMessage() {
        // TODO: Implement sendMessage method
        return false;
    }

    public boolean viewMessage() {
        // TODO: Implement viewMessage method
        return false;
    }

    public int getEmployeeSalary() {
        // TODO: Implement getEmployeeSalary method
        return 0;
    }

    public int getEmployeeWorkExperience() {
        // TODO: Implement getEmployeeWorkExperience method
        return 0;
    }

    public Vector<Message> viewEmployeeMessages() {
        // TODO: Implement viewEmployeeMessages method
        return null;
    }
}
