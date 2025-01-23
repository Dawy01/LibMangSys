package Lib;

public class Book extends LibraryItems {
    private String author;
    private String isbn;
    private int numberOfPages;

    public Book(boolean isAvailable, String title) {
        this.title= title;
        this.isAvailable=isAvailable;
    }
}
