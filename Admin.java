package proj;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Admin {

    private static Admin instance;
    Scanner scanner = new Scanner(System.in);
    private Vector<User> userList = new Vector<>();
    public String username = "Admin";
    public String password = "12345";

    private File file = new File("Users.txt");
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    private FileOutputStream fos;
    private ObjectOutputStream oos;

    // Private constructor to prevent instantiation
    private Admin() throws IOException {
        // Check if the file already exists
        if (file.exists()) {
            // If the file exists, open it for appending
            fos = new FileOutputStream(file, true);
        } else {
            // If the file doesn't exist, create a new one
            fos = new FileOutputStream(file);
        }

        // Create the ObjectOutputStream
        oos = new ObjectOutputStream(fos);
    }

    String firstname, lastname, userName, passWord, id, email, specialization, facul;
    int course;
    double gpa;
    Degree degree;
    Faculty faculty;
    // Singleton pattern to get the instance of Admin
    public static Admin getInstance() throws IOException {
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

    public void addUser() throws IOException {
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
            scanner.nextLine();  // Consume the newline character


            System.out.println("Faculty: ");
            facul = scanner.nextLine();
            faculty = Faculty.BS;
            switch (facul) {
                case "FIT" -> faculty = Faculty.FIT;
                case "KMA" -> faculty = Faculty.KMA;
                case "SPE" -> faculty = Faculty.SPE;
                case "ISE" -> faculty = Faculty.ISE;
                case "SG" -> faculty = Faculty.SG;
            }


            System.out.println("specialization: ");
            specialization = scanner.nextLine();

        }


        User newUser = new Student(firstname, lastname, userName, email, passWord, id, degree, gpa,
                course, faculty, specialization, new Vector<Book>(), new Schedule(), new KaspiPay(), new StudentOrganization(), new Transcript());
        oos.writeObject(newUser);


        System.out.println("Student added successfully!");
        System.out.println(newUser.toString());

    }

    public void removeUser(String userID) throws IOException {
        try {
            try {
                while (true) {
                    User user = (User) ois.readObject();
                    userList.add(user);
                }
            } catch (ClassNotFoundException | IOException e) {
                // EOFException indicates end of file reached
                // ClassNotFoundException may occur if the object read is not of type User
            }
            boolean userRemoved = false;
            for (User user : userList) {
                if (user.getID().equals(userID)) {
                    userList.remove(user);
                    userRemoved = true;
                    break;
                }
            }
            if (!userRemoved) {
                System.out.println("User with ID " + userID + " not found.");
                return;
            }
            for (User user : userList) oos.writeObject(user);
            System.out.println("User with ID " + userID + " removed successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();  // Handle the exception appropriately
        }
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
    public void closeStreams() throws IOException {
        // Close the streams when they are no longer needed
        oos.close();
        fos.close();
    }
}
