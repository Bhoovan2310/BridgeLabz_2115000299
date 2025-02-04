class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibrary() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println(title + " by " + author + " (ISBN: " + isbn + ")");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Doe", "123-456");
        b1.display();
        displayLibrary();
    }
}
