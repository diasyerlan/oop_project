package proj;

import java.time.LocalDate;

public class News {

    private LocalDate postDate;
    private String title;
    private String content;
    private User user;

    // Constructors
    /**
     * Constructs a new `News` object with the specified post date, title, content, and user.
     *
     * @param postDate The date when the news was posted.
     * @param title    The title of the news.
     * @param content  The content or body of the news.
     * @param user     The user who posted the news.
     */
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

    /**
     * Returns a string representation of the `News` object.
     *
     * @return A string representation including post date, title, content, and user information.
     */
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
