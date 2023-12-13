package proj;



 

public class Course {
    
    
     
    
    private String courseName;
    
    
     
    
    private Integer creditsNumber;
    
    
     
    
    private Vector<Course> prerequisites;
    
    
     
    
    private Vector<Teacher> listOfInstructors;
    
    
     
    
    private String courseCode;
    
    
     
    
    private Integer maxStudentNumber;
    
    
    
     
    
    private Transcript transcript;
    
    
    
     
    
    private String getCourseName() {
        return this.courseName;
    }
    
    
     
    
    private String setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
     
    
    private Integer getCreditsNumber() {
        return this.creditsNumber;
    }
    
    
     
    
    private Integer setCreditsNumber(Integer creditsNumber) {
        this.creditsNumber = creditsNumber;
    }
    
    
     
    
    private Vector<Course> getPrerequisites() {
        return this.prerequisites;
    }
    
    
     
    
    private Vector<Course> setPrerequisites(Vector<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    
     
    
    private Vector<Teacher> getListOfInstructors() {
        return this.listOfInstructors;
    }
    
    
     
    
    private Vector<Teacher> setListOfInstructors(Vector<Teacher> listOfInstructors) {
        this.listOfInstructors = listOfInstructors;
    }
    
    
     
    
    private String getCourseCode() {
        return this.courseCode;
    }
    
    
     
    
    private String setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    
     
    
    private Integer getMaxStudentNumber() {
        return this.maxStudentNumber;
    }
    
    
     
    
    private Integer setMaxStudentNumber(Integer maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }
    

                              Operations                                  
    
    
     
    
    public Teacher assignTeacher() {
        TODO
        return null;
    }
    
    
     
    
    public String getCourseCode() {
        TODO
        return "";
    }
    
    
     
    
    public void setCourseCode() {
        TODO
        return null;
    }
    
    
     
    
    public String getCourseName() {
        TODO
        return "";
    }
    
    
     
    
    public void setCourseName() {
        TODO
        return null;
    }
    
    
     
    
    public int getCreditsNumber() {
        TODO
        return 0;
    }
    
    
     
    
    public void setCreditsNumber() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Course> getPrerequisites() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Teacher> getListOfInstructors() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Student> getListOfStudents() {
        TODO
        return null;
    }
    
    
     
    
    public void setMaxStudentNumber() {
        TODO
        return null;
    }
    
    
     
    
    public int getMaxStudentNumber() {
        TODO
        return 0;
    }
    
    
     
    
    public Student containts() {
        TODO
        return null;
    }
    
    
     
    
    public boolean isFull() {
        TODO
        return false;
    }
    
    
     
    
    public Student addStudent() {
        TODO
        return null;
    }
    
    
     
    
    public String toString() {
        TODO
        return "";
    }
    
    
     
    
    public Vector<Subject> getListOfSubjects() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Subject> setListOfSubjects() {
        TODO
        return null;
    }
    
    
}
