package viewfinderee368.example.com.books;

/**
 * {@Books} represents a book. It contains informations like title
 * and author of the book.
 */
public class Books {
    /** Title of the book */
    public String title;

    /** Author of the book */
    public String author;

    /**
     * Constructs a new {@link Books}.
     *
     * @param bookTitle is the title of the book
     * @param bookAuthor is the author of the book
     */
    public Books(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() { return title; }

    /**
     * Returns the author of the book.
     */
    public String getAuthor() {
        return author;
    }

}
