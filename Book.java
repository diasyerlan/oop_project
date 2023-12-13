package proj;

import java.util.Vector;

public class Book {

    private String name;
    private Vector<String> author;
    private Integer isbncode;
    private Integer dateofPublic;
    private String languageofBook;
    private String title;
    private Library library;

    // Constructors
    public Book(String name, Vector<String> author, Integer isbncode, Integer dateofPublic,
                String languageofBook, String title) {
        this.name = name;
        this.author = author;
        this.isbncode = isbncode;
        this.dateofPublic = dateofPublic;
        this.languageofBook = languageofBook;
        this.title = title;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<String> getAuthor() {
        return this.author;
    }

    public void setAuthor(Vector<String> author) {
        this.author = author;
    }

    public Integer getIsbncode() {
        return this.isbncode;
    }

    public void setIsbncode(Integer isbncode) {
        this.isbncode = isbncode;
    }

    public Integer getDateofPublic() {
        return this.dateofPublic;
    }

    public void setDateofPublic(Integer dateofPublic) {
        this.dateofPublic = dateofPublic;
    }

    public String getLanguageofBook() {
        return this.languageofBook;
    }

    public void setLanguageofBook(String languageofBook) {
        this.languageofBook = languageofBook;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Operations

    public String getBookID() {
        // TODO: Implement getBookID method
        return "";
    }

    public void setBookID() {
        // TODO: Implement setBookID method
    }

    public String getBookTitle() {
        // TODO: Implement getBookTitle method
        return "";
    }

    public void setBookTitle() {
        // TODO: Implement setBookTitle method
    }

    public Vector<String> getBookAuthors() {
        // TODO: Implement getBookAuthors method
        return null;
    }

    public void setBookAuthors(Vector<String> authors) {
        // TODO: Implement setBookAuthors method
    }

    public String getPageNum() {
        // TODO: Implement getPageNum method
        return "";
    }

    public void setPageNum() {
        // TODO: Implement setPageNum method
    }

    public String toString() {
        // TODO: Implement toString method
        return "";
    }
}
