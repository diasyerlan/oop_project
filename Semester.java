package proj;

public class Semester {

    private String academicYear;
    private Term term;
    private Transcript transcript;


    private void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }


    private void setTerm(Term term) {
        this.term = term;
    }

    // Operations

    public String getAcademicYear() {
        // TODO: Implement the logic to get the academic year
        return "";
    }

    public void setAcademicYear() {
        // TODO: Implement the logic to set the academic year
    }

    public Term getTerm() {
        // TODO: Implement the logic to get the term
        return Term.FALL; // Replace with actual logic
    }

    public void setTerm() {
        // TODO: Implement the logic to set the term
    }

    public String toString() {
        // TODO: Implement the logic for the string representation of the Semester object
        return "";
    }
}
