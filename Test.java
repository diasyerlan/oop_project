package proj;

import java.io.IOException;
import java.util.Date;
import java.util.Vector;

public class Test {
    public static void main(String[] args) throws IOException {

        Vector<Course> universityCourses = new Vector<>();
        universityCourses.add(new Course("Computer Science", 4, "CS101", 50));
        universityCourses.add(new Course("Mathematics", 3, "MATH201", 40));
        universityCourses.add(new Course("Physics", 4, "PHY301", 30));
        universityCourses.add(new Course("History", 3, "HIST101", 35));
        universityCourses.add(new Course("Chemistry", 4, "CHEM201", 45));
        universityCourses.add(new Course("Literature", 3, "LIT301", 30));
        universityCourses.add(new Course("Economics", 4, "ECON101", 40));
        universityCourses.add(new Course("Psychology", 3, "PSYCH201", 35));
        universityCourses.add(new Course("Biology", 4, "BIO301", 40));
        universityCourses.add(new Course("Political Science", 3, "POLSCI101", 35));
        Serialization.write(universityCourses, "Courses.txt");
    }
}
