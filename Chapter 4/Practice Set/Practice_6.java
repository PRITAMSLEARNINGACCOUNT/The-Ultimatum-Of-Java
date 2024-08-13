import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The URL Of The Website :- ");
        String URL = Input.next();
        if (URL.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (URL.endsWith(".org")) {
            System.out.println("Organisation Website");
        } else if (URL.endsWith(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("The Website Is From Other Country");

        }
    }
}
