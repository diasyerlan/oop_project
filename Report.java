package proj;


public class Report {
 
    private String title;
   
    private User author;
    
    private String content;
    
    public String getTitle() {
        return this.title;
    }
    
    public String setTitle(String title) {
        this.title = title;
    }
    public User getAuthor() {
        return this.author;
    }
    public User setAuthor(User author) {
        this.author = author;
    }
    private String getContent() {
        return this.content;
    }
    private String setContent(String content) {
        this.content = content;
    }
    public void addContent() {
        return null;
    }
    public void viewReport() {
        return null;
    }
    
    
}
