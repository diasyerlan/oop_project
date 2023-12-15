package proj;
import java.io.Serializable;
import java.util.Vector;
public class Schedule implements Serializable {
    private String ID;
    private Vector<Subject> listOfSubjects;
    private Student  student ;
    private Teacher teacher;
    private Subject subject;

    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public Vector<Subject> getListOfSubjects() {
        return this.listOfSubjects;
    }

    }