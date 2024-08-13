import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int StudentNumber;
        System.out.println("Enter The Number Of Students: ");
        StudentNumber = Input.nextInt();
        float[] Marks = new float[StudentNumber];
        for (int i = 0; i < Marks.length; i++) {
            System.out.print("Enter The Marks Of Student " + (i + 1) + ": ");
            Marks[i] = Input.nextInt();

        }
        float Sum = 0;
        for (float Element : Marks) {
            Sum += Element;
        }
        System.out.println("So The Average Of Total Marks Of " + StudentNumber + " Students In Physics Is: " + (Sum / (float) StudentNumber));
    }
}