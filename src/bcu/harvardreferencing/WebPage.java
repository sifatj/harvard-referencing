package bcu.harvardreferencing;

import java.util.List;

public class WebPage extends Publication {
    private final String url;
    private final String dateAccessed;
    
    public WebPage(
        List<Author> authors, String title, int year,
        String url, String dateAccessed
    ) {
        super(authors, title, year);
        this.url = url;
        this.dateAccessed = dateAccessed;
    }
    
    /**
     * 
     * @return the url of the webpage
     */
    public String getURL() {
        return url;
    }
    
    /**
     * 
     * @return the last accessed date
     */
    public String getDateAccessed() {
        return dateAccessed;
    }
    
    /**
     * harvard ref in the format
     * 
     * @return the harvard reference of the webpage
     */
    @Override
    public String harvardReference() {
        String reference = super.harvardReference();
        
        reference += " Available at: " + url;
        reference += " [Accessed " + dateAccessed + "].";
        
        return reference;
    }
}
