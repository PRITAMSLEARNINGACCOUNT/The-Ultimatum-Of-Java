import java.util.Scanner;

public class W01_P5_Alternative_Way {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        for (int i = n; i > 1; i--) {
            if (i == 2) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                break;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                break;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        inr.close();
    }
}
