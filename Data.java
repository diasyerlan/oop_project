package proj;

import java.util.Date;
import java.util.Vector;

public class Data {
    public Vector<User> userList = Serialization.read("Users.txt");
    public Vector<Course> courses = Serialization.read("Courses.txt");
    Vector<Teacher> teachers = new Vector<>();

    // Constructor or method to initialize teachers
}
