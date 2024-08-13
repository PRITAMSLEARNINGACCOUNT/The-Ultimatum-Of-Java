import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Kilometer Value To Convert It Into Mile - ");
        float Kilometer= Input.nextFloat();
        float Mile= Kilometer/1.609f;
        System.out.println("So The Conversion Result From Kilometer To Mile Is - "+Mile);


    }
}
