package proj;
import java.util.Vector;
public class Admin {

    private static Admin instance;
    private Vector<User> userList;
    private String username = "Admin";
    private String password = "12345";

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

    // Operations

    public void addUser() {
        System.out.println("You are going to add a new user to the System. Please write the descriptions of ther user.");


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
