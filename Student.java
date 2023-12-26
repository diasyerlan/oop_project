package proj;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

public class Student extends User{
    private static final long serialVersionUID = 1L;
    private Degree studentDegree;
    private double gpa;
    private Integer course;
    private Faculty faculty;
    private String specialization;
    private Vector<Book> booksTaken;
    private Schedule schedule;
    private paymentStrategy paymentStrategy;
    private StudentOrganization studentOrganization;
    public HashMap<Integer, HashMap<Course, Mark>> transcript;
    public Term term;
    public String phoneNumber;
    public String creditCard;

    public Student(){
        super("", "", "", "", "", "");
        studentDegree = Degree.BACHELOR;
        gpa = 0;
        course = 1;
        faculty = Faculty.BS;
        specialization = "";
        booksTaken = new Vector<>();
        schedule = new Schedule();
        paymentStrategy = new KaspiPay();
        studentOrganization = new StudentOrganization();
        term = Term.SPRING;
        phoneNumber = "";
        creditCard = "";
    }

    public Student(String firstName, String lastName, String username, String email, String password, String ID, Degree studentDegree,
                   double gpa, int course, Faculty faculty, String specialization, Vector<Book> booksTaken, Schedule schedule,
                   paymentStrategy paymentStrategy, StudentOrganization studentOrganization, Term term, String phoneNumber, String creditCard) {
        super(firstName, lastName, username, email, password, ID);
        this.studentDegree = studentDegree;
        this.gpa = gpa;
        this.course = course;
        this.faculty = faculty;
        this.specialization = specialization;
        this.booksTaken = booksTaken;
        this.schedule = schedule;
        this.paymentStrategy = paymentStrategy;
        this.studentOrganization = studentOrganization;
        this.term = term;
        this.transcript = new HashMap<>();
        this.phoneNumber = phoneNumber;
        this.creditCard = creditCard;
    }

    public static void updateStudent() {
        System.out.println("7 - Change Student Degree");
        System.out.println("8 - Change GPzA");
        System.out.println("9 - Change Course");
        System.out.println("10 - Change faculty");
        System.out.println("11 - Change Specialization");
        System.out.println("12 - Change paymentStrategy");

    }
    String ans = "";

    public String printAllCourses() {
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Integer, HashMap<Course, Mark>> entry : transcript.entrySet()) {
            int semester = entry.getKey();
            HashMap<Course, Mark> courseMap = entry.getValue();

            ans.append("Semester ").append(semester).append(": ");

                for (Map.Entry<Course, Mark> courseEntry : courseMap.entrySet()) {
                    Course course = courseEntry.getKey();
                    ans.append(course.getCourseName()).append(", ");
                }

            ans.append('\n');
        }
        return ans.toString();
    }
    public Vector<Course> getCourses() {
        Vector<Course> vec = new Vector<>();
        for (Map.Entry<Integer, HashMap<Course, Mark>> entry : transcript.entrySet()) {
            HashMap<Course, Mark> courseMap = entry.getValue();

            for (Map.Entry<Course, Mark> courseEntry : courseMap.entrySet()) {
                Course course = courseEntry.getKey();
                vec.add(course);
            }
        }
        return vec;
    }
// Hashmap<Int, vector<Course>> transcript

    public void addtranscript(int semester, Course course) {

        HashMap<Course, Mark> semesterCoursesandMarks = transcript.get(semester);//HashMap<Integer, HashMap<Course, Mark>>

        // If the semesterCourses is null, create a new Vector
        if (semesterCoursesandMarks == null) {
            semesterCoursesandMarks = new HashMap<>();
        }
        semesterCoursesandMarks.put(course, null);
        transcript.put(semester,semesterCoursesandMarks);

        // Add the course to the semesterCourses Vecto
    }
