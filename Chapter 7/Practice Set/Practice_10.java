import java.util.Scanner;

public class Practice_10 {
    static int SUM(int n) {
        int Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += i;
        }
        return Sum;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter The Value Of N To Calculate The Sum Of The First N Natural Numbers: ");
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        System.out.println("The Sum Of The First " + N + " Natural Numbers Is: " + SUM(N));

    }
}
