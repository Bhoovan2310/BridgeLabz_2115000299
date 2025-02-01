public class Book2 {
    private String title, author;
    private double price;
    private int available;

    public Book2() {
        this("Unknown", "Unknown", 0.0, 1);
    }

    public Book2(String title, String author, double price, int available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public String getDetails() {
        return title + " by " + author + ", Price: $" + price + ", Available: " + available + "Book(s)";
    }

    public void setDetails(String title, String author, double price, int available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available < 0) {
            available--;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is not available.");
        }
    }

    public static void main(String[] args) {
        Book2 book1 = new Book2("Java Programming", "James Gosling", 39.99, 3);
        System.out.println(book1.getDetails());
        
        book1.borrowBook();
        System.out.println(book1.getDetails());

        book1.borrowBook(); 
    }
}