//    public void addMarks(int semester, Course course, Mark mark, String code) throws IOException {
//        Data.userList = Serialization.read("Database/Users.txt");
//        for (Map.Entry<Integer, HashMap<Course, Mark>> entry : transcript.entrySet()) {
//            HashMap<Course, Mark> courseMap = entry.getValue();
//            for (Map.Entry<Course, Mark> courseEntry : courseMap.entrySet()) {
//                Course c = courseEntry.getKey();
//                if (course.getCourseCode().equals(code)) {
//                    System.out.println("Updating transcript for course: " + course.getCourseName());
//                    courseMap.put(course, mark);
//                    System.out.println(semester + "|" + courseEntry.getKey().getCourseName() + "|" + courseEntry.getValue());
//                    System.out.println("The Mark is set successfully!");
//                    Serialization.write(Data.userList, "Database/Users.txt");
//                }
//            }
//        }
//    }

    public Degree getStudentDegree() {
        return this.studentDegree;
    }

    public void setStudentDegree(Degree studentDegree) {
        this.studentDegree = studentDegree;
    }


    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Integer getCourse() {
        return this.course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Vector<Book> getBooksTaken() {
        return this.booksTaken;
    }

    public void setBooksTaken(Vector<Book> booksTaken) {
        this.booksTaken = booksTaken;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    public paymentStrategy getPaymentMethod() {
        return this.paymentStrategy;
    }
    public void setPaymentMethod(paymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    // Operations (methods)

    public void viewGpa() {
        // TODO: Implement viewGpa
    }

    // Other methods...

    public int payStudentFee() {
        // TODO: Implement payStudentFee
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Student %s %s (ID: %s)%n" +
                        "  Username: %s%n" +
                        "  Password: %s%n" +
                        "  Degree: %s%n" +
                        "  GPA: %.2f%n" +
                        "  Course: %d%n" +
                        "  Faculty: %s%n" +
                        "  Specialization: %s%n" +
                        "  Books Taken: %s%n" +
                        "  Schedule: %s%n" +
                        "  Payment Strategy: %s%n" +
                        "  Student Organization: %s%n" +
                        "  Term: %s%n" +
                        "  Courses: %s%n",


                firstName, lastName, ID, getUsername(), getPassword(),
                studentDegree, gpa, course, faculty, specialization,
                booksTaken, schedule, paymentStrategy, studentOrganization, term, printAllCourses());
    }

    public void viewTranscript() {
        System.out.println("ID: " + ID);
        System.out.println("Student: " + firstName + " " + lastName);
        System.out.println("Speciality: " + getSpecialization());
        System.out.println("Study year: " + getCourse());
        System.out.println("_________________");

        Collection<Integer> semesters = transcript.keySet();
        Collection<HashMap<Course, Mark>> coursesAndMarks = transcript.values();// Hashmap<S, Hasmap<C, M>>
        for(int i : semesters) {
            if(i % 2 == 1) System.out.println("Semester " + i + ": FALL");
            System.out.println("Subject Code | " + "  Subject Name   | " + "Attestation 1 " + "|" + " Attestation 2" + " | " + "Final score" + " | " + "Mark" );
            for(HashMap<Course, Mark> h : coursesAndMarks) {
                for(Map.Entry<Course, Mark> entry : h.entrySet()) {
                    Course c = entry.getKey();
                    Mark m = entry.getValue();
                    if(m == null) m = new Mark();
                    System.out.print( "   " + c.getCourseCode() + "    |  " + c.getCourseName());
                    for(int j = 0; j < (12-c.getCourseName().length()); j++) {
                        System.out.print(" ");
                    }
                    System.out.println("    |      " + m.getFirstAttestation() + "      |    " + m.getSecondAttestation() + "        |     " + m.getFinalScore() + "  | " + m.getLetterMark());
                }
            }
        }

    }
    public void senRequestforBooks() {
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to the correct type
        Student other = (Student) obj;

        // Perform field-by-field comparison using Objects.equals
        return Objects.equals(this.getUsername(), other.getUsername()) && Objects.equals(this.getPassword(), other.getPassword());
    }

}
