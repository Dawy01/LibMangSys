package Lib;

import java.util.Date;

public class Magazine extends LibraryItems {
    private String publisher;
    private int issueNumber;
    private Date publicationDate;

    public Magazine(String publisher, int issueNumber) {
        this.publisher = publisher;
        this.issueNumber = issueNumber;

    }
    @Override
    public void displayDetails(){
        System.out.println("Title: " +title);
        System.out.println("Publisher:  " + publisher);
        System.out.println("IssueNumber:  " + issueNumber);
    }
}
