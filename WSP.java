package proj;

import java.util.Vector;
import java.util.ArrayDeque;

public class WSP {

    private Boolean isRegistration;
    private WSP instance;
    private Vector<User> listOfUsers;
    private Vector<Student> listOfStudents;
    private Vector<Manager> listOfManagers;
    private Vector<Librarian> listOfLibrarians;
    private Vector<Course> activeCourses;
    private Vector<Course> listOfAllCourses;
    private Vector<News> listOfNews;
    private Vector<Book> listOfBooks;
    private Vector<StudentOrganization> listOfStudentOrganizations;
    private ArrayDeque<Request> listOfRequestsOR;
    private ArrayDeque<Request> listOfRequestsFaculty;

    public Boolean getIsRegistration() {
        return this.isRegistration;
    }

    public void setIsRegistration(Boolean isRegistration) {
        this.isRegistration = isRegistration;
    }

    public WSP getInstance() {
        // TODO: Implement getInstance method
        return null;
    }

    // Getters and setters for other attributes

    // Other methods - implement as needed
    // TODO: Implement remaining methods

    public void readUniversityContainer() {
        // TODO: Implement readUniversityContainer method
    }

    public void saveUniversityContainer() {
        // TODO: Implement saveUniversityContainer method
    }

    public String getNews() {
        // TODO: Implement getNews method
        return "";
    }

    public void saveNews() {
        // TODO: Implement saveNews method
    }

    public String getBooks() {
        // TODO: Implement getBooks method
        return "";
    }

    public void saveBooks() {
        // TODO: Implement saveBooks method
    }

    public Vector<Course> getActiveCourses() {
        // TODO: Implement getActiveCourses method
        return null;
    }

    public boolean isCourseAvailable() {
        // TODO: Implement isCourseAvailable method
        return false;
    }

    public boolean registerForCourse() {
        // TODO: Implement registerForCourse method
        return false;
    }

    public void loadNews() {
        // TODO: Implement loadNews method
    }
}
