package proj;

public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String ID;
    private News news;
    private WSP wsp;

    // Constructors
    public User(String firstName, String lastName, String username, String email, String password, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.ID = ID;
    }

    // Getters and setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // Operations
    public boolean changePassword(String newPassword) {
        // TODO: Implement changePassword method
        return false;
    }

    public void updateLogin() {
        // TODO: Implement updateLogin method
    }

    public boolean login() {
        // TODO: Implement login method
        return false;
    }

    public void viewNews() {
        // TODO: Implement viewNews method
    }

    public void createRequest() {
        // TODO: Implement createRequest method
    }

    public String toString() {
        // TODO: Implement toString method
        return "";
    }

    public void showNews() {
        // TODO: Implement showNews method
    }

    public boolean verifyPassword(String enteredPassword) {
        // TODO: Implement verifyPassword method
        return false;
    }

    public User findUser(String username) {
        // TODO: Implement findUser method
        return null;
    }

    public boolean logOutSystem() {
        // TODO: Implement logOutSystem method
        return false;
    }

    public void logInSystem() {
        // TODO: Implement logInSystem method
    }

    // Additional getters and setters

    public void setEmail() {
        // TODO: Implement setEmail method
    }

    // Additional methods

    public String generateReport() {
        // TODO: Implement generateReport method
        return "";
    }
}
