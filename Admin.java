package proj;
import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Admin {
    private static Admin instance;
    private String language;
    private Map<Integer, String> words;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public void setLanguage(String language) {
        this.language = language;

        // Инициализация слов на выбранном языке
        if (language.equals("en")) {
            words = LanguageMessages.getEnMessage();
        } else if (language.equals("kz")) {
            words = LanguageMessages.getKzMessage();
        } else if (language.equals("ru")) {
            words = LanguageMessages.getRuMessage();
        }
    }
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


    public void commonQuestions() throws IOException {
        System.out.println(words.get(69));
        firstname = reader.readLine();

        System.out.println(words.get(70));
        lastname = reader.readLine();

        System.out.println(words.get(71));
        userName = reader.readLine();

        System.out.println(words.get(72));
        email = reader.readLine();

        System.out.println(words.get(73));
        passWord = reader.readLine();

        System.out.println(words.get(74));
        id = reader.readLine();
    }

    public void commonEmployeeQuestions() throws IOException {
        System.out.println(words.get(75));
        String date = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(date, "/");
        Vector<Integer> dates = new Vector();
        while (tokenizer.hasMoreTokens()) dates.add(Integer.parseInt(tokenizer.nextToken()));

        hireDate = new Date(dates.get(0), dates.get(1), dates.get(2));

        System.out.println(words.get(76));
        String workEsp = reader.readLine();
        workExp = Integer.parseInt(workEsp);
        reader.readLine();

    }
    // Operations

    public void addUser() throws IOException {

        System.out.println(words.get(77));
        System.out.println(words.get(78));

        while (true) {
            String position = reader.readLine();
            if (position.equals("Student")) {

                commonQuestions();
                System.out.println(words.get(80));
                String deg = reader.readLine();
                Degree degree = Degree.PHD;
                if (deg.equals(words.get(81))) degree = Degree.BACHELOR;
                else if (deg.equals(words.get(82))) degree = Degree.MASTER;

                System.out.println(words.get(83));
                String gpas = reader.readLine();
                Double gpa = Double.parseDouble(gpas);

                System.out.println(words.get(84));
                String courseS = reader.readLine();
                int course = Integer.parseInt(courseS);


                System.out.println(words.get(85));
                String facul = reader.readLine();
                Faculty faculty = Faculty.BS;
                switch (facul) {
                    case "FIT" -> faculty = Faculty.FIT;
                    case "KMA" -> faculty = Faculty.KMA;
                    case "SPE" -> faculty = Faculty.SPE;
                    case "ISE" -> faculty = Faculty.ISE;
                    case "SG" -> faculty = Faculty.SG;
                }


                System.out.println(words.get(86));
                String specialization = reader.readLine();

                System.out.println(words.get(87));
                String ter = reader.readLine();
                Term term = Term.FALL;
                switch (ter) {
                    case "Fall" -> term = Term.FALL;
                    case "Spring" -> term = Term.SPRING;

                }
                System.out.println(words.get(88));
                String phoneNumber = reader.readLine();

                System.out.println(words.get(89));
                String creditCard = reader.readLine();

                newUser = new Student(firstname, lastname, userName, email, passWord, id, degree, gpa,
                        course, faculty, specialization, new Vector<Book>(), new Schedule(), new KaspiPay(), new StudentOrganization(), term, phoneNumber, creditCard);
                break;
            } else if (position.equals("Teacher")) {
                commonQuestions();
                commonEmployeeQuestions();
                System.out.println(words.get(90));
                String teacherTyp = reader.readLine();
                TeacherType teacherType = TeacherType.ASSISTANT;
                switch (teacherTyp) {
                    case "Professor" -> teacherType = TeacherType.PROFESSOR;
                    case "Assistant" -> teacherType = TeacherType.ASSISTANT;
                    case "Tutor" -> teacherType = TeacherType.TUTOR;
                    case "Lecturer" -> teacherType = TeacherType.LECTURER;
                    case "Assistant Professor" -> teacherType = TeacherType.ASSISANTPROFESSOR;
                }

                System.out.println(words.get(91));
                String facul = reader.readLine();
                Faculty faculty = Faculty.BS;
                switch (facul) {
                    case "FIT" -> faculty = Faculty.FIT;
                    case "KMA" -> faculty = Faculty.KMA;
                    case "SPE" -> faculty = Faculty.SPE;
                    case "ISE" -> faculty = Faculty.ISE;
                    case "SG" -> faculty = Faculty.SG;
                }

                System.out.println(words.get(92));
                Vector<Course> coursesSetting = new Vector<>();
                String takenCourses = reader.readLine();
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
                    System.out.println(words.get(93));
                    String varianst = reader.readLine();
                    int variant = Integer.parseInt(varianst);
                    reader.readLine();
                    if(variant == 1) newUser = new NewsManager(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                    else if(variant == 2) newUser = new OfficeRegistrator(firstname, lastname, userName, email, passWord, id, hireDate, workExp);
                    else {
                        System.out.println(words.get(94));
                        String facul = reader.readLine();
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
            } else System.out.println(words.get(95));

        }

            if(userList == null) userList = new Vector<>();
        userList.add(newUser);
        Serialization.write(userList, "Database/Users.txt");


        System.out.println(words.get(96));
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
        System.out.println(words.get(67) + userID + words.get(68) );
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
            System.out.println(words.get(97));
            return false;
        } else {
            System.out.println(toUpdate.toString());
            User.updateUser();
            if (toUpdate instanceof Student) Student.updateUser();
            else if (toUpdate instanceof Employee) Employee.updateEmployee();
            String varianst = reader.readLine();
            int variant = Integer.parseInt(varianst);
            reader.readLine();
            if(variant == 1) {
                System.out.println(words.get(98));
                String newName = reader.readLine();
                toUpdate.setFirstName(newName);
                System.out.println(words.get(99));
            } else if (variant == 2) {
                System.out.println(words.get(100));
                String newName = reader.readLine();
                toUpdate.setLastName(newName);
                System.out.println(words.get(101));
            }
            else if (variant == 3) {
                System.out.println(words.get(102));
                String newName = reader.readLine();
                toUpdate.setUsername(newName);
                System.out.println(words.get(103));
            } else if (variant == 4) {
                System.out.println(words.get(104));
                String newName = reader.readLine();
                toUpdate.setEmail(newName);
                System.out.println(words.get(105));
            } else if (variant == 5) {
                System.out.println(words.get(106));
                String newName = reader.readLine();
                toUpdate.setPassword(newName);
                System.out.println(words.get(107));
            } else if (variant == 6) {
                System.out.println(words.get(108));
                String newName = reader.readLine();
                toUpdate.setID(newName);
                System.out.println(words.get(109));
            }
            if (toUpdate instanceof Student) {
                Student.updateUser();
                if (variant == 7) {
                    System.out.println(words.get(110));
                    String deg = reader.readLine();
                    Degree degree = Degree.PHD;
                    if (deg.equals("Bachelor")) degree = Degree.BACHELOR;
                    else if (deg.equals("Master")) degree = Degree.MASTER;
                    ((Student) toUpdate).setStudentDegree(degree);
                    System.out.println(words.get(111));
                }
                else if(variant == 8) {
                    System.out.println(words.get(112));
                    String newGspa = reader.readLine();
                    Double newGpa = Double.parseDouble(newGspa);
                    ((Student) toUpdate).setGpa(newGpa);
                    System.out.println(words.get(113));
                }
                else if(variant == 9) {
                    System.out.println(words.get(114));
                    String newCoursse = reader.readLine();
                    int newCourse = Integer.parseInt(newCoursse);
                    reader.readLine();
                    ((Student) toUpdate).setCourse(newCourse);
                    System.out.println(words.get(115));
                }
                else if(variant == 10) {
                    System.out.println(words.get(116));
                    String newfac = reader.readLine();
                    Faculty faculty = Faculty.BS;
                    switch (newfac) {
                        case "FIT" -> faculty = Faculty.FIT;
                        case "KMA" -> faculty = Faculty.KMA;
                        case "SPE" -> faculty = Faculty.SPE;
                        case "ISE" -> faculty = Faculty.ISE;
                        case "SG" -> faculty = Faculty.SG;
                    }
                    ((Student) toUpdate).setFaculty(faculty);
                    System.out.println(words.get(117));
                } else if(variant == 11) {
                    System.out.println(words.get(118));
                    String newSpec = reader.readLine();
                    ((Student) toUpdate).setSpecialization(newSpec);
                    System.out.println(words.get(119));
                } else if(variant == 12) {
                    System.out.println(words.get(120));
                    String newpay = reader.readLine();
                    new KaspiPay();
                    paymentStrategy pay = switch (newpay) {
                        case "Kaspi" -> new KaspiPay();
                        case "Halyk" -> new HalykPayment();
                        case "Cash" -> new CashPayment();
                        default -> new KaspiPay();
                    };
                    ((Student) toUpdate).setPaymentMethod(pay);
                    System.out.println(words.get(121));
                }

            } else if (toUpdate instanceof Employee) {
                Employee.updateUser();
                if (variant == 7) {
                    System.out.println(words.get(122));
                    String date = reader.readLine();
                    StringTokenizer tokenizer = new StringTokenizer(date, "/");
                    Vector<Integer> dates = new Vector();
                    while (tokenizer.hasMoreTokens()) dates.add(Integer.parseInt(tokenizer.nextToken()));
                    hireDate = new Date(dates.get(0), dates.get(1), dates.get(2));
                    ((Employee) toUpdate).setHireDate(hireDate);
                    System.out.println(words.get(123));
                }
                else if(variant == 9) {
                    System.out.println(words.get(124));
                    String workdExp = reader.readLine();
                    int workExp = Integer.parseInt(workdExp);
                    reader.readLine();
                    ((Employee) toUpdate).setWorkExperience(workExp);
                    System.out.println(words.get(125));
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
