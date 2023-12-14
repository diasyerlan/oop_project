package proj;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;
public class Admin {

    private static Admin instance;
    Scanner scanner = new Scanner(System.in);
    private Vector<User> userList;
    public String username = "Admin";
    public String password = "12345";

    // Private constructor to prevent instantiation
    private Admin() {
        // Initialize any necessary attributes
    }

    // Singleton pattern to get the instance of Admin
    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    public void mainQuestions() {
        System.out.println("Print descriptions of Student");
        System.out.println("First name: ");
        String firstname = scanner.nextLine();

        System.out.println("Last name: ");
        String lastname = scanner.nextLine();

        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        System.out.println("ID number: ");
        String id = scanner.nextLine();
    }

    // Operations

    public void addUser() {
        System.out.println("You are going to add a new user to the System. Please write the descriptions of ther user.");
        System.out.println("Whom do you want to add?");

        String position = scanner.nextLine();

        if(position.equals("Student")) {
            mainQuestions();

            System.out.println("Student degree: ");
            String degree = scanner.nextLine();

        }

        if(position.equals("Student"))  newUser = new Student(firstname, lastname, username, email, password, id,)

        userList.add();

    }

    public void removeUser() {
        // TODO: Implement removeUser method
    }

    public String updateUser() {
        // TODO: Implement updateUser method
        return "";
    }

    public String getLogFiles() {
        // TODO: Implement getLogFiles method
        return "";
    }

    public void changeMarks() {
        // TODO: Implement changeMarks method
    }

    public void changeAddress() {
        // TODO: Implement changeAddress method
    }

    public void changeCreditCard() {
        // TODO: Implement changeCreditCard method
    }
}
