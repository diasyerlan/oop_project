package proj;

import java.util.Map;

public class Transcript {
    private Map<Semester, Map<Course, Mark>> transcript;
    private Student student;
    private Course course;
    private Semester semester1;
    private Semester semester2;

    private Map<Semester, Map<Course, Mark>> getTranscript() {
        return this.transcript;
    }

    private void setTranscript(Map<Semester, Map<Course, Mark>> transcript) {
        this.transcript = transcript;
    }

    public String toString() {
        return "";
    }
}
