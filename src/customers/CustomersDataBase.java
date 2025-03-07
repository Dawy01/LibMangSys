package customers;

import util.Printer;

import java.util.ArrayList;

public class CustomersDataBase {

    private ArrayList <Customers> customers;

    public CustomersDataBase() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customers customer){
        customers.add(customer);
    }

    public void deleteCustomer(Customers customer){
        customers.remove(customer);
    }

    public void showAllCustomers(){
        Printer.printMsg(customers);
    }
}
