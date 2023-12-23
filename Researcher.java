package proj;
import java.io.Serializable;
import java.util.Vector;
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

    public void superviseStudents() {
    };
    public void conductResearch() {};
    public void presentResearchPaper() {};
    public void publicResearchPaper() {};
}
