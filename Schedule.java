package proj;
import java.io.Serializable;
import java.util.Vector;
public class Schedule implements Serializable {
    private String ID;
    private Student  student ;
    private Teacher teacher;

    public String getID() {
        return this.ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    }