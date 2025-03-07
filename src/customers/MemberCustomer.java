package customers;

import library.LibraryItems;

public class MemberCustomer extends Customers implements BrowsePriv, Privileges{
    public MemberCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    @Override
    public void browse(LibraryItems libraryItems) {
        System.out.println("You can browse");
    }

    @Override
    public String borrowItem(LibraryItems libraryItems) {
        return "You can borrow";
    }

    @Override
    public String returnItem(LibraryItems libraryItems) {
        return "You can return";
    }
}
