package bcu.harvardreferencing;

/**
 * 
 * @author Andrew Kay
 *
 */
public class IndividualAuthor implements Author {
    private final String lastName;
    private final String initials;
    
    /**
     * 
     * @param lastName The last name of the author
     * @param initials The initials of the author	
     */
    public IndividualAuthor(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }
    
    /**
     * Gets the author's full name is the format "lastName, initials".
     * 
     * @return the full name of the author
     */
    @Override
    public String fullName() {
        return lastName + ", " + initials;
    }
    
    /**
     * Gets the in-text citation name of the author.
     * 
     * @return the surname of the author
     */
    @Override
    public String citeName() {
        return lastName;
    }
}
