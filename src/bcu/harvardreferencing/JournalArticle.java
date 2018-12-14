package bcu.harvardreferencing;

import java.util.List;

/**
 * 
 * @author Andrew Kay
 *
 */
public class JournalArticle extends Publication {
    private final String journalName;
    private final int volume;
    private final int issue;
    private final int pageFrom;
    private final int pageTo;
    
    /**
     * 
     * @param authors
     * @param title
     * @param year the year of publication
     * @param journalName 
     * @param volume
     * @param issue
     * @param pageFrom
     * @param pageTo
     */
    public JournalArticle(
        List<Author> authors, String title, int year,
        String journalName, int volume, int issue, int pageFrom, int pageTo
    ) {
        super(authors, title, year);
        this.journalName = journalName;
        this.volume = volume;
        this.issue = issue;
        this.pageFrom = pageFrom;
        this.pageTo = pageTo;
    }
    
    /**
     * 
     * 
     * @return the name of the journal
     */
    public String getJournalName() {
        return journalName;
    }
    
    /**
     * 
     * @return the volume number of the journal
     */
    public int getVolume() {
        return volume;
    }
    
    public int getIssue() {
        return issue;
    }
    
    public int getPageFrom() {
        return pageFrom;
    }
    
    public int getPageTo() {
        return pageTo;
    }
    
    @Override
    public String harvardReference() {
        String reference = super.harvardReference();
        
        reference += " " + journalName + ", ";
        reference += volume + "(" + issue + "), ";
        reference += "pp. " + pageFrom + "-" + pageTo + ".";
        
        return reference;
    }
}
