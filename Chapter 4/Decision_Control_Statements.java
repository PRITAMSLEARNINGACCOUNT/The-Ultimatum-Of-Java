import java.util.Scanner;

public class Decision_Control_Statements {
    public static void main(String[] args) {
        int Age = 20;
        if (Age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age :- ");

        int Age_2 = sc.nextInt();
        if (Age_2 > 60) {
            System.out.println("You are a senior citizen");
        } else if (Age_2 >= 21) {
            System.out.println("You must seek for a job now");
        } else if (Age_2 >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

    }
}