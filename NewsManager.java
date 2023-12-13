package proj;



 

public class NewsManager extends Manager {
    
    
    
     
    
public class NewsManager extends Manager {
    private News news;

                              Operations                                  
    
    
     
    
    public void addNewsArticle() {
        TODO
        return null;
    public NewsManager(News news) {
        this.news = news;
    }

    
    
     
    
    public void viewNewsArticle() {
        TODO
        return null;
    }
    
    
     
    
    public void makePostInsta() {
        TODO
        return null;
    }
    
    
     
    
    public void makeStoriesInsta() {
        TODO
        return null;
    }
    
    
     
    
    public void makePostTelega() {
        TODO
        return null;
    }
    
    
     
    
    public void changeNewsArticle() {
        TODO
        return null;
    }
    
    
     
    
    public boolean deleteNews() {
        TODO
        return false;
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
