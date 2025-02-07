class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name, bio;
    Author(String name, String bio) {
        super("Author", 2021);
        this.name = name;
        this.bio = bio;
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryMangement {
    public static void main(String[] args) {
        Author a = new Author("Author", "Bio");
        a.displayInfo();
    }
}
