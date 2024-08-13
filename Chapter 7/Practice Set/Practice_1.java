import java.util.Scanner;

public class Practice_1 {
    static void Multiplication_Table(int Number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + " x " + i + " = " + Number * i);
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table: ");
        int Number = Input.nextInt();
        Multiplication_Table(Number);
    }
}
