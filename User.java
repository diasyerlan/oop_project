package proj;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String ID;

    private News news;
    private WSP wSP;

    private String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getUsername() {
        return this.username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private String getEmail() {
        return this.email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPassword() {
        return this.password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private String getID() {
        return this.ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public boolean changePassword() {
        return false;
    }

    public void updateLogin() {

    }

    public boolean login() {
        return false;
    }

    public void viewNews() {

    }

    public void createRequest() {

    }

    public String toString() {
        return "";
    }

    public void showNews() {

    }

    public boolean verifyPassword() {
        return false;
    }

    public User findUser() {
        return null;
    }

    public boolean logOutSystem() {
        return false;
    }

    public void logInSystem() {

    }

    public void setEmail() {

    }

    public String getEmail() {
        return "";
    }

    public void setLastName() {

    }

    public String getLastName() {
        return "";
    }

    public void setFirstName() {

    }

    public String getFirstName() {
        return "";
    }

    public void setID() {

    }

    public String getID() {
        return "";
    }

    public void setPassword() {

    }

    public String getPassword() {
        return "";
    }

    public void setLogin() {

    }

    public String getUsername() {
        return "";
    }

    public String generate_report() {
        return "";
    }
}
