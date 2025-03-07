package customers;

import library.LibraryItems;

public class PremiumCustomer extends Customers implements Privileges, BrowsePriv, BuyingPriv{
    public PremiumCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    @Override
    public void browse(LibraryItems libraryItems) {

    }

    @Override
    public void buyItem(LibraryItems item) {

    }

    @Override
    public String borrowItem(LibraryItems libraryItems) {
        return "";
    }

    @Override
    public String returnItem(LibraryItems libraryItems) {
        return "";
    }
}
