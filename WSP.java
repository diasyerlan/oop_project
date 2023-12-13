package proj;



 

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
    
    
     
    
    public Boolean setIsRegistration(Boolean isRegistration) {
        this.isRegistration = isRegistration;
    }
    
    
     
    
    public WSP getInstance() {
        return this.instance;
    }
    
    
     
    
    public WSP setInstance(WSP instance) {
        this.instance = instance;
    }
    
    
     
    
    private Vector<User> getListOfUSers() {
        return this.listOfUSers;
    }
    
    
     
    
    private Vector<User> setListOfUSers(Vector<User> listOfUSers) {
        this.listOfUSers = listOfUSers;
    }
    
    
     
    
    private Vector<Student> getListOfStudents() {
        return this.listOfStudents;
    }
    
    
     
    
    private Vector<Student> setListOfStudents(Vector<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    
     
    
    private Vector<Manager> getListOfManagers() {
        return this.listOfManagers;
    }
    
    
     
    
    private Vector<Manager> setListOfManagers(Vector<Manager> listOfManagers) {
        this.listOfManagers = listOfManagers;
    }
    
    
     
    
    private Vector<Librarian> getListOFLibrarians() {
        return this.listOFLibrarians;
    }
    
    
     
    
    private Vector<Librarian> setListOFLibrarians(Vector<Librarian> listOFLibrarians) {
        this.listOFLibrarians = listOFLibrarians;
    }
    
    
     
    
    private Vector<Course> getActiveCourses() {
        return this.ActiveCourses;
    }
    
    
     
    
    private Vector<Course> setActiveCourses(Vector<Course> ActiveCourses) {
        this.ActiveCourses = ActiveCourses;
    }
    
    
     
    
    private Vector<Course> getListOfAllCourses() {
        return this.listOfAllCourses;
    }
    
    
     
    
    private Vector<Course> setListOfAllCourses(Vector<Course> listOfAllCourses) {
        this.listOfAllCourses = listOfAllCourses;
    }
    
    
     
    
    private Vector<News> getListOfNews() {
        return this.listOfNews;
    }
    
    
     
    
    private Vector<News> setListOfNews(Vector<News> listOfNews) {
        this.listOfNews = listOfNews;
    }
    
    
     
    
    private Vector<Book> getListOfBooks() {
        return this.listOfBooks;
    }
    
    
     
    
    private Vector<Book> setListOfBooks(Vector<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    
    
     
    
    private Vector<StudentOrganization> getListOfStudentOrganizations() {
        return this.listOfStudentOrganizations;
    }
    
    
     
    
    private Vector<StudentOrganization> setListOfStudentOrganizations(Vector<StudentOrganization> listOfStudentOrganizations) {
        this.listOfStudentOrganizations = listOfStudentOrganizations;
    }
    
    
     
    
    private ArrayDeque<Request> getListOfREquestsOR() {
        return this.listOfREquestsOR;
    }
    
    
     
    
    private ArrayDeque<Request> setListOfREquestsOR(ArrayDeque<Request> listOfREquestsOR) {
        this.listOfREquestsOR = listOfREquestsOR;
    }
    
    
     
    
    private ArrayDeque<Request> getListOfRequestsFaculty() {
        return this.listOfRequestsFaculty;
    }
    
    
     
    
    private ArrayDeque<Request> setListOfRequestsFaculty(ArrayDeque<Request> listOfRequestsFaculty) {
        this.listOfRequestsFaculty = listOfRequestsFaculty;
    }
    

                              Operations                                  
    
    
     
    
    public WSP getInstance() {
        TODO
        return null;
    }
    
    
     
    
    public void readUniversityContainer() {
        TODO
        return null;
    }
    
    
     
    
    public void saveUniversityContainer() {
        TODO
        return null;
    }
    
    
     
    
    public String getNews() {
        TODO
        return "";
    }
    
    
     
    
    public void saveNews() {
        TODO
        return null;
    }
    
    
     
    
    public String getBooks() {
        TODO
        return "";
    }
    
    
     
    
    public void saveBooks() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Course> getActiveCourses() {
        TODO
        return null;
    }
    
    
     
    
    public boolean isCourseAviable() {
        TODO
        return false;
    }
    
    
     
    
    public boolean registerForCourse() {
        TODO
        return false;
    }
    
    
     
    
    public void loadNews() {
        TODO
        return null;
    }
    
    
}
