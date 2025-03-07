package library;
import util.Printer;

public class Book extends LibraryItems {
    private String author;
    private String isbn;
    private int numberOfPages;

    public Book(String title, String author, String isbn, int numberOfPages, int itemCount) {
        super(title, itemCount);
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void displayDetails(){
        Printer.printMsg("Title: " +title);
        Printer.printMsg("Author: " + author);
        Printer.printMsg("ISBN: " + isbn);
        Printer.printMsg("NumberOfPages: " + numberOfPages);
        Printer.printMsg("Available: " + isAvailable);
        Printer.printMsg("Available items: " + itemCount);
        Printer.printMsg("---------------------");
    }
}
