package customers;

import library.LibraryItems;

public class GuestCustomer extends Customers implements BrowsePriv, BuyingPriv {

    public GuestCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    @Override
    public void browse(LibraryItems libraryItems) {

    }

    @Override
    public void buyItem(LibraryItems item) {

    }
}
