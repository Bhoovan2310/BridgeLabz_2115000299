public class Book {
    private String title, author;
    private double price;
    private boolean available;

    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public String getDetails() {
        return title + " by " + author + ", Price: $" + price + ", Available: " + available;
    }

    public void setDetails(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Basics", "John Doe", 29.99);
        System.out.println(book.getDetails());
        book.setDetails("Python Guide", "Jane Doe", 34.99, false);
        System.out.println(book.getDetails());
    }
}
