abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String getItemDetails() {
        return "ID: " + itemId + " | Title: " + title + " | Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(getTitle() + " DVD has been reserved.");
        } else {
            System.out.println(getTitle() + " DVD is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class LibraryManagementSystem {
    public static void manageLibraryItem(LibraryItem item) {
        System.out.println(item.getItemDetails() + " | Loan Duration: " + item.getLoanDuration() + " days");
        if (item instanceof Reservable) {
            ((Reservable) item).reserveItem();
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
        }
    }

    public static void main(String[] args) {
        Book book = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");
        Magazine magazine = new Magazine("M202", "Time Magazine", "Various");
        DVD dvd = new DVD("D303", "Inception", "Christopher Nolan");

        manageLibraryItem(book);
        manageLibraryItem(magazine);
        manageLibraryItem(dvd);
    }
}
