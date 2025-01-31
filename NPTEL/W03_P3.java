import java.util.Scanner;

public class W03_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
    }
}