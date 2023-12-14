package proj;
import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;
public class Admin {

    private static Admin instance;
    Scanner scanner = new Scanner(System.in);
    private Vector<User> userList;
    public String username = "Admin";
    public String password = "12345";

    // Private constructor to prevent instantiation
    private Admin() {
        // Initialize any necessary attributes
    }

    String firstname, lastname, userName, passWord, id, email, specialization;
    int course;
    double gpa;
    Degree degree;
    Faculty faculty;
    // Singleton pattern to get the instance of Admin
    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    public void mainQuestions() {
        System.out.println("Print descriptions of Student");
        System.out.println("First name: ");
         firstname = scanner.nextLine();

        System.out.println("Last name: ");
         lastname = scanner.nextLine();

        System.out.println("Username: ");
         userName = scanner.nextLine();

        System.out.println("Email: ");
         email = scanner.nextLine();

        System.out.println("Password: ");
         passWord = scanner.nextLine();

        System.out.println("ID number: ");
         id = scanner.nextLine();
    }

    // Operations

    public void addUser() {
        System.out.println("You are going to add a new user to the System. Please write the descriptions of ther user.");
        System.out.println("Whom do you want to add?");

        String position = scanner.nextLine();

        if(position.equals("Student")) {
            mainQuestions();

            System.out.println("Student Degree");
            String deg = scanner.nextLine();
            degree = Degree.PHD;
            if(deg.equals("Bachelor"))  degree = Degree.BACHELOR;
            else if(deg.equals("Master")) degree = Degree.MASTER;

            System.out.println("GPA: ");
            gpa = scanner.nextDouble();

            System.out.println("Course: ");
            course = scanner.nextInt();

            System.out.println("Faculty: ");
            String facul = scanner.nextLine();
            faculty = Faculty.BS;
            if(facul.equals("FIT")) faculty = Faculty.FIT;
            else if(facul.equals("KMA")) faculty = Faculty.KMA;
            else if(facul.equals("SPE")) faculty = Faculty.SPE;
            else if(facul.equals("ISE")) faculty = Faculty.ISE;
            else if(facul.equals("SG")) faculty = Faculty.SG;


            System.out.println("specialization: ");
            specialization = scanner.nextLine();

        }


        userList.add(new Student(firstname, lastname, userName, email, passWord, id, degree, gpa,
                course, faculty, specialization, new Vector<Book>(), new Schedule(), new KaspiPay()));

    }

    public void removeUser() {
        // TODO: Implement removeUser method
    }

    public String updateUser() {
        // TODO: Implement updateUser method
        return "";
    }

    public String getLogFiles() {
        // TODO: Implement getLogFiles method
        return "";
    }

    public void changeMarks() {
        // TODO: Implement changeMarks method
    }

    public void changeAddress() {
        // TODO: Implement changeAddress method
    }

    public void changeCreditCard() {
        // TODO: Implement changeCreditCard method
    }
}
