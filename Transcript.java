package proj;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Transcript implements Serializable {

    public Map<Semester, Map<Course, Mark>> transcript;

public Transcript() {
        transcript = new HashMap<>();
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
