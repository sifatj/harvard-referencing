package bcu.harvardreferencing;

import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Andrew Kay
 *
 */
public class Publication {
    private final List<Author> authors;
    private final String title;
    private final int year;
    
    /**
     * 
     * @param authors
     * @param title
     * @param year
     */
    public Publication(List<Author> authors, String title, int year) {
        if(authors.isEmpty()) {
            throw new IllegalArgumentException("Empty authors list");
        }
        
        this.authors = authors;
        this.title = title;
        this.year = year;
    }
    
    
    /**
     * 
     * @return a list of authors (do i mention it is unmodifiable?)
     */
    public List<Author> getAuthors() {
        return Collections.unmodifiableList(authors);
    }
    
    /**
     * 
     * @return the title of the publication
     */
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public String harvardReference() {
        return authorNames() + " (" + year + ") " + title + ".";
    }
    
    public String authorNames() {
        String nameString = "";
        
        int secondLast = authors.size() - 2;
        for(int i = 0; i < authors.size(); i++) {
            nameString += authors.get(i).fullName();
            if(i < secondLast) {
                nameString += ", ";
            } else if(i == secondLast) {
                nameString += " and ";
            }
        }
        
        return nameString;
    }
}
