import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter A Value Between `1` And `7` :- ");
        int Value = Input.nextInt();
        switch (Value) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}
