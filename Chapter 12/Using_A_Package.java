import MyCustomPackage.Package_Creation;
import java.util.*;
// import java.util.Scanner;

public class Using_A_Package {
    public static void main(String[] args) {
        System.out.println("Using Custom Package");
        Package_Creation obj = new Package_Creation();
        obj.display();
        System.out.println("Now Taking User Input Using Scanner Class From A Different Package");
        System.out.println("Please Enter Your Name :- ");
        Scanner Input = new Scanner(System.in);
        Input.nextLine();
        System.out.println("So Your Name Is - " + Input);
    }
}
