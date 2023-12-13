package proj;

import java.util.List;

public class ResearchProject {

    private String topic;
    private String content;
    private List<ResearchPaper> papers;
    private Researcher researcher;

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

    public List<ResearchPaper> getPapers() {
        return this.papers;
    }

    public void setPapers(List<ResearchPaper> papers) {
        this.papers = papers;
    }
}
