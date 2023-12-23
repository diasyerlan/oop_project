package proj;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

public class Data {
    public static Vector<User> userList = Serialization.read("Database/Users.txt");
    public static Vector<Course> courses = Serialization.read("Courses.txt");
    public static HashMap<Student, Boolean> requestedReg = Serialization.read("Database/RegisterRequests.txt", "");
    public static Vector<Book> books = Serialization.read("Database/LibraryBooks.txt");
    public static HashMap<Vector<String>, String> requestedBooks = Serialization.read("Database/LibrarianRequests.txt", "");
    public static HashMap<String, Vector<Book>> studentBooks = Serialization.read("Database/StudentBooks.txt", "");
    public static Vector<StudentOrganization> studentOrganizations = Serialization.read("Database/StudentOrganizations.txt");
    public static  HashMap<Student, StudentOrganization> orgsOfStudent = Serialization.read("Database/OrganizationOfStudent.txt", "");
    public static HashMap<StudentOrganization,Vector<Student>> OrganizationMembers = Serialization.read("Database/OrganizationMembers.txt", "");
    public static HashMap<Integer, paymentStrategy> semesterPayed = Serialization.read("Database/Payment.txt", "");
    public static Vector<Researcher> researchers = Serialization.read("Database/Researchers.txt");
    public static LinkedHashMap<CanBeResearcher, Vector<ResearchProject>> researchProjects = Serialization.read("Database/ResearchProjects.txt", 5);
    Vector<Teacher> teachers = new Vector<>();

    // Constructor or method to initialize teachers
}
