package proj;

import java.util.Vector;

public class Employee extends User {

    private Integer salary;
    private Integer hireDate;
    private Integer workExperience;
    private Security security;
    private Message message;

    // Constructors
    public Employee(String firstName, String lastName, String username, String email,
                    String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID);
        this.salary = salary;
        this.hireDate = hireDate;
        this.workExperience = workExperience;
    }

    // Getters and setters
    public Integer getSalary() {
        return this.salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Integer hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getWorkExperience() {
        return this.workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    // Operations

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
