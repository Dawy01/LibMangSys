package library;
import util.Printer;

public abstract class LibraryItems {

    protected String title;
    protected boolean isAvailable;
    protected int itemCount;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsAvailable() {
        isAvailable = itemCount >0;
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }




    public LibraryItems(String title, int itemCount ) {
        this.title = title;
        this.itemCount=itemCount;
        this.isAvailable= itemCount > 0;

    }

    public void borrowItem() {
        if (!getIsAvailable()) {
            Printer.printMsg("This item is not available");

        } else{
            itemCount--;
            Printer.printMsg(this.title + " is now borrowed\nitem count: " + this.itemCount + "\n");
    }

    }

    public void returnItem() {
            itemCount++;
            Printer.printMsg(this.title + " is now returned\nItem count: "+ this.itemCount +  "\n");

    }


    public abstract void displayDetails();


    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
