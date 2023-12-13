package proj;



 

public class Librarian extends Employee implements manageRequest {
    
    
     
    
    private invalid listofBooks;
    
    
     
    
    private String Name;
    
    
     
    
    private Integer Age;
    
    
    
    
     
    
    private invalid getListofBooks() {
        return this.listofBooks;
    }
    
    
     
    
    private invalid setListofBooks(invalid listofBooks) {
        this.listofBooks = listofBooks;
    }
    
    
     
    
    private String getName() {
        return this.Name;
    }
    
    
     
    
    private String setName(String Name) {
        this.Name = Name;
    }
    
    
     
    
    private Integer getAge() {
        return this.Age;
    }
    
    
     
    
    private Integer setAge(Integer Age) {
        this.Age = Age;
    }
    

                              Operations                                  
    
    
     
    
    public boolean ApproveRequest() {
        TODO
        return false;
    }
    
    
     
    
    public void addBook() {
        TODO
        return null;
    }
    
    
     
    
    public Book getBookID() {
        TODO
        return null;
    }
    
    
     
    
    public int hashcode() {
        TODO
        return 0;
    }
    
    
     
    
    public boolean equals() {
        TODO
        return false;
    }
    
    
}
