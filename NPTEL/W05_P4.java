
//Prefixed Fixed Code:
import java.util.Scanner;
import java.util.InputMismatchException;

public class W05_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        // create an array to save user input
        int[] name = new int[length];
        int sum = 0;// save the total sum of the array.try {

        try {
            for (int i = 0; i < name.length; i++) {
                int a = sc.nextInt();
                name[i] = a;
                sum += a;
            }
            System.out.println(sum);

        } catch (InputMismatchException e) {
            System.out.println("You entered bad data.");
        }
    }
}
