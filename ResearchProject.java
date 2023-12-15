package proj;
import java.util.Vector;
public class ResearchProject {
    private String topic;
    private String content;
    private Vector<ResearchPaper> papers;
    private Researcher researcher;
    private ResearchPaper researchPaper;
    public String getTopic() {
        return this.topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Vector<ResearchPaper> getPapers() {
        return this.papers;
    }
    public void setPapers(Vector<ResearchPaper> papers) {
        this.papers = papers;
    }

    public void addResearchPaper(ResearchPaper researchPaper) {
        if (this.papers == null) {
            this.papers = new Vector<>();
        }
        this.papers.add(researchPaper);
    }

    public void displayProjectDetails() {
        System.out.println("Research Project Details:");
        System.out.println("Topic: " + topic);
        System.out.println("Content: " + content);

        if (papers != null && !papers.isEmpty()) {
            System.out.println("Research Papers:");
            for (ResearchPaper paper : papers) {
                System.out.println("- " + paper.getTitle());
            }
        } else {
            System.out.println("No research papers available.");
        }
    }

}