
/**
 *Book class for library System.
 *
 * @author hmjaneway
 */
public class Book {

    private String title;
    private String author;
    private String genre;
    private boolean available;
    private String dueDate;

    /**
     * default constructor for book class.
     */
    public Book() {
        title = "";
        author = "";
        genre = "";
        available = true;

    }

    /**
     * Overloaded constructor.
     *
     * @param title is the title of the book.
     * @param author is the author of the book.
     * @param genre is the genre of the book.
     * @param available if the book is available or not.
     * @param dueDate is the due date of the book.
     */
    public Book(String title, String author, String genre, boolean available, String dueDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.dueDate = dueDate;
    }

    /**
     * Sets the title of the book.
     *
     * @param title new title to be entered.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     *
     * @param author new author to be entered.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the genre of the book.
     *
     * @param genre new genre to be entered.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Sets whether the book is available or not.
     *
     * @param available whether the book is available is true if not false.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns the title of the book.
     *
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     *
     * @return author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the genre of the book.
     *
     * @return genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Return the statement true or false whether the book is available.
     *
     * @return availability by true or false statement.
     */
    public boolean getAvailable() {
        return available;
    }

    /**
     * Sets the due date for a book.
     *
     * @param date The due date formatted in mm/dd/yyyy.
     */
    public void setDueDate(String date) {
        this.dueDate = date;
    }

    /**
     * Return the due date.
     *
     * @return The due date formatted in mm/dd/yyyy.
     */
    public String getDueDate() {
        return this.dueDate;
    }

    /**
     * Return the book details formatted.
     *
     * @return The book title, author, genre, availability, and due date.
     */
    public String toString() {
        return "Title: " + this.title + " Author: " + this.author + " Genre: " + this.genre + " Available: " + this.available + " Due Date: " + this.dueDate;
    }
}
