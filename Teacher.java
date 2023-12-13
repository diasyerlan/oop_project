package proj;



 

public class Teacher extends Employee implements CanBeResearcher {
    
    
     
    
    private TeacherType teacherType;
    
    
     
    
    private String teacherName;
    
    
     
    
    private Integer teacherId;
    
    
     
    
    private Faculty faculty;
    
    
     
    
    private Vector<Course> coursesTaken;
    
    
     
    
    private Schedule schedule;
    
    
    
     
    
    private Schedule schedule;
    
    
     
    
    private Mark mark;
    
    
    
     
    
    private TeacherType getTeacherType() {
        return this.teacherType;
    }
    
    
     
    
    private TeacherType setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }
    
    
     
    
    private String getTeacherName() {
        return this.teacherName;
    }
    
    
     
    
    private String setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    
     
    
    private Integer getTeacherId() {
        return this.teacherId;
    }
    
    
     
    
    private Integer setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
    
    
     
    
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    
     
    
    private Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    
     
    
    private Vector<Course> getCoursesTaken() {
        return this.coursesTaken;
    }
    
    
     
    
    private Vector<Course> setCoursesTaken(Vector<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
    
    
     
    
    private Schedule getSchedule() {
        return this.schedule;
    }
    
    
     
    
    private Schedule setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    

                              Operations                                  
    
    
     
    
    public void putMark() {
        TODO
        return null;
    }
    
    
     
    
    public void manageCourse() {
        TODO
        return null;
    }
    
    
     
    
    public String infoStudent() {
        TODO
        return "";
    }
    
    
     
    
    public void viewCourse() {
        TODO
        return null;
    }
    
    
     
    
    public void sendMessage() {
        TODO
        return null;
    }
    
    
     
    
    public void putMark() {
        TODO
        return null;
    }
    
    
     
    
    public Vector<Course> getCoursesTakem() {
        TODO
        return null;
    }
    
    
     
    
    public String toString() {
        TODO
        return "";
    }
    
    
     
    
    public boolean putFirstAttestationMark() {
        TODO
        return false;
    }
    
    
     
    
    public boolean putSecondAttestation() {
        TODO
        return false;
    }
    
    
     
    
    public boolean putFinalAttestationMark() {
        TODO
        return false;
    }
    
    
     
    
    public Vector<Lesson> getSchedule() {
        TODO
        return null;
    }
    
    
     
    
    public boolean equals() {
        TODO
        return false;
    }
    
    
}
