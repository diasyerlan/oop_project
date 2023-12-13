package proj;



public class Student  extends User implements CanBeResearcher {
    
   
    private String studentName;
    
    
    private Integer studentId;
    
    private Degree studentDegree;
    
    
    private Integer age;
    
    
     
    
    private double gpa;
    
    
     
    
    private Integer course;
    
    
     
    
    private Faculty faculty;
    
    
     
    
    private String specialization;
    
    
     
    
    private Vector<Book> booksTaken;
    
    
     
    
    private Schedule schedule;
    
    
     
    
    private Boolean paymentStrategy;
    
    
    
     
    
    private StudentOrganization studentOrganization;
    
    
     
    
    private Transcript transcript;
    
    
     
    
    private paymentStrategy paymentStrategy2;
    
    
     
    
    private Schedule schedule2;
    
    
     
    
    private Schedule schedule2;
    
    
     
    
    private StudentClub studentClub;
    
    
    
     
    
    private String getStudentName() {
        return this.studentName;
    }
    
    
     
    
    private String setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
     
    
    private Integer getStudentId() {
        return this.studentId;
    }
    
    
     
    
    private Integer setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    
    
     
    
    private Degree getStudentDegree() {
        return this.studentDegree;
    }
    
    
     
    
    private Degree setStudentDegree(Degree studentDegree) {
        this.studentDegree = studentDegree;
    }
    
    
     
    
    private Integer getAge() {
        return this.age;
    }
    
    
     
    
    private Integer setAge(Integer age) {
        this.age = age;
    }
    
    
     
    
    private double getGpa() {
        return this.gpa;
    }
    
    
     
    
    private double setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
     
    
    private Integer getCourse() {
        return this.course;
    }
    
    
     
    
    private Integer setCourse(Integer course) {
        this.course = course;
    }
    
    
     
    
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    
     
    
    private Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    
     
    
    private String getSpecialization() {
        return this.specialization;
    }
    
    
     
    
    private String setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
     
    
    private Vector<Book> getBooksTaken() {
        return this.booksTaken;
    }
    
    
     
    
    private Vector<Book> setBooksTaken(Vector<Book> booksTaken) {
        this.booksTaken = booksTaken;
    }
    
    
     
    
    private Schedule getSchedule() {
        return this.schedule;
    }
    
    
     
    
    private Schedule setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    
     
    
    private Boolean getPaymentStrategy() {
        return this.paymentStrategy;
    }
    
    
     
    
    private Boolean setPaymentStrategy(Boolean paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    

                              Operations                                  
    
    
     
    
    public void viewGpa() {
        TODO
        return null;
    }
    
    
     
    
    public void viewCourse() {
        TODO
        return null;
    }
    
    
     
    
    public void viewTranscript() {
        TODO
        return null;
    }
    
    
     
    
    public void rateTeachers() {
        TODO
        return null;
    }
    
    
     
    
    public void getTranscript() {
        TODO
        return null;
    }
    
    
     
    
    public void infoCourse() {
        TODO
        return null;
    }
    
    
     
    
    public boolean registerForCourse() {
        TODO
        return false;
    }
    
    
     
    
    public Schedule getSchedule() {
        TODO
        return null;
    }
    
    
     
    
    public void takeBook() {
        TODO
        return null;
    }
    
    
     
    
    public void returnBook() {
        TODO
        return null;
    }
    
    
     
    
    public Degree getStudentDegree() {
        TODO
        return proj.Degree.Bachelor;
    }
    
    
     
    
    public double getGPA() {
        TODO
        return null;
    }
    
    
     
    
    public Faculty getFaculty() {
        TODO
        return proj.Faculty.FIT;
    }
    
    
     
    
    public String getSpecialization() {
        TODO
        return "";
    }
    
    
     
    
    public Vector<Book> getBooksTaken() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<StudentOrganization> getStudentOrganizations() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Course> getCurrentCourses() {
        TODO
        return null;
    }
    
    
     
    
    public String toString() {
        TODO
        return "";
    }
    
    
     
    
    public int payStudentFee() {
        TODO
        return 0;
    }
    
    
}
