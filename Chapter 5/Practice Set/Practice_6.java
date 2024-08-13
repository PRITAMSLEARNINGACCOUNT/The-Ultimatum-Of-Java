import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Number To Generate Factorial ?");
        int N = Input.nextInt();
        int Factorial = 1;
        if (N == 0) {
            System.out.println("The Factorial Of 0 Is 1");
        } else {
            int i = 1;
            while (i <= N) {
                Factorial *= i;
                i++;
            }
            System.out.println("The Factorial Of " + N + " Is " + Factorial);
        }
    }
}
