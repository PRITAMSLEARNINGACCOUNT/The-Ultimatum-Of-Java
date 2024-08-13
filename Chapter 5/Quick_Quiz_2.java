import java.util.Scanner;

public class Quick_Quiz_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Value Of N :-");
        int N = Input.nextInt();
        int I = 1;
        System.out.println("Printing Naturals Number From 1 To " + N + " Using Do While Loop");
        do {
            System.out.println(I);
            I++;
        } while (I <= N);
    }
}
