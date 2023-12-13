package proj;
import java.util.Vector;

public class Librarian extends Employee implements manageRequest {

    private Vector<Book> listofBooks;
    private String name;
    private Integer age;

    public Librarian(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
    }

    private Vector<Book> getListofBooks() {
        return this.listofBooks;
    }

    private void setListofBooks(Vector<Book> listofBooks) {
        this.listofBooks = listofBooks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer Age) {
        this.age = age;
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

    @Override
    public void respondRequest() {

    }

    @Override
    public Request getRequest() {
        return null;
    }
}