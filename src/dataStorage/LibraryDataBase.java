package dataStorage;
import library.LibraryItems;
import java.util.ArrayList;
public class LibraryDataBase {

    private ArrayList<LibraryItems> libraryItems;

    public LibraryDataBase() {
        libraryItems = new ArrayList<>();
    }

    public void add(LibraryItems libraryItem) {
        libraryItems.add(libraryItem);
    }

    public void delete(LibraryItems libraryItem) {
        libraryItems.remove(libraryItem);
    }

    public ArrayList<LibraryItems> getAllLibraryItems() {
        return libraryItems;
    }

    public LibraryItems getItemByTitle(String title) {
        for (LibraryItems item : libraryItems)
            if (item.getTitle().equals(title)) {
                return item;
            }

        return null;
    }


    public String updateItem(LibraryItems oldLibItem, LibraryItems newLibItem) {
        LibraryItems item = getItemByTitle(oldLibItem.getTitle());
        if (item != null) {
            libraryItems.set(libraryItems.indexOf(item), newLibItem);
            return "Item has been changed";
        }

        return "The required item not found";


    }


}
