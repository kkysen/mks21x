//package sen.khyber.apcs.library;

/**
 * a circulating book that can be checked out by a patron until a due date
 * 
 * @author Khyber Sen
 */
public class CirculatingBook extends LibraryBook {
    
    private String currentHolder = null;
    private String dueDate = null;
    
    public CirculatingBook(final String title, final String author, final String isbn,
            final String callNumber) {
        super(title, author, isbn, callNumber);
    }
    
    public String getCurrentHolder() {
        return currentHolder;
    }
    
    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }
    
    public String getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    @Override
    public void checkout(final String patron, final String dueDate) {
        currentHolder = patron;
        this.dueDate = dueDate;
        System.out.println("Successfully checked out " + this);
    }
    
    @Override
    public void returned() {
        currentHolder = null;
        dueDate = null;
    }
    
    @Override
    public String circulationStatus() {
        if (currentHolder == null) {
            return "book available on shelves";
        }
        return "checked out by " + currentHolder + " until " + dueDate;
    }
    
}
