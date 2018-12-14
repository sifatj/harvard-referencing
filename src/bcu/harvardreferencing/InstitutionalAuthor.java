package bcu.harvardreferencing;

/**
 * 
 * @author Andrew Kay
 *
 */
public class InstitutionalAuthor implements Author {
    private final String name;
    
    /**
     * 
     * @param name the name of the institutional author
     */
    public InstitutionalAuthor(String name) {
        this.name = name;
    }
    
    /**
     * @return the full name of the institution 
     */
    @Override
    public String fullName() {
        return name;
    }
    
    /**
     * Gets the in-text citation name for the institution.
     * 
     * @return the in-text citation name for the institution
     */
    @Override
    public String citeName() {
        return name;
    }
}
