import java.util.Scanner;

public class Practice_Problem_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println(
                "This Program Used A Built-In Scanner Class To Take Input From The User And Shows A Message After Taking Input.");
        System.out.println("Enter Your Name: ");
        String Name = Input.nextLine();
        System.out.println("Hello " + Name + "!");
    }
}