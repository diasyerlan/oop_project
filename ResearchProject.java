package proj;



 

public class ResearchProject {
    
    
     
    
    private String topic;
    
    
     
    
    private String content;
    
    
     
    
    private Vector<ResearchPaper> papers;
    
    
    
     
    
    private Researcher researcher;
    
    
     
    
    private Researcher researcher;
    
    
     
    
    private ResearchPaper researchPaper;
    
    
    
     
    
    public String getTopic() {
        return this.topic;
    }
    
    
     
    
    public String setTopic(String topic) {
        this.topic = topic;
    }
    
    
     
    
    public String getContent() {
        return this.content;
    }
    
    
     
    
    public String setContent(String content) {
        this.content = content;
    }
    
    
     
    
    public Vector<ResearchPaper> getPapers() {
        return this.papers;
    }
    
    
     
    
    public Vector<ResearchPaper> setPapers(Vector<ResearchPaper> papers) {
        this.papers = papers;
    }
    
}
