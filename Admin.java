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
    public static Vector<User> userList = Serialization.read("Database/Users.txt");

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
        System.out.println("Whom do you want to add? Choose between these: Student, Teacher, Librarian, Cleaner, Security, Manager");

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

                System.out.println("Term: ");
                String ter = scanner.nextLine();
                Term term = Term.FALL;
                switch (ter) {
                    case "Fall" -> term = Term.FALL;
                    case "Spring" -> term = Term.SPRING;

                }
                System.out.println("Phone Number: ");
                String phoneNumber = scanner.nextLine();

                System.out.println("Credit Card number: ");
                String creditCard = scanner.nextLine();

                newUser = new Student(firstname, lastname, userName, email, passWord, id, degree, gpa,
                        course, faculty, specialization, new Vector<Book>(), new Schedule(), new KaspiPay(), new StudentOrganization(), term, phoneNumber, creditCard);
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

                newUser = new Teacher(firstname, lastname, userName, email, passWord, id, hireDate, workExp, teacherType, faculty, coursesSetting, new Schedule());
                Serialization.write(userList, "Database/Users.txt");
                break;

            } else if (position.equals("Librarian") || position.equals("Security") || position.equals("Cleaner") || position.equals("Manager")) {
                commonQuestions();
                commonEmployeeQuestions();
                if (position.equals("Librarian"))
                    newUser = new Librarian(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                else if (position.equals("Security"))
                    newUser = new Security(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                else if (position.equals("Manager")) {
                    System.out.println("Choose the type of Manager: ");
                    System.out.println("1 - News Manager");
                    System.out.println("2 - Office Registrar");
                    System.out.println("3 - Faculty Manager");
                    int variant = scanner.nextInt();
                    scanner.nextLine();
                    if(variant == 1) newUser = new NewsManager(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                    else if(variant == 2) newUser = new OfficeRegistrator(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                    else {
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
                        newUser = new FacultyManager(firstname, lastname, userName, email, passWord, id, hireDate, workExp, faculty);
                    }
                }

                else newUser = new Cleaner(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                break;
            } else System.out.println("Wrong type of user! Try again: ");

        }

            if(userList == null) userList = new Vector<>();
        userList.add(newUser);
        Serialization.write(userList, "Database/Users.txt");


        System.out.println("User added successfully!");
        userList = Serialization.read("Database/Users.txt");
        System.out.println(userList.lastElement().toString());

    }

    public void removeUser(String userID) throws IOException, ClassNotFoundException {
        List<User> usersToRemove = new ArrayList<>();
        for(User user : userList) {
            String user_id = user.getID();
            if (user_id != null && user_id.equals(userID)) {
                usersToRemove.add(user);
            }
        }
        userList.removeAll(usersToRemove);
        Serialization.write(userList, "Database/Users.txt");
        System.out.println("User with ID" + userID + " is removed!" );
    }



    public boolean updateUser(String userID) throws IOException {
        User toUpdate = null;
        for(User user: userList) {
            String user_id = user.getID();
            if (user_id != null && user_id.equals(userID)) {
                toUpdate = user;
            }
        }

        if (toUpdate == null) {
            System.out.println("User not found. Try again!");
            return false;
        } else {
            System.out.println(toUpdate.toString());
            User.updateUser();
            if (toUpdate instanceof Student) Student.updateUser();
            else if (toUpdate instanceof Employee) Employee.updateEmployee();
            int variant = scanner.nextInt();
            scanner.nextLine();
            if(variant == 1) {
                System.out.println("Type the updated name: ");
                String newName = scanner.nextLine();
                toUpdate.setFirstName(newName);
                System.out.println("The firstname of User changed successfully!");
            } else if (variant == 2) {
                System.out.println("Type the updated lastname: ");
                String newName = scanner.nextLine();
                toUpdate.setLastName(newName);
                System.out.println("The lastname of User changed successfully!");
            }
            else if (variant == 3) {
                System.out.println("Type the updated username: ");
                String newName = scanner.nextLine();
                toUpdate.setUsername(newName);
                System.out.println("The username of User changed successfully!");
            } else if (variant == 4) {
                System.out.println("Type the updated email: ");
                String newName = scanner.nextLine();
                toUpdate.setEmail(newName);
                System.out.println("The email of User changed successfully!");
            } else if (variant == 5) {
                System.out.println("Type the updated password: ");
                String newName = scanner.nextLine();
                toUpdate.setPassword(newName);
                System.out.println("The password of User changed successfully!");
            } else if (variant == 6) {
                System.out.println("Type the updated ID: ");
                String newName = scanner.nextLine();
                toUpdate.setID(newName);
                System.out.println("The ID of User changed successfully!");
            }
            if (toUpdate instanceof Student) {
                Student.updateUser();
                if (variant == 7) {
                    System.out.println("Type the updated Student Degree: ");
                    String deg = scanner.nextLine();
                    Degree degree = Degree.PHD;
                    if (deg.equals("Bachelor")) degree = Degree.BACHELOR;
                    else if (deg.equals("Master")) degree = Degree.MASTER;
                    ((Student) toUpdate).setStudentDegree(degree);
                    System.out.println("The Degree of Student changed successfully!");
                }
                else if(variant == 8) {
                    System.out.println("Type the updated GPA: ");
                    Double newGpa = scanner.nextDouble();
                    ((Student) toUpdate).setGpa(newGpa);
                    System.out.println("The GPA of Student changed successfully!");
                }
                else if(variant == 9) {
                    System.out.println("Type the updated Course: ");
                    int newCourse = scanner.nextInt();
                    scanner.nextInt();
                    ((Student) toUpdate).setCourse(newCourse);
                    System.out.println("The Course of Student changed successfully!");
                }
                else if(variant == 10) {
                    System.out.println("Type the updated Faculty: ");
                    String newfac = scanner.nextLine();
                    Faculty faculty = Faculty.BS;
                    switch (newfac) {
                        case "FIT" -> faculty = Faculty.FIT;
                        case "KMA" -> faculty = Faculty.KMA;
                        case "SPE" -> faculty = Faculty.SPE;
                        case "ISE" -> faculty = Faculty.ISE;
                        case "SG" -> faculty = Faculty.SG;
                    }
                    ((Student) toUpdate).setFaculty(faculty);
                    System.out.println("The Faculty of Student changed successfully!");
                } else if(variant == 11) {
                    System.out.println("Type the updated Course: ");
                    String newSpec = scanner.nextLine();
                    ((Student) toUpdate).setSpecialization(newSpec);
                    System.out.println("The Specialization of Student changed successfully!");
                } else if(variant == 12) {
                    System.out.println("Type the updated last Payment method. Choose between Kaspi, Halyk, Cash ");
                    String newpay = scanner.nextLine();
                    new KaspiPay();
                    paymentStrategy pay = switch (newpay) {
                        case "Kaspi" -> new KaspiPay();
                        case "Halyk" -> new HalykPayment();
                        case "Cash" -> new CashPayment();
                        default -> new KaspiPay();
                    };
                    ((Student) toUpdate).setPaymentMethod(pay);
                    System.out.println("The Last Payment method of Student changed successfully!");
                }

            } else if (toUpdate instanceof Employee) {
                Employee.updateUser();
                if (variant == 7) {
                    System.out.println("Type the updated employee hire date. Format yy/mm/dd: ");
                    String date = scanner.nextLine();
                    StringTokenizer tokenizer = new StringTokenizer(date, "/");
                    Vector<Integer> dates = new Vector();
                    while (tokenizer.hasMoreTokens()) dates.add(Integer.parseInt(tokenizer.nextToken()));
                    hireDate = new Date(dates.get(0), dates.get(1), dates.get(2));
                    ((Employee) toUpdate).setHireDate(hireDate);
                    System.out.println("The Hire Date of employee changed successfully!");
                }
                else if(variant == 9) {
                    System.out.println("Type the updated work experience: ");
                    int workExp = scanner.nextInt();
                    scanner.nextLine();
                    ((Employee) toUpdate).setWorkExperience(workExp);
                    System.out.println("The GPA of Student changed successfully!");
                }
            }
            Serialization.write(userList, "Database/Users.txt");
            System.out.println(toUpdate.toString());
            return true;
        }


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
