import java.util.Scanner;

public class W08_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        // TODO: Initialize a variable to store the sum of digits
        // TODO: Use a loop to extract each digit and add it to the sum
        // TODO: Print the sum of the digits
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        System.out.println(sum);
        scanner.close();
    }
}
