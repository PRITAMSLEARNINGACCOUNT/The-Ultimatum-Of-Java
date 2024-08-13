import java.util.Scanner;

public class Introduction_To_Strings {
    public static void main(String[] args) {
        String String_1 = new String("First String");
        System.out.println("First Way To Print A String - " + String_1);
        String String_2 = "Second String";
        System.out.println("Second Way To Print A String - " + String_2);
        System.out.println("Taking Input From User Just Only One Word - ");
        Scanner ScannerObject = new Scanner(System.in);
        String String_3 = ScannerObject.next();
        System.out.println("The Word You Entered Is - " + String_3);
        System.out.println("Taking Input From User Just Complete Sentence - ");
        Scanner ScannerObject_2 = new Scanner(System.in);
        String String_4 = ScannerObject_2.nextLine();
        System.out.println("The Sentence You Entered Is - " + String_4);
    }
}
