package proj;

import java.util.Date;

public class Request {
    private User user;
    private String problem;
    private Date date;

    private User getUser() {
        return this.user;
    }

    private void setUser(User user) {
        this.user = user;
    }

    private String getProblem() {
        return this.problem;
    }

    private void setProblem(String problem) {
        this.problem = problem;
    }

    private Date getDate() {
        return this.date;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    // Operations

    public User getUser() {
        // TODO: Implement logic for getting user
        return null;
    }

    public void setUser() {
        // TODO: Implement logic for setting user
    }

    public String getProblem() {
        // TODO: Implement logic for getting problem
        return "";
    }

    public void setProblem() {
        // TODO: Implement logic for setting problem
    }

    public Date getDate() {
        // TODO: Implement logic for getting date
        return new Date();
    }

    public void setdate() {
        // TODO: Implement logic for setting date
    }
}
