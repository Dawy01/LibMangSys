package Lib;

public class LibraryItems {
    protected String title;
    protected boolean isAvailable;


    public void borrowItem() {
        if (checkAvailabilty()) {
            isAvailable = false;
            printing(this.title + " is now borrowed\n-----");
        } else
            printing("This item is not available\n-----");

    }

    public void returnItem() {
        if (!checkAvailabilty()) {
            isAvailable = true;
            printing(this.title + " is now returned\n------");
        } else
            printing(this.title + " Is already returned\n------");
    }

    private boolean checkAvailabilty(){
        return isAvailable;
    }

    public void displayDetails() {
        printing("Title: " + title);
        printing("Availability:  " + isAvailable);
    }

    private void printing(String msg){
        System.out.println(msg);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
