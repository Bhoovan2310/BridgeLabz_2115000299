public class Book {

    public String ISBN;
    protected String title;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.ISBN = "12345";
        book.title = "Java Programming";
        book.setAuthor("John Smith");
        System.out.println(book.title);
        System.out.println(book.getAuthor());
    }
}
