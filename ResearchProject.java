package proj;
import java.io.Serializable;
import java.util.Vector;
public class ResearchProject implements Serializable {
    private static final long serialVersionUID = -6947764470146079755L;
    private String topic;
    private int projectNumber; // Unique identifier for each research project
    private CanBeResearcher leadResearcher;
    private String fundingSource;
    private int durationMonth;
    private String methodology;
    public ResearchProject(String topic, CanBeResearcher leadResearcher, String fundingSource, int durationMonth, String methodology, int n) {
        this.projectNumber = n;
        this.topic = topic;
        this.leadResearcher = leadResearcher;
        this.fundingSource = fundingSource;
        this.durationMonth = durationMonth;
        this.methodology = methodology;
    }
    public String getTopic() {
        return this.topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }


    public CanBeResearcher getLeadResearcher() {
        return leadResearcher;
    }

    public void setLeadResearcher(Researcher leadResearcher) {
        this.leadResearcher = leadResearcher;
    }

    public String getFundingSource() {
        return fundingSource;
    }

    public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }

    public int getDurationMonth() {
        return durationMonth;
    }

    public void setDurationMonth(int durationMonth) {
        this.durationMonth = durationMonth;
    }

    public String getMethodology() {
        return methodology;
    }

    public void setMethodology(String methodology) {
        this.methodology = methodology;
    }

    public int getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }
}