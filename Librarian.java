package proj;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Librarian extends Employee{
    private static final long serialVersionUID = 5821103428083893929L;

    private Vector<Workshops> workshops;

    public Librarian(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
        this.workshops = new Vector<Workshops>();
    }



    public boolean ApproveRequest() {

        return false;
    }

    public void addBook() {

    }

    public Book getBookID() {

        return null;
    }

    public int hashcode() {
        return 0;
    };




    public String getRequests() {
        System.out.println("Here are the requests: ");
        String respond = "";
        for(Pair<Vector<String>, String> p : Data.requestedBooks) {
            respond += "The student ID is " + p.second + '\n';
            respond += "Requested Books: \n";
            for(String s : p.first) {
                respond += s + '\n';
            }
            respond += '\n';

        }
        return respond;
    }

    public String toString() {
        return String.format("Librarian %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience());
    }
}