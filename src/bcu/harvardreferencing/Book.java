package bcu.harvardreferencing;

import java.util.List;

/**
 * 
 * <p>
 * 
 * 
 * @author Andrew Kay
 * @see Publication
 */
public class Book extends Publication {
    private final String publisher;
    
    /**
     * Creates a Book object.
     * <p>
     * It stores below params.
     * 
     * @param authors list of authors of the book.
     * @param title the title of the book.
     * @param year the year the book was published. 
     * @param publisher the name of the book publisher.
     */
    public Book(
        List<Author> authors, String title, int year,
        String publisher
    ) {
        super(authors, title, year);
        this.publisher = publisher;
    }
    
    /**
     * Gets the name of the book publisher.
     * 
     * @return the name of the book publisher
     */
    public String getPublisher() {
        return publisher;
    }
    
    
    /**
     * Gets the Harvard reference of the book
     * @return the Harvard reference of the book
     */
    @Override
    public String harvardReference() {
        return super.harvardReference() + " " + publisher + ".";
    }
}
