package Lib;

public class Book extends LibraryItems {
    private String author;
    private String isbn;
    private int numberOfPages;

    public Book(String author, String isbn, int numberOfPages) {
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public void displayDetails(){
        System.out.println("Title: " +title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("NumberOfPages: " + numberOfPages);
    }
}
