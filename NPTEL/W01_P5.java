import java.util.*;

public class W01_P5 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        for (int i = n; i > 1; i--) {
            if (i == 2) {
                System.out.print("*".repeat(i));
                break;
            }
            System.out.println("*".repeat(i));

        }
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                System.out.print("*".repeat(i));
                break;
            }
            System.out.println("*".repeat(i));
        }
        inr.close();
    }
}
