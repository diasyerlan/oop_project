package proj;

import java.util.Date;

public class Request {
    private User user;
    private String problem;
    private Date date;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProblem() {
        return this.problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Operations

    public User getCurrentUser() {
        // TODO: Implement logic for getting user
        return null;
    }

    public void setCurrentUser() {
        // TODO: Implement logic for setting user
    }

    public String getProblemDescription() {
        // TODO: Implement logic for getting problem
        return "";
    }

    public void setProblemDescription() {
        // TODO: Implement logic for setting problem
    }

    public Date getRequestDate() {
        // TODO: Implement logic for getting date
        return new Date();
    }

    public void setRequestDate() {
        // TODO: Implement logic for setting date
    }
}
