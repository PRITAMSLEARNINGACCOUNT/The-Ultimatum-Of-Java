import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner ScannerObject = new Scanner(System.in);
        System.out.println("Enter Your Name - ");
        String name = ScannerObject.next();
        System.out.println("Hello " + name);
//        Alternative Way To Achive The Same Result
//        System.out.println("Hello " + ScannerObject.next());
    }
}
