import java.util.Scanner;

public class Practice_11 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Sum = 0;
        System.out.println("Enter The Value Of N :- ");
        int N = Input.nextInt();
        for (int i = 1; i <= N; i++) {
            Sum += (2 * i);
            System.out.println(2 * i);
        }
        System.out.println("So The Sum Of " + N + " Even Numbers Is: " + Sum);
    }
}
