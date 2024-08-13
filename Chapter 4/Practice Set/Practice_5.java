import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the year :- ");
        int Year = Input.nextInt();
        if ((Year % 4 == 0) && ((Year % 400 == 0) || (Year % 100 != 0))) {
            System.out.println("The year " + Year + " is a leap year.");
        } else {
            System.out.println("The year " + Year + " is not a leap year.");
        }
    }
}
