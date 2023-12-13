public class News {
    
    private LocalDate postDate;
    private String title;
    private String content;
    private User user;
    private NewsManager newsManager;
    public News(LocalDate postDate, String title, String content, User user) {
        this.postDate = postDate;
        this.title = title;
        this.content = content;
        this.user = user;
    }
    private LocalDate getPostDate() {
        return this.postDate;
    }
    
    private void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }
    
    private String getTitle() {
        return this.title;
    }
    
    private void setTitle(String title) {
        this.title = title;
    }
    
    private String getContent() {
        return this.content;
    }
    
    private void setContent(String content) {
        this.content = content;
    }

   
    
    public LocalDate getPostDate() {
       
        return PostDate;
    }
    
    public void setPostDate() {
       
    }
    
    public String getTitle() {
       
        return "";
    }
    
    public void setTitle() {
       
    }
    
    public String getContent() {
     
        return "";
    }
    
    public void setContent() {
       
    }
    public String toString() {
        return "News{" +
                "postDate=" + postDate +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}