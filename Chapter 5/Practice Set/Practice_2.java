import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Sum = 0;
        System.out.println("Enter The Value Of N :- ");
        int N = Input.nextInt();
        int i = 1;
        while (i <= N) {
            Sum += (2 * i);
            i++;
        }
        System.out.println("So The Sum Of " + N + " Even Numbers Is: " + Sum);
    }
}