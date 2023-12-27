package proj;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
/**
 * Represents a book with relevant attributes such as name, author, code, date of publication, language, and title.
 * Implements Serializable to support serialization.
 */
public class Book implements Serializable {

    private String name;
    private String author;
    private Integer code;
    private LocalDate dateOfPublication;
    private String language;
    private String title;
    /**
     * Constructs a Book object with specified attributes.
     *
     * @param name               The name of the book.
     * @param author             The author of the book.
     * @param code               The code identifying the book.
     * @param dateOfPublication The date when the book was published.
     * @param language           The language in which the book is written.
     */
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
    /**
     * Gets the name of the book.
     *
     * @return The name of the book.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Sets the name of the book.
     *
     * @param name The new name of the book.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Gets the code identifying the book.
     *
     * @return The code identifying the book.
     */
    public Integer getCode() {
        return this.code;
    }
    /**
     * Sets the code identifying the book.
     *
     * @param code The new code identifying the book.
     */
    public void setCode(int code) {
        this.code = code;
    }
    /**
     * Gets the date when the book was published.
     *
     * @return The date of publication of the book.
     */
    public LocalDate getDateOfPublication() {
        return this.dateOfPublication;
    }
    /**
     * Sets the date when the book was published.
     *
     * @param dateOfPublication The new date of publication of the book.
     */
    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
    /**
     * Gets the language in which the book is written.
     *
     * @return The language of the book.
     */
    public String getLanguage() {
        return this.language;
    }
    /**
     * Sets the language in which the book is written.
     *
     * @param language The new language of the book.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
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
