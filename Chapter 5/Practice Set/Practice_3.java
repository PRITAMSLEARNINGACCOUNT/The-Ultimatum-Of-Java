import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Which Multiplication Table You Want To Generate ?");
        int N = Input.nextInt();
        System.out.println("So The Multiplication Table Of " + N + " Is :- ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}
