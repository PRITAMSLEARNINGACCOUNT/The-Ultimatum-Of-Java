import java.util.Scanner;
import java.util.Random;

public class Exercise_2 {
    public static void main(String[] args) {
        String ComputerChoice = "";
        Random rand = new Random();
        int RandomNumber = rand.nextInt(100);
        // System.out.println(RandomNumber);
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Rock, Paper or Scissor :- ");
        String UserInput = Input.next();
        if (RandomNumber < 33) {
            ComputerChoice = "Rock";
        } else if (RandomNumber < 66) {
            ComputerChoice = "Paper";

        } else {
            ComputerChoice = "Sicssor";
        }
        if (UserInput.equalsIgnoreCase(ComputerChoice)) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("It's a tie");
        } else if (UserInput.equalsIgnoreCase("Rock") && ComputerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("Computer Wins");
        } else if (UserInput.equalsIgnoreCase("Rock") && ComputerChoice.equalsIgnoreCase("Scissor")) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("User Wins");
        } else if (UserInput.equalsIgnoreCase("Paper") && ComputerChoice.equalsIgnoreCase("Rock")) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("User Wins");
        } else if (UserInput.equalsIgnoreCase("Paper") && ComputerChoice.equalsIgnoreCase("Scissor")) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("Computer Wins");
        } else if (UserInput.equalsIgnoreCase("Scissor") && ComputerChoice.equalsIgnoreCase("Rock")) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("Computer Wins");
        } else if (UserInput.equalsIgnoreCase("Scissor") && ComputerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("Computer Choice: " + ComputerChoice + " And User Choice: " + UserInput);
            System.out.println("User Wins");

        } else {
            System.out.println("Invalid Input");

        }

    }
}
