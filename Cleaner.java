package proj;

public class Cleaner extends Employee {

    private String name;
    private Integer age;

    public Cleaner(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
    }

    // Constructors


    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Operations

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
}
