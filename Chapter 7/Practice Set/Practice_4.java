import java.util.Scanner;

public class Practice_4 {
    static void PrintPattern(int n) {
        if (n < 0) {
            System.out.println("Invalid Input");
        }
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter How Many No Of Rows You Want To Print: ");
        int Number = Input.nextInt();
        PrintPattern(Number);
    }
}
