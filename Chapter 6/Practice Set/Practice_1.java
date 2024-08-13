import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        float Sum = 0;
        float[] Numbers = new float[5];
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print("Enter Float Number " + (i + 1) + ": ");
            Numbers[i] = Input.nextFloat();
        }
        for (int i = 0; i < Numbers.length; i++) {
            Sum += Numbers[i];
        }
        System.out.println("So The Sum Of All The Float Numbers In The Array Is: " + Sum);
    }
}
