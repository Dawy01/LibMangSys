package library;

import util.Printer;

public class AudioBooks extends LibraryItems {
    private int duration;
    private String creator;
    private int issueNumber;


    public AudioBooks(String title, int itemCount, int duration, String creator, int issueNumber) {
        super(title, itemCount);
        this.duration = duration;
        this.creator = creator;
        this.issueNumber = issueNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    @Override
    public void displayDetails(){
        Printer.printMsg("Title: " +title);
        Printer.printMsg("Creator: "+ creator);
        Printer.printMsg("Duration: "+ duration);
        Printer.printMsg("---------------------");
    }
}
