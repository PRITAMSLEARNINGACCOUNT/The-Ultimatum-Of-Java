import java.util.Scanner;

public class Exercise_1_1 {
    public static void main(String[] args) {
        Scanner ScannerObject = new Scanner(System.in);
        System.out.println("Enter The Mark Of Science??");
        float Science = ScannerObject.nextFloat();
        System.out.println("Enter The Mark Of English??");
        float English = ScannerObject.nextFloat();
        System.out.println("Enter The Mark Of Computer??");
        float Computer = ScannerObject.nextFloat();
        System.out.println("Enter The Mark Of Biology??");
        float Biology = ScannerObject.nextFloat();
        System.out.println("Enter The Mark Of Geography??");
        float Geography = ScannerObject.nextFloat();
        float Total = (Science + English + Computer + Biology + Geography) / 50;
        System.out.println("So The CGPA Is - " + Total);
    }
}