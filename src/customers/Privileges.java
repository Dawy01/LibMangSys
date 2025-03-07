package customers;

import library.LibraryItems;

public interface Privileges {

    String borrowItem(LibraryItems libraryItems);
    String returnItem (LibraryItems libraryItems);
}
