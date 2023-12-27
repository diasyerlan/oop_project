package proj;

import proj.Exceptions.E;
import proj.Exceptions.H_indexException;
import proj.Exceptions.iterExceedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Storage {
    private static Map<Integer, String> words;
    private String language;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
    public static void researcherDef(User foundUser) throws IOException {
        if (foundUser.isResearcher) {
            for (CanBeResearcher researcher : Data.researchers) {
                if (researcher.getID().equals(foundUser.getID())) {
                    System.out.println(words.get(130));
                    if ( foundUser instanceof Student && (((Student) foundUser).getStudentDegree() == Degree.MASTER || ((Student) foundUser).getStudentDegree() == Degree.PHD)) {
                        System.out.println(words.get(131));
                    }

                    String ss = reader.readLine();
                    int s = Integer.parseInt(ss);
                    if (Data.researchProjects == null)
                        Data.researchProjects = new LinkedHashMap<>();
                    if (s == 1) {
                        Researcher.printResearchProjects(researcher);
                    } else if (s == 2) {
                        Researcher.printResearchPaper(researcher);
                    } else if (s == 3) {
                        System.out.println(words.get(132));

                        Vector<ResearchPaper> allPapers = Data.getAllResearchPapers(researcher);
                        String n = reader.readLine();
                        switch (n) {
                            case "1" -> Researcher.printPapers(Comp.dateComparator, allPapers);
                            case "2" -> Researcher.printPapers(Comp.citationComparator, allPapers);
                            case "3" -> Researcher.printPapers(Comp.articleLengthComparator, allPapers);
                            case "4" -> Researcher.printPapers(Comp.authorsNumComparator, allPapers);
                            case "5" -> Researcher.printPapers(Comp.titleComparator, allPapers);
                            case "6" -> Researcher.printPapers(Comp.keywordsNumComparator, allPapers);
                            case "7" -> Researcher.printPapers(Comp.abstractLengthComparator, allPapers);
                        }

                    } else if (s == 4) {
                        System.out.println(words.get(133) + Researcher.calculateH_index(researcher));

                    } else if (s == 5) {
                        System.out.println(words.get(134));
                        System.out.println(words.get(135));
                        String topic = reader.readLine();

                        System.out.println(words.get(136));
                        String fundingSource = reader.readLine();
                        System.out.println(words.get(137));
                        String duratios = reader.readLine();
                        int duration = Integer.parseInt(duratios);
                        System.out.println(words.get(138));
                        String methodology = reader.readLine();
                        while (true) {
                            boolean isFound = false;
                            int lastestNum = 0;
                            for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                                if (entry.getKey().getID().equals(researcher.getID())) {
                                    if (entry.getValue().isEmpty()) break;
                                    for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                                        lastestNum = entry1.getKey().getProjectNumber();
                                    }
//
                                }
                                break;
                            }
                            for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                                if (entry.getKey().getID().equals(researcher.getID())) {
                                    entry.getValue().put(new ResearchProject(topic, researcher, fundingSource, duration, methodology, lastestNum + 1), new Vector<>());
                                    isFound = true;
                                    break;
                                }
                            }
//                                                for (Map.Entry<CanBeResearcher, Vector<ResearchProject>> entry : Data.researchProjects.entrySet()) {
//                                                    if (entry.getKey().getID().equals(researcher.getID())) {
//                                                        Vector<ResearchProject> r = entry.getValue();
//                                                        r.add(new ResearchProject(topic, researcher, fundingSource, duration, methodology, lastestNum+1));
//                                                        isFound = true;
//                                                        break;
//                                                    }
//
//                                                }
                            if (!isFound)
                                Data.researchProjects.put(researcher, new LinkedHashMap<>());
                            else break;
                        }
                        System.out.println(words.get(139));
                    } else if (s == 6) {
                        System.out.println(words.get(140));
                        for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                            if (entry.getKey().getID().equals(researcher.getID())) {
                                for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                                    System.out.println(entry1.getKey().getProjectNumber() + " - " + entry1.getKey().getTopic());
                                }
                            }
                        }
                        String qs = reader.readLine();
                        int q = Integer.parseInt(qs);
                        for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                            if (entry.getKey().getID().equals(researcher.getID())) {
                                for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                                    if (entry1.getKey().getProjectNumber() == q) {
                                        System.out.println(words.get(141));
                                        System.out.println(words.get(142));
                                        String title = reader.readLine();

                                        System.out.println(words.get(143));
                                        String article = reader.readLine();

                                        System.out.println(words.get(144));
                                        String author = reader.readLine();
                                        StringTokenizer tokenizer = new StringTokenizer(author, ", ");
                                        Vector<String> authors = new Vector<>();
                                        while (tokenizer.hasMoreTokens())
                                            authors.add(tokenizer.nextToken());

                                        System.out.println(words.get(145));
                                        String abctract = reader.readLine();

                                        System.out.println(words.get(146));
                                        String citation = reader.readLine();
                                        StringTokenizer tokenizer1 = new StringTokenizer(citation, ". ");
                                        Vector<String> citations = new Vector<>();
                                        while (tokenizer1.hasMoreTokens())
                                            citations.add(tokenizer1.nextToken());

                                        System.out.println(words.get(147));
                                        String keyword = reader.readLine();
                                        StringTokenizer tokenizer2 = new StringTokenizer(keyword, ", ");
                                        Vector<String> keywords = new Vector<>();
                                        while (tokenizer2.hasMoreTokens())
                                            keywords.add(tokenizer2.nextToken());

                                        System.out.println(words.get(148));
                                        String yeard = reader.readLine();
                                        int year = Integer.parseInt(yeard);
                                        Vector<ResearchPaper> vector = entry.getValue().computeIfAbsent(entry1.getKey(), k -> new Vector<>());
                                        vector.add(new ResearchPaper(title, article, authors, abctract, citations, keywords, year));
                                        System.out.println(words.get(149));
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    } else if (s == 7 && foundUser instanceof Student && (((Student) foundUser).getStudentDegree() == Degree.MASTER || ((Student) foundUser).getStudentDegree() == Degree.PHD)) {
                        if(Data.supervisors == null) Data.supervisors = new HashMap<>();
                        boolean found = false;
                        for(Map.Entry<User, CanBeResearcher> stud: Data.supervisors.entrySet() ) {
                            if(stud.getKey().equals(foundUser)) {
                                System.out.println(words.get(150) + stud.getValue().getFirstName() + " " + stud.getValue().getLastName());
                                System.out.println(stud.getValue());
                                found = true;
                                break;
                            }
                        }
                        if(!found) {
                            System.out.println(words.get(151));
                            int i = 1;
                            Map<Integer, CanBeResearcher> temp = new HashMap<>();
                            for (CanBeResearcher r : Data.researchers) {
                                if (r.equals(foundUser)) continue;
                                System.out.println(i + " - " + r.getFirstName() + " " + r.getLastName() + ", " + Researcher.calculateH_index(r) + ", " + r.getDegree());
                                temp.put(i, r);
                                i++;
                            }
                            boolean success = false;
                            while(!success) {
                                try {
                                    String ns = reader.readLine();
                                    int n = Integer.parseInt(ns);
                                    E.validateIter(n, i);
                                    success = true;
                                    for (Map.Entry<Integer, CanBeResearcher> entry : temp.entrySet()) {
                                        if (n == entry.getKey()) {
                                            try {
                                                E.validateH_index(Researcher.calculateH_index(entry.getValue()));
                                                Data.supervisors.put(foundUser, entry.getValue());
                                                System.out.println(words.get(152));
                                                break;
                                            } catch (H_indexException e) {
                                                System.out.println(words.get(153) + e.getMessage());
                                            }
                                        }
                                    }
                                } catch (iterExceedException e) {
                                    System.out.println(words.get(153) + e.getMessage());
                                }
                            }
                        }

                    }
                    Serialization.write(Data.supervisors, "Database/Supervisors.txt");
                    Serialization.write(Data.researchProjects, "Database/ResearchProjects.txt");
                }
            }
        } else {
            for(User user : Data.userList) {
                if(user.equals(foundUser)) {
                    user.isResearcher = true;
                    System.out.println(words.get(154));
                    if (Data.researchers == null) Data.researchers = new Vector<>();
                    Data.researchers.add(new Researcher(foundUser));
                }
            }

            Serialization.write(Data.userList, "Database/Users.txt");
            }

    }

    public static void menuAdding(User foundUser, int n) {
        if (!foundUser.isResearcher) System.out.println(n + words.get(128));
        else System.out.println(n + words.get(129));
    }
    public static <T> void messaging(Class<T> clazz, HashMap<T, Vector<String>> h) throws IOException {
        for (User u : Data.userList) {
            if (clazz.isInstance(u)) {
                System.out.println(u.getID() + " - " + u.getFirstName() + " " + u.getLastName());
            }
        }

        System.out.println(words.get(156));
        String id = reader.readLine();

        for (User u : Data.userList) {
            if (u.getID().equals(id) && clazz.isInstance(u)) {
                System.out.println(words.get(157));
                String info = u.getFirstName() + " " + u.getLastName() + ": ";
                String message = reader.readLine();

                h = (h == null) ? new HashMap<>() : h;

                Vector<String> messages = h.computeIfAbsent(clazz.cast(u), k -> new Vector<>());
                messages.add(info + message);

                System.out.println(words.get(158));
                break;
            }
        }
    }

    public static void sendMessage() throws IOException {
        System.out.println(words.get(159));

        String messs = reader.readLine();
        int mess = Integer.parseInt(messs);

        if(mess == 1) {
            System.out.println(words.get(160));
            Storage.messaging(Teacher.class, Data.messageToTeacher);
            Serialization.write(Data.messageToTeacher, "Database/MessageToTeacher.txt");
        }
        else if (mess == 2) {
            System.out.println(words.get(161));
            Storage.messaging(Librarian.class, Data.messageToLibrarian);
            Serialization.write(Data.messageToLibrarian, "Database/MessageToLibrarian.txt");
        }
        else if (mess == 3) {
            System.out.println(words.get(162));
            Storage.messaging(FacultyManager.class, Data.messageToDean);
            Serialization.write(Data.messageToDean, "Database/MessageToDean.txt");
        } else if (mess == 4) {
            System.out.println(words.get(163));
            Storage.messaging(OfficeRegistrator.class, Data.messageToOR);
            Serialization.write(Data.messageToOR, "Database/MessageToOR.txt");
        } else if (mess == 5) {
            System.out.println(words.get(164));
            Storage.messaging(NewsManager.class, Data.messageToNewsManager);
            Serialization.write(Data.messageToNewsManager, "Database/MessageToNewsManager.txt");
        }
    }
}
