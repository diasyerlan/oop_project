package proj;
import java.io.Serializable;
import java.util.*;

public class Researcher extends ResearcherDecorator implements Serializable {

    public Researcher(CanBeResearcher r) {
        super(r);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public Degree getDegree() {
        return super.getDegree();
    }

    public void superviseStudents() {
    };
    public static void printResearchProjects(CanBeResearcher researcher) {
        if (Data.researchProjects.isEmpty())
            System.out.println("No Research projects yet!");
        else {
            for (Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
                if (entry.getKey().equals(researcher)) {
                    for (Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                        System.out.println(entry1.getKey().getTopic());
                    }
                    break;
                }
            }
        }
    };
    public static void printResearchPaper(CanBeResearcher researcher) {
        for(Map.Entry<CanBeResearcher, LinkedHashMap<ResearchProject, Vector<ResearchPaper>>> entry : Data.researchProjects.entrySet()) {
            if(entry.getKey().equals(researcher)) {
                for(Map.Entry<ResearchProject, Vector<ResearchPaper>> entry1 : entry.getValue().entrySet()) {
                    System.out.println("Research Project: " + entry1.getKey().getTopic());
                    System.out.println("Research Papers: ");
                    for(ResearchPaper rp : entry1.getValue()) {
                        System.out.println(rp);
                        System.out.println();
                    }
                    System.out.println("____________________");
                }
            }
        }
    };
    public static int calculateH_index(CanBeResearcher researcher) {
        Vector <ResearchPaper> papers = Data.getAllResearchPapers(researcher);
        Collections.sort(papers, Comparator.comparingInt(ResearchPaper :: getCitationNum).reversed());
        int i = 1, h_index = 0;
        while(i <= papers.size()) {
            h_index = papers.elementAt(i-1).getCitationNum();
            i++;
        }
        return h_index;
    }
    public static void printPapers(Comparator c, Vector<ResearchPaper> allPapers) {
        if(!allPapers.isEmpty()) {
            Collections.sort(allPapers, c);
            for (ResearchPaper paper : allPapers) {
                System.out.println(paper);
            }
        } else {
            System.out.println("No research papers available.");
        }
    }
    public void publicResearchPaper() {};
}
