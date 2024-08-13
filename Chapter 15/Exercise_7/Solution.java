import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class BookProperties {
    String BookName;
    String Author;
    String IssuedTo = null;
    LocalDate IssuedOn = null;
}

class Library {
    ArrayList<BookProperties> AvailableBooks = new ArrayList<BookProperties>();
    ArrayList<BookProperties> IssuedBooks = new ArrayList<BookProperties>();
    ArrayList<String> Users = new ArrayList<String>();
    Scanner Input = new Scanner(System.in);

    void AddBook() {
        BookProperties Book = new BookProperties();
        System.out.println("Enter The Name Of The Book You Want To Add : ");
        Book.BookName = Input.nextLine();
        System.out.println("Enter The Author Of The Book : ");
        Book.Author = Input.nextLine();
        AvailableBooks.add(Book);
        System.out.println("Book Added");
    }

    void ShowAvailableBooks() {
        if (AvailableBooks.size() == 0) {
            System.out.println("No Books Available");
            return;
        }
        System.out.println("Available Books Are : ");
        for (BookProperties Book : AvailableBooks) {
            System.out.println("Book Name : " + Book.BookName + " Author : " + Book.Author + " Issued To : " + Book.IssuedTo + " Issued On : " + Book.IssuedOn);
        }
    }

    void IssueBook() {
        if (AvailableBooks.size() == 0) {
            System.out.println("No Books Available");
            return;
        }
        System.out.println("Enter The Name Of The Book You Want To Issue : ");
        String TemporaryBookName = Input.nextLine();

        for (BookProperties Book : AvailableBooks) {
            if (Book.BookName.equalsIgnoreCase(TemporaryBookName) && !IssuedBooks.contains(Book)) {
                System.out.println("Enter The Name Of The Person To Whom The Book Is Issued : ");
                String UserName = Input.nextLine();
                if (!Users.contains(UserName)) {
                    Users.add(UserName);
                }
                Book.IssuedTo = UserName;
                Book.IssuedOn = LocalDate.now();
                IssuedBooks.add(Book);
                System.out.println("Book Issued");
                return;
            }
        }
        System.out.println("Book Not Found To Be Issued");
    }

    void ReturnBook() {
        if (IssuedBooks.size() == 0) {
            System.out.println("No Books Are Issued");
            return;
        }
        System.out.println("Enter The Name Of The Book You Want To Return : ");
        String TemporaryBookName = Input.nextLine();
        for (BookProperties Book : IssuedBooks) {
            if (Book.BookName.equalsIgnoreCase(TemporaryBookName)) {
                Book.IssuedTo = null;
                Book.IssuedOn = null;
                IssuedBooks.remove(Book);
                System.out.println("Book Returned");
                return;
            }
        }
        System.out.println("Book Is Not Issued");
    }

}


public class Solution {
    public static void main(String[] args) {
        Library Library = new Library();
        Scanner Input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Show Available Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice : ");
            int Choice = Input.nextInt();
            switch (Choice) {
                case 1:
                    Library.AddBook();
                    break;
                case 2:
                    Library.ShowAvailableBooks();
                    break;
                case 3:
                    Library.IssueBook();
                    break;
                case 4:
                    Library.ReturnBook();
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
