import java.util.Scanner;

public class Practice_3 {
    static int SUM(int n) {
        if (n == 0) {
            return 0;
        }
        return n + SUM(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Please Enter The Value Of N To Calculate The Sum Of The First N Natural Numbers: ");
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        System.out.println("The Sum Of The First " + N + " Natural Numbers Is: " + SUM(N));
    }
}
