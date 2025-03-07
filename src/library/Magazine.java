package library;
import util.Printer;
import java.util.Date;

public class Magazine extends LibraryItems {
    private String publisher;
    private int issueNumber;
    private Date publicationDate;

    public Magazine(String publisher, int issueNumber, String title, int itemCount) {
        super(title, itemCount);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails(){
        Printer.printMsg("Publisher: " + publisher);
        Printer.printMsg("IssueNumber: " + issueNumber);
        Printer.printMsg("Available: " + isAvailable);
        Printer.printMsg("---------------------");
    }
}
