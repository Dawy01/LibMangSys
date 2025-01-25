package Lib;

public class DVD  extends LibraryItems{
    private String director;
    private int duration;

    public DVD(String director, int duration) {
        this.director = director;
        this.duration = duration;
    }
    @Override
    public void displayDetails(){
        System.out.println("Title: " +title);
        System.out.println("Director:  " + director);
        System.out.println("Duration:  " + duration);
    }
}
