import java.util.Scanner;

public class Practice_7 {
    static void PrintPattern(int N) {
        if (N == 0) {
            return;
        }
        for (int i = 0; i < N; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        PrintPattern(N - 1);

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter How Many No Of Rows You Want To Print: ");
        int Number = Input.nextInt();
        PrintPattern(Number);

    }
}
