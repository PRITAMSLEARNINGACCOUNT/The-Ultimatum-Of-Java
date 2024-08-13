import java.util.Scanner;

public class Quick_Quiz_3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Value Of N :-");
        int N = Input.nextInt();
        System.out.println("Printing First" + N + " Odd Numbers Using For Loop");
        for (int i = 0; i < N; i++) {
            System.out.println(2 * i + 1);
        }
    }
}
