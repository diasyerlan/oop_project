package proj;
import java.io.*;
import java.util.*;

public class Admin {
    private static Admin instance;
    Scanner scanner = new Scanner(System.in);
    public String username = "Admin";
    public String password = "12345";
    User newUser = new User();
    Data data = new Data();
    public static Vector<User> userList = Serialization.read("Users.txt");

    // Private constructor to prevent instantiation
    private Admin(){
    }

    String firstname, lastname, userName, passWord, id, email;
    int day, month, year, workExp;
    Date hireDate;
    // Singleton pattern to get the instance of Admin
    public static Admin getInstance() throws IOException {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }


    public void readAllUsers() {
        for(User user : userList) {
            System.out.println(user.toString());
        }
    }


    public void commonQuestions() {
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

    public void commonEmployeeQuestions() {
        System.out.println("Hire Date: (Write dd/mm/yy format)");
        String date = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(date, "/");
        Vector<Integer> dates = new Vector();
        while (tokenizer.hasMoreTokens()) dates.add(Integer.parseInt(tokenizer.nextToken()));

        hireDate = new Date(dates.get(0), dates.get(1), dates.get(2));

        System.out.println("Write down the work experience in years: ");
        workExp = scanner.nextInt();
        scanner.nextLine();

    }
    // Operations

    public void addUser() throws IOException {

        System.out.println("You are going to add a new user to the System. Please write the descriptions of ther user.");
        System.out.println("Whom do you want to add? Choose between these: Student, Teacher, Librarian, Cleaner, Security");

        while (true) {
            String position = scanner.nextLine();
            if (position.equals("Student")) {

                commonQuestions();
                System.out.println("Student Degree");
                String deg = scanner.nextLine();
                Degree degree = Degree.PHD;
                if (deg.equals("Bachelor")) degree = Degree.BACHELOR;
                else if (deg.equals("Master")) degree = Degree.MASTER;

                System.out.println("GPA: ");
                Double gpa = scanner.nextDouble();

                System.out.println("Course: ");
                int course = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character


                System.out.println("Faculty: ");
                String facul = scanner.nextLine();
                Faculty faculty = Faculty.BS;
                switch (facul) {
                    case "FIT" -> faculty = Faculty.FIT;
                    case "KMA" -> faculty = Faculty.KMA;
                    case "SPE" -> faculty = Faculty.SPE;
                    case "ISE" -> faculty = Faculty.ISE;
                    case "SG" -> faculty = Faculty.SG;
                }


                System.out.println("specialization: ");
                String specialization = scanner.nextLine();
                newUser = new Student(firstname, lastname, userName, email, passWord, id, degree, gpa,
                        course, faculty, specialization, new Vector<Book>(), new Schedule(), new KaspiPay(), new StudentOrganization(), new Transcript());
                break;
            } else if (position.equals("Teacher")) {
                commonQuestions();
                commonEmployeeQuestions();
                System.out.println("Teacher type. Choose between these: (Professor, Assistant, Tutor, Lecturer, Assistant Professor)");
                String teacherTyp = scanner.nextLine();
                TeacherType teacherType = TeacherType.ASSISTANT;
                switch (teacherTyp) {
                    case "Professor" -> teacherType = TeacherType.PROFESSOR;
                    case "Assistant" -> teacherType = TeacherType.ASSISTANT;
                    case "Tutor" -> teacherType = TeacherType.TUTOR;
                    case "Lecturer" -> teacherType = TeacherType.LECTURER;
                    case "Assistant Professor" -> teacherType = TeacherType.ASSISANTPROFESSOR;
                }

                System.out.println("Faculty. Choose Faculty between these: (FIT, BS, KMA, SPE, ISE, SG)");
                String facul = scanner.nextLine();
                Faculty faculty = Faculty.BS;
                switch (facul) {
                    case "FIT" -> faculty = Faculty.FIT;
                    case "KMA" -> faculty = Faculty.KMA;
                    case "SPE" -> faculty = Faculty.SPE;
                    case "ISE" -> faculty = Faculty.ISE;
                    case "SG" -> faculty = Faculty.SG;
                }

                System.out.println("Set the courses taken: (Seperate by coma)");
                Vector<Course> coursesSetting = new Vector<>();
                String takenCourses = scanner.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(takenCourses, ", ");
                Vector<String> coursesTaken = new Vector();
                while (tokenizer.hasMoreTokens()) coursesTaken.add(tokenizer.nextToken());
                for (String s : coursesTaken) {
                    for (Course course : data.courses) {
                        if (course.getCourseName().equals(s)) {
                            coursesSetting.add(course);
                        }
                    }
                }

                newUser = new Teacher(firstname, lastname, username, email, passWord, id, hireDate, workExp, teacherType, faculty, coursesSetting, new Schedule());
                Serialization.write(userList, "Users.txt");
                break;

            } else if (position.equals("Librarian") || position.equals("Security") || position.equals("Cleaner")) {
                commonQuestions();
                commonEmployeeQuestions();
                if (position.equals("Librarian"))
                    newUser = new Librarian(firstname, lastname, username, email, passWord, id, hireDate, workExp);
                else if (position.equals("Security"))
                    newUser = new Security(firstname, lastname, username, email, passWord, id, hireDate, workExp);
                else newUser = new Cleaner(firstname, lastname, username, email, passWord, id, hireDate, workExp);
                break;
            } else System.out.println("Wrong type of user! Try again: ");

        }

            if(userList == null) userList = new Vector<>();
        userList.add(newUser);
        Serialization.write(userList, "Users.txt");


        System.out.println("User added successfully!");
        userList = Serialization.read("Users.txt");
        System.out.println(userList.lastElement().toString());

    }

    public void removeUser(String userID) throws IOException, ClassNotFoundException {
        List<User> usersToRemove = new ArrayList<>();
        for(User user : userList) {
            if(user.getID().equals(userID)) {
                usersToRemove.add(user);
            }
        }
        userList.removeAll(usersToRemove);
        Serialization.write(userList, "Users.txt");
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
