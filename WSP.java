package proj;

import java.util.ArrayDeque;
import java.util.Vector;

public class WSP {
    private Boolean isRegistration;
    private WSP instance;
    private Vector<User> listOfUSers;
    private Vector<Student> listOfStudents;
    private Vector<Manager> listOfManagers;
    private Vector<Librarian> listOFLibrarians;
    private Vector<Course> ActiveCourses;
    private Vector<Course> listOfAllCourses;
    private Vector<News> listOfNews;
    private Vector<Book> listOfBooks;
    private Vector<StudentOrganization> listOfStudentOrganizations;
    private ArrayDeque<Request> listOfREquestsOR;
    private ArrayDeque<Request> listOfRequestsFaculty;
    private User user;

    public Boolean getIsRegistration() {
        return this.isRegistration;
    }

    public void setIsRegistration(Boolean isRegistration) {
        this.isRegistration = isRegistration;
    }

    public WSP getInstance() {
        return this.instance;
    }

    public void setInstance(WSP instance) {
        this.instance = instance;
    }

    private Vector<User> getListOfUSers() {
        return this.listOfUSers;
    }

    private void setListOfUSers(Vector<User> listOfUSers) {
        this.listOfUSers = listOfUSers;
    }

    private Vector<Student> getListOfStudents() {
        return this.listOfStudents;
    }

    private void setListOfStudents(Vector<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    private Vector<Manager> getListOfManagers() {
        return this.listOfManagers;
    }

    private void setListOfManagers(Vector<Manager> listOfManagers) {
        this.listOfManagers = listOfManagers;
    }

    private Vector<Librarian> getListOFLibrarians() {
        return this.listOFLibrarians;
    }

    private void setListOFLibrarians(Vector<Librarian> listOFLibrarians) {
        this.listOFLibrarians = listOFLibrarians;
    }

    private Vector<Course> getActiveCourses() {
        return this.ActiveCourses;
    }

    private void setActiveCourses(Vector<Course> ActiveCourses) {
        this.ActiveCourses = ActiveCourses;
    }

    private Vector<Course> getListOfAllCourses() {
        return this.listOfAllCourses;
    }

    private void setListOfAllCourses(Vector<Course> listOfAllCourses) {
        this.listOfAllCourses = listOfAllCourses;
    }

    private Vector<News> getListOfNews() {
        return this.listOfNews;
    }

    private void setListOfNews(Vector<News> listOfNews) {
        this.listOfNews = listOfNews;
    }

    private Vector<Book> getListOfBooks() {
        return this.listOfBooks;
    }

    private void setListOfBooks(Vector<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    private Vector<StudentOrganization> getListOfStudentOrganizations() {
        return this.listOfStudentOrganizations;
    }

    private void setListOfStudentOrganizations(Vector<StudentOrganization> listOfStudentOrganizations) {
        this.listOfStudentOrganizations = listOfStudentOrganizations;
    }

    private ArrayDeque<Request> getListOfREquestsOR() {
        return this.listOfREquestsOR;
    }

    private void setListOfREquestsOR(ArrayDeque<Request> listOfREquestsOR) {
        this.listOfREquestsOR = listOfREquestsOR;
    }

    private ArrayDeque<Request> getListOfRequestsFaculty() {
        return this.listOfRequestsFaculty;
    }

    private void setListOfRequestsFaculty(ArrayDeque<Request> listOfRequestsFaculty) {
        this.listOfRequestsFaculty = listOfRequestsFaculty;
    }

    public WSP getInstance() {
        return null;
    }

    public void readUniversityContainer() {

    }

    public void saveUniversityContainer() {

    }

    public String getNews() {
        return "";
    }

    public void saveNews() {

    }

    public String getBooks() {
        return "";
    }

    public void saveBooks() {

    }

    public Vector<Course> getActiveCourses() {
        return null;
    }

    public boolean isCourseAviable() {
        return false;
    }

    public boolean registerForCourse() {
        return false;
    }

    public void loadNews() {

    }
}
