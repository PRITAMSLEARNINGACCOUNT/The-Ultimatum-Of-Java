import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        boolean IsPresentValue = false;
        Scanner Input = new Scanner(System.in);
        int[] Numbers = new int[5];
        System.out.println("Enter 5 Integer Numbers: ");
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = Input.nextInt();
        }
        System.out.println("Enter The Value You Want To Find In The Array: ");
        int PresentValue = Input.nextInt();
        for (int number : Numbers) {
            if (number == PresentValue) {
                IsPresentValue = true;
                break;
            }
        }
        if (IsPresentValue) {
            System.out.println("The Value " + PresentValue + " Is Present In The Array.");
        } else {

            System.out.println("The Value " + PresentValue + " Is Not Present In The Array.");
        }
    }
}
