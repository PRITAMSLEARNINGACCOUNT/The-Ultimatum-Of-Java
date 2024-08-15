import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Practice_Program_05 {
    public static void main(String[] args) {
        File MultiplicationTable = new File("MultiplicationTable.txt");
        System.out.println("Enter For Which Number You Want To Generate A Multiplication Table: ");
        Scanner Input = new Scanner(System.in);
        int Number = Input.nextInt();
        try {
            FileWriter Writer = new FileWriter("MultiplicationTable.txt");
            for (int j = 1; j <= 10; j++) {
                Writer.write(Number + " x " + j + " = " + Number * j + "\n");
                Writer.write("\n");
            }
            Writer.close();
            System.out.println("Multiplication Table Generated Successfully!");
        } catch (Exception Error) {
            Error.printStackTrace();
        }

    }
}