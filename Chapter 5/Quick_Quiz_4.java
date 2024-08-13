import java.util.Scanner;

public class Quick_Quiz_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Value Of N :-");
        int N = Input.nextInt();
        System.out.println("Printing First " + N + " Natural Numbers In Reverse Order Using For Loop");
        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }
}
