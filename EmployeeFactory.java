package proj;

public class EmployeeFactory {

    // Operations

    public Employee getEmployee(String employeeType, String firstName, String lastName,
                                String username, String email, String password, String ID,
                                Integer salary, Integer hireDate, Integer workExperience) {
        // TODO: Implement logic to create and return specific types of employees
        // You might want to use the employeeType parameter to determine the type of employee to create.

        if ("Cleaner".equalsIgnoreCase(employeeType)) {
            return new Cleaner(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
        } else if ("Manager".equalsIgnoreCase(employeeType)) {
            return new Manager(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
        }
        // Add more conditions based on the types of employees you have

        return null; // Return null if the employee type is not recognized
    }
}
