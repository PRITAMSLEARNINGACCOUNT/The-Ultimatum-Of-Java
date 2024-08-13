import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Number To Generate Factorial ?");
        int N = Input.nextInt();
        int Factorial = 1;
        if (N == 0) {
            System.out.println("The Factorial Of 0 Is 1");
        } else {
            for (int i = 1; i <= N; i++) {
                Factorial *= i;
            }
            System.out.println("The Factorial Of " + N + " Is " + Factorial);
        }
    }
}
