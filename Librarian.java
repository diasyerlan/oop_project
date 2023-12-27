package proj;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

public class Librarian extends Employee{
    private static final long serialVersionUID = 5821103428083893929L;
    private Vector<Workshops> workshops;

    public Librarian(String firstName, String lastName, String username, String email, String password, String ID, Date hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, hireDate, workExperience);
        this.workshops = new Vector<Workshops>();
    }


    /**
     * Approves a request.
     *
     * @return true if the request is approved, false otherwise.
     */
    public boolean ApproveRequest() {

        return false;
    }
    /**
     * Adds a book to the library.
     */
    public void addBook() {

    }
    /**
     * Retrieves a book by its ID.
     *
     * @return the book associated with the specified ID.
     */

    public Book getBookID() {

        return null;
    }
    /**
     * Calculates the hash code for the Librarian.
     *
     * @return the hash code value.
     */
    public int hashcode() {
        return 0;
    };



    /**
     * Retrieves a string representation of the librarian's requests.
     *
     * @return a string containing information about the librarian's requests.
     */
    public String getRequests() {
        System.out.println("Here are the requests: ");
        String respond = "";
        for(Map.Entry<Vector<String>, String> entry : Data.requestedBooks.entrySet()) {
            respond += "The student ID is " + entry.getValue() + '\n';
            respond += "Requested Books: \n";
            for(String s : entry.getKey()) {
                respond += s + '\n';
            }
            respond += '\n';

        }
        return respond;
    }
    /**
     * Retrieves a string representation of the Librarian.
     *
     * @return a formatted string containing information about the Librarian.
     */
    public String toString() {
        return String.format("Librarian %s %s (ID: %s)%n" +
                        "  Hire Date: %s%n" +
                        "  Work Experience: %d years%n",
                getFirstName(), getLastName(), getID(),
                getHireDate(), getWorkExperience());
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument, false otherwise.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to the correct type
        Librarian other = (Librarian) obj;

        // Perform field-by-field comparison using Objects.equals
        return Objects.equals(this.getUsername(), other.getUsername()) && Objects.equals(this.getPassword(), other.getPassword());
    }
}