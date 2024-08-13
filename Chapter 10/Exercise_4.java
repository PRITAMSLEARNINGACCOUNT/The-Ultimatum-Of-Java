import java.util.Scanner;

class Library {
    private String[] AvailableBooks;
    private String[] IssuedBooks;
    private Scanner Input = new Scanner(System.in);
    private int BookIndex = 8;
    private int IssueIndex = 0;

    Library() {
        AvailableBooks = new String[100];
        AvailableBooks[0] = "Programming With Java";
        AvailableBooks[1] = "Hands On Machine Learning";
        AvailableBooks[2] = "Python Programming";
        AvailableBooks[3] = "C Programming";
        AvailableBooks[4] = "Gone Girl";
        AvailableBooks[5] = "The Girl On The Train";
        AvailableBooks[6] = "The Alchemist";
        AvailableBooks[7] = "The Da Vinci Code";
        IssuedBooks = new String[100];
        System.out.println("Welcome To The Library");
        System.out.println("This Library Has The Capacity Of Storing All Total 100 Books");
    }

    private void Update(int Index, String[] Array, int Length) {
        for (int i = Index; i < Length - 1; i++) {
            Array[i] = Array[i + 1];
        }
    }

    public void issueBook() {
        showAvailableBooks();
        System.out.println("Enter The Name Of The Book You Want To Issue : ");
        String BookName = Input.nextLine();
        for (int i = 0; i < BookIndex; i++) {
            if (AvailableBooks[i].equals(BookName)) {
                IssuedBooks[IssueIndex] = AvailableBooks[i];
                Update(i, AvailableBooks, BookIndex);
                BookIndex--;
                IssueIndex++;
                System.out.println("Book Issued");
                return;

            }
        }
        System.out.println("Book Not Found To Be Issued");
    }

    private void addBook(String BookName) {
        if (BookIndex == 100) {
            System.out.println("Library Is Full");
            return;
        }
        AvailableBooks[BookIndex++] = BookName;
    }

    public void addBook() {
        System.out.println("Enter The Name Of The Book You Want To Add : ");
        if (BookIndex == 100) {
            System.out.println("Library Is Full");
            return;
        }
        AvailableBooks[BookIndex] = Input.nextLine();
        BookIndex++;
        System.out.println("Book Added");
    }

    public void showIssuedBooks() {
        if (IssueIndex != 0) {
            System.out.println("Issued Books Are : ");
            for (int i = 0; i < IssueIndex; i++) {
                System.out.println(IssuedBooks[i]);
            }
            return;
        }
        System.out.println("No Books Are Issued");
    }

    public void returnBook() {
        showIssuedBooks();
        System.out.println("Enter The Name Of The Book You Want To Return : ");
        String BookName = Input.nextLine();
        for (int i = 0; i < IssueIndex; i++) {
            if (IssuedBooks[i].equals(BookName)) {
                Update(i, IssuedBooks, IssueIndex);
                addBook(BookName);
                System.out.println("Book Returned");
                IssueIndex--;
                return;
            }
        }
        System.out.println("Book Is Not Issued");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books Are : ");
        for (int i = 0; i < BookIndex; i++) {
            System.out.println(AvailableBooks[i]);
        }
    }
}

public class Exercise_4 {
    public static void main(String[] args) {
        Library Library = new Library();
        Scanner Input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 To Issue A Book");
            System.out.println("Enter 2 To Return A Book");
            System.out.println("Enter 3 To Add A Book");
            System.out.println("Enter 4 To Show Issued Books");
            System.out.println("Enter 5 To Show Available Books");
            System.out.println("Enter 6 To Exit");
            int Choice = Input.nextInt();
            switch (Choice) {
                case 1:
                    Library.issueBook();
                    break;
                case 2:
                    Library.returnBook();
                    break;
                case 3:
                    Library.addBook();
                    break;
                case 4:
                    Library.showIssuedBooks();
                    break;
                case 5:
                    Library.showAvailableBooks();
                    break;
                // case 6:
                // System.exit(0);
                // break;
                case 6:
                    System.out.println("Exiting The Library");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            if (Choice == 6) {
                break;

            }

        }
    }
}