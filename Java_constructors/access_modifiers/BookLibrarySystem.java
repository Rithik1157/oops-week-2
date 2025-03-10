package access_modifiers;

class Book {
    public String ISBN; 
    protected String title; 
    private String author; 

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize; // File size in MB

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Display EBook details
    public void displayEBookInfo() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); 
        System.out.println("Title: " + title); 
        System.out.println("Author: " + getAuthor()); 
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class to test
public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "JOSH");
        book1.displayBookInfo();

        book1.setAuthor("Rithik");
        System.out.println("Updated Author: " + book1.getAuthor());

        EBook ebook1 = new EBook("978-1491950357", "Clean Code", "Robert C. Martin", 5.5);
        ebook1.displayEBookInfo();
    }
}
