import Lib.DVD;
import Lib.Magazine;
import Lib.Book;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Book book= new Book("Ali", "A", 400);
        book.setTitle("ABC");
        book.setAvailable(true);
        book.borrowItem();
        book.borrowItem();
        book.returnItem();
        book.returnItem();
        book.displayDetails();
        System.out.println("*****************\n");

        Magazine magazine=new Magazine("Ahmed", 15);
        magazine.setTitle("EFG");
        magazine.setAvailable(true);
        magazine.borrowItem();
        magazine.borrowItem();
        magazine.returnItem();
        magazine.returnItem();
        magazine.displayDetails();
        System.out.println("*****************\n");

        DVD dvd= new DVD("Islam", 120);
        dvd.setTitle("HKL");
        dvd.setAvailable(false);
        dvd.borrowItem();
        dvd.borrowItem();
        dvd.returnItem();
        dvd.returnItem();
        dvd.displayDetails();
        System.out.print("*****************");


    }
}