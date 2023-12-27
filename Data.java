package proj;

import java.util.*;
/**
 * Represents a class holding various data used in the educational system.
 * This class includes data related to users, courses, books, organizations, payments, researchers,
 * research projects, supervisors, complaints, messages, news, and more.
 * The data is loaded from and saved to files using the Serialization class.
 */
public class Data {
    // User-related data
    public static Vector<User> userList = Serialization.read("Database/Users.txt");
    public static Vector<Course> courses = Serialization.read("Database/Courses.txt");
    public static HashMap<Student, Boolean> requestedReg = Serialization.read("Database/RegisterRequests.txt", "");
    public static Vector<Book> books = Serialization.read("Database/LibraryBooks.txt");
    public static HashMap<Vector<String>, String> requestedBooks = Serialization.read("Database/LibrarianRequests.txt", "");
    public static HashMap<String, Vector<Book>> studentBooks = Serialization.read("Database/StudentBooks.txt", "");
    public static Vector<StudentOrganization> studentOrganizations = Serialization.read("Database/StudentOrganizations.txt");
    public static  HashMap<Student, StudentOrganization> orgsOfStudent = Serialization.read("Database/OrganizationOfStudent.txt", "");
    public static HashMap<StudentOrganization,Vector<Student>> OrganizationMembers = Serialization.read("Database/OrganizationMembers.txt", "");
    // Payment-related data
    public static HashMap<Integer, paymentStrategy> semesterPayed = Serialization.read("Database/Payment.txt", "");
    public static Vector<Researcher> researchers = Serialization.read("Database/Researchers.txt");
    public static HashMap<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> researchProjects = Serialization.read("Database/ResearchProjects.txt", 5);
    /**
     * Retrieves all research papers associated with a specific researcher.
     *
     * @param researcher The researcher for whom research papers are retrieved.
     * @return A vector containing all research papers associated with the researcher.
     */
    public static Vector<ResearchPaper> getAllResearchPapers(CanBeResearcher researcher)
    {
        Vector<ResearchPaper> allPapers = new Vector<>();
        for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
            if (entry.getKey().equals(researcher)) {
                for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                    for(ResearchPaper r : entry1.getValue()) {
                        allPapers.add(r);
                    }
                }
                break;
            }
        }
        return allPapers;
    }
    // Supervisor-related data
    public static HashMap<User, CanBeResearcher> supervisors = Serialization.read("Database/Supervisors.txt", "");
    // Complaints-related data
    public static HashMap<FacultyManager,HashMap<Student, HashMap<String, UrgencyLevel>>> complaints = Serialization.read("Database/TeacherComplaints.txt", "");
    // Messages-related data
    public static HashMap<Teacher, Vector<String>> messageToTeacher = Serialization.read("Database/MessageToTeacher.txt", "");
    public static HashMap<Librarian, Vector<String>> messageToLibrarian = Serialization.read("Database/MessageToLibrarian.txt", "");
    public static HashMap<OfficeRegistrator, Vector<String>> messageToOR = Serialization.read("Database/MessageToOR.txt", "");
    public static HashMap<FacultyManager, Vector<String>> messageToDean = Serialization.read("Database/MessageToDean.txt", "");
    public static HashMap<NewsManager, Vector<String>> messageToNewsManager = Serialization.read("Database/MessageToNewsManager.txt", "");
    // News-related data
    public static HashMap<String, String> news = Serialization.read("Database/News.txt", "");
    Vector<Teacher> teachers = new Vector<>();

    // Constructor or method to initialize teachers
}
