package proj;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Book implements Serializable {

    private String name;
    private String author;
    private Integer code;
    private LocalDate dateOfPublication;
    private String language;
    private String title;
    // Constructors
    public Book(String name, String author, Integer code, LocalDate dateOfPublication,
                String language) {
        this.name = name;
        this.author = author;
        this.code = code;
        this.dateOfPublication = dateOfPublication;
        this.language = language;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDateOfPublication() {
        return this.dateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
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


    public String toString() {
        // TODO: Implement toString method
        return "";
    }
}
