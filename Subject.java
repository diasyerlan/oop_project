package proj;

import java.util.Vector;

public class Subject {

    private String subjectName;
    private String startTime;
    private String endTime;
    private LessonType subjectType;
    private Teacher teacher;
    private Integer duration;
    private Semester semester;
    private Schedule schedule;

    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public LessonType getSubjectType() {
        return this.subjectType;
    }

    public void setSubjectType(LessonType subjectType) {
        this.subjectType = subjectType;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public Integer getDuration() {
        return this.duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Semester getSemester() {
        return this.semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    // Operations (methods)

    public Vector<Student> getStudents() {
        // TODO: Implement your method
        return null;
    }



    // Add other methods as needed

    @Override
    public String toString() {
        // TODO: Implement your method
        return "";
    }
}
