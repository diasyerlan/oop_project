package proj;

import java.util.Vector;

public class Data {
    public static Vector<User> userList = Serialization.read("Database/Users.txt");
    public static Vector<Course> courses = Serialization.read("Courses.txt");
    public static Vector<Pair> requestedReg = Serialization.read("Database/RegisterRequests.txt");
    public static Vector<Book> books = Serialization.read("Database/LibraryBooks.txt");
    public static Vector<Pair<Vector<String>, String>> requestedBooks = Serialization.read("Database/LibrarianRequests.txt");
    public static Vector<Pair<String, Vector<Book>>> studentBooks = Serialization.read("Database/StudentBooks.txt");
    public static Vector<StudentOrganization> studentOrganizations = Serialization.read("Database/StudentOrganizations.txt");
    public static  Vector<Pair<Student, StudentOrganization>> orgsOfStudent = Serialization.read("Database/OrganizationOfStudent.txt");
    public static Vector<Pair<StudentOrganization,Vector<Student>>> OrganizationMembers = Serialization.read("Database/OrganizationMembers.txt");
    public static Vector<Pair<Integer, paymentStrategy>> semesterPayed = Serialization.read("Database/Payment.txt");


    Vector<Teacher> teachers = new Vector<>();

    // Constructor or method to initialize teachers
}
