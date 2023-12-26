package proj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Map;
import java.util.Vector;
import java.nio.Buffer;
import java.io.*;
import java.util.*;

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
