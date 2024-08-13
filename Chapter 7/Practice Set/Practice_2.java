import java.util.Scanner;

public class Practice_2 {
    static void PrintPattern(int No) {
        if (No < 0) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 1; i <= No; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter How Many No Of Rows You Want To Print: ");
        int Number = Input.nextInt();
        PrintPattern(Number);
    }
}
