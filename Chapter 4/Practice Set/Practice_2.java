import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Double Percentage_1, Percentage_2, Percentage_3;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the percentage of Python Programming :- ");
        Percentage_1 = Input.nextDouble();
        System.out.println("Enter the percentage of C Programming :- ");
        Percentage_2 = Input.nextDouble();
        System.out.println("Enter the percentage of Web Development :- ");
        Percentage_3 = Input.nextDouble();
        Double Average = (Percentage_1 + Percentage_2 + Percentage_3) / 3.0;
        if (Average >= 40.0 && Percentage_1 >= 33.0
                && Percentage_2 >= 33.0 && Percentage_3 >= 33.0) {
            System.out.println("Your Overall Percentage is :- " + Average);
            System.out.println("Congratulations! You have passed the exam.");
        } else {
            System.out.println("Your Overall Percentage is :- " + Average);
            System.out.println("Sorry! You have failed the exam.");

        }

    }
}
