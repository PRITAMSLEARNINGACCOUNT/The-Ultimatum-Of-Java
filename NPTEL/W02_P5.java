import java.util.Scanner;

public class W02_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        String author = sc.next();

        // Create a Book object
        Book book = new Book();

        // Set title and author
        book.setTitle(title);
        book.setAuthor(author);

        // Display book details
        book.displayDetails();
    }
}

class Book {
    // Private attributes
    private String title;
    private String author;

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return this.title;
    }

    // Getter for author
    public String getAuthor() {
        return this.author;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.print("Author: " + this.author);
    }
}
