package proj;

import proj.Exceptions.E;
import proj.Exceptions.H_indexException;
import proj.Exceptions.iterExceedException;

import java.io.IOException;
import java.util.*;

public class Storage {

    static Scanner scanner = new Scanner(System.in);
    public static void researcherDef(User foundUser) throws IOException {
        if (foundUser.isResearcher) {
            for (CanBeResearcher researcher : Data.researchers) {
                if (researcher.getID().equals(foundUser.getID())) {
                    System.out.println("This is your researcher menu!");
                    System.out.println("1 - View all Research projects");
                    System.out.println("2 - View all Research papers");
                    System.out.println("3 - Print all Research papers");
                    System.out.println("4 - Calculate h-index");
                    System.out.println("5 - Add research project");
                    System.out.println("6 - Add research papers");
                    if ( foundUser instanceof Student && (((Student) foundUser).getStudentDegree() == Degree.MASTER || ((Student) foundUser).getStudentDegree() == Degree.PHD)) {
                        System.out.println("7 - View Supervisor");
                    }

                    int s = scanner.nextInt();
                    scanner.nextLine();
                    if (Data.researchProjects == null)
                        Data.researchProjects = new LinkedHashMap<>();
                    if (s == 1) {
                        Researcher.printResearchProjects(researcher);
                    } else if (s == 2) {
                        Researcher.printResearchPaper(researcher);
                    } else if (s == 3) {
                        System.out.println("1 - Sort by Publication Date");
                        System.out.println("2 - Sort by citations");
                        System.out.println("3 - Sort by article length");
                        System.out.println("4 - Sort by authors number");
                        System.out.println("5 - Sort by title alphabetically");
                        System.out.println("6 - Sort by keywords number");
                        System.out.println("7 - Sort by abstract length");

                        Vector<ResearchPaper> allPapers = Data.getAllResearchPapers(researcher);
                        String n = scanner.nextLine();
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
                        System.out.println("Your h-index is " + Researcher.calculateH_index(researcher));

                    } else if (s == 5) {
                        System.out.println("You are going to add Research Projects");
                        System.out.println("Write the Research Topic: ");
                        String topic = scanner.nextLine();

                        System.out.println("Write the Research Funding Source of the research project: ");
                        String fundingSource = scanner.nextLine();
                        System.out.println("Write the duration of Research in months: ");
                        int duration = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Write what Methodology you used: ");
                        String methodology = scanner.nextLine();
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
                        System.out.println("The project is added successfully!");
                    } else if (s == 6) {
                        System.out.println("You are going to add research papers for your projects. Select for which project you want to add: ");
                        for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                            if (entry.getKey().getID().equals(researcher.getID())) {
                                for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                                    System.out.println(entry1.getKey().getProjectNumber() + " - " + entry1.getKey().getTopic());
                                }
                            }
                        }
                        int q = scanner.nextInt();
                        scanner.nextLine();
                        for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                            if (entry.getKey().getID().equals(researcher.getID())) {
                                for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                                    if (entry1.getKey().getProjectNumber() == q) {
                                        System.out.println("Now add descriptions for your Research Paper: ");
                                        System.out.println("Add Title:");
                                        String title = scanner.nextLine();

                                        System.out.println("Type an article(content):");
                                        String article = scanner.nextLine();

                                        System.out.println("Type authors by coma: ");
                                        String author = scanner.nextLine();
                                        StringTokenizer tokenizer = new StringTokenizer(author, ", ");
                                        Vector<String> authors = new Vector<>();
                                        while (tokenizer.hasMoreTokens())
                                            authors.add(tokenizer.nextToken());

                                        System.out.println("Write an abstract: ");
                                        String abctract = scanner.nextLine();

                                        System.out.println("Write citations: ");
                                        String citation = scanner.nextLine();
                                        StringTokenizer tokenizer1 = new StringTokenizer(citation, ". ");
                                        Vector<String> citations = new Vector<>();
                                        while (tokenizer1.hasMoreTokens())
                                            citations.add(tokenizer1.nextToken());

                                        System.out.println("Write keywords: ");
                                        String keyword = scanner.nextLine();
                                        StringTokenizer tokenizer2 = new StringTokenizer(keyword, ", ");
                                        Vector<String> keywords = new Vector<>();
                                        while (tokenizer2.hasMoreTokens())
                                            keywords.add(tokenizer2.nextToken());

                                        System.out.println("Type year published: ");
                                        int year = scanner.nextInt();
                                        scanner.nextLine();
                                        Vector<ResearchPaper> vector = entry.getValue().computeIfAbsent(entry1.getKey(), k -> new Vector<>());
                                        vector.add(new ResearchPaper(title, article, authors, abctract, citations, keywords, year));
                                        System.out.println("Research Paper added successfully!");
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
                                System.out.println("Your supervisor is " + stud.getValue().getFirstName() + " " + stud.getValue().getLastName());
                                System.out.println(stud.getValue());
                                found = true;
                                break;
                            }
                        }
                        if(!found) {
                            System.out.println("You do not have any Supervisors. Choose one: ");
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
                                    int n = scanner.nextInt();
                                    scanner.nextLine();
                                    E.validateIter(n, i);
                                    success = true;
                                    for (Map.Entry<Integer, CanBeResearcher> entry : temp.entrySet()) {
                                        if (n == entry.getKey()) {
                                            try {
                                                E.validateH_index(Researcher.calculateH_index(entry.getValue()));
                                                Data.supervisors.put(foundUser, entry.getValue());
                                                System.out.println("Supervisor chosen successfully!");
                                                break;
                                            } catch (H_indexException e) {
                                                System.out.println("Exception caught: " + e.getMessage());
                                            }
                                        }
                                    }
                                } catch (iterExceedException e) {
                                    System.out.println("Exception caught: " + e.getMessage());
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
                    System.out.println("Congrats, you are a Researcher now!");
                    if (Data.researchers == null) Data.researchers = new Vector<>();
                    Data.researchers.add(new Researcher(foundUser));
                }
            }

            Serialization.write(Data.userList, "Database/Users.txt");
            }

    }

    public static void menuAdding(User foundUser, int n) {
        if (!foundUser.isResearcher) System.out.println(n + " - Become a Researcher");
        else System.out.println(n + " - Go to Researcher menu");
    }
}
