package proj;

import java.time.LocalDate;

public class News {

    private LocalDate postDate;
    private String title;
    private String content;
    private User user;

    // Constructors
    public News(LocalDate postDate, String title, String content, User user) {
        this.postDate = postDate;
        this.title = title;
        this.content = content;
        this.user = user;
    }

    // Getters and setters
    public LocalDate getPostDate() {
        return this.postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Additional methods

    @Override
    public String toString() {
        return "News{" +
                "postDate=" + postDate +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}
