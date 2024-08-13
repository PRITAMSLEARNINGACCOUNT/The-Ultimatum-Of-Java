import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner ScannerObject = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int UserInput = ScannerObject.nextInt();
        System.out.println("The Number You Entered Is Greater Than The User Input Number - " + (UserInput > 100));

    }
}
