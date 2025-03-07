package library;
import util.Printer;

public class DVD  extends LibraryItems{
    private String director;
    private int duration;

    public DVD(String director, int duration, String title, int itemCount) {
        super(title, itemCount);
        this.director = director;
        this.duration = duration;
    }
    @Override
    public void displayDetails(){
        Printer.printMsg("Title: " + title);
        Printer.printMsg("Director:  " + director);
        Printer.printMsg("Duration:  " + duration);
        Printer.printMsg("Available: " + isAvailable);
        Printer.printMsg("---------------------");
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
