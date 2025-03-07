package util;
import customers.CustomersDataBase;
import customers.GuestCustomer;
import dataStorage.LibraryDataBase;
import library.Book;

public class LibraryManagmentSystemApp {
    LibraryDataBase dataBase;

    public LibraryManagmentSystemApp (){

       dataBase = new LibraryDataBase();
    }

    CustomersDataBase customersDataBase = new CustomersDataBase();;





    public void run(){

   /*     Book book1 = new Book("ABC", "Ahmed1", "HSF", 250,20);
        Book book2 = new Book("ABCD", "Ahmed2", "HSG", 251,21);
        Book book3 = new Book("ABCDE", "Ahmed3", "HSH", 252,22);


        dataBase.add(book1);
        dataBase.add(book2);
        Printer.printMsg(dataBase.getAllLibraryItems());
        dataBase.delete(book1);
        Printer.printMsg(dataBase.getAllLibraryItems());
        dataBase.updateItem(book2, book3);
        Printer.printMsg(dataBase.getAllLibraryItems());
        dataBase.getItemByTitle(book3.getTitle());*/


        GuestCustomer guest1 = new GuestCustomer("Ahmed", "Hussien", "135498432");
        GuestCustomer guest2 = new GuestCustomer("Ahmed", "Ali", "111111111");
        GuestCustomer guest3 = new GuestCustomer("Ahmed", "Ayman", "22222222");
        customersDataBase.addCustomer(guest1);
        customersDataBase.addCustomer(guest2);
        customersDataBase.addCustomer(guest3);
        customersDataBase.showAllCustomers();
        customersDataBase.deleteCustomer(guest1);
        customersDataBase.showAllCustomers();






    }


}
