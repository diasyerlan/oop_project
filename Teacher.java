package proj;

import java.util.Vector;

public class Teacher extends Employee implements CanBeResearcher {
    private TeacherType teacherType;
    private String teacherName;
    private Integer teacherId;
    private Faculty faculty;
    private Vector<Course> coursesTaken;
    private Schedule schedule1;
    private Schedule schedule2;
    private Mark mark;

    private TeacherType getTeacherType() {
        return this.teacherType;
    }

    private void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    private String getTeacherName() {
        return this.teacherName;
    }

    private void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    private Integer getTeacherId() {
        return this.teacherId;
    }

    private void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    private Faculty getFaculty() {
        return this.faculty;
    }

    private void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    private Vector<Course> getCoursesTaken() {
        return this.coursesTaken;
    }

    private void setCoursesTaken(Vector<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    private Schedule getSchedule1() {
        return this.schedule1;
    }

    private void setSchedule1(Schedule schedule1) {
        this.schedule1 = schedule1;
    }

    private Schedule getSchedule2() {
        return this.schedule2;
    }

    private void setSchedule2(Schedule schedule2) {
        this.schedule2 = schedule2;
    }

    public void putMark() {

    }

    public void manageCourse() {

    }

    public String infoStudent() {
        return "";
    }

    public void viewCourse() {

    }

    public void sendMessage() {

    }

    public Vector<Course> getCoursesTaken() {
        return null;
    }

    public String toString() {
        return "";
    }

    public boolean putFirstAttestationMark() {
        return false;
    }

    public boolean putSecondAttestation() {
        return false;
    }

    public boolean putFinalAttestationMark() {
        return false;
    }

    public Vector<Lesson> getSchedule() {
        return null;
    }

    public boolean equals() {
        return false;
    }
}
