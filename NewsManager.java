package proj;

import java.time.LocalDate;

public class NewsManager extends Manager {
    private News news;

    public NewsManager(String firstName, String lastName, String username, String email, String password, String ID, Integer salary, Integer hireDate, Integer workExperience) {
        super(firstName, lastName, username, email, password, ID, salary, hireDate, workExperience);
    }

    // Constructors


    // Operations

    public void addNewsArticle(LocalDate postDate, String title, String content, User user) {
        this.news = new News(postDate, title, content, user);
    }

    public void viewNewsArticle() {
        System.out.println(news.toString());
    }

    public void makePostInsta() {
        // TODO: Implement logic for posting on Instagram
    }

    public void makeStoriesInsta() {
        // TODO: Implement logic for posting stories on Instagram
    }

    public void makePostTelega() {
        // TODO: Implement logic for posting on Telegram
    }

    public void changeNewsArticle(String title, String content) {
        this.news.setTitle(title);
        this.news.setContent(content);
    }

    public boolean deleteNews() {
        this.news = null;
        return true;
    }
}
