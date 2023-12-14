package proj;

public class ResearcherDecorator implements Researcher {

    private CanBeResearcher researcher;

    public CanBeResearcher getResearcher() {
        return this.researcher;
    }

    public void setResearcher(CanBeResearcher researcher) {
        this.researcher = researcher;
    }

    @Override
    public void superviseStudents() {

    }

    @Override
    public void conductResearch() {

    }

    @Override
    public void presentResearchPaper() {

    }

    @Override
    public void publicResearchPaper() {

    }
}
