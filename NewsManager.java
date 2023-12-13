package proj;

public class NewsManager extends Manager {
    private News news;

    public NewsManager(News news) {
        this.news = news;
    }

    
    private News news;

    public void addNewsArticle(LocalDate postDate, String title, String content, User user) {
        this.news = new News(postDate, title, content, user);
    }
    public void viewNewsArticle() {
        System.out.println(news.toString());
    }

    public void makePostInsta() {

        return null;
    }
    public void makeStoriesInsta() {
        return null;
    }
    public void makePostTelega() {
        return null;
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
