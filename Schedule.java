package proj;

import java.util.Vector;

public class Schedule {

    // Replace "invalid" with the appropriate data type or use a comment to indicate the intention.

    private String ID;
    private Vector<Subject> listOfSubjects;


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Vector<Subject> getListOfSubjects() {
        return this.listOfSubjects;
    }

    public void setListOfSubjects(Vector<Subject> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}
