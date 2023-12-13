package proj;

import java.util.Map;

public class Transcript {

    private Map<Semester, Map<Course, Mark>> transcript;
    private Student student;
    private Course course;
    private Semester semester;

    public Map<Semester, Map<Course, Mark>> getTranscript() {
        return this.transcript;
    }

    public void setTranscript(Map<Semester, Map<Course, Mark>> transcript) {
        this.transcript = transcript;
    }

    // Operations

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Transcript:\n");

        for (Map.Entry<Semester, Map<Course, Mark>> semesterEntry : transcript.entrySet()) {
            Semester semester = semesterEntry.getKey();
            Map<Course, Mark> coursesAndMarks = semesterEntry.getValue();

            result.append(semester).append(":\n");

            for (Map.Entry<Course, Mark> courseEntry : coursesAndMarks.entrySet()) {
                Course course = courseEntry.getKey();
                Mark mark = courseEntry.getValue();

                result.append("\t").append(course).append(": ").append(mark).append("\n");
            }
        }

        return result.toString();
    }
}
