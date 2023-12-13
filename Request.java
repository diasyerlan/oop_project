package proj;
public class Request {
    private User user;
    private String problem;
    private java.util.date date;
    private User getUser() {
        return this.user;
    }
    private User setUser(User user) {
        this.user = user;
    }
    private String getProblem() {
        return this.problem;
    }
    private String setProblem(String problem) {
        this.problem = problem;
    }
    private java.util.date getDate() {
        return this.date;
    }
    private java.util.date setDate(java.util.date date) {
        this.date = date;
    }
    public User getUser() {
        return null;
    }
    public void setUser() {
        return null;
    }
    public String getProblem() {
        return "";
    }
    public void setProblem() {
        return null;
    }
    public Date getDate() {
        return new Date();
    }
    public void setdate() {
        return null;
    }
    
    
}
