package proj;

public class ResearcherDecorator implements Researcher {

    private CanBeResearcher researcher;

    public CanBeResearcher getResearcher() {
        return this.researcher;
    }

    public void setResearcher(CanBeResearcher researcher) {
        this.researcher = researcher;
    }
}
