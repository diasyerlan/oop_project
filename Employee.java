package proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Map;
import java.util.Vector;
import java.nio.Buffer;
import java.io.*;
import java.util.*;
/**
 * The Employee class represents an employee in the system, extending the User class.
 * It includes additional attributes such as hire date and work experience.
 */
public class Employee extends User {
    private static final long serialVersionUID = 5958066297683139454L;
    private Date hireDate;
    private Integer workExperience;
    private Security security;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Message message;
    private String language;
    private static Employee instance;
    private static Map<Integer, String> words;
    /**
     * Sets the language for the employee instance.
     *
     * @param language The language code (e.g., "en", "kz", "ru").
     */
    public void setLanguage(String language) {
        this.language = language;

        // Инициализация слов на выбранном языке
        if (language.equals("en")) {
            words = LanguageMessages.getEnMessage();
        } else if (language.equals("kz")) {
            words = LanguageMessages.getKzMessage();
        } else if (language.equals("ru")) {
            words = LanguageMessages.getRuMessage();
        }
    }

    // Constructors
    /**
     * Default constructor for the Employee class.
     */
    public Employee(){}
    /**
     * Parameterized constructor for the Employee class.
     *
     * @param firstName      The first name of the employee.
     * @param lastName       The last name of the employee.
     * @param username       The username of the employee.
     * @param email          The email of the employee.
     * @param password       The password of the employee.
     * @param ID             The ID of the employee.
     * @param hireDate       The hire date of the employee.
     * @param workExperience The work experience of the employee.
     */
    public Employee(String firstName, String lastName, String username, String email,
                    String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID);
        this.hireDate = hireDate;
        this.workExperience = workExperience;
    }

    // Getters and setters
    /**
     * Gets the hire date of the employee.
     *
     * @return The hire date of the employee.
     */
    public Date getHireDate() {
        return this.hireDate;
    }

    /**
     * Sets the hire date of the employee.
     *
     * @param hireDate The new hire date of the employee.
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    /**
     * Gets the work experience of the employee.
     *
     * @return The work experience of the employee.
     */
    public Integer getWorkExperience() {
        return this.workExperience;
    }

    /**
     * Sets the work experience of the employee.
     *
     * @param workExperience The new work experience of the employee.
     */
    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }
    /**
     * Static method to update employee information.
     */
    // Operations
    public static void updateEmployee() {
        System.out.println(words.get(126));
        System.out.println(words.get(127));

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
