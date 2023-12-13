package proj;
public class Researcher implements InterfResearch {
    private Vector<ResearchProject> projects;
    private ResearchProject researchProject;
    public Vector<ResearchProject> getProjects() {
        return this.projects;
    }
    public Vector<ResearchProject> setProjects(Vector<ResearchProject> projects) {
        this.projects = projects;
    }
    public void superviseStudents() {
        return null;
    }
    public void conductResearch() {
        return null;
    }
    public void presentResearchPaper() {
        return null;
    }
    public void publishResearchPaper() {
        return null;
    }
    
    
}
