package proj;

import java.util.Vector;

public class ResearcherDecorator implements CanBeResearcher {
    private CanBeResearcher researcher;
    private int h_index;
    private Vector<ResearchProject> researchProjects;
    private Vector<ResearchPaper> researchPapers;
    public ResearcherDecorator(CanBeResearcher r) {
        this.researcher = r;
        h_index = 0;
    }


    @Override
    public String getFirstName() {
        return researcher.getFirstName();
    }

    @Override
    public String getLastName() {
        return researcher.getLastName();
    }

    @Override
    public String getUsername() {
        return researcher.getUsername();
    }

    @Override
    public String getEmail() {
        return researcher.getEmail();
    }

    @Override
    public String getPassword() {
        return researcher.getPassword();
    }

    @Override
    public String getID() {
        return researcher.getID();
    }
}

