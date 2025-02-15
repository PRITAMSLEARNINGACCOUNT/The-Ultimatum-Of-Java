import java.util.Scanner;

public class W05_P3 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        // Read any two values for a and b
        int result;

        a = input.nextInt();
        b = input.nextInt();
        try {
            result = a / b;
            System.out.print(result);
        } catch (Exception e) {
            System.out.println("\t\r\n" + "Exception caught: Division by zero.");
        }
    }
}