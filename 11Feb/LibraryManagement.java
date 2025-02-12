class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    private Book head;
    private Book tail;
    private int bookCount;

    public void addBook(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    public void removeBook(int bookId) {
        if (head == null) return;
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            bookCount--;
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp == tail) tail = temp.prev;
        bookCount--;
    }

    public Book findBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public Book findBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateAvailability(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayBooks() {
        Book temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public int getTotalBooks() {
        return bookCount;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Harry Potter", "J.K. Rowling", "Fantasy", 101, true);
        library.addBook("The Alchemist", "Paulo Coelho", "Fiction", 102, false);
        library.addBook("1984", "George Orwell", "Dystopian", 103, true);

        System.out.println("All Books:");
        library.displayBooks();

        System.out.println("\nAfter Removing Book ID 102:");
        library.removeBook(102);
        library.displayBooks();

        System.out.println("\nUpdating Availability of Book ID 101:");
        library.updateAvailability(101, false);
        library.displayBooks();

        System.out.println("\nTotal Books in Library: " + library.getTotalBooks());

        System.out.println("\nSearching for Book by Title '1984':");
        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found -> ID: " + foundBook.bookId + ", Title: " + foundBook.title + ", Author: " + foundBook.author + ", Available: " + foundBook.isAvailable);
        }
    }
}