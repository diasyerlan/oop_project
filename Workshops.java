package proj;

import java.util.Date;

public class Workshops {
    private String name;
    private Date date;
    private int expectedAudience;

    public Workshops(String name, Date date, int expectedAudience) {
        this.name = name;
        this.date = date;
        this.expectedAudience = expectedAudience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getExpectedAudience() {
        return expectedAudience;
    }

    public void setExpectedAudience(int expectedAudience) {
        this.expectedAudience = expectedAudience;
    }
}
