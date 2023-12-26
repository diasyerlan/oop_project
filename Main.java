package proj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Admin admin = Admin.getInstance();

        System.out.println("Select the system language(kz, en, rus):");
        String language = reader.readLine();
        Map <Integer, String> words = new HashMap<>();
        if (language.equals("en")) words = LanguageMessages.getEnMessage();
        else if (language.equals("kz")) words = LanguageMessages.getKzMessage();
        else if (language.equals("ru")) words = LanguageMessages.getRuMessage();

        System.out.println(words.get(1));

        while (true) {
            Serialization.read("Database/Users.txt");
            System.out.print(words.get(2));
            String username = reader.readLine();

            System.out.print(words.get(3));
            String password = reader.readLine();

            if (admin.username.equals(username) && admin.password.equals(password)) {
                System.out.println(words.get(4));

                String selecte = reader.readLine();
                int selected = Integer.parseInt(selecte);
                if (selected == 1) admin.addUser();
                else if (selected == 2) {
                    System.out.println(words.get(5));
                    String id = reader.readLine();
                    admin.removeUser(id);
                } else if (selected == 3) {
                    while (true) {
                        System.out.println(words.get(6));
                        String id = reader.readLine();
                        if (admin.updateUser(id)) break;
                    }
                } else if (selected == 0) {
                    admin.readAllUsers();
                }
                break;
            }
            User foundUser = null;
            for (User user : Admin.userList) {
                if (user.getUsername() == null) break;
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    foundUser = user;
                    break;
                }

            }
            if (foundUser != null) {
                System.out.println(words.get(7));
                if (foundUser instanceof Student) {
                    System.out.println(words.get(8));
                    Storage.menuAdding(foundUser, 8);

                    System.out.println(words.get(9));
                    String selecte = reader.readLine();
                    int selected = Integer.parseInt(selecte);
                    if (selected == 0) {
                        ((Student) foundUser).viewTranscript();
                    } else if (selected == 1) {
                        boolean found = false;
                        if (Data.requestedReg == null) Data.requestedReg = new HashMap<>();
                        for (Map.Entry<Student, Boolean> entry : Data.requestedReg.entrySet()) {
                            if (entry.getKey().equals(foundUser)) {
                                if (Boolean.FALSE.equals(entry.getValue())) {
                                    found = true;
                                    System.out.println(words.get(10));
                                    break;
                                }
                                if (Boolean.TRUE.equals(entry.getValue())) {
                                    found = true;
                                    System.out.println(words.get(11));
                                    break;
                                }

                            }


                        }
                        if (!found) {
                            Data.requestedReg.put((Student) foundUser, false);
                            System.out.println(words.get(12));
                        }
                        Serialization.write(Data.requestedReg, "Database/RegisterRequests.txt");
                    } else if (selected == 2) {
                        ((Student) foundUser).getSchedule();
                    } else if (selected == 3) {
                        System.out.println(words.get(13));
                        String s = reader.readLine();


                        String[] substringsArray = s.split(",\\s*");
                        Vector<String> booksNames = new Vector<>(Arrays.asList(substringsArray));
                        if (Data.requestedBooks == null) Data.requestedBooks = new HashMap<>();
                        Data.requestedBooks.put(booksNames, foundUser.ID);
                        Serialization.write(Data.requestedBooks, "Database/LibrarianRequests.txt");
                        System.out.println(words.get(14));

                    } else if (selected == 4) {
                        System.out.println(words.get(15));
                        String s = reader.readLine();

                        String[] substringsArray = s.split(",\\s*");
                        Vector<String> booksNames = new Vector<>(Arrays.asList(substringsArray));

                        Iterator<Map.Entry<String, Vector<Book>>> iter = Data.studentBooks.entrySet().iterator();

                        while (iter.hasNext()) {
                            Map.Entry<String, Vector<Book>> studentBooksEntry = iter.next();

                            if (studentBooksEntry.getKey().equals(foundUser.ID)) {
                                Iterator<Book> bookIterator = studentBooksEntry.getValue().iterator();

                                while (bookIterator.hasNext()) {
                                    Book b = bookIterator.next();

                                    for (String bookName : booksNames) {
                                        if (bookName.equals(b.getName())) {
                                            Data.books.add(b);
                                            bookIterator.remove();
                                            break;  // Break out of the innermost loop after adding a book
                                        }
                                    }
                                }

                                if (studentBooksEntry.getValue().isEmpty()) {
                                    iter.remove();  // Remove the entry from Data.studentBooks if the books vector is empty
                                }
                            }
                        }


                        Serialization.write(Data.studentBooks, "Database/StudentBooks.txt");
                        Serialization.write(Data.books, "Database/LibraryBooks.txt");
                        System.out.println(words.get(16));

                    } else if (selected == 5) {
                        if (Data.studentBooks.isEmpty()) System.out.println("You have no book from library!");
                        else {
                            System.out.println("Here are the books you have taken from library: ");
                            for (Map.Entry<String, Vector<Book>> p : Data.studentBooks.entrySet()) {
                                System.out.println(p.getKey());
                                for (Book b : p.getValue()) {
                                    System.out.println(b.getName());

                                }
                            }
                        }
                    } else if (selected == 6) {
                        if (Data.orgsOfStudent == null || Data.orgsOfStudent.isEmpty()) {
                            System.out.println("You are not a member of any Student Organization. Select one of these: ");
                            for (StudentOrganization s : Data.studentOrganizations) {
                                System.out.println(s.getNumber() + " - " + s.getOrganizationName());
                            }
                            selecte = reader.readLine();
                            int orgNum = Integer.parseInt(selecte);
                            for (StudentOrganization s : Data.studentOrganizations) {
                                if (s.getNumber() == orgNum) {
                                    if (Data.orgsOfStudent == null) Data.orgsOfStudent = new HashMap<>();
                                    Data.orgsOfStudent.put((Student) foundUser, s);
                                    if (s.getOrganizationMembers().size() < 50) {
                                        System.out.println("Congrats! You become member of Organization");
                                        s.getOrganizationMembers().add((Student) foundUser);
                                        if (Data.OrganizationMembers == null)
                                            Data.OrganizationMembers = new HashMap<>();
                                        Data.OrganizationMembers.put(s, s.getOrganizationMembers());
                                    } else {
                                        System.out.println("Organization is full of students!");
                                    }
                                    break;
                                }
                            }

                        } else {
                            for (Map.Entry<Student, StudentOrganization> entry : Data.orgsOfStudent.entrySet()) {
                                if (entry.getKey().equals(foundUser)) {
                                    System.out.println("You are already a member of this Organization");
                                }
                            }
                        }
                        Serialization.write(Data.OrganizationMembers, "Database/OrganizationMembers.txt");
                        Serialization.write(Data.orgsOfStudent, "Database/StudentOrganizations.txt");
                    } else if (selected == 7) {
                        System.out.println("You are going to pay Student Fee for current semester. Choose method of Payment: ");
                        System.out.println("1 - Kaspi");
                        System.out.println("2 - Halyk");
                        System.out.println("3 - Cash");
                        String payS = reader.readLine();
                        int pay = Integer.parseInt(payS);
                        int semester;
                        if (((Student) foundUser).term == Term.FALL)
                            semester = ((Student) foundUser).getCourse() * 2 - 1;
                        else semester = ((Student) foundUser).getCourse() * 2;
                        if (Data.semesterPayed == null) Data.semesterPayed = new HashMap<>();
                        paymentStrategy transaction = new CashPayment();
                        if (pay == 1) {
                            transaction = new KaspiPay(((Student) foundUser).phoneNumber);
                        } else if (pay == 2) {
                            transaction = new HalykPayment(((Student) foundUser).creditCard);
                        } else if (pay == 3) {
                            transaction = new CashPayment();
                        }
                        Data.semesterPayed.put(semester, transaction);
                        Serialization.write(Data.semesterPayed, "Database/Payment.txt");
                    } else if (selected == 8) {
                        Storage.researcherDef(foundUser);
                    } else if ((((Student) foundUser).getStudentDegree() == Degree.PHD || ((Student) foundUser).getStudentDegree() == Degree.MASTER) && selected == 9) {

                    }

                }
                else if (foundUser instanceof OfficeRegistrator) {
                    System.out.println("0 - add courses for Student");
                    System.out.println("1 - Send work Messages");
                    System.out.println("2 - View work Messages");


                    System.out.println("Type the appropriate number to take action: ");
                    String selecte = reader.readLine();
                    int selected = Integer.parseInt(selecte);
                    if (selected == 0) {
                        System.out.println("Type the ID of the Student: ");
                        while (true) {
                            String id = reader.readLine();
                            Student foundStudent = null;
                            for (User user : Admin.userList) {
                                if (user.getUsername() == null) break;
                                if (user.getID().equals(id) && user instanceof Student) {
                                    foundStudent = (Student) user;
                                    break;
                                }
                            }
                            if (foundStudent != null) {
                                for (Map.Entry<Student, Boolean> entry : Data.requestedReg.entrySet()) {
                                    if (entry.getKey().equals(foundStudent) && Boolean.FALSE.equals(entry.getValue())) {
                                        System.out.println("The student is not approved for Registration. Type 'ok' to confirm: ");
                                        String ok = reader.readLine();
                                        if (ok.equals("ok")) {
                                            Data.requestedReg.put(foundStudent, false);
                                            Serialization.write(Data.requestedReg, "Database/RegisterRequests.txt");
                                            System.out.println("The request is approved!");
                                            break;
                                        }
                                    }
                                }
                                int semester = 0;
                                semester = ((OfficeRegistrator) foundUser).setCourses(foundStudent, semester);
                                String courses = reader.readLine();
                                StringTokenizer tokenizer = new StringTokenizer(courses, ", ");
                                Vector<String> courseNames = new Vector();
                                while (tokenizer.hasMoreTokens()) courseNames.add(tokenizer.nextToken());
                                for (String courseTyped : courseNames) {
                                    for (Course course : Data.courses) {
                                        if (course.getCourseName().equals(courseTyped)) {
                                            foundStudent.addtranscript(semester, course);
                                        }
                                    }
                                }
                                System.out.println(foundStudent.toString());
                                Serialization.write(Admin.userList, "Database/Users.txt");


                            } else System.out.println("Student not found. Try again!");
                        }
                    } else if (selected == 1) {
                        Storage.sendMessage();
                    } else if (selected == 2) {
                        System.out.println("These are the messages you got from your colleagues: ");
                        for(Map.Entry<OfficeRegistrator, Vector<String>> entry : Data.messageToOR.entrySet()) {
                            if(entry.getKey().equals(foundUser)) {
                                for(String s : entry.getValue()) {
                                    System.out.println(s);
                                }
                            }
                        }
                    }
                    break;
                }
                else if (foundUser instanceof Librarian) {
                    System.out.println("0 - View all books");
                    System.out.println("1 - View requests");
                    System.out.println("2 - Send work Message");
                    System.out.println("3 - View work Messages");
                    Storage.menuAdding(foundUser, 4);

                    String selecte = reader.readLine();
                    int selected = Integer.parseInt(selecte);

                    if (selected == 0) {

                    } else if (selected == 1) {
                        System.out.println(((Librarian) foundUser).getRequests());
                        System.out.println("Type the ID of the certain user to confirm request: ");
                        String st = reader.readLine();
                        Vector<Book> reqBooks = new Vector<>();
                        for (Map.Entry<Vector<String>, String> entry : Data.requestedBooks.entrySet()) {
                            if (entry.getValue().equals(st)) {
                                Iterator<Map.Entry<Vector<String>, String>> iterator = Data.requestedBooks.entrySet().iterator();
                                while (iterator.hasNext()) {
                                    Map.Entry<Vector<String>, String> entry1 = iterator.next();

                                    if (entry1.getValue().equals(st)) {
                                        Iterator<String> bookIterator = entry1.getKey().iterator();

                                        while (bookIterator.hasNext()) {
                                            String s = bookIterator.next();

                                            Iterator<Book> libraryIterator = Data.books.iterator();

                                            while (libraryIterator.hasNext()) {
                                                Book book = libraryIterator.next();

                                                if (s.equals(book.getName())) {
                                                    if (Data.studentBooks == null) {
                                                        Data.studentBooks = new HashMap<>();
                                                    }

                                                    reqBooks.add(book);
                                                    libraryIterator.remove();  // Use iterator's remove to avoid ConcurrentModificationException
                                                    break;
                                                }
                                            }
                                        }

                                        iterator.remove();  // Use iterator's remove to avoid ConcurrentModificationException
                                    }
                                }
                                break;
                            }
                        }
                        Data.studentBooks.put(st, reqBooks);
                        Serialization.write(Data.studentBooks, "Database/StudentBooks.txt");
                        Serialization.write(Data.books, "Database/LibraryBooks.txt");
                        Serialization.write(Data.requestedBooks, "Database/LibrarianRequests.txt");
                    } else if(selected == 2) {
                        Storage.sendMessage();
                    } else if (selected == 3) {
                        System.out.println("These are the messages you got from your colleagues: ");
                        for(Map.Entry<Librarian, Vector<String>> entry : Data.messageToLibrarian.entrySet()) {
                            if(entry.getKey().equals(foundUser)) {
                                for(String s : entry.getValue()) {
                                    System.out.println(s);
                                }
                            }
                        }
                    }
                    else if (selected == 4) {
                        Storage.researcherDef(foundUser);
                    }


                }
                else if (foundUser instanceof Teacher) {
                    System.out.println("0 - View info about Student");
                    System.out.println("1 - Put marks");
                    System.out.println("2 - view Schedule");
                    System.out.println("3 - View courses taken");
                    System.out.println("4 - Sent a complain about Student");
                    System.out.println("5 - Send work Messages");
                    System.out.println("6 - View work Messages");
                    Storage.menuAdding(foundUser, 7);// add next things

                    String selecte = reader.readLine();
                    int selected = Integer.parseInt(selecte);

                    if (selected == 0) {
                        System.out.println("Write down the ID of the Student you want to get info:");
                        String id = reader.readLine();
                        boolean found = false;
                        for (User u : Data.userList) {
                            if (u.ID.equals(id)) {
                                System.out.println(u.toString());
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("No student found with such ID");
                    }
                    else if (selected == 1) {
                        Mark mark = new Mark();
                        System.out.println("You are going to put marks for semester for the Student. Type the course Code you want to choose: ");
                        for (Course c : ((Teacher) foundUser).coursesTaken) {
                            System.out.println(c.getCourseCode() + " - " + c.getCourseName());
                        }
                        String code = reader.readLine();
                        Double a;
                        for (Course c : ((Teacher) foundUser).coursesTaken) {
                            if (c.getCourseCode().equals(code)) {
                                System.out.println("You selected the subject " + c.getCourseName());
                                System.out.println("Write the Student ID to put marks");
                                String id = reader.readLine();
                                for (User u : Data.userList) {
                                    if (u.ID.equals(id) && u instanceof Student) {
                                        for (Course co : ((Student) u).getCourses()) {
                                            if (code.equals(co.getCourseCode())) {
                                                for (Map.Entry<Integer, HashMap<Course, Mark>> entry : ((Student) u).transcript.entrySet()) {
                                                    HashMap<Course, Mark> courseMap = entry.getValue();
                                                    for (Map.Entry<Course, Mark> courseEntry : courseMap.entrySet()) {
                                                        Course course = courseEntry.getKey();
                                                        Mark studentMark = courseEntry.getValue() == null ? new Mark() : courseEntry.getValue();

                                                        if (course.getCourseCode().equals(code)) {
                                                            System.out.println("Choose for what you are going to set points: ");
                                                            System.out.println("0 - First Attestation");
                                                            System.out.println("1 - Second Attestation");
                                                            System.out.println("2 - Final score");
                                                            String chos = reader.readLine();
                                                            int cho = Integer.parseInt(chos);
                                                            reader.readLine();
                                                            System.out.println("Write the first attestation point for " + u.getFirstName() + " " + u.getLastName() + " for subject " + co.getCourseName());
                                                            if (cho == 0) {
                                                                System.out.println("Enter first attestation score:");
                                                                String as = reader.readLine();
                                                                a = Double.parseDouble(as);
                                                                mark = new Mark(a, studentMark.getSecondAttestation(), studentMark.getFinalScore());
                                                            } else if (cho == 1) {
                                                                System.out.println("Enter second attestation score:");
                                                                String as = reader.readLine();
                                                                a = Double.parseDouble(as);
                                                                mark = new Mark(studentMark.getFirstAttestation(), a, studentMark.getFinalScore());
                                                            } else if (cho == 2) {
                                                                System.out.println("Enter final score:");
                                                                String as = reader.readLine();
                                                                a = Double.parseDouble(as);
                                                                mark = new Mark(studentMark.getFirstAttestation(), studentMark.getSecondAttestation(), a);
                                                            }

                                                            courseMap.put(course, mark);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break;

                                    }
                                }
                                break;
                            }
                        }
                        Serialization.write(Data.userList, "Database/Users.txt");
                    }
                    else if (selected == 4) {
                        System.out.println("You are going to sent complaint about Student to to a Dean. Type ID of a Student: ");
                        String id = reader.readLine();
                        for(User u: Data.userList) {
                            if (u instanceof Student && u.getID().equals(id)) {
                                System.out.println("Choose the Urgency Level:");
                                System.out.println("1 - High");
                                System.out.println("2 - Medium");
                                System.out.println("3 - Low");
                                String urgs = reader.readLine();
                                int urg = Integer.parseInt(urgs);
                                UrgencyLevel level = UrgencyLevel.LOW;
                                reader.readLine();
                                switch (urg) {
                                    case 1:
                                        level = UrgencyLevel.HIGH;
                                        break;
                                    case 2:
                                        level = UrgencyLevel.MEDIUM;
                                        break;
                                    case 3:
                                        level = UrgencyLevel.LOW;
                                        break;
                                    default:
                                        System.out.println("Invalid urgency level. Defaulting to LOW.");
                                        break;
                                }

                                System.out.println("Write complaint text!");
                                String complaint = reader.readLine();

                                for (User us : Data.userList) {
                                    if (us instanceof FacultyManager && ((FacultyManager) us).getFaculty().equals(((Student) u).getFaculty())) {
                                        Data.complaints = (Data.complaints == null) ? new HashMap<>() : Data.complaints;

                                        HashMap<Student, HashMap<String, UrgencyLevel>> h1 = Data.complaints.computeIfAbsent((FacultyManager) us, k -> new HashMap<>());

                                        HashMap<String, UrgencyLevel> hashMap = h1.computeIfAbsent((Student) u, k -> new HashMap<>());
                                        hashMap.put(complaint, level);

                                        System.out.println("Complaint is sent successfully!");
                                        break;
                                    }
                                }
                            }

                        }
                        Serialization.write(Data.complaints, "Database/TeacherComplaints.txt");
                    }
                    else if (selected == 5) {
                        Storage.sendMessage();
                    }
                    else if (selected == 6) {
                        System.out.println("These are the messages you got from your colleagues: ");
                        for(Map.Entry<Teacher, Vector<String>> entry : Data.messageToTeacher.entrySet()) {
                            if(entry.getKey().equals(foundUser)) {
                                for(String s : entry.getValue()) {
                                    System.out.println(s);
                                }
                            }
                        }
                    } else if (selected == 7) {
                        Storage.researcherDef(foundUser);
                    }
                }
                else if (foundUser instanceof FacultyManager) {
                    System.out.println("1 - View complaints about Students");
                    System.out.println("2 - Send work Messages");
                    System.out.println("3 - View work Messages");

                    String selecte = reader.readLine();
                    int selected = Integer.parseInt(selecte);

                    if(selected == 1) {
                        for(Map.Entry<FacultyManager, HashMap<Student, HashMap<String, UrgencyLevel>>> entry : Data.complaints.entrySet()) {
                            if(entry.getKey().equals(foundUser)) {
                                for(Map.Entry<Student, HashMap<String, UrgencyLevel>> entry1 : entry.getValue().entrySet()) {
                                    System.out.println();
                                    System.out.println("Student " + entry1.getKey().getID() + ": " + entry1.getKey().getFirstName() + " " + entry1.getKey().getLastName());
                                    for(Map.Entry<String, UrgencyLevel> entry2: entry1.getValue().entrySet()) {
                                        System.out.println("Urgency level: " + entry2.getValue());
                                        System.out.println("Complaint: \n" + entry2.getKey());
                                    }
                                    System.out.println("_________________");
                                }
                            }
                        }
                    } else if (selected == 2) {
                        Storage.sendMessage();
                    } else if (selected == 3) {
                        System.out.println("These are the messages you got from your colleagues: ");
                        for(Map.Entry<FacultyManager, Vector<String>> entry : Data.messageToDean.entrySet()) {
                            if(entry.getKey().equals(foundUser)) {
                                for(String s : entry.getValue()) {
                                    System.out.println(s);
                                }
                            }
                        }
                    }
                }
                else if(foundUser instanceof NewsManager) {
                    System.out.println("1 - Post a News");
                    System.out.println("2 - Send work Messages");
                    System.out.println("3 - View work Messages");

                    String selecte = reader.readLine();
                    int selected = Integer.parseInt(selecte);

                    if(selected == 1) {
                        System.out.println("1 - to WSP");
                        System.out.println("2 - to Istagram");
                        System.out.println("3 - to Telegram");

                        selecte = reader.readLine();
                        int selec = Integer.parseInt(selecte);

                        System.out.println("Write a news Header");
                        String h = reader.readLine();

                        System.out.println("Write a news Article");
                        String a = reader.readLine();

                        if(Data.news == null) Data.news = new HashMap<>();

                        Data.news.put(h, a);
                        switch (selec) {
                            case 1:
                                System.out.println("Published in WSP successfully!");
                                break;
                            case 2:
                                System.out.println("Published in Instagram successfully!");
                                break;
                            case 3:
                                System.out.println("Published in Telegram successfully!");
                                break;
                            default:
                                System.out.println("Invalid selection!"); // Необязательный блок default для обработки некорректных значений
                                break;
                        }

                    } else if (selected == 2) {
                        Storage.sendMessage();
                    } else if (selected == 3) {
                        System.out.println("These are the messages you got from your colleagues: ");
                        for(Map.Entry<FacultyManager, Vector<String>> entry : Data.messageToDean.entrySet()) {
                            if(entry.getKey().equals(foundUser)) {
                                for(String s : entry.getValue()) {
                                    System.out.println(s);
                                }
                            }
                        }
                    }
                }
                else {
                    System.out.println("Incorrect uername or password. Try again:");
                }
                Serialization.write(Data.userList, "Database/Researchers.txt");
                Serialization.write(Data.userList, "Database/Users.txt");
            }


        }
    }

}
