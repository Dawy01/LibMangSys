package util;

import customers.Customers;
import library.LibraryItems;

import java.util.ArrayList;

public class Printer {



    public static void printMsg(String msg){

        System.out.println(msg);
    }
    public static void printMsg(int msg){

        System.out.println(msg);
    }

    public static void printMsg(boolean msg){

        System.out.println(msg);
    }

    /*public static void printMsg(ArrayList<LibraryItems>libraryItemList){
        for (LibraryItems item : libraryItemList)
            item.displayDetails();
        }*/

    public static void  printMsg(ArrayList <Customers> customers){
        for(Customers customer : customers) {
            System.out.println("First Name: " + customer.getFirstName());
            System.out.println("Last Name: " + customer.getLastName());
            System.out.println("Phone Number: " + customer.getPhoneNumber());
            System.out.println("-------------------");
        }

    }


}
